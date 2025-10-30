/**
 * -----------------------------------------------------------------------------
 * Test Case: Document Signing - Verify Upload, Signing, and Deletion Flow
 * -----------------------------------------------------------------------------
 * Description:
 * This test automates the end-to-end workflow for the Document Signing feature
 * in the Vestd platform. It validates that users can:
 *  - Access the Document Signing page
 *  - View required UI elements and headers
 *  - Upload and configure a document for signing
 *  - Send it for signing and confirm status updates
 *  - Edit and delete documents successfully
 *
 * Steps:
 *  1. Login as Editor
 *  2. Verify presence of static UI elements and table headers
 *  3. Upload and configure a new document
 *  4. Send the document for signing
 *  5. Verify “Draft” status and available actions (Edit/Delete)
 *  6. Edit and delete the document
 *  7. Close the browser
 *
 * Custom Keywords Used:
 *  - UIKeywords.loginToApp(username, password)
 *  - UIKeywords.verifyElementPresentVisible(objectPath)
 *  - UIKeywords.verifyElementPresentVisibleText(objectPath, expectedText)
 *  - UIKeywords.clickElement(objectPath)
 *  - UIKeywords.verifyElementContainsPartialText2(objectPath, partialText)
 *
 * Test Data:
 *  - Test File: Test-PDF-File.pdf
 *  - Global Variables: username_editor, password, documentSigningURL
 *
 * Author: [Your Name]
 * Date Created: [DD-MM-YYYY]
 * Last Updated: [DD-MM-YYYY]
 * -----------------------------------------------------------------------------
 */

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.Keys as Keys


// STEP 1: Login to the application
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

// STEP 2: Navigate to Document Signing page
WebUI.navigateToUrl(documentSigningURL)

// STEP 3: Verify static UI elements are visible on the page
['input_search', 'div_entryCount2', 'span_pagination'].each({ 
    CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/$it")
})

// STEP 4: Verify presence of expected table headers
def headersToCheck = ['Type', 'Description', 'Date', 'Action']
verifyTableHeaders(headersToCheck)

// STEP 5: Verify text and visibility of key page elements

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/documentSigning/a_addNewDocument', 'Add a new document')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/documentSigning/small_badge-signed', 'Signed')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/documentSigning/a_view', 'View')

// STEP 6: Click “Add a new document” and upload test PDF file
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/a_addNewDocument')
WebUI.uploadFile(findTestObject('Platform/documentSigning/file_upload-DocumentToSign'), 
    'C:\\Users\\admin\\Documents\\VestdApp-TestAutomation Katalon\\Vestd QA Test Automation\\TestData\\Test-PDF-File.pdf')

// STEP 7: Select document type (AoA) and add signer
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/input_documentType')
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/li_AoA')
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/btn_addAnotherSigner')
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/input_shareholders')
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/li_shareholder')

// STEP 8: Continue to next step and verify setup page
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/btn_continue')
WebUI.delay(15)
WebUI.verifyTextPresent('Setup Articles of Association signing', false)

// Verify the presence of “Save and send for signing” button
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/Platform/documentSigning/btn_saveAndSendForSigning')

// STEP 9: Send document for signing and confirm alert text
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/btn_saveAndSendForSigning')
CustomKeywords.'UIKeywords.verifyElementContainsPartialText2'('Object Repository/Platform/documentSigning/div_alert', 
    'signature on the document')

// STEP 10: Navigate back to Document Signing page and verify Draft status
WebUI.navigateToUrl(documentSigningURL)
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/documentSigning/small_badge-draft', 'Draft')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/documentSigning/a_edit', 'Edit')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/documentSigning/a_delete', 'Delete')

// STEP 11: Edit the document and return back
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/a_edit')
WebUI.verifyTextPresent('Send a document for signing', false)
WebUI.back()

// STEP 12: Delete the document and verify deletion message
CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/documentSigning/a_delete')
WebUI.verifyTextPresent('Document deleted', false)

// STEP 13: Close browser
WebUI.closeBrowser()

// FUNCTION: Verify presence of table headers dynamically
def verifyTableHeaders(List<String> headers, int timeout = 10) {
    headers.each({ def header ->
        TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']")
        WebUI.verifyElementPresent(thHeader, timeout)
    })
}

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

CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/company-update')

// Verify static elements
['input_search', 'div_entryCount2', 'span_pagination'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/$it")
    })

// List of headers to verify
def headersToCheck = ['Subject', 'Date sent', 'Action']

verifyTableHeaders(headersToCheck)

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/companyMessaging/a_createNewMessage', 
    'Create new message')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/companyMessaging/a_view', 'View')

WebUI.click(findTestObject('Platform/companyMessaging/a_view'))

WebUI.verifyTextPresent('Communication - sent message', false)

CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/companyMessaging/a_backToCommunication')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/companyMessaging/btn_duplicate', 
    'Duplicate')

WebUI.click(findTestObject('Platform/companyMessaging/btn_duplicate'))

WebUI.verifyTextPresent('Message duplicated.', false)

CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/companyMessaging/a_backToCommunication')

WebUI.click(findTestObject('Platform/companyMessaging/a_delete'))

WebUI.click(findTestObject('Platform/companyMessaging/btn_confirmDeleteAlert'))

CustomKeywords.'UIKeywords.clickElement'('Object Repository/Platform/companyMessaging/a_createNewMessage')

WebUI.setText(findTestObject('Platform/companyMessaging/input_subject'), 'Test')

WebUI.setText(findTestObject('Platform/companyMessaging/input_replyAddress'), 'sherry.perez+staff@vestd.com')

WebUI.setText(findTestObject('Platform/companyMessaging/div_message'), 'Test')

WebUI.click(findTestObject('Platform/companyMessaging/btn_saveAsDraft'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/Platform/companyMessaging/small_badge', 'Draft')

WebUI.click(findTestObject('Platform/companyMessaging/a_delete'))

WebUI.click(findTestObject('Platform/companyMessaging/btn_confirmDeleteAlert'))

WebUI.verifyElementNotPresent(findTestObject('Platform/companyMessaging/small_badge'), 0)


def verifyTableHeaders(List<String> headers, int timeout = 10) {
	headers.each({ def header ->
			TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']")

			WebUI.verifyElementPresent(thHeader, 10)
		})
}

WebUI.closeBrowser()


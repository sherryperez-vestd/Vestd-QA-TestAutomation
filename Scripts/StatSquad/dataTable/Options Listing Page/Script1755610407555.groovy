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
import org.openqa.selenium.Keys as Keys

/**
 * Test: EMI Option Listing - UI Verification
 * URL: https://demo.app.vestd.com/company/50934/option?type=emi&page=1&per_page=25
 *
 * Steps:
 * 1. Login as staff user.
 * 2. Navigate to the EMI option listing page.
 * 3. Verify presence of core UI elements (filters, pagination, search, etc.).
 * 4. Expand row and check detailed option info (vesting, exercise, employee data).
 * 5. Confirm each detail cell is not empty.
 * 6. Validate column headers and sorting icons.
 * 7. Open filter panel and verify dropdown filter values.
 * 8. Test search functionality and clear input.
 * 9. Re-check headers after search reset.
 */
// Login
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

// Navigate to Option Listing
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/option?type=emi&page=1&per_page=25')

// Verify static elements
['btn_download', 'btn_filter', 'input_search', 'div_entryCount', 'span_previous', 'span_next', 'tr_chevron', 'span_badge'].each(
    { 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/$it")
    })

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/tr_chevron')

['div_vestingStart', 'div_vestingEnd', 'div_Exercised', 'div_exerciseEnd', 'div_Vested', 'div_employee2'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/optionsListing/$it")
    })

// Verify element has value and not empty
['div_vestingStartData', 'div_exerciseEndData', 'div_ExercisedData', 'div_vestingEnd', 'div_vestedData', 'div_exerciseEndData'
    , 'div_employee2Data'].each({ 
        CustomKeywords.'UIKeywords.verifyElementTextNotEmpty'("Object Repository/StatSquad/dataTable/optionsListing/$it")
    })

// Verify table headers
verifyOptionsListingTableHeaders()

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

// Verify filter options
verifyDropdownOptions('optionsListing/div_status', ['label_draft', 'label_live', 'label_completed', 'label_cancelled'])

verifyDropdownOptions('optionsListing/div_recipientStatus', ['label_notInvited', 'label_inviteRejected', 'label_inviteExpired'
        , 'label_waitingToAcceptInvite', 'label_waitingToAcceptOption', 'label_accepted', 'label_leftEmployment'])

verifyDropdownOptions('optionsListing/div_employee', ['label_Yes', 'label_No'])

// Search functionality 
// No records found
def searchBox = findTestObject('StatSquad/dataTable/input_search')
WebUI.setText(searchBox, 'x')
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/td_noRecordsFound')

// Clear search text
WebUI.click(searchBox)
WebUI.sendKeys(searchBox, Keys.chord(Keys.BACK_SPACE))

// Records found
def searchBox2 = findTestObject('StatSquad/dataTable/input_search')
WebUI.setText(searchBox2, 'b')
WebUI.scrollToElement(findTestObject('StatSquad/dataTable/div_entryCount'), 0)
WebUI.delay(5)
WebUI.verifyTextPresent('3 entries', true)

// Re-verify headers
verifyOptionsListingTableHeaders( // === Functions ===
    )

def verifyOptionsListingTableHeaders() {
    ['div-th_type', 'div-th_reference', 'div-th_recipient', 'div-th_options', 'div-th_grantDate', 'div_sortableIconsType'
        , 'div_sortableIconsReference', 'div_sortableIconsRecipient', 'div_sortableIconsOptions', 'div_sortableIconsGrantDate'].each(
        { 
            CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/optionsListing/$it")
        })
}

def verifyDropdownOptions(String dropdownPath, List<String> labelList) {
    CustomKeywords.'UIKeywords.clickElement'("Object Repository/StatSquad/dataTable/$dropdownPath")

    labelList.each({ 
            CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/optionsListing/$it")
        })
}


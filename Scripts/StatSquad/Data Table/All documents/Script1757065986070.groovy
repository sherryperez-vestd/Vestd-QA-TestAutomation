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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testdata.TestData as TestData

// Login
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/legal-doc/filtered-view?page=1&per_page=25')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/allDocuments/a_filterAndSearch')

// Verify static elements
['btn_downloadDocuments', 'btn_filter', 'input_search', 'div_entryCount', 'span_previous', 'a_next', 'tr_chevron'].each(
    { 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/$it")
    })

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/allDocuments/div_sortableIconsCreated')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/tr_chevron')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/allDocuments/div_reason')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/allDocuments/btn_edit')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/allDocuments/btn_delete')

// List of headers to verify
def headersToCheck = ['Name', 'Created', 'Status', 'Action']

verifyTableHeaders(headersToCheck)

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

// Verify filter options
verifyDropdownFilter('allDocuments/div_Status', ['label_Complete', 'label_Cancelled', 'label_Expired', 'label_Needs signing'
        , 'label_Off-platform', 'label_Sent for filing', 'label_Sent for signing', 'label_Will be filed'])

verifyDropdownFilter('allDocuments/div_Companies House', ['label_Filed'])

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/allDocuments/div_Document Type')

// Verify document type filter
def documentTypes = ['Advanced Subscription Agreement', 'Articles of Association', 'Balance Sheet', 'Beneficial Share Certificate'
    , 'Board Minutes', 'Business Plan', 'Cashflow Statement', 'Certificate of Incorporation', 'Company Update', 'Convertible Note'
    , 'Deed of Adherence', 'Director Resolution', 'Dividend Voucher', 'EMI Option Agreement', 'Employment Contract', 'Forfeiture letter'
    , 'Founder Service Agreement', 'Group Structure Chart', 'HMRC Annual EMI Notification', 'HMRC Annual ERS Other Notification'
    , 'HMRC Initial EMI Notification', 'Investor Self Certification Form', 'ITEPA_431', 'Non-Disclosure Agreement', 'Option buyback program FAQ'
    , 'Option cancellation agreement', 'Option Criteria', 'Organisational Chart', 'Other', 'Pitch Deck', 'Profit & Loss Statement'
    , 'Rollover agreement', 'RP04 - Correction of CS01', 'RP04 - Correction of Other', 'RP04 - Correction of SH01', 'RP04 - Correction of SH02'
    , 'RP04 - Correction of SH03', 'RP04 - Correction of SH06', 'Scheme Rules', 'SH01', 'SH02', 'SH03', 'SH04', 'SH06', 'SH08'
    , 'SH10', 'Share Certificate', 'Share Issue Criteria', 'Share subscription letter/agreement', 'Share Supply Agreement'
    , 'Shareholder Agreement', 'Shareholder Resolution', 'Share Purchase Agreement', 'Stamp duty proof', 'Stock Transfer'
    , 'Supplier Contract', 'Syndicate Terms', 'Unapproved Option Agreement', 'Warrant']

documentTypes.each({ def docType ->
        WebUI.verifyTextPresent(docType, true, FailureHandling.STOP_ON_FAILURE)
    })

// Search functionality 
// No records found
def searchBox = findTestObject('StatSquad/dataTable/input_search')

WebUI.setText(searchBox, 'x')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/td_noRecordsFound')

WebUI.refresh()

// Clear search text
WebUI.click(searchBox)

WebUI.sendKeys(searchBox, Keys.chord(Keys.BACK_SPACE))

// Records found
def searchBox2 = findTestObject('StatSquad/dataTable/input_search')

WebUI.setText(searchBox2, 'w')

WebUI.scrollToElement(findTestObject('StatSquad/dataTable/div_entryCount'), 0)

WebUI.delay(3)

WebUI.verifyTextPresent('1 entry', true)

WebUI.sendKeys(searchBox2, Keys.chord(Keys.BACK_SPACE))

// Re-verify headers
verifyTableHeaders(headersToCheck)

// Filter functionality
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/allDocuments/div_Status')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/allDocuments/label_Needs signing')

WebUI.verifyTextPresent('1 entry', true)

WebUI.click(findTestObject('StatSquad/dataTable/div_xClearFilter'))

// Re-verify headers
verifyTableHeaders(headersToCheck // ------------------   Functions  ----------------------------
    )

def verifyTableHeaders(List<String> headers, int timeout = 10) {
    headers.each({ def header ->
            TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']")

            WebUI.verifyElementPresent(thHeader, 10)
        })
}

def verifyDropdownFilter(String dropdownPath, List<String> labelList) {
    CustomKeywords.'UIKeywords.clickElement'("Object Repository/StatSquad/dataTable/$dropdownPath")

    labelList.each({ 
            CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/allDocuments/$it")
        })
}


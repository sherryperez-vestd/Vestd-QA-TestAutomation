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
not_run: CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)


WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/shareholder?page=1&per_page=25')

WebUI.verifyElementNotClickable(findTestObject('StatSquad/dataTable/shareholder/btn_inviteShareholders'))

WebUI.click(findTestObject('StatSquad/dataTable/shareholder/span_checkbox'))

WebUI.verifyElementClickable(findTestObject('StatSquad/dataTable/shareholder/btn_inviteShareholders'))

WebUI.verifyElementPresent(findTestObject('StatSquad/dataTable/shareholder/div_InviteShareholderTooltip'), 0)

WebUI.click(findTestObject('StatSquad/dataTable/shareholder/div_InviteShareholderTooltip'))

WebUI.verifyTextPresent('Please select the checkbox of each user you wish to invite. Corporate users can be invited individually by selecting their names.', 
    true)

WebUI.click(findTestObject('StatSquad/dataTable/shareholder/div_InviteShareholderTooltip'))

// Verify static elements
['btn_filter', 'input_search', 'div_entryCount', 'span_previous', 'span_next'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/$it")
    })

// List of headers you want to verify
def headersToCheck = ['Type', 'Name', 'Must Sign']

// Call the function
verifyTableHeadersAndSortIcons(headersToCheck)

// Verify table headers
//verifyShareholderTableHeaders()
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

// Verify filter options
verifyDropdownFilter('shareholder/div_status', ['label_active', 'label_inactive'])

verifyDropdownFilter('shareholder/div_type', ['label_individual', 'label_corporate'])

verifyDropdownFilter('shareholder/div_invitationStatus', ['label_invited', 'label_notInvited'])

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

WebUI.delay(3)

WebUI.verifyTextPresent('5 entries', true)

WebUI.sendKeys(searchBox2, Keys.chord(Keys.BACK_SPACE))

// Re-verify headers
verifyTableHeadersAndSortIcons(headersToCheck)

// Filter functionality
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/shareholder/div_type')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/shareholder/label_corporate')

WebUI.verifyTextPresent('2 entries', true)

WebUI.click(findTestObject('StatSquad/dataTable/div_xClearFilter' //WebUI.verifyTextPresent('24 entries', true)
        // Verify header text
        // Verify sortable icon div inside header
        // ------------------   Functions  ----------------------------
        ))

//WebUI.closeBrowser()

def verifyTableHeadersAndSortIcons(List<String> headers, int timeout = 10) {
    headers.each({ def header ->
            TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']")

            WebUI.verifyElementPresent(thHeader, timeout)

            TestObject sortIcon = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']//div[@class='neutral ml-2 sortable-icons']")

            WebUI.verifyElementPresent(sortIcon, timeout)
        })
}

def verifyDropdownFilter(String dropdownPath, List<String> labelList) {
    CustomKeywords.'UIKeywords.clickElement'("Object Repository/StatSquad/dataTable/$dropdownPath")

    labelList.each({ 
            CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/shareholder/$it")
        })
}


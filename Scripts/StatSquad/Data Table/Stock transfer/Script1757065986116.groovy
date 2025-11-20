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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/stock-transfer')

WebUI.verifyElementPresent(findTestObject('StatSquad/dataTable/stockTransfer/btn_downloadShareMovementData'), 0)

WebUI.verifyElementClickable(findTestObject('StatSquad/dataTable/stockTransfer/btn_downloadShareMovementData'))

// Verify static elements
['btn_filter', 'input_search', 'div_entryCount2', 'span_pagination'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/$it")
    })

// List of headers you want to verify
def headersToCheck = ['Type', 'Shares', 'Consideration', 'From', 'To', 'Date', 'Investment round', 'Status']

// Call the function 
verifyTableHeaders(headersToCheck)

// Verify table headers
//verifyShareholderTableHeaders()
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

// Verify filter options
verifyDropdownFilter('stockTransfer/div_investmentRound', ['label_none', 'label_Incorporation', 'label_FandF', 'label_roundOne'
        , 'label_Round two'])

verifyDropdownFilter('stockTransfer/div_status', ['label_Completed', 'label_In progress', 'label_Draft'])

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

WebUI.scrollToElement(findTestObject('StatSquad/dataTable/div_entryCount2'), 0)

WebUI.delay(3)

WebUI.verifyTextPresent('3 entries', true)

WebUI.sendKeys(searchBox2, Keys.chord(Keys.BACK_SPACE))

// Re-verify headers
verifyTableHeaders(headersToCheck)

// Filter functionality
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/stockTransfer/div_status')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/stockTransfer/label_In progress')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/td_noRecordsFound')

// Verify header text
// Verify sortable icon div inside header
WebUI.click(findTestObject('StatSquad/dataTable/btn_clearFilter'))

WebUI.verifyTextPresent('3 entries', true)

def verifyTableHeaders(List<String> headers, int timeout = 10) {
    headers.each({ def header ->
            TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']")

            WebUI.verifyElementPresent(thHeader, 10)
        })
}

def verifyDropdownFilter(String dropdownPath, List<String> labelList) {
    CustomKeywords.'UIKeywords.clickElement'("Object Repository/StatSquad/dataTable/$dropdownPath")

    labelList.each({ 
            CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/stockTransfer/$it")
        })
}


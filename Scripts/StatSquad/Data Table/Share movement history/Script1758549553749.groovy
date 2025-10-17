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

// ------------------  EMI  ----------------------------
WebUI.navigateToUrl(shareMovementHistoryURL)

// Verify static elements
['btn_filter', 'input_search', 'div_entryCount', 'span_previous', 'a_next'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/$it")
    })

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

// Verify table headers
def headersToCheck = ['Movement type', 'Shares', 'Nominal Value', 'Owner', 'Hurdle Rate', 'Price paid per share', 'Total price paid'
    , 'Date']

verifyTableHeaders(headersToCheck)

// List of headers you want to verify
def headersToCheck2 = ['Movement type', 'Shares', 'Nominal Value', 'Owner', 'Date']

// Call the function
verifyTableHeadersAndSortIcons(headersToCheck2)

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/shareMovementHistory/div_Movement type')

// Verify Movement type filter
def movementTypes = ['Share issue', 'Transfer', 'Buyback', 'Consolidate', 'Capital reduction', 'Conversion', 'Subdivide'
    , 'Cancellation', 'Linking']

movementTypes.each({ def mType ->
        WebUI.verifyTextPresent(mType, true, FailureHandling.STOP_ON_FAILURE)
    })

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/shareMovementHistory/div_Share class')

// Verify share class filter
def shareClassTypes = ['Ordinary', 'Vn', 'Vv', 'Ordinary A']

shareClassTypes.each({ def scType ->
        WebUI.verifyTextPresent(scType, true, FailureHandling.STOP_ON_FAILURE)
    })

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

WebUI.setText(searchBox2, 'h')

WebUI.scrollToElement(findTestObject('StatSquad/dataTable/div_entryCount'), 0)

WebUI.delay(3)

WebUI.verifyTextPresent('3 entries', true)

WebUI.sendKeys(searchBox2, Keys.chord(Keys.BACK_SPACE))

// Re-verify headers
verifyTableHeaders(headersToCheck)

// Filter functionality
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/shareMovementHistory/div_Movement type')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/shareMovementHistory/label_Conversion')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/td_noRecordsFound')

WebUI.click(findTestObject('StatSquad/dataTable/div_xClearFilter'))

verifyTableHeaders(headersToCheck //WebUI.verifyTextPresent('2 entries', true)
    // Verify header text
    ) // Verify sortable icon div inside header

def verifyTableHeaders(List<String> headers, int timeout = 10) {
    headers.each({ def header ->
            TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']")

            WebUI.verifyElementPresent(thHeader, 10)
        })
}

def verifyTableHeadersAndSortIcons(List<String> headers, int timeout = 10) {
    headers.each({ def header ->
            TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']")

            WebUI.verifyElementPresent(thHeader, timeout)

            TestObject sortIcon = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[normalize-space(.)='$header']//div[contains(@class,'ml-2 sortable-icons')]")

            WebUI.verifyElementPresent(sortIcon, timeout)
        })
}

//def verifyDropdownFilter(String dropdownPath, List<String> labelList) {
//    CustomKeywords.'UIKeywords.clickElement'("Object Repository/StatSquad/dataTable/$dropdownPath")
//
//    labelList.each({ 
//            CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/shareMovementHistory/$it")
//        })
//}
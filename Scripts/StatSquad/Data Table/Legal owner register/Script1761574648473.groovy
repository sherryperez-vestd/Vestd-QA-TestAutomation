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

WebUI.navigateToUrl(legalOwnerRegisterURL)

// Verify static elements
['btn_filter', 'input_search', 'div_entryCount', 'span_previous', 'span_next'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/dataTable/$it")
    })

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

// Verify table headers
def headersToCheck = ['Owner', 'Movements']

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/shareMovementHistory/div_Share class')

// header with sort icon
def headersToCheck2 = ['Owner']

// Call the function
verifyTableHeadersAndSortIcons(headersToCheck2)

// List of expected headers
List<String> headers = [
	"Class name",
	"Nominal value",
	"Hurdle rate",
	"Shares",
	"Class ownership",
	"Total ownership",
	"Date"
]

// Loop through and verify each header is present
headers.each { headerText ->
	TestObject headerObj = new TestObject("th_${headerText.replace(' ', '_')}")
	headerObj.addProperty("xpath", ConditionType.EQUALS, "//table//th[normalize-space()='${headerText}']")
	
	WebUI.verifyElementPresent(headerObj, 5)
}



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

WebUI.verifyTextPresent('1 entry', true)

WebUI.sendKeys(searchBox2, Keys.chord(Keys.BACK_SPACE))

// Re-verify headers
verifyTableHeaders(headersToCheck)

// Filter functionality
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/btn_filter')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/shareMovementHistory/div_Share class')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/dataTable/legalOwnerRegister/label_Vv')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/dataTable/td_noRecordsFound')

WebUI.click(findTestObject('StatSquad/dataTable/div_xClearFilter'))

verifyTableHeaders(headersToCheck) 


List<String> headers2 = ["Name", "Share class", "Shares", "Vesting date", "Exercise date"]

headers2.each { headerText ->
	TestObject headerObj = new TestObject("th_${headerText.replace(' ', '_')}")
	headerObj.addProperty('xpath', ConditionType.EQUALS, "//table//th[normalize-space()='${headerText}']")
	
	WebUI.verifyElementPresent(headerObj, 5)	
}

WebUI.verifyTextPresent('Option liabilities', true)


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


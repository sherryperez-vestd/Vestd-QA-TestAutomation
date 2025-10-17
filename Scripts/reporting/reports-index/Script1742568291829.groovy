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


WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(reportsCountryURL)

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/reporting/index/heading_Reporting Beta', 
    'Reporting Beta')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/reporting/index/lead-text_Access detailed reports', 
    'Access detailed reports tailored to your needs. Can\'t find what you\'re looking for? Request a custom report here.')

// Verify table headers
def reportIndexTableHeaders = ['Report name', 'Description', 'Action']

verifyTableHeaders(reportIndexTableHeaders)

// Verify reports name
List<String> expectedReports = ['Shareholders report', 'Employee report', 'Financial report', 'Cap table report', 'Option agreement report'
    , 'Expense report']

// Add "MGT1 report" if IN company
String currentUrl = WebUI.getUrl()
if (currentUrl == 'https://demo.app.vestd.com/company/50915/reports') {
	expectedReports.add('MGT1 report')
}

// Loop through each row
for (int i = 1; i <= expectedReports.size(); i++) {
    // XPath for the first column of the current row
    TestObject firstColumn = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//tbody/tr[' + i) + ']/td[1]')

    String actualText = WebUI.getText(firstColumn)

    // Verify text matches expected
    WebUI.verifyEqual(actualText, expectedReports[(i - 1)])
}

// Verify report description
def descriptions = [[('path') : 'StatSquad/reporting/index/td_shareholders description', ('text') : 'This report will provide a download of your shareholders names, emails and other basic information.']
    , [('path') : 'StatSquad/reporting/index/td_financial report description', ('text') : 'This report will provide options vested, options lapsed, options exercised, reversed options and exercise requests. You will be able to select the start and end date on the next page.']
    , [('path') : 'StatSquad/reporting/index/td_cap table description', ('text') : 'This will take you to cap table page where you can simulate the ownership structure of your company in different scenarios.']
    , [('path') : 'StatSquad/reporting/index/td_option agreement description', ('text') : 'This report will provide a download of all option agreements, the status, the option holders name, option type, and other related information.']
    , [('path') : 'StatSquad/reporting/index/td_Expense report description', ('text') : 'This report calculates stock option expenses under the selected valuation method. It includes fair values, vesting schedules, and a monthly breakdown to ensure IFRS-compliant entries for "employee compensation expense" in the annual P&L.']]

// Conditionally add MGT1 description if IN company
if (currentUrl == 'https://demo.app.vestd.com/company/50915/reports') {
	descriptions.add([
		('path') : 'StatSquad/reporting/index/td_MGT1Description',
		('text') : 'Register of members. pursuant to section 88 (1)(a) of the companies act, 2013 and rule 3(1) of the companies (management and administration) rules, 2014'
	])
}

descriptions.each({ def el ->
        CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'("Object Repository/$el.path", el.text)
    })

// Verify Generate links
def elements = [[('path') : 'StatSquad/reporting/index/link_generate-shareholders', ('text') : 'Generate'], [('path') : 'StatSquad/reporting/index/link_generate-employee-report'
        , ('text') : 'Generate'], [('path') : 'StatSquad/reporting/index/link_generate-financial', ('text') : 'Generate']
    , [('path') : 'StatSquad/reporting/index/link_generate-cap-table', ('text') : 'Generate'], [('path') : 'StatSquad/reporting/index/link_generate-option-agreement'
        , ('text') : 'Generate'], [('path') : 'StatSquad/reporting/index/link_generate-expense', ('text') : 'Generate'], [
        ('path') : 'StatSquad/reporting/index/link_Request a custom report here', ('text') : 'Request a custom report here']]


// Conditionally add MGT1 description if IN company
if (currentUrl == 'https://demo.app.vestd.com/company/50915/reports') {
	elements.add([
		('path') : 'StatSquad/reporting/index/link_generate-MGT1',
		('text') : 'Generate'
	])
}

elements.each({ def el ->
        // Verify element is present, visible, and has expected text
        CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'("Object Repository/$el.path", el.text)

        // Verify element is clickable
        WebUI.verifyElementClickable(findTestObject("Object Repository/$el.path"))
    })

//Click "Request a custom report here" and verify new URL
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/reporting/index/link_Request a custom report here')
currentWindow = WebUI.getWindowIndex()

//WebUI.switchToWindowIndex(currentWindow)
WebUI.switchToWindowIndex(currentWindow + 1)

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://usabi.li/do/1951db0cc1b3/7cf2')

def verifyTableHeaders(List<String> headers, int timeout = 10) {
    headers.each({ def header ->
            TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[contains(normalize-space(.), '$header')]")

            WebUI.verifyElementPresent(thHeader, timeout)
        })
}


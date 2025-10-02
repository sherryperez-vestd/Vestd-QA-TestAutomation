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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*
 ================================================================================
 Test Case: Verify Expense Report Page and Download Report
 URL: https://demo.app.vestd.com/company/50934/expense-reports
 Purpose:
	 - Login as Editor
	 - Navigate to Expense Reports page
	 - Verify static elements and tooltips are visible
	 - Verify text content matches expected
	 - Enter risk-free rate and volatility
	 - Verify Download button is clickable and trigger download
 ================================================================================
 */
not_run: CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

'Login as Admin and navigate to expense reports page'
WebUI.navigateToUrl(expenseReportURL_UK)

// Verify static elements
verifyStaticExpenseElements(['tooltip-icon_Beta', 'input_Day_from_date_day', 'input_Month_from_date_month', 'input_Year_from_date_year'
        , 'input_Day_to_date_day', 'input_Month_to_date_month', 'input_Year_to_date_year', 'input_Black-Scholes', 'tooltip-icon_IFRS pricing model'
        , 'tooltip-icon_Risk-free rate', 'input_risk_free_rate', 'tooltip-icon_Volatility', 'input_Volatility'])

// Verify static elements and text
def elementsWithText = [('StatSquad/reporting/expense/heading_ExpenseReport') : 'Expense report Beta', ('StatSquad/reporting/expense/heading_Beta') : 'Beta'
    , ('StatSquad/reporting/financial/span_From Date') : 'From Date', ('StatSquad/reporting/financial/span_To Date') : 'To Date'
    , ('StatSquad/reporting/expense/label_StartDay') : 'Day', ('StatSquad/reporting/expense/label_StartMonth') : 'Month'
    , ('StatSquad/reporting/expense/label_StartYear') : 'Year', ('StatSquad/reporting/expense/label_EndDay') : 'Day', ('StatSquad/reporting/expense/label_EndMonth') : 'Month'
    , ('StatSquad/reporting/expense/label_EndYear') : 'Year', ('StatSquad/reporting/expense/label_IFRS pricing model') : 'IFRS pricing model'
    , ('StatSquad/reporting/expense/label_Risk-free rate') : 'Risk-free rate', ('StatSquad/reporting/expense/label_Volatility') : 'Volatility'
    , ('StatSquad/reporting/expense/p_To generate report') : 'To generate a report, enter a start and end date to define the reporting period.'
    , ('StatSquad/reporting/expense/p_It provides all necessary expense entries') : 'This report calculates stock option expenses using the Black-Scholes, a standard method for estimating the fair value of options based on exercise price, vesting period, expected volatility, and the risk-free interest rate.']

verifyElementsWithText(elementsWithText)

TestObject multiSelect = new TestObject('multiSelect')

multiSelect.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class,\'multiselect-wrapper\')]')

WebUI.verifyElementNotPresent(findTestObject('StatSquad/reporting/expense/li_Intrinsic value'), 0)

WebUI.setText(findTestObject('StatSquad/reporting/expense/input_risk_free_rate'), '1')

WebUI.setText(findTestObject('StatSquad/reporting/expense/input_Volatility'), '1')

WebUI.verifyElementClickable(findTestObject('StatSquad/reporting/btn_Download Report'))

'Login as Admin and navigate to expense reports page'
WebUI.navigateToUrl(expenseReportURL_IN)

WebUI.verifyTextPresent('Black-Scholes', false)

WebUI.click(findTestObject('StatSquad/reporting/expense/dd_IFRS pricing model'))

WebUI.click(findTestObject('StatSquad/reporting/expense/li_Intrinsic value'))

WebUI.verifyTextPresent('Intrinsic value', false)

not_run: WebUI.click(findTestObject('StatSquad/reporting/btn_Download Report'))

not_run: WebUI.callTestCase(findTestCase('StatSquad/Reports/Download Report'), [:], FailureHandling.STOP_ON_FAILURE /**
 * Verify multiple static elements are present and visible
 * @param elements List of element IDs under "StatSquad/reporting/expense"
 */ /**
 * 
 * Verify multiple elements are present, visible, and contain expected text
 * @param elementsWithText Map of [objectPath : expectedText]
 */ )

def verifyStaticExpenseElements(List<String> elements) {
    elements.each({ def element ->
            CustomKeywords.'UIKeywords.verifyElementPresentVisible'("StatSquad/reporting/expense/$element")
        })
}

def verifyElementsWithText(Map<String, String> elementsWithText) {
    elementsWithText.each({ def objPath, def expectedText ->
            CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'(objPath, expectedText)
        })
}


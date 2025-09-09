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
 * Test Case: Verify Expense Report (Beta) setup and access flow
 *
 * URL: https://demo.app.vestd.com/company/50135/reports/expense-report
 *
 * Steps:
 * 1. Navigate to the Expense Report page as Admin.
 * 2. Validate headers: "Expense report Beta", "Beta".
 * 3. Check alert for missing settings with correct message and button.
 * 4. Click "Expense report settings" and verify:
 *    - Edit settings page content (labels, descriptions, inputs).
 *    - Back navigation to Expense Report page.
 * 5. Confirm date input fields are visible (From/To Date).
 * 6. Validate download button is present but **not clickable**.
 * 7. Navigate to a second company report and click additional controls.
 */
not_run: WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

'Login as Admin and navigate to expense reports page'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/reports/expense-report')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/heading_ExpenseReport'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/heading_ExpenseReport'), 'Expense report Beta')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/tooltip-icon_Beta'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/heading_Beta'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/heading_Beta'), 'Beta')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/financial/span_From Date'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/financial/span_From Date'), 'From Date')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/financial/span_To Date'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/financial/span_To Date'), 'To Date')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/financial/label_Day'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/financial/label_Day'), 'Day')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/financial/label_Month'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/financial/label_Month'), 'Month')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/financial/label_Year'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/financial/label_Year'), 'Year')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/input_Day_from_date_day'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/input_Month_from_date_month'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/input_Year_from_date_year'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/input_Day_to_date_day'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/input_Month_to_date_month'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/input_Year_to_date_year'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_To generate report'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/p_To generate report'), 'To generate report, first enter a start and end date. These dates will define the time frame for the report.')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_It provides all necessary expense entries'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/p_It provides all necessary expense entries'), 'It provides all necessary expense entries that must be combined and recorded in the annual P&L under "employee compensation expense." The report includes fair value calculations, vesting schedules, and a detailed monthly expense breakdown to ensure IFRS compliance.')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/label_IFRS pricing model'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/label_IFRS pricing model'), 'IFRS pricing model')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/tooltip-icon_IFRS pricing model'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/dd_IFRS pricing model'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/label_Risk-free rate'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/label_Risk-free rate'), 'Risk-free rate')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/tooltip-icon_Risk-free rate'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/input_risk_free_rate'), 0)

WebUI.setText(findTestObject('StatSquad/reporting/expense/input_risk_free_rate'), '1')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/label_Volatility'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/label_Volatility'), 'Volatility')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/tooltip-icon_Volatility'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/input_Volatility'), 0)

WebUI.setText(findTestObject('StatSquad/reporting/expense/input_Volatility'), '1')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/btn_Download Report'), 0)

WebUI.verifyElementClickable(findTestObject('StatSquad/reporting/btn_Download Report'))

WebUI.click(findTestObject('StatSquad/reporting/btn_Download Report'))

not_run: WebUI.callTestCase(findTestCase('StatSquad/Reports/Download Report'), [:], FailureHandling.STOP_ON_FAILURE)


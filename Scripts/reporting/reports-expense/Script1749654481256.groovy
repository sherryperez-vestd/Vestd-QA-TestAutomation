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

'Login as Admin and navigate to expense reports page'
WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/reports/expense-report')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/heading_ExpenseReport'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/heading_ExpenseReport'), 'Expense report Beta')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/heading_Beta'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/heading_Beta'), 'Beta')

'Check Add expense report settings alert banner'
WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/div_add expense report settings alert'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/heading_expense report alert'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/heading_expense report alert'), 'Add expense report settings')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_expense alert text'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/p_expense alert text'), 'Seems like you dont have the expense report settings updated, Please click on the button below and update it before proceeding.')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/btn_Expense report settings'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/btn_Expense report settings'), 'Expense report settings')

'Check Edit expense report settings page'
WebUI.click(findTestObject('StatSquad/reporting/expense/btn_Expense report settings'))

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/heading_Edit expense report settings'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/heading_Edit expense report settings'), 'Edit expense report settings')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_edit expense report settings text'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/p_edit expense report settings text'), 'Configure the settings for IFRS 2 (Share-Based Payments) by selecting the financial year start date and defining key valuation inputs like the risk-free rate and volatility for option pricing.')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/label_Financial year start date'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/label_Financial year start date'), 'Financial year start date')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/tooltip-icon_Financial year start date'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/dd_Month'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/dd_Day'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/label_Valuation method'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/label_Valuation method'), 'Valuation method')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/tooltip-icon_Financial year start date'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/dd_Valuation method'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/btn_Edit Expense report settings Save'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/btn_Edit Expense report settings Save'), 'Save')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/a_back to expense report'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/reporting/expense/a_back to expense report'), '< Back to expense report')

WebUI.click(findTestObject('StatSquad/reporting/expense/a_back to expense report'))

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

not_run: WebUI.verifyElementClickable(findTestObject('StatSquad/reporting/financial/btn_Download Report'))

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/financial/btn_Download Report'), 0)

WebUI.verifyElementNotClickable(findTestObject('StatSquad/reporting/financial/btn_Download Report'))

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reports/expense-report')

WebUI.click(findTestObject('StatSquad/reporting/expense/a_click here'))

WebUI.click(findTestObject('StatSquad/reporting/expense/dd_Month'))

WebUI.closeBrowser()


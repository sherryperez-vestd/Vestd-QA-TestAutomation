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

//WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)
'Login as Admin and navigate to expense reports page (diff company for expense settings)'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reports/expense-report')

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_Please select a date range between'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_To generate report'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_This report calculates - Black-Scholes'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_It provides all necessary expense entries'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_To update'), 0)

WebUI.click(findTestObject('StatSquad/reporting/expense/a_click here'))

WebUI.click(findTestObject('StatSquad/reporting/expense/dd_Valuation method'))

WebUI.click(findTestObject('StatSquad/reporting/expense/li_Intrinsic value'))

WebUI.click(findTestObject('StatSquad/reporting/expense/btn_Edit Expense report settings Save'))

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_This report calculates - intrinsic'), 0)

WebUI.click(findTestObject('StatSquad/reporting/expense/a_click here'))

WebUI.click(findTestObject('StatSquad/reporting/expense/dd_Valuation method'))

WebUI.click(findTestObject('StatSquad/reporting/expense/li_Black-Scholes'))

WebUI.setText(findTestObject('StatSquad/reporting/expense/input_risk_free_rate'), '1')

WebUI.setText(findTestObject('StatSquad/reporting/expense/input_Volatility'), '1')

WebUI.click(findTestObject('StatSquad/reporting/expense/btn_Edit Expense report settings Save'))

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/expense/p_This report calculates - Black-Scholes'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/reporting/financial/btn_Download Report'), 0)

WebUI.verifyElementClickable(findTestObject('StatSquad/reporting/financial/btn_Download Report'))

WebUI.click(findTestObject('StatSquad/reporting/financial/btn_Download Report'))

url = WebUI.getUrl()

split_url = url.split('/')

removedurlchars = (split_url[(split_url.size() - 1)])

partial_url = url.minus(removedurlchars)

WebUI.verifyEqual(partial_url, 'https://demo.app.vestd.com/company/50934/job-monitor/')

WebUI.delay(20)

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://demo.app.vestd.com/company/50934/temporary-file')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/temporary-file/h1_Temporary files'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/temporary-file/h1_Temporary files'), 'Temporary files')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/temporary-file/label_Expires in 23 hours'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/temporary-file/label_Expires in 23 hours'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/temporary-file/label_Expires in 23 hours'), 
    'Expires in 23 hours')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/temporary-file/btn_Download'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/temporary-file/btn_Download'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/temporary-file/btn_Download'), 'Download')


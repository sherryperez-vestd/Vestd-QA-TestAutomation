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

WebUI.callTestCase(findTestCase('users-login/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/valuation/create?type=company')

WebUI.selectOptionByValue(findTestObject('valuations/company-valuation/select_Please selectInvestment roundAccount_d52d9d'), 
    'Investment round', true)

WebUI.setText(findTestObject('valuations/company-valuation/input_Day_starts_at_day'), '1')

WebUI.setText(findTestObject('valuations/company-valuation/input_Month_starts_at_month'), '1')

WebUI.setText(findTestObject('valuations/company-valuation/input_Year_starts_at_year'), '2025')

WebUI.click(findTestObject('valuations/company-valuation/button_Save'))

WebUI.verifyElementPresent(findTestObject('valuations/company-valuation/td_Company'), 0)

WebUI.verifyElementPresent(findTestObject('valuations/company-valuation/td_1st Jan 2025'), 0)

WebUI.click(findTestObject('valuations/company-valuation/button_Delete'))

WebUI.click(findTestObject('valuations/company-valuation/button_Yes, delete the valuation'))


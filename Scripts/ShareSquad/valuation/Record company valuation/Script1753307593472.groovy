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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/valuation/create?type=company')

WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/valuations/company/select_Please selectInvestment roundAccount'), 
    'Investment round', true)

WebUI.setText(findTestObject('Object Repository/ShareSquad/valuations/company/input_Whole company valuation_valuation'), '2000000')

WebUI.setText(findTestObject('Object Repository/ShareSquad/valuations/company/input_Day_starts_at_day'), '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/valuations/company/input_Month_starts_at_month'), '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/valuations/company/input_Year_starts_at_year'), '2025')

WebUI.click(findTestObject('Object Repository/ShareSquad/valuations/company/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/valuations/company/td_2,000,000 Investment round'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/valuations/company/td_2,000,000 Investment round'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/valuations/company/td_2,000,000 Investment round'), '£2,000,000 Investment round')

WebUI.click(findTestObject('Object Repository/ShareSquad/valuations/company/button_Delete'))

WebUI.click(findTestObject('Object Repository/ShareSquad/valuations/company/button_Yes, delete the valuation'))

WebUI.closeBrowser()


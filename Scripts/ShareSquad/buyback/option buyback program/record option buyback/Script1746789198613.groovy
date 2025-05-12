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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/distribution/6244')

WebUI.click(findTestObject('Object Repository/buyback/option-buyback/a_Record-option-buyback'))

WebUI.setText(findTestObject('Object Repository/buyback/option-buyback/input_Number of options'), '1')

WebUI.click(findTestObject('Object Repository/buyback/option-buyback/Page_Test esop2 ESOP Agreement Agreement su_3ce55f/a_Record option buyback'))

WebUI.setText(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/input_Number of options for buyback_q3YicPc_181dd3'), 
    '1')

WebUI.setText(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/input__OGCIcoyvb2D3FXd2'), 
    '1')

WebUI.setText(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/input_Day_purchased_at_day'), 
    '1')

WebUI.setText(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/input_Month_purchased_at_month'), 
    '1')

WebUI.setText(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/input_Year_purchased_at_year'), 
    '2025')

WebUI.click(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/button_Record buyback'))

WebUI.click(findTestObject('Object Repository/buyback/option-buyback/Page_Test esop2 ESOP Agreement Agreement su_3ce55f/div_Options bought back successfully'))

WebUI.verifyElementPresent(findTestObject('Object Repository/buyback/option-buyback/Page_Test esop2 ESOP Agreement Agreement su_3ce55f/div_Options bought back successfully'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/buyback/option-buyback/Page_Test esop2 ESOP Agreement Agreement su_3ce55f/div_Options bought back successfully'), 
    'Options bought back successfully')

WebUI.click(findTestObject('Object Repository/buyback/option-buyback/Page_Test esop2 ESOP Agreement Agreement su_3ce55f/a_Buyback options'))

WebUI.verifyElementPresent(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/td_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/td_1'), 
    '1')

WebUI.click(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/i_Completed_feather icon-eye'))

WebUI.click(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/button_Delete'))

WebUI.click(findTestObject('Object Repository/buyback/option-buyback/Page_Option buyback - QA Test IN (Indian Co_56e0bb/button_Ok, delete buyback options'))

WebUI.closeBrowser()

WebUI.acceptAlert()


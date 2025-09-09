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

'Login and navigate to Record Option buyback page'
WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/option-buyback')

WebUI.verifyElementPresent(findTestObject('ShareSquad/buyback/option-buyback/Page_Buyback options Index/Record-buyback'), 
    0)

WebUI.click(findTestObject('ShareSquad/buyback/option-buyback/Page_Buyback options Index/Record-buyback'))

'Create Option buyback'
WebUI.click(findTestObject('ShareSquad/buyback/option-buyback/Page_Option buyback - create/input_Select the option holder'))

WebUI.click(findTestObject('ShareSquad/buyback/option-buyback/Page_Option buyback - create/input_Select the option holder whose option_fdeaed'))

WebUI.click(findTestObject('ShareSquad/buyback/option-buyback/Page_Option buyback - create/button_Continue'))

WebUI.setText(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/input_Number of options'), '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/input_Number of options'), 
    '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/input_total-price-paid'), 
    '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/input_Day_purchased_at_day'), 
    '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/input_Month_purchased_at_month'), 
    '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/input_Year_purchased_at_year'), 
    '2025')

// Define the path to the file
WebUI.uploadFile(findTestObject('ShareSquad/buyback/option-buyback/Page_Option buyback - create/input_forfeiture-letter'), 
    'C:\\Users\\admin\\Documents\\VestdApp-TestAutomation Katalon\\Vestd QA Test Automation\\TestData\\Test-PDF-File.pdf')

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/button_Record buyback'))

'Check Record Option buyback success banner'
WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_ESOP Agreement/div_Options bought back successfully'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_ESOP Agreement/div_Options bought back successfully'), 
    'Options bought back successfully')

'Check data is added on Option buyback index page '
WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_ESOP Agreement/a_Buyback options'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/td_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/td_1'), 
    '1')

WebUI.verifyElementPresent(findTestObject('ShareSquad/buyback/option-buyback/span_Completed-status'), 0)

WebUI.scrollToElement(findTestObject('ShareSquad/buyback/option-buyback/Page_Option buyback - create/i_Completed_feather icon-eye'), 
    0)

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/i_Completed_feather icon-eye'))

'Delete recorded entry'
WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/button_Delete'))

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/option-buyback/Page_Option buyback - create/button_Ok, delete buyback options'))

WebUI.closeBrowser()


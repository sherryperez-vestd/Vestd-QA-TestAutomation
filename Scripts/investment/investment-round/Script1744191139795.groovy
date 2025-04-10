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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/investment-hub')

WebUI.click(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/button_New round'))

WebUI.click(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/button_Add an investor'))

WebUI.setText(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/input__HtluOwj0MCM2M3NV'), 
    '10,000')

WebUI.setText(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/input__icI0PfMsjcHlTkzj'), 
    '1')

WebUI.setText(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/input_Percent of company_piSHaxpFRVAgh7Nt'), 
    '1')

WebUI.setText(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/input_Percent of round_x4p6ZBbWUva0WDZT'), 
    '1')

WebUI.click(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/button_Im done editing this investor'))

WebUI.verifyElementPresent(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/div_Unknown investor Draft'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/div_Unknown investor Draft'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/div_Unknown investor Draft'), 
    'Unknown investor Draft')

WebUI.click(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/a_Remove'))

WebUI.click(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/button_Yes, remove Unknown investor'))

WebUI.verifyElementVisible(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/span_Investment round 2 edit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/span_Investment round 2 edit'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/span_Investment round 2 edit'), 
    'Investment round 2 edit')

WebUI.click(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/button_delete'))

WebUI.click(findTestObject('Object Repository/investment/Page_Investment - QA Test UK1 (Reid Ltd) - Vestd/button_Yes, delete the round'))


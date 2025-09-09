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

WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/investment-hub')

WebUI.click(findTestObject('Object Repository/CoCo/investment/Page_Investment/button_New round'))

not_run: WebUI.click(findTestObject('Object Repository/CoCo/investment/Page_Investment/button_Add an investor'))

not_run: WebUI.setText(findTestObject('Object Repository/CoCo/investment/Page_Investment/input__investment'), '10,000')

not_run: WebUI.setText(findTestObject('Object Repository/CoCo/investment/Page_Investment/input__price per share'), '1')

not_run: WebUI.setText(findTestObject('Object Repository/CoCo/investment/Page_Investment/input_Percent of company'), '1')

not_run: WebUI.setText(findTestObject('Object Repository/CoCo/investment/Page_Investment/input_Percent of round'), '1')

not_run: WebUI.click(findTestObject('Object Repository/CoCo/investment/Page_Investment/button_Im done editing this investor'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/investment/Page_Investment/div_Unknown investor Draft'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/investment/Page_Investment/div_Unknown investor Draft'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/CoCo/investment/Page_Investment/div_Unknown investor Draft'), 
    'Unknown investor Draft')

not_run: WebUI.click(findTestObject('Object Repository/CoCo/investment/Page_Investment/a_Remove'))

not_run: WebUI.click(findTestObject('Object Repository/CoCo/investment/Page_Investment/button_Yes, remove Unknown investor'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/investment/Page_Investment/span_Investment round 2 edit'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/investment/Page_Investment/span_Investment round 2 edit'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/CoCo/investment/Page_Investment/span_Investment round 2 edit'), 
    'Investment round 2 edit')

WebUI.click(findTestObject('Object Repository/CoCo/investment/Page_Investment/button_delete'))

WebUI.click(findTestObject('Object Repository/CoCo/investment/Page_Investment/button_Yes, delete the round'))

WebUI.closeBrowser()


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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.click(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/i_Projected value_vi vi-sm mt-auto ml-lg-2 _17a5ba'))

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/button_View transactions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/button_View transactions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/button_View transactions'), 
    'View transactions')

WebUI.click(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/button_View transactions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/h5_Transaction History'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/h5_Transaction History'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/h5_Transaction History'), 
    'Transaction History')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/p_250 Ordinary shares'))

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/p_250 Ordinary shares'))

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/p_250 Ordinary shares'), 
    '250 Ordinary shares')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Transaction'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Transaction'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Transaction'), 
    'Transaction:')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_1'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_1'), 
    '1')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Related to'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Related to'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Related to'), 
    'Related to:')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_FTest LTest option'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_FTest LTest option'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_FTest LTest option'), 
    'FTest LTest option')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Share issue'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Share issue'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Share issue'), 
    'Share issue:')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_250 Ordinary (voting)'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_250 Ordinary (voting)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_250 Ordinary (voting)'), 
    '250 Ordinary (voting)')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Shares with equity rights'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Shares with equity rights'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Shares with equity rights'), 
    'Shares with equity rights:')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_0.0050'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_0.0050'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_0.0050'), 
    '0.0050%')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Price paid per share'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Price paid per share'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Price paid per share'), 
    'Price paid per share:')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_1.00'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_1.00'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_1.00'), 
    '£1.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Total price paid'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Total price paid'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Total price paid'), 
    'Total price paid:')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_250.00'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_250.00'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_250.00'), 
    '£250.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Issued on'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Issued on'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_Issued on'), 
    'Issued on:')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_20th Feb 2025'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_20th Feb 2025'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/strong_20th Feb 2025'), 
    '20th Feb 2025')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/span_'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/button_Close'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/button_Close'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/button_Close'), 
    'Close')

WebUI.click(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/button_Close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/a_View agreement summary'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/a_View agreement summary'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/shares-options-breakdown/Page_Dashboard - Vestd/a_View agreement summary'), 
    'View agreement summary')


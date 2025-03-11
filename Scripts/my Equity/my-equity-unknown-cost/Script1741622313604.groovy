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

WebUI.callTestCase(findTestCase('user-login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/unknown-cost/div_Unknown cost We dont have a record of h_6d6667'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/unknown-cost/div_Unknown cost We dont have a record of h_6d6667'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/span_Unknown cost'), 
    'Unknown cost')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/p_We dont have a record of how much you pai_4d3790'), 
    'We don’t have a record of how much you paid for these shareholdings, so we’ve defaulted to nominal value. Update the price you paid for these shares to see your actual profit.')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/td_Price paid'), 
    'Price paid')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/td_Details'), 
    'Details')

WebUI.verifyElementText(findTestObject('null'), 
    'Update price')

WebUI.verifyElementClickable(findTestObject('null'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/small_0.0001 nominal value'), 
    '£0.0001 nominal value')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/small_Issued 28th January 2025'), 
    'Issued 28th January 2025')

WebUI.verifyElementText(findTestObject('null'), 
    '1,000 shares')

WebUI.click(findTestObject('null'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/unknown-cost/div_share1,000 shares at 0.0001 nominal val_2c78ea'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/unknown-cost/div_share1,000 shares at 0.0001 nominal val_2c78ea'))

WebUI.verifyElementVisible(findTestObject('null'))

WebUI.verifyElementPresent(findTestObject('null'), 
    0)

WebUI.verifyElementText(findTestObject('null'), 
    'Cancel')

WebUI.verifyElementPresent(findTestObject('null'), 
    0)

WebUI.verifyElementVisible(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    'Save')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/span_'), '£')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/span_share'), 
    '/share')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/unknown-cost/input__ZVGphHxntxz6jRc7'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/unknown-cost/input__ZVGphHxntxz6jRc7'))

WebUI.setText(findTestObject('Object Repository/my-equity-page/unknown-cost/input__ZVGphHxntxz6jRc7'), 
    '1')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    '£-/shares')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/my-equity-page/unknown-cost/input__dUi7WcQlvuLdEEw0'), 
    '1')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    '£1.00/shares')


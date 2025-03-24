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

WebUI.callTestCase(findTestCase('users/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

WebUI.verifyElementPresent(findTestObject('my-equity-page/show-hide-settings/label_Hide My Equity calculator and graph'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/show-hide-settings/label_Hide My Equity calculator and graph2'), 
    'Hide “My Equity calculator and graph” (recipient dashboard) from the recipients')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/div_Yes, hide the value graph and the calculator'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/input_Hide My Equity calculator and graph'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/label_Yes, hide the value graph and the calculator'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/show-hide-settings/label_Yes, hide the value graph and the calculator'), 
    'Yes, hide the value graph and the calculator from the recipients')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/input_Yes, hide the value graph and the calculator'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/label_No, show the value graph and calculator'), 
    0)

WebUI.click(findTestObject('Object Repository/my-equity-page/show-hide-settings/label_No, show the value graph and calculator'))

WebUI.click(findTestObject('Object Repository/my-equity-page/show-hide-settings/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/message_Company updated'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/show-hide-settings/message_Company updated'), 'Company updated')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.click(findTestObject('Object Repository/my-equity-page/show-hide-settings/tab_Overall value'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/tab_Overall value'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/link_Overall value'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/tab_Overall value'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/div_Estimated Profit in 5 Years Annual grow_898f9a'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/show-hide-settings/div_Estimated Profit in 5 Years Annual grow_898f9a'))

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

WebUI.click(findTestObject('Object Repository/my-equity-page/show-hide-settings/input_Hide My Equity calculator and graph'))

WebUI.click(findTestObject('Object Repository/my-equity-page/show-hide-settings/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/message_Company updated'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/show-hide-settings/message_Company updated'), 'Company updated')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/my-equity-page/show-hide-settings/tab_Overall value'), 0)

WebUI.verifyElementNotPresent(findTestObject('my-equity-page/show-hide-settings/link_Overall value'), 0)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

WebUI.click(findTestObject('my-equity-page/show-hide-settings/input_Yes, hide the value graph and the calculator'))

WebUI.click(findTestObject('Object Repository/my-equity-page/show-hide-settings/button_Save'))


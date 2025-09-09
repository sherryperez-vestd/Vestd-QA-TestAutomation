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

/**
 * Test Case: Verify the toggle to show/hide My Equity calculator and value graph
 *
 * Steps:
 * 1. Navigate to the company admin page.
 * 2. Verify the presence of the "Hide My Equity calculator and graph" toggle.
 * 3. Set the toggle to "Show", save changes, and verify graph/calculator is visible on the recipient dashboard.
 * 4. Set the toggle to "Hide", save changes, and confirm the graph/calculator is not displayed on the recipient dashboard.
 * 5. Reset the toggle to "Show" for cleanup.
 */
not_run: WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

'Login and navigate to My company admin page'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

'Check option to hide/show value graph and calculator are present'
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideSettings/label_Hide My Equity calculator and graph2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/label_Hide My Equity calculator and graph2'), 
    'Hide “My Equity calculator and graph” (recipient dashboard) from the recipients')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/div_Yes, hide the value graph and the calculator'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/input_Hide My Equity calculator and graph'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/label_Yes, hide the value graph and the calculator'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/label_Yes, hide the value graph and the calculator'), 
    'Yes, hide the value graph and the calculator from the recipients')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/input_No show the value graph and the calculator'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/label_No, show the value graph and calculator'), 
    0)

'Set option to Show value graph and calculator\r\n'
WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/label_No, show the value graph and calculator'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/_common/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/message_Company updated'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/message_Company updated'), 
    'Company updated')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/_common/tab_Overall value'))

'Check value graph and calculator are displayed\r\n'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/_common/tab_Overall value'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/link_Overall value'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/_common/tab_Overall value'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/div_Estimated Profit in 5 Years'), 
    0)

// WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/div_Estimated Profit in 5 Years'))
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

'Set option to Hide value graph and calculator'
WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/input_Hide My Equity calculator and graph'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/_common/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/message_Company updated'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/message_Company updated'), 
    'Company updated')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

'Check value graph and calculator are NOT displayed'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/StatSquad/myEquity/_common/tab_Overall value'), 0)

WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/showHideSettings/link_Overall value'), 0)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

WebUI.click(findTestObject('StatSquad/myEquity/showHideSettings/input_No show the value graph and the calculator'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/_common/button_Save'))


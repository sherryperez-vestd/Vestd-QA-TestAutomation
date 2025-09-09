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
 * Test Case: Verify behavior of "Show diluted numbers on the My Equity page" setting
 *
 * Steps:
 * 1. Log in as staff user.
 * 2. Confirm the setting is visible and set to "Yes" on the Company admin page.
 * 3. Verify the diluted/undiluted toggle appears on the My Equity page.
 * 4. Change the setting to "No" and save.
 * 5. Confirm the toggle is no longer visible on the My Equity page.
 * 6. Reset the setting back to "Yes" for cleanup.
 */
not_run: WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

'Check \'Show diluted numbers on the My Equity page\' is set to Yes on Company page '
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/label_Show diluted numbers on the My Equity page'), 
    0)

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/label_Show diluted Yes'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/radio_Show diluted numbers Yes'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/label_Show diluted No'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/radio_Show diluted numbers No'), 0)

WebUI.verifyElementChecked(findTestObject('StatSquad/myEquity/showHideDilutedToggle/radio_Show diluted numbers Yes'), 10)

'Check Diluted Undiluted toggle is present on My Equity page'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.click(findTestObject('StatSquad/myEquity/_common/tab_Overall value'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/text_ Ownership view'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/span_ Un-Diluted'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/span_Diluted'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/toggle_diluted-undiluted'), 0)

'Check \'Show diluted numbers on the My Equity page\' is set to No on Company page '
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

WebUI.click(findTestObject('StatSquad/myEquity/showHideDilutedToggle/radio_Show diluted numbers No'))

WebUI.click(findTestObject('StatSquad/myEquity/_common/button_Save'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/div_Company updated'), 0)

'Check Diluted Undiluted toggle is NOT present on My Equity page'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.click(findTestObject('StatSquad/myEquity/_common/tab_Overall value'))

WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/text_ Ownership view'), 0)

WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/span_ Un-Diluted'), 0)

WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/span_Diluted'), 0)

'Set back \'Show diluted numbers on the My Equity page\' to Yes on Company page '
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')

WebUI.click(findTestObject('StatSquad/myEquity/showHideDilutedToggle/radio_Show diluted numbers Yes'))

WebUI.click(findTestObject('StatSquad/myEquity/_common/button_Save'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/div_Company updated'), 0)


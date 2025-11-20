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
 * 2. Confirm the setting is visible and set to "No" on the Company admin page.
 * 3. Confirm the toggle is no longer visible on the My Equity page.
 * 4. Reset the setting back to "Yes" for cleanup.
 */
'Login and navigate to My company admin page'
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

//WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/admin')
WebUI.navigateToUrl(GlobalVariable.staffCompanyAdminPage)

'Check \'Show diluted numbers on the My Equity page\' is set to Yes on Company page '
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/showHideDilutedToggle/label_Show diluted numbers on the My Equity page', 
    'Show diluted numbers on the My Equity page')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/showHideDilutedToggle/radio_showDiluted')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/showHideDilutedToggle/label_showDilutedYes', 
    'Yes')
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/showHideDilutedToggle/radio_showUndiluted')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/showHideDilutedToggle/label_noShowUndiluted', 
    'No, show undiluted numbers')

CustomKeywords.'UIKeywords.clickElement'('StatSquad/myEquity/showHideDilutedToggle/radio_showUndiluted')
CustomKeywords.'UIKeywords.clickElement'('StatSquad/myEquity/_common/button_Save')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/showHideSettings/message_Company updated',
	'Company updated')

//WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')
'Check Diluted Undiluted toggle is NOT present on My Equity page'
WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

WebUI.setText(findTestObject('StatSquad/myEquity/awardSection/input_estimatedProfitPerShare'), '1')
WebUI.scrollToElement(findTestObject('StatSquad/myEquity/_common/tab_Overall value'), 0)
WebUI.click(findTestObject('StatSquad/myEquity/_common/tab_Overall value'))

WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/span_ Un-Diluted'), 0)
WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/span_Diluted'), 0)
WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/showHideDilutedToggle/toggle_diluted-undiluted'), 0)


'Set back \'Show diluted numbers on the My Equity page\' to Yes '
WebUI.navigateToUrl(GlobalVariable.staffCompanyAdminPage)

CustomKeywords.'UIKeywords.clickElement'('StatSquad/myEquity/showHideDilutedToggle/radio_showDiluted')
CustomKeywords.'UIKeywords.clickElement'('StatSquad/myEquity/_common/button_Save')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/showHideSettings/message_Company updated', 
    'Company updated')

'Check Diluted Undiluted toggle is now present on My Equity page'
WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

WebUI.click(findTestObject('StatSquad/myEquity/_common/tab_Overall value'))

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/showHideDilutedToggle/text_ Ownership view')
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/showHideDilutedToggle/span_ Un-Diluted')
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/showHideDilutedToggle/span_Diluted')



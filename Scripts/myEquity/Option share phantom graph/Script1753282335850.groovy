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
 * Test Case: Verify presence and visibility of vesting graphs for all scheme types
 *
 * Steps:
 * 1. Log in as a staff user.
 * 2. Navigate to the My Equity page for each user representing a scheme type:
 *    - EMI, UO, CSOP, ESOP, GS, CS, Phantom (RSA test is skipped)
 * 3. For each scheme:
 *    - Verify the vesting tab is present, visible, and clickable.
 *    - Click the tab and confirm the corresponding vesting graph (canvas) is displayed.
 * 4. RSA vesting check is commented out (not run).
 */


//'Login and navigate to My equity page'
WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

'Check EMI vesting graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.verifyElementClickable(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.click(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-options'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-options'))

'Check UO vesting graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370417')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.verifyElementClickable(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.click(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-options'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-options'))

'Check CSOP vesting  graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370432')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.verifyElementClickable(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.click(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Option-vesting'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-options'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-options'))

'Check ESOP vesting graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/dashboard?user_id=370324')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-esop_Option-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-esop_Option-vesting'))

WebUI.verifyElementClickable(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-esop_Option-vesting'))

WebUI.click(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-esop_Option-vesting'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-esop'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-esop'))

'Check GS vesting graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370451')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/vesting-graph/tab_Share-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/vesting-graph/tab_Share-vesting'))

WebUI.verifyElementClickable(findTestObject('Object Repository/StatSquad/myEquity/graph/vesting-graph/tab_Share-vesting'))

WebUI.click(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Share-vesting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/vesting-graph/canvas-graph-options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/vesting-graph/canvas-graph-options'))

//'Check RSA vesting graph'
//not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370580')
//
//not_run: WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-link_Share-vesting'), 0)
//
//not_run: WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-link_Share-vesting'))
//
//not_run: WebUI.verifyElementClickable(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-link_Share-vesting'))
//
//not_run: WebUI.click(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-link_Share-vesting'))
//
//not_run: WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-shares'), 0)
//
//not_run: WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-shares'))
'Check CS vesting graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=382358')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-link_Share-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-link_Share-vesting'))

WebUI.verifyElementClickable(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-link_Share-vesting'))

WebUI.click(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab-link_Share-vesting'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-shares'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-shares'))

'Check Phantom vesting graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370449')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/vesting-graph/tab_Phantom-shares'))

WebUI.verifyElementClickable(findTestObject('Object Repository/StatSquad/myEquity/graph/vesting-graph/tab_Phantom-shares'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/vesting-graph/tab_Phantom-shares'),  0)

WebUI.click(findTestObject('StatSquad/myEquity/graph/vesting-graph/tab_Phantom-shares'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-phantom'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/vesting-graph/canvas-graph-phantom'))


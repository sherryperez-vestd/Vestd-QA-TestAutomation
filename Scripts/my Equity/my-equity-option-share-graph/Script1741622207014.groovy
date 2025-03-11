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

'Check EMI graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.verifyElementClickable(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.click(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/canvas-graph-options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/canvas-graph-options'))

'Check UO graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370417')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.verifyElementClickable(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.click(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/canvas-graph-options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/canvas-graph-options'))

'Check CSOP graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370432')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.verifyElementClickable(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.click(findTestObject('Object Repository/my-equity-page/graph/tab_Option-vesting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/canvas-graph-options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/canvas-graph-options'))

'Check ESOP graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/dashboard?user_id=370324')

WebUI.verifyElementPresent(findTestObject('my-equity-page/graph/tab-esop_Option-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/graph/tab-esop_Option-vesting'))

WebUI.verifyElementClickable(findTestObject('my-equity-page/graph/tab-esop_Option-vesting'))

WebUI.click(findTestObject('my-equity-page/graph/tab-esop_Option-vesting'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/graph/canvas-graph-esop'), 0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/graph/canvas-graph-esop'))

'Check GS graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370451')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/tab_Share-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/tab_Share-vesting'))

WebUI.verifyElementClickable(findTestObject('Object Repository/my-equity-page/graph/tab_Share-vesting'))

WebUI.click(findTestObject('my-equity-page/graph/tab_Share-vesting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/canvas-graph-options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/canvas-graph-options'))

'Check RSA graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370580')

WebUI.verifyElementPresent(findTestObject('my-equity-page/graph/tab-link_Share-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/graph/tab-link_Share-vesting'))

WebUI.verifyElementClickable(findTestObject('my-equity-page/graph/tab-link_Share-vesting'))

WebUI.click(findTestObject('my-equity-page/graph/tab-link_Share-vesting'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/graph/canvas-graph-shares'), 0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/graph/canvas-graph-shares'))

'Check CS graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370581')

WebUI.verifyElementPresent(findTestObject('my-equity-page/graph/tab-link_Share-vesting'), 0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/graph/tab-link_Share-vesting'))

WebUI.verifyElementClickable(findTestObject('my-equity-page/graph/tab-link_Share-vesting'))

WebUI.click(findTestObject('my-equity-page/graph/tab-link_Share-vesting'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/graph/canvas-graph-shares'), 0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/graph/canvas-graph-shares'))

'Check Phantom graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370449')

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/tab_Phantom-shares'))

WebUI.verifyElementClickable(findTestObject('Object Repository/my-equity-page/graph/tab_Phantom-shares'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/tab_Phantom-shares'), 0)

WebUI.click(findTestObject('my-equity-page/graph/tab_Phantom-shares'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/graph/canvas-graph-phantom'), 0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/graph/canvas-graph-phantom'))

WebUI.closeBrowser()


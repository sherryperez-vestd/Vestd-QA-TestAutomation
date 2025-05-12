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

'Check Company valuation history section with 0 valuations'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50066/dashboard?user_id=285633')

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/valuation-section/txt_0Valuations'), 'Valuations recorded by the company help show the actual growth of your shareholding up to today. Please contact the company to add a historical valuation.')

not_run: WebUI.verifyElementNotPresent(findTestObject('myEquity/valuation-section/btn_See_more'), 0)

WebUI.verifyElementNotPresent(findTestObject('myEquity/valuation-section/btn_See_more'), 0)

'Check Company valuation history section with 1 valuation'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/valuation-section/tile_1Company-valuation-history'))

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/valuation-section/tile_Current-valuation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/valuation-section/tile_Valuation-section'))

not_run: WebUI.verifyElementNotPresent(findTestObject('myEquity/valuation-section/btn_See_more'), 0)

WebUI.verifyElementNotPresent(findTestObject('myEquity/valuation-section/btn_See_more'), 0)

'Check Company valuation history section with 2 valuations'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/51622/dashboard?user_id=365693')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/valuation-section/tile_2Company-valuation-history'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/valuation-section/btn_See_more'), 0)

'Check See more link'
WebUI.verifyElementText(findTestObject('Object Repository/myEquity/valuation-section/btn_See_more'), 'See more')

WebUI.click(findTestObject('myEquity/valuation-section/btn_See_more'))

'Check Current valuation history Cancel CTA'
WebUI.verifyElementPresent(findTestObject('myEquity/valuation-section/button-cancel_Company-valuation-history-modal'), 0)

WebUI.click(findTestObject('myEquity/valuation-section/button-cancel_Company-valuation-history-modal'))

'Check Current valuation tooltip'
not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/valuation-section/tooltip-icon_Current-valuation'), 
    0)

not_run: WebUI.mouseOver(findTestObject('Object Repository/myEquity/valuation-section/tooltip-icon_Current-valuation'))

not_run: WebUI.click(findTestObject('Object Repository/myEquity/valuation-section/tooltip-icon_Current-valuation'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/myEquity/valuation-section/tooltip-txt_Current-valuation'), 
    'This valuation was added by the company on 10th January 2025.')

'Check Company valuation history tooltip'
not_run: WebUI.click(findTestObject('myEquity/valuation-section/tooltip-icon_Current-valuation'))

'Check Company valuation history tooltip'
not_run: WebUI.click(findTestObject('Object Repository/myEquity/valuation-section/tooltip-icon_Company-valuation-history'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/valuation-section/tooltip-icon_Company-valuation-history'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/valuation-section/tooltip-txt_Company-valuation-history'))

not_run: WebUI.verifyElementText(findTestObject('myEquity/valuation-section/tooltip-txt_Company-valuation-history'), 'Keep in mind that adjusting the company valuation toggle will instantly update the figures displayed on the graph')

'Check Company valuation history tooltip'
not_run: WebUI.click(findTestObject('Object Repository/myEquity/valuation-section/tooltip-icon_Company-valuation-history'))

WebUI.closeBrowser()


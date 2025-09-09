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
 * Test Case: Verify Company Valuation History Display on My Equity Page
 *
 * Steps:
 * 1. Login as a staff user and navigate to My Equity page for 3 companies.
 * 2. For each company:
 *    - 0 valuations: Confirm placeholder text and absence of "See more" button.
 *    - 1 valuation: Check valuation tiles are visible; "See more" should be hidden.
 *    - 2+ valuations: Verify "See more" appears and opens modal on click.
 * 3. Confirm presence and function of cancel CTA in modal.
 * 4. Tooltip checks for valuations are currently commented out.
 */
'Login and navigate to My equity page'
not_run: WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

'Check Company valuation history section with 0 valuations'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50066/dashboard?user_id=285633')

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/txt_0Valuations'), 'Valuations recorded by the company help show the actual growth of your shareholding up to today. Please contact the company to add a historical valuation.')

//WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/valuationSection/btn_See_more'), 0)
WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/valuationSection/btn_See_more'), 0)

'Check Company valuation history section with 1 valuation'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/tile_1Company-valuation-history'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/tile_Current-valuation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/tile_Valuation-section'))

//WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/valuationSection/btn_See_more'), 0)
WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/valuationSection/btn_See_more'), 0)

'Check Company valuation history section with 2 valuations'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/51622/dashboard?user_id=365693')

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/tile_2Company-valuation-history'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/btn_See_more'), 0)

'Check See more link'
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/btn_See_more'), 'See more')

WebUI.click(findTestObject('StatSquad/myEquity/valuationSection/btn_See_more'))

'Check Current valuation history Cancel CTA'
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/valuationSection/button-cancel_Company-valuation-history-modal'), 
    0)

WebUI.click(findTestObject('StatSquad/myEquity/valuationSection/button-cancel_Company-valuation-history-modal'))

'Check Current valuation tooltip'

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/tooltip-icon_Current-valuation'), 0)
//WebUI.mouseOver(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/tooltip-icon_Current-valuation'))
// WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/tooltip-icon_Current-valuation'))
// WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/valuationSection/tooltip-txt_Current-valuation'), 'This valuation was added by the company on 10th January 2025.')
'Check Company valuation history tooltip'

// WebUI.click(findTestObject('StatSquad/myEquity/valuationSection/tooltip-icon_Current-valuation'))
'Check Company valuation history tooltip'


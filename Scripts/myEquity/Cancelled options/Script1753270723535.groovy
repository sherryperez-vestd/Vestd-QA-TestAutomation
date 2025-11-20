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
 * Test Case: Validate cancelled and part-cancelled options display on My Equity
 *
 * URL: https://demo.app.vestd.com/company/50135/dashboard?user_id=370192
 *
 * Steps:
 * 1. Navigate to user's My Equity page and expand “Projected value”.
 * 2. Verify “Cancelled: 40” label and value are shown.
 * 3. Go to Agreement Summary and click “Reverse” to undo cancellation → accept alert.
 * 4. Confirm cancelled label/value are no longer visible on My Equity.
 * 5. Navigate again to Agreement Summary → perform part-cancellation of 40 shares.
 * 6. Confirm “Cancelled: 40” is displayed again on My Equity.
 */
// Login
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

'Login and navigate to My equity page'
WebUI.navigateToUrl(GlobalVariable.cancelledOptionsURL)

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/_common/span_summayBarChevron'))

'Check Cancelled label and value are displayed on My Equity'
WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/span_Cancelled'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/span_Cancelled'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/span_Cancelled'), 
    'Cancelled:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/strong_40'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/strong_40'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/strong_40'), 
    '40')

'Go to summary agreement and reverse cancellation '
WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/a_View agreement summary'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/agreementsPage/button_Reverse'))

WebUI.acceptAlert()

'Check Cancelled label and value are NOT displayed on My Equity\r\n'
WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/agreementsPage/a_Recipient My Equity page'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/_common/span_summayBarChevron'))

WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/cancelledDeferred/myEquityPage/span_Cancelled'), 0)

WebUI.verifyElementNotPresent(findTestObject('StatSquad/myEquity/cancelledDeferred/myEquityPage/strong_40'), 0)

'Go to summary agreement and part cancel some option'
WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/a_View agreement summary'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/agreementsPage/a_Part cancel this option'))

WebUI.setText(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/cancelAgreementPage/input_Number to cancel_number_to_cancel'), 
    '40')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/cancelAgreementPage/label_This option is being part-cancelled'))

WebUI.setText(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/cancelAgreementPage/textarea_Additional notes_reason'), 
    'x')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/cancelAgreementPage/input_The reason for the part-cancellation'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/cancelAgreementPage/button_Yes, cancel 40 shares'))

'Check Cancelled label and value are displayed on My Equity'
WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/agreementsPage/a_Recipient My Equity page'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/_common/span_summayBarChevron'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/span_Cancelled'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/span_Cancelled'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/span_Cancelled'), 
    'Cancelled:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/strong_40'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/strong_40'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/cancelledDeferred/myEquityPage/strong_40'), 
    '40')


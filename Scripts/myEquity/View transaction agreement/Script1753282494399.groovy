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
import com.kms.katalon.core.configuration.RunConfiguration

/**
 * Test Case: Verify transaction history modal content on My Equity page
 *
 * Steps:
 * 1. Navigate directly to a recipient’s My Equity page.
 * 2. Expand the summary bar and open the "View transactions" modal.
 * 3. Verify presence and visibility of all transaction history elements, including:
 *    - Section titles, share counts, transaction labels, equity details, and date.
 *    - Ensure values (e.g., shares issued, price paid) match expected text.
 * 4. Close the modal and confirm that post-close elements (e.g., "View agreement summary") are visible.
 */

'Login and navigate to My equity page'
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

//WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')
WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

'Check View transactions history window elements (labels and values)'
WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/chevron_summary bar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_View transactions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_View transactions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_View transactions'), 
    'View transactions')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_View transactions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/h5_Transaction History'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/h5_Transaction History'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/h5_Transaction History'), 
    'Transaction History')

String currentProfile = RunConfiguration.getExecutionProfile()

if (currentProfile == 'Demo') {
	WebUI.comment("Running verification steps for profile: ${currentProfile}")
	verifyTransactionHistoryDetailsDemo()
} else {
	WebUI.comment("Skipping verification — current profile is '${currentProfile}', not 'Demo'")
	verifyTransactionHistoryDetailsGB4()
}

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_'), 0)
WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_Close'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_Close'),  0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_Close'),
	'Close')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_Close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/a_View agreement summary'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/a_View agreement summary'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/a_View agreement summary'),
	'View agreement summary')


def verifyTransactionHistoryDetailsGB4() {	
	WebUI.verifyTextPresent('-30 Ordinary shares', false)
	WebUI.verifyTextPresent('Cancellation: -30 Ordinary (voting)', false)
	WebUI.verifyTextPresent('Shares with equity rights: 0.0015%', false)
	WebUI.verifyTextPresent('Price received per share: £0.03333', false)
	WebUI.verifyTextPresent('Total price received: £1.00', false)
	WebUI.verifyTextPresent('Cancelled on: 25th Feb 2025', false)	
}

def verifyTransactionHistoryDetailsDemo() {

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/p_250 Ordinary shares'))

WebUI.verifyTextPresent('-100 Ordinary shares', false)

WebUI.verifyTextPresent('Redeemed on: 17th Oct 2025', false)

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/p_250 Ordinary shares'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/p_250 Ordinary shares'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/p_250 Ordinary shares'), 
    '250 Ordinary shares')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_Transaction_Number'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_Transaction_Number'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_Transaction_Number'), 
    '3')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Transaction'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Transaction'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Transaction'), 
    'Transaction:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Related to'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Related to'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Related to'), 
    'Related to:')

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_FTest LTest option'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_FTest LTest option'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_FTest LTest option'), 
    'FTest LTest option')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Share issue'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Share issue'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Share issue'), 
    'Share issue:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250 Ordinary (voting)'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250 Ordinary (voting)'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250 Ordinary (voting)'), 
    '250 Ordinary (voting)')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Shares with equity rights'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Shares with equity rights'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Shares with equity rights'), 
    'Shares with equity rights:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_0.0050'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_0.0050'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_0.0050'), 
    '0.0055%')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Price paid per share'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Price paid per share'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Price paid per share'), 
    'Price paid per share:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_1.00'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_1.00'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_1.00'), 
    '£1.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Total price paid'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Total price paid'),  0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Total price paid'), 
    'Total price paid:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250.00'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250.00'),  0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250.00'), 
    '£250.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Issued on'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Issued on'),  0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Issued on'), 
    'Issued on:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_20th Feb 2025'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_20th Feb 2025'),  0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_20th Feb 2025'), 
    '20th Feb 2025')
}






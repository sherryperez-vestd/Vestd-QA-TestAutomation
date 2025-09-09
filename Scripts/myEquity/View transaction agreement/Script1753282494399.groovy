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

//WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)
'Login and navigate to My equity page'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

'Check View transactions history window elements (labels and values)'
WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/chevron_summary bar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_View transactions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_View transactions'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_View transactions'), 'View transactions')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/button_View transactions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/h5_Transaction History'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/h5_Transaction History'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/h5_Transaction History'), 'Transaction History')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/p_250 Ordinary shares'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/p_250 Ordinary shares'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/p_250 Ordinary shares'), '250 Ordinary shares')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Transaction'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Transaction'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Transaction'), 'Transaction:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_Transaction_Number'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_Transaction_Number'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_Transaction_Number'), '2')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Related to'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Related to'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Related to'), 'Related to:')

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_FTest LTest option'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_FTest LTest option'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_FTest LTest option'), 'FTest LTest option')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Share issue'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Share issue'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Share issue'), 'Share issue:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250 Ordinary (voting)'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250 Ordinary (voting)'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_250 Ordinary (voting)'), '250 Ordinary (voting)')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Shares with equity rights'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Shares with equity rights'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/span_Shares with equity rights'), 
    'Shares with equity rights:')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_0.0050'))

// WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_0.0050'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/strong_0.0050'), 
    '0.0050%')

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


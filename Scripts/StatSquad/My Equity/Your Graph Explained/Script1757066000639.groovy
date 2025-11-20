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
 * Test Case: Verify "Your Graph Explained" section in My Equity dashboard 
 * Ensure the "Your graph explained" section is visible, expandable, and displays correct data
 * for EMI and GS scheme users.
 * 1. Log in as a staff user.
 * 2. Navigate to:
 *    - EMI user dashboard: https://demo.app.vestd.com/company/50135/dashboard?user_id=365431
 *    - GS user dashboard:  https://demo.app.vestd.com/company/50135/dashboard?user_id=370451
 * 3. For each user:
 *    - Click "Overall value" tab (if present).
 *    - Expand "Your graph explained" section.
 *    - Verify presence and visibility of:
 *        - Section title, breakdown table headers (e.g., Month, Value per share).
 *        - Additional messages for GS (e.g., "Watch your share value grow!", hurdle message).
 */
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

//WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')
WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

WebUI.setText(findTestObject('StatSquad/myEquity/awardSection/input_estimatedProfitPerShare'), '1')

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/_common/tab_overall-value'), 0)

WebUI.click(findTestObject('StatSquad/myEquity/_common/tab_overall-value'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/graphExplained/chevron_yourGraphExplained', 
    'Your graph explained')

WebUI.click(findTestObject('StatSquad/myEquity/graphExplained/chevron_yourGraphExplained'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/graphExplained/th_monthByMonthBreakdown', 
    'Month-by-month breakdown:')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/graphExplained/th_Month', 'Month')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/graphExplained/th_valuationConsidered')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/graphExplained/th_companyEquity')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/graphExplained/th_recipientEquity', 'Recipient equity')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/graphExplained/th_valuePerShare', 'Value per share')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/graphExplained/th_recipientValue', 'Recipient value')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/graphExplained/th_recipientCost', 'Recipient Cost')

WebUI.navigateToUrl(GlobalVariable.GSVestingGraphURL)

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/graphExplained/heading_yourGraphExplained', 
    'Your graph explained')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/chevron_yourGraphExplained GS'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/graphExplained/txt_watchYourShareValueGrow', 
    'Watch your share value grow!')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/myEquity/graphExplained/txt_hurdleMessage')


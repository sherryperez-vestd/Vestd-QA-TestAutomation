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
 * This test script logs in to the application and navigates to the company dashboard
 * at URL: https://demo.app.vestd.com/company/50135/dashboard?user_id=365431.
 * It verifies the 'Your vesting details' section, including both 'Scheduled Vesting'
 * and 'Manual Vesting' tabs. The script checks that headings, tooltips, and table
 * headers such as 'Vested', 'Date', and 'Number of shares' are visible and display
 * the correct text. Custom keywords are used for cleaner verification of element
 * presence and content.
 */
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

//WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')
WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/Transaction History/chevron_summary bar'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/convertibles/span_myConvertibleBreakdown', 
    'My convertibles breakdown')

WebUI.verifyTextPresent('CN - CN: £0.00', false)

WebUI.verifyTextPresent('Issued on: 17th Oct 2025', false)

WebUI.verifyTextPresent('Maturity date: 17th Oct 2025', false)

WebUI.verifyTextPresent('SAFE/ASA - SAFE/ASA: €0.00', false)

WebUI.verifyTextPresent('Longstop date: 17th Oct 2025', false)

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/convertibles/a_viewAgreementSummary_CN')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/convertibles/a_viewAgreementSummary_SAFE')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/convertibles/span_completed')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/convertibles/span_myInvestmentText', 'My Investment')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/convertibles/span_myInvestmentAmount', '£100,000.00')


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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

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

WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/span_yourVestingDetails', 
    'Your vesting details')

WebUI.click(findTestObject('StatSquad/myEquity/vestingDetails/span_yourVestingDetails'))

// === Scheduled Vesting Tab Verification ===
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/a_scheduledVestingTab', 'Scheduled vesting')

WebUI.click(findTestObject('StatSquad/myEquity/vestingDetails/a_scheduledVestingTab'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/h5_FullSchedule', 'Full schedule (49 tranches)')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/vestingDetails/span_tooltipIconFullSched')

WebUI.click(findTestObject('StatSquad/myEquity/vestingDetails/span_tooltipIconFullSched'))

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/vestingDetails/span_tooltipTextFullSched')

WebUI.click(findTestObject('StatSquad/myEquity/vestingDetails/span_tooltipIconFullSched'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/th_Vested', 'Vested')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/th_vestingPeriod', 'Vesting period')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/th_numberOfShares', 'Number of shares')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/th_agreementName', 'Agreement name')

// === Manual Vesting Tab Verification ===
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/a_manualVestingTab', 'Manual vesting')

WebUI.click(findTestObject('StatSquad/myEquity/vestingDetails/a_manualVestingTab'))

String currentProfile = RunConfiguration.getExecutionProfile()

if (currentProfile == 'Demo') {
	CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/h5_fullHistory', 'Full history (1 event)')
} else {
	WebUI.verifyTextPresent('Full history (3 events)', false)
}


CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/vestingDetails/span_tooltipIconFullHistory')

WebUI.click(findTestObject('StatSquad/myEquity/vestingDetails/span_tooltipIconFullHistory'))

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('StatSquad/myEquity/vestingDetails/span_tooltipTextFullHistory')

WebUI.click(findTestObject('StatSquad/myEquity/vestingDetails/span_tooltipIconFullHistory'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/th_Vested2', 'Vested')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/th_Date', 'Date')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/th_numberOfShares2', 'Number of shares')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/myEquity/vestingDetails/th_agreementName2', 'Agreement name')




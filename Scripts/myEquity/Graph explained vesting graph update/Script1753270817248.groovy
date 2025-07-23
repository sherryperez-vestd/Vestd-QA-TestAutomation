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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/tab_overall-value'), 0)

WebUI.click(findTestObject('StatSquad/myEquity/graph/tab_overall-value'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/heading_yourGraphExplained'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/heading_yourGraphExplained'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/heading_yourGraphExplained'), 
    'Your graph explained')

WebUI.click(findTestObject('StatSquad/myEquity/graphExplained/chevron_yourGraphExplained'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/th_monthByMonthBreakdown'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graphExplained/th_monthByMonthBreakdown'))

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/graphExplained/th_monthByMonthBreakdown'), 'Month-by-month breakdown:')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/th_Month'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/graphExplained/th_Month'), 'Month')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/th_valuationConsidered'), 0)

//WebUI.verifyElementText(findTestObject('StatSquad/myEquity/graphExplained/th_valuationConsidered'), 
//   'Valuation')
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/th_companyEquity'), 0)

//WebUI.verifyElementText(findTestObject('StatSquad/myEquity/graphExplained/th_companyEquity'), 'Company equity')
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/th_recipientEquity'), 0)

//WebUI.verifyElementText(findTestObject('StatSquad/myEquity/graphExplained/th_recipientEquity'), 'Recipient equity')
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/th_valuePerShare'), 0)

//WebUI.verifyElementText(findTestObject('StatSquad/myEquity/graphExplained/th_valuePerShare'), 'Value per share ')
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/th_recipientValue'), 0)

//WebUI.verifyElementText(findTestObject('StatSquad/myEquity/graphExplained/th_valuePerShare'), 'Recipient value')
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/th_recipientCost'), 0)

//WebUI.verifyElementText(findTestObject('StatSquad/myEquity/graphExplained/th_recipientCost'), 'Recipient Cost')
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370451')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/heading_yourGraphExplained'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/heading_yourGraphExplained'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/heading_yourGraphExplained'), 
    'Your graph explained')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graphExplained/heading_yourGraphExplained'), 0)

//WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graphExplained/chevron_yourGraphExplained'))
//
//WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/vestingDetails/chevron_yourVestingSchedule'))
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/txt_watchYourShareValueGrow'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/txt_watchYourShareValueGrow'), 
    'Watch your share value grow!')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/txt_hurdleMessage'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graphExplained/txt_hurdleMessage'))


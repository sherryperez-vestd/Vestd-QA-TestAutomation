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

'Login and navigate to My equity page'
not_run: WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/dashboard?user_id=370447')

WebUI.click(findTestObject('StatSquad/myEquity/_common/span_summayBarChevron'))

'Check Buyback label and value are displayed'
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/span_Buyback'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/span_Buyback'), 'Buyback:')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/strong_textBuyback'), 
    0)

CustomKeywords.'UIKeywords.verifyElementTextNotEmpty'('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/strong_textBuyback')

WebUI.click(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/span_Cancelled_static-content'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/li_Buyback tooltip text'), 
    0)

def elementText = WebUI.getText(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/li_Buyback tooltip text'))

assert elementText.contains('Buyback:')

WebUI.click(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/span_Cancelled_static-content'))


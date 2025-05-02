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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/dashboard?user_id=370447')

WebUI.click(findTestObject('myEquity/shares-options-breakdown/chevron_summary-bar'))

WebUI.click(findTestObject('myEquity/shares-options-breakdown/options-breakdown/span_Cancelled_static-content'))

WebUI.verifyElementPresent(findTestObject('myEquity/shares-options-breakdown/options-breakdown/span_Buyback'), 0)

WebUI.verifyElementText(findTestObject('myEquity/shares-options-breakdown/options-breakdown/span_Buyback'), 'Buyback:')

WebUI.verifyElementPresent(findTestObject('myEquity/shares-options-breakdown/options-breakdown/strong_200'), 0)

WebUI.verifyElementText(findTestObject('myEquity/shares-options-breakdown/options-breakdown/strong_200'), '200')

WebUI.click(findTestObject('myEquity/shares-options-breakdown/options-breakdown/span_Cancelled_static-content'))

WebUI.waitForElementPresent(findTestObject('myEquity/shares-options-breakdown/options-breakdown/li_Buyback tooltip text'), 
    0)

WebUI.verifyElementPresent(findTestObject('myEquity/shares-options-breakdown/options-breakdown/li_Buyback tooltip text'), 
    0)

WebUI.verifyElementText(findTestObject('myEquity/shares-options-breakdown/options-breakdown/li_Buyback tooltip text'), 'Buyback: These options are those that have been repurchased by the company that granted them, allowing you to sell them back. This number represents the total options the company has bought back from you.')

WebUI.closeBrowser()


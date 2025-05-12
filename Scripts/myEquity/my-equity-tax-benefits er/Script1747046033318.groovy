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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370192')

WebUI.click(findTestObject('Object Repository/myEquity/tax-benefits/i_Your tax benefits_'))

WebUI.setText(findTestObject('myEquity/tax-benefits/input__NU9uoaRq4tbBNoSa'), '1')

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/tax-benefits/p_When you exercise your options, you wont _c4009e'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/tax-benefits/p_When you exercise your options, you wont _c4009e'), 
    0)

def mes = WebUI.getText(findTestObject('Object Repository/myEquity/tax-benefits/p_When you exercise your options, you wont _c4009e'))

if (!(mes.contains('14%'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/tax-benefits/p_When you exercise your options, you wont _367393'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/tax-benefits/p_When you exercise your options, you wont _367393'), 
    0)

def mes2 = WebUI.getText(findTestObject('Object Repository/myEquity/tax-benefits/p_When you exercise your options, you wont _367393'))

if (!(mes2.contains('20%'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

WebUI.closeBrowser()


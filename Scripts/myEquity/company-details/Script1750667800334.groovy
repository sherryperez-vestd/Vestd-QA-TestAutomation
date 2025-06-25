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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/span_Company details'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/span_Company details'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Registered name'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Registered name'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Registered name value'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Registered name value'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Incorporation date'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Incorporation date'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Incorporation date value'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Incorporation date value'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Company number'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Company number'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Company number value'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Company number value'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Address'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Address'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Address value'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Address value'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Shares issued'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Shares issued'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Shares issued value'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Shares issued value'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Shareholders'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Shareholders'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/p_Shareholders value'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/p_Shareholders value'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/company-details/a_View-AoA'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/company-details/a_View-AoA'))

WebUI.verifyElementClickable(findTestObject('StatSquad/myEquity/company-details/a_View-AoA'))

WebUI.click(findTestObject('StatSquad/myEquity/company-details/a_View-AoA'))

'Check AoA link opens file'
currentWindow = WebUI.getWindowIndex()

//WebUI.switchToWindowIndex(currentWindow)
WebUI.switchToWindowIndex(currentWindow + 1)

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://demo.app.vestd.com/company/50135/legal-doc/521803')

WebUI.closeBrowser()


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

'Login and navigate to the home page'
WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/home')

'Check Dashboard menu is present and opens correct URL'
WebUI.verifyElementPresent(findTestObject('CoCo/navigation/top-nav/a_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/top-nav/a_Dashboard'), 'Dashboard')

WebUI.click(findTestObject('CoCo/navigation/top-nav/a_Dashboard'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://demo.app.vestd.com/company/all')

'Check Earn referal menu is NOT present in all company page'
WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/top-nav/a_Earn'), 0)

WebUI.back()

'Check Staff menu is NOT present'
WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/top-nav/a_Staff'), 0)

'Check Earn referal menu is present'
WebUI.verifyElementPresent(findTestObject('CoCo/navigation/top-nav/a_Earn'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/top-nav/a_Earn'), 'Earn £100')

'Check Information menu is present and opens correct URL'
WebUI.verifyElementPresent(findTestObject('CoCo/navigation/top-nav/a_Information'), 0)

WebUI.click(findTestObject('CoCo/navigation/top-nav/a_Information'))

currentWindow = WebUI.getWindowIndex()

//WebUI.switchToWindowIndex(currentWindow)
WebUI.switchToWindowIndex(currentWindow + 1)

url = WebUI.getUrl()

split_url = url.split('/')

removedurlchars = (split_url[(split_url.size() - 1)])

partial_url = url.minus(removedurlchars)

WebUI.verifyEqual(partial_url, 'https://www.vestd.com/')

//WebUI.closeWindowTitle('Vestd Help Centre')
WebUI.switchToWindowIndex(currentWindow)

'Check Notification menu is present'
WebUI.verifyElementPresent(findTestObject('CoCo/navigation/top-nav/a_Notification'), 0)

'Check User account menu is present'
WebUI.verifyElementPresent(findTestObject('CoCo/navigation/top-nav/a_user-account'), 0)

WebUI.closeBrowser()


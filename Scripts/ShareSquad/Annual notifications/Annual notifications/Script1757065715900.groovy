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

WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/annual-hmrc-notification')

WebUI.verifyElementPresent(findTestObject('ShareSquad/annualNotifications/span_Tax year ending 5th April'), 0)

WebUI.verifyElementText(findTestObject('ShareSquad/annualNotifications/span_Tax year ending 5th April'), 'Tax year ending 5th April')

WebUI.verifyElementPresent(findTestObject('ShareSquad/annualNotifications/btn_Year'), 0)

WebUI.verifyElementPresent(findTestObject('ShareSquad/annualNotifications/btn_Update'), 0)

WebUI.click(findTestObject('ShareSquad/annualNotifications/a_EMI Start notification'))

WebUI.click(findTestObject('ShareSquad/annualNotifications/btn_Mark complete'))

WebUI.click(findTestObject('ShareSquad/annualNotifications/btn_Save'))

WebUI.verifyTextPresent('Notification details updated.', false)

WebUI.click(findTestObject('ShareSquad/annualNotifications/btn_Reverse'))

WebUI.click(findTestObject('ShareSquad/annualNotifications/btn_YesDelete'))

WebUI.verifyTextPresent('Notification reversed successfully.', false)

WebUI.verifyElementPresent(findTestObject('ShareSquad/annualNotifications/a_EMI Start notification'), 0)

WebUI.closeBrowser()


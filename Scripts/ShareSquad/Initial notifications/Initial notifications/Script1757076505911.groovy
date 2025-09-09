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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/option/hmrc-notification')

WebUI.verifyElementPresent(findTestObject('ShareSquad/initialNotifications/a_Start this initial notification'), 0)

WebUI.click(findTestObject('ShareSquad/initialNotifications/a_Start this initial notification'))

WebUI.verifyElementPresent(findTestObject('ShareSquad/initialNotifications/input_Save and confirm HMRC submission'), 0)

WebUI.verifyElementPresent(findTestObject('ShareSquad/initialNotifications/a_Back to initial notifications'), 0)

WebUI.click(findTestObject('ShareSquad/initialNotifications/a_Back to initial notifications'))

WebUI.verifyTextPresent('Your unreported EMI options', false)

WebUI.verifyTextPresent('Completed initial notifications', false)

WebUI.scrollToElement(findTestObject('ShareSquad/initialNotifications/a_View'), 0)

WebUI.verifyElementPresent(findTestObject('ShareSquad/initialNotifications/a_View'), 0)

WebUI.click(findTestObject('ShareSquad/initialNotifications/a_View'))

WebUI.verifyTextPresent('EMI initial notification', false)

WebUI.click(findTestObject('ShareSquad/initialNotifications/a_Back to initial notifications'))

WebUI.verifyTextPresent('EMI initial notifications to HMRC', false)

WebUI.closeBrowser()


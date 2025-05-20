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
WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370192')

WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/i_Projected value_vi vi-sm mt-auto ml-lg-2 _17a5ba'))
'Check Cancelled label and value are displayed on My Equity'
WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/span_Cancelled'))
WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/span_Cancelled'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/span_Cancelled'), 'Cancelled:')
WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/strong_40'))
WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/strong_40'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/strong_40'), '40')

'Go to summary agreement and reverse cancellation '
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/a_View agreement summary'))
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/agreements-page/button_Reverse'))
WebUI.acceptAlert()

'Check Cancelled label and value are NOT displayed on My Equity\r\n'
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/agreements-page/a_Recipient My Equity page'))
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/i_Projected value_vi vi-sm mt-auto ml-lg-2 _17a5ba'))
WebUI.verifyElementNotPresent(findTestObject('myEquity/cancelled-deferred/my-equity-page/span_Cancelled'), 0)
WebUI.verifyElementNotPresent(findTestObject('myEquity/cancelled-deferred/my-equity-page/strong_40'), 0)

'Go to summary agreement and part cancell some option'
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/a_View agreement summary'))
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/agreements-page/a_Part cancel this option'))
WebUI.setText(findTestObject('Object Repository/myEquity/cancelled-deferred/cancel-agreement-page/input_Number to cancel_number_to_cancel'), '40')
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/cancel-agreement-page/label_This option is being part-cancelled i_126efc'))
WebUI.setText(findTestObject('Object Repository/myEquity/cancelled-deferred/cancel-agreement-page/textarea_Additional notes_reason'), 'x')
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/cancel-agreement-page/input_The reason for the part-cancellation__66b55e'))
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/cancel-agreement-page/button_Yes, cancel 40 shares'))

'Check Cancelled label and value are displayed on My Equity'
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/agreements-page/a_Recipient My Equity page'))
WebUI.click(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/i_Projected value_vi vi-sm mt-auto ml-lg-2 _17a5ba'))
WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/span_Cancelled'))
WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/span_Cancelled'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/span_Cancelled'), 'Cancelled:')
WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/strong_40'))
WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/strong_40'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/myEquity/cancelled-deferred/my-equity-page/strong_40'), '40')

WebUI.closeBrowser()


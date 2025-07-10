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

//WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)
'Login and navigate to My equity page'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

'Check Unknown cost section elements(text, labels)'
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/txt-heading_unknown-cost'), 'Unknown cost')

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/txt_unknown-cost-lead-text'), 
    'We don’t have a record of how much you paid for these shareholdings, so we’ve defaulted to nominal value. Update the price you paid for these shares to see your actual profit.')

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/td_Price paid'), 'Price paid')

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/td_Details'), 'Details')

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/unknown-cost/a_Update price'), 'Update price')

WebUI.verifyElementClickable(findTestObject('StatSquad/myEquity/unknown-cost/a_Update price'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/small_0.0001 nominal value'), 
    '£0.0001 nominal value')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/small_shares_date_issued'), 
    0)

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/unknown-cost/b_1,000 shares'), '1,000 shares')

'Check update price elements (link, labels, CTAs(edit, save, cancel)'
WebUI.click(findTestObject('StatSquad/myEquity/unknown-cost/a_Update price'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/label_price-paid-input'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/label_price-paid-input'))

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/unknown-cost/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/unknown-cost/button_Cancel'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/unknown-cost/button_Cancel'), 'Cancel')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/unknown-cost/button_Save'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/unknown-cost/button_Save'))

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/unknown-cost/button_Save'), 'Save')

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/input-label-currency'), '£')

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/input-label_per-share'), '/share')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/input_price-paid'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/input_price-paid'))

'Check Price Paid value can be edited and saved'
WebUI.setText(findTestObject('Object Repository/StatSquad/myEquity/unknown-cost/input_price-paid'), '1')

WebUI.click(findTestObject('StatSquad/myEquity/unknown-cost/button_Cancel'))

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/unknown-cost/b_-shares'), '£-/shares')

WebUI.click(findTestObject('StatSquad/myEquity/unknown-cost/a_Update price'))

WebUI.setText(findTestObject('StatSquad/myEquity/unknown-cost/input_price-paid'), '1')

WebUI.click(findTestObject('StatSquad/myEquity/unknown-cost/button_Save'))

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/unknown-cost/b_1.00shares'), '£1.00/shares')

WebUI.click(findTestObject('StatSquad/myEquity/unknown-cost/a_Update price'))

WebUI.setText(findTestObject('StatSquad/myEquity/unknown-cost/input_price-paid'), '')

WebUI.click(findTestObject('StatSquad/myEquity/unknown-cost/button_Save'))

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/unknown-cost/b_1.00shares'), FailureHandling.STOP_ON_FAILURE)


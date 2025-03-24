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

WebUI.callTestCase(findTestCase('users/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

'Check Unknown cost section'
WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/unknown-cost/div_unknown-cost-section'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/unknown-cost/div_unknown-cost-section'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/txt-heading_unknown-cost'), 'Unknown cost')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/txt_unknown-cost-lead-text'), 'We don’t have a record of how much you paid for these shareholdings, so we’ve defaulted to nominal value. Update the price you paid for these shares to see your actual profit.')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/td_Price paid'), 'Price paid')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/td_Details'), 'Details')

WebUI.verifyElementText(findTestObject('my-equity-page/unknown-cost/a_Update price'), 'Update price')

WebUI.verifyElementClickable(findTestObject('my-equity-page/unknown-cost/a_Update price'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/small_0.0001 nominal value'), '£0.0001 nominal value')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/small_Issued 28th January 2025'), 
    'Issued 28th January 2025')

WebUI.verifyElementText(findTestObject('my-equity-page/unknown-cost/b_1,000 shares'), '1,000 shares')

'Check update price link / edit / save cancel CTA'
WebUI.click(findTestObject('my-equity-page/unknown-cost/a_Update price'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/unknown-cost/label_price-paid-input'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/unknown-cost/label_price-paid-input'))

WebUI.verifyElementVisible(findTestObject('my-equity-page/unknown-cost/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/unknown-cost/button_Cancel'), 0)

WebUI.verifyElementText(findTestObject('my-equity-page/unknown-cost/button_Cancel'), 'Cancel')

WebUI.verifyElementPresent(findTestObject('my-equity-page/unknown-cost/button_Save'), 0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/unknown-cost/button_Save'))

WebUI.verifyElementText(findTestObject('my-equity-page/unknown-cost/button_Save'), 'Save')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/input-label-currency'), '£')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/unknown-cost/input-label_per-share'), '/share')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/unknown-cost/input_price-paid'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/unknown-cost/input_price-paid'))

WebUI.setText(findTestObject('Object Repository/my-equity-page/unknown-cost/input_price-paid'), '1')

WebUI.click(findTestObject('my-equity-page/unknown-cost/button_Cancel'))

WebUI.verifyElementText(findTestObject('my-equity-page/unknown-cost/b_-shares'), '£-/shares')

WebUI.click(findTestObject('my-equity-page/unknown-cost/a_Update price'))

WebUI.setText(findTestObject('Object Repository/my-equity-page/unknown-cost/input__dUi7WcQlvuLdEEw0'), '1')

WebUI.click(findTestObject('my-equity-page/unknown-cost/button_Save'))

WebUI.verifyElementText(findTestObject('my-equity-page/unknown-cost/b_1.00shares'), '£1.00/shares')

WebUI.click(findTestObject('my-equity-page/unknown-cost/a_Update price'))

WebUI.setText(findTestObject('my-equity-page/unknown-cost/input__dUi7WcQlvuLdEEw0'), '')

WebUI.click(findTestObject('my-equity-page/unknown-cost/button_Save'))

WebUI.verifyElementVisible(findTestObject('my-equity-page/unknown-cost/b_1.00shares'), FailureHandling.STOP_ON_FAILURE)


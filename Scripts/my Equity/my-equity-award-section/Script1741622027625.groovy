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

WebUI.callTestCase(findTestCase('user-login'), [:], FailureHandling.STOP_ON_FAILURE)

'Check EMI vesting schedule'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/award-section/div_Award table'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/award-section/div_Award table'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/txt_heading-Award (No. of shares)'), 
    'Award (No. of shares)')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/txt_heading-Total value'), 
    'Total value')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award-total-value'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award-total-value'))

WebUI.click(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award-total-value'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/award-section/tooltip-text_award-total-value'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/tooltip-text_award-total-value'), 
    'This amount shows the total value of your options before any tax or exercise price deductions')

WebUI.click(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award-total-value'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/txt_heading-Total price to pay'), 
    'Total price to pay')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award_total-price-to-pay'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award_total-price-to-pay'))

WebUI.click(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award_total-price-to-pay'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/award-section/tooltip-text_total-price-to-pay'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/award-section/tooltip-text_total-price-to-pay'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/tooltip-text_total-price-to-pay'), 
    'Total Price to Pay is the total amount you’ll need to pay to exercise your options. It’s calculated by multiplying the exercise price (the fixed price per share) by the number of options you’re exercising.')

WebUI.click(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award_total-price-to-pay'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/txt_heading-Pre-tax profit'), 
    'Pre-tax profit')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award-pre-tax-profit'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award-pre-tax-profit'))

WebUI.click(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award-pre-tax-profit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/award-section/tooltip-text_award-pre-tax-profit'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/award-section/tooltip-text_award-pre-tax-profit'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/tooltip-text_award-pre-tax-profit'), 
    'This amount shows the total value of your options after the exercise price is deducted, but before taxes are applied')

WebUI.click(findTestObject('Object Repository/my-equity-page/award-section/tooltip-icon_award-pre-tax-profit'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/int-award-number-of-shares'), 
    '9,750')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/int-award-total-value'), 
    '£288.97')

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/int_award-total-price-to-pay'), 
    '£9,750.00')

WebUI.setText(findTestObject('Object Repository/my-equity-page/award-section/input_estimated-profit-per-share'), 
    '5')

WebUI.sendKeys(findTestObject('Object Repository/my-equity-page/award-section/input_estimated-profit-per-share'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/award-section/int_award-pre-tax-profit'), 
    '£39,000.00')

WebUI.closeBrowser()


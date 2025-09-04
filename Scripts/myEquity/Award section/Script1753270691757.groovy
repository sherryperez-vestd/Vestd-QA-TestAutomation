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

/**
 * Test Case: Verify Award Section on My Equity Page
 *
 * Steps:
 * 1. Navigate to the user's My Equity dashboard.
 * 2. Verify visibility and correctness of Award section headers and tooltips:
 *    - Award (No. of shares), Total value, Total price to pay, Pre-tax profit.
 * 3. Interact with tooltips to ensure correct info is displayed.
 * 4. Validate dynamic values (e.g., Total price to pay not empty).
 * 5. Modify estimated profit per share and ensure related values update accordingly.
 */
WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

'Login and navigate to My equity page'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/awardSection/div_awardTable'), 0)

'Check Award table'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/awardSection/div_awardTable'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/awardSection/div_awardTable'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/awardSection/txt_headingAwardNoOfShares'), 
    'Award (No. of shares)')

'Check Award table'
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/awardSection/txt_headingTotalValue'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/awardSection/txt_headingTotalValue'), 'Total value')

'Check Award Total Value tooltip'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardTotalValue'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardTotalValue'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardTotalValue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip-text_award-total-value'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip-text_award-total-value'), 
    'This amount shows the total value of your options before any tax or exercise price deductions')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardTotalValue'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/awardSection/txt_headingTotalPriceToPay'), 
    'Total price to pay')

'Check Award Total Price to Pay tooltip'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardTotalPriceToPay'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardTotalPriceToPay'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardTotalPriceToPay'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_text_total-price-to-pay'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_text_total-price-to-pay'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_text_total-price-to-pay'), 
    'Total Price to Pay is the total amount you’ll need to pay to exercise your options. It’s calculated by multiplying the exercise price (the fixed price per share) by the number of options you’re exercising.')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardTotalPriceToPay'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/awardSection/txt_headingPreTaxProfit'), 'Pre-tax profit')

'Check Award Pre-tax profit tooltip'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardPreTaxProfit'), 
    0)

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardPreTaxProfit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_textAwardPreTaxProfit'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_textAwardPreTaxProfit'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_textAwardPreTaxProfit'), 
    'This amount shows the total value of your options after the exercise price is deducted, but before taxes are applied')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/awardSection/tooltip_iconAwardPreTaxProfit'))

// Fail test if text is null or empty
//CustomKeywords.'UIKeywords.verifyElementTextNotEmpty'('Object Repository/StatSquad/myEquity/int-award-number-of-shares')
'Check Award Total value amount'
CustomKeywords.'UIKeywords.verifyElementTextNotEmpty'('Object Repository/StatSquad/myEquity/awardSection/int_awardTotalValue')

CustomKeywords.'UIKeywords.verifyElementTextNotEmpty'('Object Repository/StatSquad/myEquity/awardSection/int_awardTotalPriceToPay')

'Check change in Estimated profit value updates Total value and Pre tax - profit amount '
WebUI.setText(findTestObject('Object Repository/StatSquad/myEquity/awardSection/input_estimatedProfitPerShare'), '5')

WebUI.sendKeys(findTestObject('Object Repository/StatSquad/myEquity/awardSection/input_estimatedProfitPerShare'), Keys.chord(
        Keys.ENTER))


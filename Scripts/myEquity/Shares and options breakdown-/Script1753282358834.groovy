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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.click(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/chevron_summary-bar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tile_my-shares-breakdown-section'))

'Check My shares breakdown tooltips and labels\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/txt_my-shares-breakdown'), 
    'My shares breakdown')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tooltip-icon_my-shares-breakdown-shares'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tooltip-icon_my-shares-breakdown-shares'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tooltip-text_my-shares-breakdown-shares'), 
    'Here you\'ll see your total share allocation and the share class it belongs to.')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tooltip-icon_my-shares-breakdown-shares'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tooltip-icon_my-shares-breakdown-average-price-per-share'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tooltip-icon_my-shares-breakdown-average-price-per-share'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tooltip-text_my-shares-breakdown-average-price-per-share'), 
    'Here, you\'ll see the weighted average price paid per share at issuance. Note: Payments are handled outside Vestd and should be settled before shares are issued.')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/tooltip-icon_my-shares-breakdown-average-price-per-share'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/shares-breakdown/txt_average-price-per-share'), 
    'Average price per share:')

'Check My shares breakdown transaction history'
WebUI.verifyElementText(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/button_View transactions'), 'View transactions')

WebUI.click(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/button_View transactions'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/txt_Transaction-History'), 0)

WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/txt_Transaction-History'))

WebUI.click(findTestObject('StatSquad/myEquity/sharesOptionsBreakdown/button_Close'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tile_My-options-breakdown-section'), 
    0)

'Check My options breakdown tooltips and labels\r\n\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/txt_My-options-breakdown'), 
    'My options breakdown')

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/txt_EMI Option 10,000 Ordinary'), 
    'EMI Option: 10,000 Ordinary')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tooltip-icon_My-options-breakdown'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tooltip-icon_My-options-breakdown'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tooltip-text_My-options-breakdown'), 
    'Here, you can view the number of options granted to you under the selected agreement.')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tooltip-icon_My-options-breakdown'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/label_Exercised-Vested-Unvested'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/label_Exercised-Vested-Unvested'), 
    'Exercised: 250Vested: 250Unvested: 9,500')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tooltip-icon_My-options-breakdown-Exercised-Vested-Unvested'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tooltip-icon_My-options-breakdown-Exercised-Vested-Unvested'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tooltip-text_my-options-breakdown-Exercised-Vested-Unvested'), 
    'Here\'s how your options are categorised: Exercised, Vested, and Unvested.')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/tooltip-icon_My-options-breakdown-Exercised-Vested-Unvested'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/progress-bar_my-options-breakdown'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/sharesOptionsBreakdown/options-breakdown/label_my-optons-breakdown-Granted-on'), 
    'Granted on:')

not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')


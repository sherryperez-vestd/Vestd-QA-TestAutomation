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

//'Login and navigate to the dashboard page'
not_run: CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/cap-table')

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/h1_Cap table'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/captable/h1_Cap table'), 'Cap table')

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/datepicker'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/p_Cap table leadtext'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/a_View legal register'), 0)

WebUI.verifyElementClickable(findTestObject('StatSquad/captable/a_View legal register'))

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/datepicker'), 0)

WebUI.verifyElementClickable(findTestObject('StatSquad/captable/datepicker'))

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/input_captable-view'), 0)

WebUI.click(findTestObject('StatSquad/captable/input_captable-view'))

WebUI.click(findTestObject('StatSquad/captable/li_Simulate-with-options-exercised'))

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/alert_date-selection-disabled'), 0)

WebUI.verifyElementNotClickable(findTestObject('StatSquad/captable/datepicker'))

WebUI.click(findTestObject('StatSquad/captable/input_captable-view'))

WebUI.click(findTestObject('StatSquad/captable/li_voting-control'))

WebUI.verifyElementNotPresent(findTestObject('StatSquad/captable/alert_date-selection-disabled'), 0)

WebUI.verifyElementClickable(findTestObject('StatSquad/captable/datepicker'))

WebUI.click(findTestObject('StatSquad/captable/input_captable-view'))

WebUI.click(findTestObject('StatSquad/captable/li_Simulate-with-options-and-new-share-issuance'))

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/alert_date-selection-disabled'), 0)

WebUI.verifyElementNotClickable(findTestObject('StatSquad/captable/datepicker'))

WebUI.click(findTestObject('StatSquad/captable/input_captable-view'))

WebUI.click(findTestObject('StatSquad/captable/li_include-deferred-shares'))

WebUI.verifyElementNotPresent(findTestObject('StatSquad/captable/alert_date-selection-disabled'), 0)

WebUI.verifyElementClickable(findTestObject('StatSquad/captable/datepicker'))

WebUI.click(findTestObject('StatSquad/captable/input_captable-view'))

WebUI.click(findTestObject('StatSquad/captable/li_simulate-with-option-pools-options-exercised'))

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/alert_date-selection-disabled'), 0)

WebUI.verifyElementNotClickable(findTestObject('StatSquad/captable/datepicker'))

WebUI.click(findTestObject('StatSquad/captable/input_captable-view'))

WebUI.click(findTestObject('StatSquad/captable/li_simulate-with-option-option-pools-new-share-issuance'))

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/alert_date-selection-disabled'), 0)

WebUI.verifyElementNotClickable(findTestObject('StatSquad/captable/datepicker'))

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/input_number-of-new-shares'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/input_share-class'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/btn_update'), 0)

WebUI.click(findTestObject('StatSquad/captable/input_captable-view'))

WebUI.click(findTestObject('StatSquad/captable/li_capital-ownership'))

WebUI.verifyElementNotPresent(findTestObject('StatSquad/captable/alert_date-selection-disabled'), 0)

WebUI.verifyElementClickable(findTestObject('StatSquad/captable/datepicker'))

WebUI.verifyElementNotPresent(findTestObject('StatSquad/captable/input_number-of-new-shares'), 0)

WebUI.verifyElementNotPresent(findTestObject('StatSquad/captable/input_share-class'), 0)

WebUI.verifyElementNotPresent(findTestObject('StatSquad/captable/btn_update'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/a_download-as-csv'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/a_download-as-pdf'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/h3_Overall ownership'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/h3_Share classes'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/canvas_Overall ownership'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/canvas_Share classes'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/th_Show hide'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/th_Class name'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/th_Nominal value'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/th_Number of shares'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/th_percent of the company'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/td_Total'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/h2_Ownership'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/h2_All options'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/captable/h2_Outstanding share authorisations'), 0)

WebUI.scrollToPosition(200, 200)

WebUI.click(findTestObject('StatSquad/captable/datepicker'))

WebUI.click(findTestObject('Object Repository/StatSquad/captable/btn_DatePickerMonth'))

WebUI.click(findTestObject('Object Repository/StatSquad/captable/div_DatePickerMonthMay'))

WebUI.click(findTestObject('Object Repository/StatSquad/captable/btn_DatePickerYear'))

WebUI.click(findTestObject('Object Repository/StatSquad/captable/div_DatePickerYear'))

WebUI.click(findTestObject('Object Repository/StatSquad/captable/div_DatePickerDay1'))

WebUI.click(findTestObject('Object Repository/StatSquad/captable/btn_DatePickerSelect'))

WebUI.verifyElementText(findTestObject('StatSquad/captable/td_TotalValue'), '400,000')

'Check Download PDF'
WebUI.click(findTestObject('Object Repository/StatSquad/captable/a_download-as-pdf'))

String currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

String url = WebUI.getUrl()

assert url.contains('https://demo.app.vestd.com/company/50934/cap-table/download/pdf')

// Close temporary file window
WebUI.closeWindowIndex(currentWindow + 1)

WebUI.switchToWindowIndex(currentWindow)

'Check Download CSV'
WebUI.click(findTestObject('Object Repository/StatSquad/captable/a_download-as-csv'))

WebUI.delay(20)

CustomKeywords.'UIKeywords.verifyTemporaryFilePage'('https://demo.app.vestd.com/company/50934/temporary-file')

not_run: WebUI.closeBrowser()


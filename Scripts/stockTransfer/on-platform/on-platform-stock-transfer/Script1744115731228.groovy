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

WebUI.callTestCase(findTestCase('users-login/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/stock-transfer/create?record-type=on-platform')

WebUI.selectOptionByValue(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/select_Please selectOrdinary (voting) (0.00_0f5091'), 
    '172183', true)

WebUI.click(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/span_Please select_multiselect-caret is-open'))

WebUI.click(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/span_AdminSuper SP (999,990 shares)'))

WebUI.click(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/span_Please select_multiselect-caret is-open_1'))

WebUI.click(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/li_Barry Saunders'))

WebUI.setText(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/input_Number of shares_QhorUmmXeybowrrh'), 
    '5')

WebUI.setText(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/input_Cash consideration (total for all sha_20407e'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/select_Please selectNoYes'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/select_NoneIncorporationFFRound oneRound two'), 
    '128377', true)

WebUI.click(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/input_create one_btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/h1_New stock transfer'))

WebUI.verifyElementPresent(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/h1_New stock transfer'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/h1_New stock transfer'), 
    'New stock transfer')

WebUI.click(findTestObject('Object Repository/stock-transfer/Page_Building the equity economy - Vestd/input_Select Stamp duty confirmation_btn bt_1d2ef7'))

WebUI.click(findTestObject('Object Repository/stock-transfer/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/div_Stock transfer created'))

WebUI.rightClick(findTestObject('Object Repository/stock-transfer/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/div_Stock transfer created_1'))

WebUI.click(findTestObject('Object Repository/stock-transfer/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/div_Stock transfer created.      Back to li_f96178'))

WebUI.verifyElementVisible(findTestObject('Object Repository/stock-transfer/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/div_Stock transfer created_1_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/stock-transfer/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/div_Stock transfer created_1_2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/stock-transfer/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/div_Stock transfer created_1_2'), 
    'Stock transfer created.')


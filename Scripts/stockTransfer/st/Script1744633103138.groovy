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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/stock-transfer/create?record-type=on-platform&share_class_id=172183')

WebUI.waitForPageLoad(10)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/select_shareclass'), 
    '172183', true)

WebUI.click(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/span_AdminSuper SP (999,970 shares)'))

WebUI.click(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/input_To_ey1vr3r3Efy00wtg'))

WebUI.click(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/li_Barry Saunders'))

WebUI.setText(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/input_Number of shares_vht04voN69fObXMm'), 
    '10')

WebUI.setText(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/input_Cash consideration (total for all sha_20407e'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/select_Please selectNoYes'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/input_create one_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/stock-transfer/New Folder/Page_Building the equity economy - Vestd/input_Select Stamp duty confirmation_btn bt_1d2ef7'))

WebUI.click(findTestObject('Object Repository/stock-transfer/New Folder/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/button_Start the stock transfer'))

WebUI.click(findTestObject('Object Repository/stock-transfer/New Folder/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/button_Ok, Start stock transfer'))

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Object Repository/stock-transfer/New Folder/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/span_Complete'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/stock-transfer/New Folder/Page_Stock transfer - QA UK1 (Reid Ltd) - Vestd/span_Complete'), 
    'Complete')

WebUI.closeBrowser()


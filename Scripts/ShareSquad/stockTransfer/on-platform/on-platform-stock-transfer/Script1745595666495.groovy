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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/stock-transfer')

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfers index/a_Create a new transfer'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/select_share-class'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/input_shareholder-From'))

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/li_AdminSuper SP'))

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/select_To'))

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/li_Barry Saunders'))

WebUI.setText(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/input_Number of shares'), '10')

WebUI.setText(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/input_Cash consideration (total for all sha_20407e'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/select_Please selectNoYes'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/select_NoneIncorporationFFRound oneRound two'), 
    '128377', true)

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/input_create one_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfer create/input_Select Stamp duty confirmation_btn bt_1d2ef7'))

WebUI.rightClick(findTestObject('Object Repository/stockTransfer/Page_Stock transfer details/div_Stock transfer created'))

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfer details/p_Back to list of stock transfers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/stockTransfer/Page_Stock transfer details/div_Stock transfer created_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/stockTransfer/Page_Stock transfer details/div_Stock transfer created_1'), 
    'Stock transfer created.')

WebUI.click(findTestObject('Object Repository/stockTransfer/Page_Stock transfer details/button_Delete'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Object Repository/stockTransfer/Page_Stock transfers index/div_The stock transfer has been deleted'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/stockTransfer/Page_Stock transfers index/div_The stock transfer has been deleted'), 
    'The stock transfer has been deleted.')

WebUI.closeBrowser()


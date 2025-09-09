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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/stock-transfer/create?record-type=off-platform')

WebUI.selectOptionByIndex(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/select_share-class'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/input_shareholder-From'))

WebUI.click(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/li_AdminSuper SP'))

WebUI.click(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/select_To'))

WebUI.click(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/li_Barry Saunders'))

WebUI.setText(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/input_Number of shares'), 
    '10')

WebUI.setText(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/input_Cash consideration'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/select_Please selectNoYes'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer create/select_Investment-Rounds'), 
    '128377', true)

WebUI.scrollToElement(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/btn_Next_OnOff'), 0)

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/btn_Next_OnOff'))

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/input_radioDoNotWishToUploadSPA'))

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/input_radioUploadSTForm'))

WebUI.uploadFile(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/file_upload-STForm'), 'C:\\Users\\admin\\Documents\\VestdApp-TestAutomation Katalon\\Vestd QA Test Automation\\TestData\\Test-PDF-File.pdf')

WebUI.setText(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/input_STFormDay'), '1')

WebUI.setText(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/input_STFormMonth'), '1')

WebUI.setText(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/input_STFormYear'), '2025')

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/input_btn-Save as draft'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer details/div_Stock transfer created'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer details/div_Stock transfer created_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer details/div_Stock transfer created_1'), 
    'Stock transfer created.')

WebUI.verifyElementPresent(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer details/p_Back to list of stock transfers'), 
    0)

WebUI.click(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer details/button_Delete'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfers index/div_The stock transfer has been deleted'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfers index/div_The stock transfer has been deleted'), 
    'The stock transfer has been deleted.')

WebUI.closeBrowser()


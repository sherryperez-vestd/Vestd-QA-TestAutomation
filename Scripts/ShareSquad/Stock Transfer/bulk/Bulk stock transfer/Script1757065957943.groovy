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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/stock-transfer/bulk-stock-transfer/start')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'("ShareSquad/stockTransfer/Page_Stock transfer create/select_transferType")

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/select_transferType'))

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/li_newStockTransfer'))


WebUI.verifyElementPresent(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/file_upload-bulkST-Template'), 0)

WebUI.uploadFile(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/file_upload-bulkST-Template'), 'C:\\Users\\admin\\Documents\\VestdApp-TestAutomation Katalon\\Vestd QA Test Automation\\TestData\\bulk-stock-transfer-upload.xlsx')

WebUI.delay(5)

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/btn_NextBulk'))

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer create/btn_NextBulk'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer details/div_Stock transfer created_1'), 
    0)

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer details/div_Stock transfer created_1', 'Draft stock transfers created' )

//WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer details/div_Stock transfer created_1'), 
//    0)

//WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer details/div_Stock transfer created_1'), 
//    'Draft stock transfers created')

WebUI.click(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfer details/button_Delete'))

WebUI.click(findTestObject('ShareSquad/stockTransfer/Page_Stock transfer details/button_DeleteYes'))

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/ShareSquad/stockTransfer/Page_Stock transfers index/div_The stock transfer has been deleted', 'All stock transfers have been deleted' )



//WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfers index/div_The stock transfer has been deleted'), 
//    0)
//
//WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/stockTransfer/Page_Stock transfers index/div_The stock transfer has been deleted'), 
//    'All stock transfers have been deleted')

WebUI.closeBrowser()


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

'Login and navigate to the dashboard page'
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-upload/create?reward-type=ordinary-shares')

WebUI.scrollToElement(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/file_upload-import-share-issues'), 
    0)

WebUI.uploadFile(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/file_upload-import-share-issues'), 'C:\\Users\\admin\\Documents\\VestdApp-TestAutomation Katalon\\Vestd QA Test Automation\\TestData\\issue-shares-bulk-upload.csv')

WebUI.click(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/btn_Import_and_review'))

WebUI.verifyElementPresent(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/txt_Upload_successful'), 0)

WebUI.click(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/btn_confirm'))

WebUI.verifyElementPresent(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/alert_Distributions created'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/a_issue_shares_active'), 
    0)

WebUI.click(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/a_share distribution bulk'))

WebUI.click(findTestObject('ShareSquad/issueShares/bulk-upload-share-issues/btn_Delete'))

WebUI.acceptAlert()

WebUI.verifyTextPresent('No records found.', false)

WebUI.closeBrowser()


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

WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-approval/176207')

WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/a_Top up pool'), 0)

WebUI.click(findTestObject('ShareSquad/authorisations/Top up pool/a_Top up pool'))

WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/label_How many new shares'), 0)

WebUI.verifyElementText(findTestObject('ShareSquad/authorisations/Top up pool/label_How many new shares'), 'How many new shares do you want to add to the option pool?')

'Top up 0 shares'
WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/input_top-up-Pool size'), 0)

WebUI.click(findTestObject('ShareSquad/authorisations/Top up pool/radio_upload-DR-res'))

WebUI.uploadFile(findTestObject('ShareSquad/authorisations/Top up pool/file_upload-DR-res-file'), 'C:\\Users\\admin\\Documents\\VestdApp-TestAutomation Katalon\\Vestd QA Test Automation\\TestData\\Test-PDF-File.pdf')

WebUI.setText(findTestObject('ShareSquad/authorisations/Top up pool/input_top-up-DR-res-day'), '1')

WebUI.setText(findTestObject('ShareSquad/authorisations/Top up pool/input_top-up-DR-res-month'), '1')

WebUI.setText(findTestObject('ShareSquad/authorisations/Top up pool/input_top-up-DR-res-year'), '2025')

WebUI.click(findTestObject('ShareSquad/authorisations/Top up pool/radio_upload-SH-res'))

WebUI.uploadFile(findTestObject('ShareSquad/authorisations/Top up pool/file_upload-SH-res-file'), 'C:\\Users\\admin\\Documents\\VestdApp-TestAutomation Katalon\\Vestd QA Test Automation\\TestData\\Test-PDF-File.pdf')

WebUI.setText(findTestObject('ShareSquad/authorisations/Top up pool/input_top-up-SH-res-day'), '1')

WebUI.setText(findTestObject('ShareSquad/authorisations/Top up pool/input_top-up-SH-res-month'), '1')

WebUI.setText(findTestObject('ShareSquad/authorisations/Top up pool/input_top-up-SH-res-year'), '2025')

WebUI.click(findTestObject('ShareSquad/authorisations/Top up pool/button_Continue'))

'Check 0 top up shares is accepted after uploading DR and SH resolutions'
WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/txt_num shares-0'), 0)

WebUI.verifyElementText(findTestObject('ShareSquad/authorisations/Top up pool/txt_num shares-0'), '0')

WebUI.click(findTestObject('ShareSquad/authorisations/Top up pool/button_Delete-topup'))

'Clean up - Delete top up created'
WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/a_Top up pool'), 0)

WebUI.closeBrowser()


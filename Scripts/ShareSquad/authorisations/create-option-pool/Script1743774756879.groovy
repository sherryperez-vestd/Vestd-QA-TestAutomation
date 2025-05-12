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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-approval/create?type=options')

WebUI.setText(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool/input_Reference_name'), 
    'Option pool test')

WebUI.setText(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool/input_Pool size_share_pool_size'), 
    '2000000')

WebUI.selectOptionByValue(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool/select_Please selectOrdinary (voting) (0.00_0f5091'), 
    '172183', true)

WebUI.waitForElementVisible(findTestObject('authorisations/option-pool/Page_Create Option pool/button_Next'), 0)

WebUI.click(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool/button_Next'))

WebUI.waitForElementVisible(findTestObject('authorisations/option-pool/Page_Create Option pool confirm details/button_Confirm'), 
    0)

WebUI.click(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/button_Confirm'))

WebUI.waitForElementVisible(findTestObject('authorisations/option-pool/Page_Create Option pool confirm details/button_Yes, confirm'), 
    0)

WebUI.click(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/button_Yes, confirm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/h1_Option pool test                        _22f63e'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/h1_Option pool test                        _22f63e'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/h1_Option pool test                        _22f63e'), 
    'Option pool test\r \nEdit')

WebUI.verifyElementVisible(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/dd_2,000,000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/dd_2,000,000'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/dd_2,000,000'), 
    '2,000,000')

WebUI.click(findTestObject('Object Repository/authorisations/option-pool/Page_Create Option pool confirm details/button_Delete'))

WebUI.acceptAlert()

WebUI.closeBrowser()


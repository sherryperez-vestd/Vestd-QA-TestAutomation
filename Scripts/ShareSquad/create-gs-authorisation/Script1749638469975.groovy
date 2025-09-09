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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-approval/create?type=growth-shares')

WebUI.setText(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create/input_Reference_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create/input_Pool size_share_pool_size'), '0')

WebUI.selectOptionByValue(findTestObject('ShareSquad/authorisations/Page_Create/select_GS Auth share class'), '172184', true)

WebUI.click(findTestObject('ShareSquad/authorisations/Page_Create/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ShareSquad/authorisations/Page_Create/txt-alert_share pool size must be at least 1'))

WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Page_Create/txt-alert_share pool size must be at least 1'), 0)

'Check validation message is displayed when pool size entered is 0'
WebUI.verifyElementText(findTestObject('ShareSquad/authorisations/Page_Create/txt-alert_share pool size must be at least 1'), 'The share pool size must be at least 1.')

WebUI.click(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create/button_Next'))

WebUI.setText(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create/input_Pool size_share_pool_size'), '2000000')

WebUI.click(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create/button_Next'))

WebUI.waitForElementVisible(findTestObject('ShareSquad/authorisations/Page_Create Confirm details/button_Confirm'), 0)

WebUI.click(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create Confirm details/button_Confirm'))

WebUI.waitForElementVisible(findTestObject('ShareSquad/authorisations/Page_Create Confirm details/button_Yes, confirm'), 0)

WebUI.click(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create Confirm details/button_Yes, confirm'))

'Check new GS authorisation is successfully created\r\n'
WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Page_Create Confirm details/h1_Test'), 0)

WebUI.verifyElementVisible(findTestObject('ShareSquad/authorisations/Page_Create Confirm details/h1_Test'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create Confirm details/h1_Test'), 
    'Option pool test\r \nEdit')

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create Confirm details/dd_poolsize-2,000,000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create Confirm details/dd_poolsize-2,000,000'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create Confirm details/dd_poolsize-2,000,000'), 
    '2,000,000')

'Delete GS authorisation\r\n'
WebUI.click(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create Confirm details/button_Delete'))

WebUI.acceptAlert()

WebUI.closeBrowser()


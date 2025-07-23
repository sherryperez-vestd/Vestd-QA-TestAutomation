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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-approval/176206')

WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/a_Top up pool'), 0)

//def topUpText = WebUI.getText(findTestObject('ShareSquad/authorisations/Top up pool/a_Top up pool'))
//if (topUpText.contains('Top up the pool')) {
//WebUI.click(findTestObject('ShareSquad/authorisations/Top up pool/a_Top up pool'))
//}

//WebUI.verifyElementText(findTestObject('ShareSquad/authorisations/Top up pool/a_Top up pool'), 'Top up the pool')

WebUI.click(findTestObject('ShareSquad/authorisations/Top up pool/a_Top up pool'))

WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/label_How many new shares'), 0)

WebUI.verifyElementText(findTestObject('ShareSquad/authorisations/Top up pool/label_How many new shares'), 'How many new shares do you want to add to the option pool?')

WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/input_top-up-Pool size'), 0)

//WebUI.setText(findTestObject('Object Repository/ShareSquad/authorisations/Page_Create/input_Pool size_share_pool_size'), '0')

WebUI.click(findTestObject('ShareSquad/authorisations/Top up pool/button_Continue'))

WebUI.verifyElementPresent(findTestObject('ShareSquad/authorisations/Top up pool/txt-alert_num shares must be at least 1'), 
    0)

WebUI.verifyElementText(findTestObject('ShareSquad/authorisations/Top up pool/txt-alert_num shares must be at least 1'), 
    'The num shares must be at least 1 when generating a resolution.')


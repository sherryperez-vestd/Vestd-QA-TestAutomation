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

WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/Page_Dashboard/h1_Dashboard'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/dashboard/Page_Dashboard/h1_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_Dashboard/h1_Dashboard'), 'Dashboard')

WebUI.click(findTestObject('navigation/top-nav/a_Dashboard'))

'Check Customise'
WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Customise'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Customise'), 'Customise')

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Customise'))

WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/Page_Group/h1_Customise dashboard'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/Page_Group/h1_Customise dashboard'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/Page_Group/button_New group'))

WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/Page_Group/button_New group'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_Group/button_New group'), 'New group')

WebUI.click(findTestObject('Object Repository/dashboard/Page_Group/button_New group'))

WebUI.setText(findTestObject('Object Repository/dashboard/Page_Group - Create/input_Group name'), 'test')

WebUI.click(findTestObject('Object Repository/dashboard/Page_Group - Create/span_Companies-selection'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Group - Create/form_Group Companies Indian Co'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Group - Create/input_Test Co_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/Page_Group/h5_test'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_Group/h5_test'), 'test')

WebUI.click(findTestObject('Object Repository/dashboard/Page_Group/button_Delete'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Group/button_Yes, delete this group'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Group/a_Back to Dashboard'))

WebUI.closeBrowser()


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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.app.vestd.com/')

WebUI.maximizeWindow()

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Coco/register/Page_Register-new-user/a_Join now')
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Coco/register/Page_Register-new-user/a_StartUKDemo')
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Coco/register/Page_Register-new-user/a_StartIndiaDemo')

WebUI.click(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/a_Join now'))

WebUI.setText(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/input_First name_given_name'), 'test')

WebUI.click(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/div_Last name'))

WebUI.setText(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/input_Last name_family_name'), 'new')

WebUI.setText(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/input_Email address_email'), 'sherry.perez+new@vestd.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/input_Password_password'), 
    'BXwrjJCMvIr67Y1Dtu7MbQ==')

WebUI.click(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/span_Role_multiselect-caret is-open'))

WebUI.click(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/li_Employee'))

WebUI.click(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/input_Other_agreed_to_terms'))

WebUI.click(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/input_Participant Terms_subscribe_to_marketing'))

WebUI.click(findTestObject('Object Repository/CoCo/register/Page_Register-new-user/button_Join'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/register/Page_Verify email - Vestd/div_You should have received a verification_b4194e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/register/Page_Verify email - Vestd/div_You should have received a verification_b4194e'), 
    'You should have received a verification email to the address provided below. Please follow the link to verify your email.')

WebUI.closeBrowser()


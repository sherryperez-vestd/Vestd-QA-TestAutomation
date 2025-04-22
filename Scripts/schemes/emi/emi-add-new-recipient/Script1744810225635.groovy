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

not_run: WebUI.callTestCase(findTestCase('users-login/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-template/40375')

WebUI.selectOptionByValue(findTestObject('Object Repository/schemes/emi/add-new-recipient/select_Please select oneOption pool 1 (202,_945b62'), 
    '167068', true)

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_Day_starting_at_day'), '1')

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_Month_starting_at_month'), '1')

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_Year_starting_at_year'), '2024')

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_First name_given_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_Last name_family_name'), 'Recipient')

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_Email_email'), 'sherry.perez+testrecipient@vestd.com')

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_Number of options_num_shares'), '1000')

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_NI number_ni_number'), 'AB123456C')

WebUI.setText(findTestObject('Object Repository/schemes/emi/add-new-recipient/input_Unique identifier_customer_unique_identifier'), 
    '12345')

WebUI.click(findTestObject('Object Repository/schemes/emi/add-new-recipient/button_Save as draft and add another'))

WebUI.verifyElementVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient option draft'))

WebUI.verifyElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient option draft'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient                          _26a11a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient                          _26a11a'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient                          _26a11a'), 
    'Test Recipient\n \n Not invited')

WebUI.verifyElementVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Ordinary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Ordinary'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Ordinary'), 'Ordinary')

WebUI.verifyElementVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_1,000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_1,000'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_1,000'), '1,000')

WebUI.waitForElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No'), 'No')

WebUI.verifyElementVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No_1'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No_1'), 'No')

WebUI.waitForElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Edit'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Edit'))

WebUI.verifyElementText(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Edit'), 'Edit')

WebUI.verifyElementClickable(findTestObject('Object Repository/schemes/emi/add-new-recipient/a_Test Recipient option'))

WebUI.click(findTestObject('Object Repository/schemes/emi/add-new-recipient/a_Test Recipient option'))

WebUI.click(findTestObject('Object Repository/schemes/emi/recipient-agreement/button_Delete'))

WebUI.acceptAlert()

not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-template/40375')

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient option draft'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient option draft'), 
    0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient                          _26a11a'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Test Recipient                          _26a11a'), 
    0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Ordinary'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Ordinary'), 0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_1,000'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_1,000'), 0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No'), 0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No_1'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_No_1'), 0)

not_run: WebUI.waitForElementNotPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Edit'), 0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/td_Edit'))

not_run: WebUI.closeBrowser()


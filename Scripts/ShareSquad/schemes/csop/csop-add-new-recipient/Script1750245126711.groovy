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

not_run: WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-template/40375')

WebUI.click(findTestObject('ShareSquad/schemes/csop/add new recipient/input_select-option-pool'))

WebUI.click(findTestObject('ShareSquad/schemes/csop/add new recipient/li_option-pool'))

WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/input_Day'), '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/input_Month'), '1')

WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/input_Year'), '2024')

WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/input_First name_given_name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/input_Last name_family_name'), 
    'Recipient')

WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/input_Email_email'), 'sherry.perez+testrecipient@vestd.com')

WebUI.setText(findTestObject('ShareSquad/schemes/csop/add new recipient/input_Number of shares'), '1000')

WebUI.setText(findTestObject('ShareSquad/schemes/csop/add new recipient/input_NI number'), 'AB123456C')

//WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/input_Unique identifier_customer_unique_identifier'), '12345')
WebUI.click(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/button_Save as draft and add another'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Test Recipient'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Test Recipient'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Test Recipient Draft'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Test Recipient Draft'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Test Recipient Draft'), 
    'Test Recipient\n \n Not invited')

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Ordinary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Ordinary'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Ordinary'), 
    'Ordinary')

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_1,000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_1,000'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_1,000'), 
    '1,000')

WebUI.waitForElementPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No'), 'No')

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No_1'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No_1'), 'No')

WebUI.waitForElementPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Edit'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Edit'))

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Edit'), 'Edit')

WebUI.verifyElementClickable(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/a_Test Recipient option'))

WebUI.click(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/a_Test Recipient option'))

'Edit tranch number of shares'
WebUI.click(findTestObject('ShareSquad/schemes/csop/add new recipient/a_edit tranch'))

WebUI.setText(findTestObject('ShareSquad/schemes/csop/edit tranche/input_num_shares'), '25')

WebUI.click(findTestObject('ShareSquad/schemes/csop/edit tranche/button_Save'))

'Check Add tranch CTA is present'
WebUI.verifyElementPresent(findTestObject('ShareSquad/schemes/csop/add new recipient/a_Add tranche'), 0)

'Reverse tranch number of shares edit'
WebUI.click(findTestObject('ShareSquad/schemes/csop/add new recipient/a_edit tranch'))

WebUI.setText(findTestObject('ShareSquad/schemes/csop/edit tranche/input_num_shares'), '20')

WebUI.click(findTestObject('ShareSquad/schemes/csop/edit tranche/button_Save'))

'Check Add tranch CTA is not present'
WebUI.verifyElementNotPresent(findTestObject('ShareSquad/schemes/csop/add new recipient/a_Add tranche'), 0)

WebUI.click(findTestObject('Object Repository/ShareSquad/schemes/emi/recipient-agreement/button_Delete'))

WebUI.acceptAlert()

not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-template/40375')

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Test Recipient'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Test Recipient'), 
    0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Test Recipient Draft'))

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Ordinary'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Ordinary'), 
    0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_1,000'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_1,000'), 
    0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No'), 
    0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No_1'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_No_1'), 
    0)

not_run: WebUI.waitForElementNotPresent(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Edit'), 
    0)

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/ShareSquad/schemes/emi/add-new-recipient/td_Edit'))

not_run: WebUI.closeBrowser()


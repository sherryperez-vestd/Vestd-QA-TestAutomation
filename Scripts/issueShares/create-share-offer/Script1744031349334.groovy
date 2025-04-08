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

WebUI.callTestCase(findTestCase('users-login/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-offer/create')

WebUI.selectOptionByValue(findTestObject('Object Repository/share-issue/Page_Distribute - Share distribution - QA T_30de61/select_Please selectIndividualCompany'), 
    'individual', true)

WebUI.setText(findTestObject('Object Repository/share-issue/Page_Distribute - Share distribution - QA T_30de61/input_First name_given_name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/share-issue/Page_Distribute - Share distribution - QA T_30de61/input_Last name_family_name'), 
    'Shares')

WebUI.setText(findTestObject('Object Repository/share-issue/Page_Distribute - Share distribution - QA T_30de61/input_Email_email'), 
    'sherry.perez+shares@vestd.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/share-issue/Page_Distribute - Share distribution - QA T_30de61/select_Please select oneOrdinary share pool_c70f14'), 
    '167070', true)

WebUI.setText(findTestObject('Object Repository/share-issue/Page_Distribute - Share distribution - QA T_30de61/input_Number of shares_num_shares'), 
    '10')

WebUI.setText(findTestObject('Object Repository/share-issue/Page_Distribute - Share distribution - QA T_30de61/input_Price paid_price_per_share'), 
    '1')

WebUI.click(findTestObject('Object Repository/share-issue/Page_Distribute - Share distribution - QA T_30de61/input_create one_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/share-issue/Page_Share distribution 2 - Share distribut_cb2c86/button_Issue immediately'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/share-issue/Page_Share distribution 2 - Share distribut_cb2c86/a_Back to list of share distributions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/share-issue/Page_Share distributions - QA Test UK1 (Rei_331161/td_Test Shares'))

WebUI.verifyElementPresent(findTestObject('Object Repository/share-issue/Page_Share distributions - QA Test UK1 (Rei_331161/td_Test Shares'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/share-issue/Page_Share distributions - QA Test UK1 (Rei_331161/td_Test Shares'), 
    'Test Shares')

not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-offer')

WebUI.click(findTestObject('Object Repository/share-issue/Page_Share distributions - QA Test UK1 (Rei_331161/a_Share distribution 2'))

WebUI.click(findTestObject('Object Repository/share-issue/Page_Share distribution 2 - Share distribut_cb2c86/a_Share issue 428587'))

WebUI.click(findTestObject('Object Repository/share-issue/Page_Share issue - QA Test UK1 (Reid Ltd) - Vestd/button_Delete'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/share-issue/Page_Share allotment - QA Test UK1 (Reid Lt_dc5613/button_Delete'))

WebUI.acceptAlert()

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-offer')

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/share-issue/Page_Share distributions - QA Test UK1 (Rei_331161/td_Test Shares'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/share-issue/Page_Share distributions - QA Test UK1 (Rei_331161/td_Test Shares'), 
    0)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/shareholder')

WebUI.click(findTestObject('Object Repository/shareholders/shareholder-index/a_Test Shares'))

WebUI.click(findTestObject('Object Repository/shareholders/shareholder-index/a_Edit'))

WebUI.click(findTestObject('Object Repository/shareholders/shareholders edit details/div_First name  Last name                  _4f9980'))

WebUI.setText(findTestObject('Object Repository/shareholders/shareholders edit details/input_First name_given_name'), 
    '1')

WebUI.setText(findTestObject('Object Repository/shareholders/shareholders edit details/input_Last name_family_name'), 
    '1')

WebUI.click(findTestObject('Object Repository/shareholders/shareholders edit details/input_Last name_family_name'))

WebUI.setText(findTestObject('Object Repository/shareholders/shareholders edit details/input_Email_email'), 
    '1@vestd.com')

WebUI.click(findTestObject('Object Repository/shareholders/shareholders edit details/div_First name  Last name                  _4f9980_1'))

WebUI.click(findTestObject('Object Repository/shareholders/shareholders edit details/button_Save details'))

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/shareholder')

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/share-issue/Page_Share distributions - QA Test UK1 (Rei_331161/td_Test Shares'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/share-issue/Page_Share distributions - QA Test UK1 (Rei_331161/td_Test Shares'), 
    0)

WebUI.click(findTestObject('Object Repository/shareholders/shareholder-index/a_1 1'))

WebUI.click(findTestObject('Object Repository/shareholders/shareholders details/button_Merge'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/shareholders/shareholders details/div_Shareholder updated'))

WebUI.verifyElementVisible(findTestObject('Object Repository/shareholders/shareholders details/div_Shareholder updated'))

WebUI.verifyElementPresent(findTestObject('Object Repository/shareholders/shareholders details/div_Shareholder updated'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/shareholders/shareholders details/div_Shareholder updated'), 
    'Shareholder updated')

WebUI.closeBrowser()


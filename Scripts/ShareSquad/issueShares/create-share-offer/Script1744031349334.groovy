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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-offer/create')

WebUI.selectOptionByValue(findTestObject('Object Repository/issueShares/Share-distribution-create/select_Please selectIndividualCompany'), 
    'individual', true)

WebUI.setText(findTestObject('Object Repository/issueShares/Share-distribution-create/input_First name_given_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/issueShares/Share-distribution-create/input_Last name_family_name'), 'Shares')

WebUI.setText(findTestObject('Object Repository/issueShares/Share-distribution-create/input_Email_email'), 'sherry.perez+shares@vestd.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/issueShares/Share-distribution-create/select_Please select oneOrdinary share pool_c70f14'), 
    '167070', true)

WebUI.setText(findTestObject('Object Repository/issueShares/Share-distribution-create/input_Number of shares_num_shares'), 
    '10')

WebUI.setText(findTestObject('Object Repository/issueShares/Share-distribution-create/input_Price paid_price_per_share'), 
    '1')

WebUI.click(findTestObject('Object Repository/issueShares/Share-distribution-create/input_create one_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('issueShares/Share-distribution-details/p_Test Shares (sherry.perezsharesvestd.com) Not invited'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('issueShares/Share-distribution-details/p_Test Shares (sherry.perezsharesvestd.com) Not invited'), 
    'Test Shares')

WebUI.verifyElementPresent(findTestObject('issueShares/Share-distribution-details/td_10 Ordinary (voting) 0.0001 nominal value'), 
    0)

WebUI.verifyElementText(findTestObject('issueShares/Share-distribution-details/td_10 Ordinary (voting) 0.0001 nominal value'), 
    '10 Ordinary (voting) £0.0001 nominal value')

WebUI.verifyElementPresent(findTestObject('issueShares/Share-distribution-details/td_1.00 per share'), 0)

WebUI.verifyElementText(findTestObject('issueShares/Share-distribution-details/td_1.00 per share'), '£1.00 per share')

WebUI.verifyElementPresent(findTestObject('issueShares/Share-distribution-details/td_10.00'), 0)

WebUI.verifyElementText(findTestObject('issueShares/Share-distribution-details/td_10.00'), '£10.00')

WebUI.verifyElementPresent(findTestObject('issueShares/Share-distribution-details/td_Ordinary share pool 1'), 0)

WebUI.verifyElementText(findTestObject('issueShares/Share-distribution-details/td_Ordinary share pool 1'), 'Ordinary share pool 1')

WebUI.click(findTestObject('Object Repository/issueShares/Share-distribution-details/button_Issue immediately'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/issueShares/Share-distribution-details/a_Back to list of share distributions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/issueShares/share-issues-index/td_Test Shares'))

WebUI.verifyElementPresent(findTestObject('Object Repository/issueShares/share-issues-index/td_Test Shares'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/issueShares/share-issues-index/td_Test Shares'), 'Test Shares')

WebUI.click(findTestObject('Object Repository/issueShares/share-issues-index/a_Share distribution 1'))

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('issueShares/Share-distribution-details/a_Share issue-staff-link'), 0)

WebUI.click(findTestObject('Object Repository/issueShares/Share-distribution-details/a_Share issue-staff-link'))

WebUI.click(findTestObject('Object Repository/issueShares/Share-issue-staffpage/button_Delete-share-issue'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/issueShares/Share-allotment-staffpage/button_Delete-share-allotment'))

WebUI.acceptAlert()

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-offer')

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/issueShares/share-issues-index/td_Test Shares'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/issueShares/share-issues-index/td_Test Shares'), 
    0)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/shareholder')

WebUI.click(findTestObject('Object Repository/shareholders/shareholder-index/a_Test Shares'))

WebUI.click(findTestObject('Object Repository/shareholders/shareholder-index/a_Edit'))

WebUI.click(findTestObject('Object Repository/shareholders/shareholders edit details/div_First name  Last name                  _4f9980'))

WebUI.setText(findTestObject('Object Repository/shareholders/shareholders edit details/input_First name_given_name'), '1')

WebUI.setText(findTestObject('Object Repository/shareholders/shareholders edit details/input_Last name_family_name'), '1')

WebUI.click(findTestObject('Object Repository/shareholders/shareholders edit details/input_Last name_family_name'))

WebUI.setText(findTestObject('Object Repository/shareholders/shareholders edit details/input_Email_email'), '1@vestd.com')

WebUI.click(findTestObject('Object Repository/shareholders/shareholders edit details/div_First name  Last name                  _4f9980_1'))

WebUI.click(findTestObject('Object Repository/shareholders/shareholders edit details/button_Save details'))

WebUI.click(findTestObject('Object Repository/shareholders/shareholders details/button_Merge'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/shareholders/shareholders details/div_Shareholder updated'))

WebUI.verifyElementVisible(findTestObject('Object Repository/shareholders/shareholders details/div_Shareholder updated'))

WebUI.verifyElementPresent(findTestObject('Object Repository/shareholders/shareholders details/div_Shareholder updated'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/shareholders/shareholders details/div_Shareholder updated'), 'Shareholder updated')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-certificate')

WebUI.refresh()

WebUI.click(findTestObject('shareCertificates/button_Delete'))

WebUI.acceptAlert()

WebUI.closeBrowser()


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

WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-offer/create')

WebUI.waitForElementPresent(findTestObject('ShareSquad/issueShares/share-distribution-create/select_shareAuthorisation'), 
    0)

WebUI.click(findTestObject('ShareSquad/issueShares/share-distribution-create/select_shareAuthorisation'))

WebUI.scrollToElement(findTestObject('ShareSquad/issueShares/share-distribution-create/span_shareAuthorisationSelectItem'), 
    0)

WebUI.click(findTestObject('ShareSquad/issueShares/share-distribution-create/span_shareAuthorisationSelectItem'))

WebUI.click(findTestObject('ShareSquad/issueShares/share-distribution-create/select_IndividualOrCompany'))

WebUI.click(findTestObject('ShareSquad/issueShares/share-distribution-create/li_individualSelectItem'))

WebUI.setText(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-create/input_firstName'), 'Test')

WebUI.setText(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-create/input_lastName'), 'Shares')

WebUI.setText(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-create/input_emailAddress'), 'sherry.perez+shares@vestd.com')

WebUI.scrollToElement(findTestObject('ShareSquad/issueShares/share-distribution-create/input_numberOfShares'), 0)

WebUI.waitForElementPresent(findTestObject('ShareSquad/issueShares/share-distribution-create/input_numberOfShares'), 0)

WebUI.waitForElementVisible(findTestObject('ShareSquad/issueShares/share-distribution-create/input_numberOfShares'), 0)

WebUI.setText(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-create/input_numberOfShares'), 
    '10')

WebUI.setText(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-create/input_pricePaid'), '1')

WebUI.click(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-create/btn_createSaveAsDraft'))

not_run: WebUI.verifyElementPresent(findTestObject('ShareSquad/issueShares/share-distribution-details/p_Test Shares (sherry.perezsharesvestd.com) Not invited'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('ShareSquad/issueShares/share-distribution-details/p_Test Shares (sherry.perezsharesvestd.com) Not invited'), 
    'Test Shares')

WebUI.verifyElementPresent(findTestObject('ShareSquad/issueShares/share-distribution-details/td_10 Ordinary (voting) 0.0001 nominal value'), 
    0)

WebUI.verifyElementText(findTestObject('ShareSquad/issueShares/share-distribution-details/td_10 Ordinary (voting) 0.0001 nominal value'), 
    '10 Ordinary (voting) £0.0001 nominal value')

WebUI.verifyElementPresent(findTestObject('ShareSquad/issueShares/share-distribution-details/td_1.00 per share'), 0)

WebUI.verifyElementText(findTestObject('ShareSquad/issueShares/share-distribution-details/td_1.00 per share'), '£1.00 per share')

WebUI.verifyElementPresent(findTestObject('ShareSquad/issueShares/share-distribution-details/td_10.00'), 0)

WebUI.verifyElementText(findTestObject('ShareSquad/issueShares/share-distribution-details/td_10.00'), '£10.00')

WebUI.verifyElementPresent(findTestObject('ShareSquad/issueShares/share-distribution-details/td_Ordinary share pool 1'), 
    0)

WebUI.verifyElementText(findTestObject('ShareSquad/issueShares/share-distribution-details/td_Ordinary share pool 1'), 'Ordinary share pool 1')

WebUI.click(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-details/button_Issue immediately'))

WebUI.click(findTestObject('ShareSquad/issueShares/share-distribution-create/btn_issueSharesContinue'))

WebUI.click(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-details/a_Back to list of share distributions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/issueShares/share-issues-index/td_Test Shares'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/issueShares/share-issues-index/td_Test Shares'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/issueShares/share-issues-index/td_Test Shares'), 'Test Shares')

WebUI.click(findTestObject('Object Repository/ShareSquad/issueShares/share-issues-index/a_Share distribution 1'))

WebUI.delay(5)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('ShareSquad/issueShares/share-distribution-details/a_Share issue-staff-link'), 
    0)

WebUI.click(findTestObject('Object Repository/ShareSquad/issueShares/share-distribution-details/a_Share issue-staff-link'))

WebUI.click(findTestObject('ShareSquad/issueShares/share-issue-staffpage/button_Delete-share-issue'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/ShareSquad/issueShares/share-allotment-staffpage/button_Delete-share-allotment'))

WebUI.acceptAlert()

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-offer?page=1&per_page=25')

//WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-offer')
not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/ShareSquad/issueShares/share-issues-index/td_Test Shares'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/ShareSquad/issueShares/share-issues-index/td_Test Shares'), 
    0)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/shareholder')

WebUI.refresh()

WebUI.scrollToElement(findTestObject('CoCo/shareholders/shareholder-index/a_Test Shares'), 0)

WebUI.click(findTestObject('Object Repository/CoCo/shareholders/shareholder-index/a_Test Shares'))

WebUI.click(findTestObject('Object Repository/CoCo/shareholders/shareholder-index/a_Edit'))

WebUI.click(findTestObject('Object Repository/CoCo/shareholders/shareholders edit details/div_First name Last name'))

WebUI.setText(findTestObject('Object Repository/CoCo/shareholders/shareholders edit details/input_First name_given_name'), 
    '1')

WebUI.setText(findTestObject('Object Repository/CoCo/shareholders/shareholders edit details/input_Last name_family_name'), 
    '1')

WebUI.click(findTestObject('Object Repository/CoCo/shareholders/shareholders edit details/input_Last name_family_name'))

WebUI.setText(findTestObject('Object Repository/CoCo/shareholders/shareholders edit details/input_Email_email'), '1@vestd.com')

not_run: WebUI.click(findTestObject('Object Repository/CoCo/shareholders/shareholders edit details/div_First name Last name 2'))

WebUI.click(findTestObject('Object Repository/CoCo/shareholders/shareholders edit details/button_Save details'))

WebUI.click(findTestObject('Object Repository/CoCo/shareholders/shareholders details/button_Merge'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/CoCo/shareholders/shareholders details/div_Shareholder updated'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/shareholders/shareholders details/div_Shareholder updated'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/shareholders/shareholders details/div_Shareholder updated'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/shareholders/shareholders details/div_Shareholder updated'), 
    'Shareholder updated')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-certificate')

WebUI.refresh()

WebUI.click(findTestObject('CoCo/CoSec/shareCertificates/icon_Delete'))

WebUI.click(findTestObject('CoCo/CoSec/shareCertificates/button_ConfirmDelete'))

WebUI.closeBrowser()


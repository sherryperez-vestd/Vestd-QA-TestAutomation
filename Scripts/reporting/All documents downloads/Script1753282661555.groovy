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

//WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/legal-doc')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Filter and search'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Filter and search'), 'Filter and search')

WebUI.click(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Filter and search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/button_Download documents'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/button_Download documents'), 
    'Download documents')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/button_Add filter'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/button_Add filter'), 'Add filter')

WebUI.click(findTestObject('Object Repository/StatSquad/reporting/allDocuments/button_Add filter'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/div_StatusCompleteCancelledExpiredNeedsSigning'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_StatusCompleteCancelledExpiredNeedsSigning'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_StatusCompleteCancelledExpiredNeedsSigning'), 
    'StatusCompleteCancelledExpiredNeeds signingOff-platformSent for filingSent for signingWill be filed')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Document TypeAdvanced Subscription'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Document TypeAdvanced Subscription'), 
    'Document TypeAdvanced Subscription AgreementArticles of AssociationBalance SheetBeneficial Share CertificateBoard MinutesBusiness PlanCashflow StatementCertificate of IncorporationCompany UpdateConvertible NoteDeed of AdherenceDirector ResolutionEMI Option AgreementEmployment ContractFounder Service AgreementGroup Structure ChartHMRC Annual EMI NotificationHMRC Annual ERS Other NotificationHMRC Initial EMI NotificationInvestor Self Certification FormITEPA_431Non-Disclosure AgreementOption cancellation agreementOption CriteriaOrganisational ChartOtherPitch DeckProfit & Loss StatementRollover agreementRP04 - Correction of SH01Scheme RulesSH01SH02SH03SH04SH06SH08SH10Share CertificateShare Issue CriteriaShare subscription letter/agreementShare Supply AgreementShareholder AgreementShareholder ResolutionShare Purchase AgreementStamp duty proofStock TransferSupplier ContractSyndicate TermsUnapproved Option AgreementWarrant')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Companies HouseFiled'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Companies HouseFiled'), 
    'Companies House')

not_run: WebUI.click(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_StatusCompleteCancelledExpiredNeedsSigning'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/div_CompleteCancelledExpiredNeeds signing'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Complete'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Complete'), 'Complete')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Cancelled'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Cancelled'), 
    'Cancelled')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Expired'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Expired'), 'Expired')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Needs signing'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Needs signing'), 
    'Needs signing')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Off-platform'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Off-platform'), 
    'Off-platform')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Sent for filing'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Sent for filing'), 
    'Sent for filing')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Sent for signing'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Sent for signing'), 
    'Sent for signing')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Will be filed'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/label_Will be filed'), 
    'Will be filed')

not_run: WebUI.click(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Document TypeAdvanced Subscription'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/div_Advanced Subscription AgreementArticles'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Companies HouseFiled'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/div_Filed'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/div_Filed'), 'Filed')

not_run: WebUI.click(findTestObject('Object Repository/StatSquad/reporting/allDocuments/a_Companies HouseFiled'))

WebUI.click(findTestObject('Object Repository/StatSquad/reporting/allDocuments/button_Add filter'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/div_Search'), 0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/div_Search'), 'Search:')

WebUI.setText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/input_Search_table-search'), 'tx')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/allDocuments/td_No matching records found'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/allDocuments/td_No matching records found'), 
    'No matching records found')

WebUI.click(findTestObject('Object Repository/StatSquad/reporting/allDocuments/button_Download documents'))

url = WebUI.getUrl()

split_url = url.split('/')

removedurlchars = (split_url[(split_url.size() - 1)])

partial_url = url.minus(removedurlchars)

WebUI.verifyEqual(partial_url, 'https://demo.app.vestd.com/company/50135/job-monitor/')

WebUI.delay(20)

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://demo.app.vestd.com/company/50135/temporary-file')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/temporaryFile/h1_Temporary files'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/temporaryFile/h1_Temporary files'), 'Temporary files')

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/temporaryFile/label_Expires in 23 hours'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/temporaryFile/label_Expires in 23 hours'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/temporaryFile/label_Expires in 23 hours'), 
    'Expires in 23 hours')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/temporaryFile/btn_Download'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/temporaryFile/btn_Download'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/temporaryFile/btn_Download'), 'Download')


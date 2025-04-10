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

not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/reports')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/home')

WebUI.click(findTestObject('Object Repository/navigation/Sec and Admin/a_Secretarial  admin'))

WebUI.verifyElementVisible(findTestObject('Object Repository/navigation/Sec and Admin/a_Reports'))

WebUI.verifyElementPresent(findTestObject('Object Repository/navigation/Sec and Admin/a_Reports'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/navigation/Sec and Admin/a_Reports'), 'Reports')

WebUI.verifyElementClickable(findTestObject('Object Repository/navigation/Sec and Admin/a_Reports'))

WebUI.click(findTestObject('Object Repository/navigation/Sec and Admin/a_Reports'))

not_run: WebUI.verifyElementPresent(findTestObject('null'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('null'))

not_run: WebUI.verifyElementText(findTestObject('null'), 
    'Reporting Beta')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/heading_Reporting Beta'))

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/index/heading_Reporting Beta'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/heading_Reporting Beta'), 'Reporting Beta')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/lead-text_Access detailed reports'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/lead-text_Access detailed reports'), 'Access detailed reports tailored to your needs. Can\'t find what you\'re looking for? Request a custom report here.')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/th_Report name'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/th_Report name'), 'Report name')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/th_Description'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/th_Description'), 'Description')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/th_Action'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/th_Action'), 'Action')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/td_Shareholders report'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/td_Shareholders report'), 'Shareholders report')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/td_This report will provide a download of y_f8195d'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/td_This report will provide a download of y_f8195d'), 
    'This report will provide a download of your shareholders names, emails and other basic information.')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/link_generate-shareholders'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/link_generate-shareholders'), 'Generate')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/td_Financial report'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/td_Financial report'), 'Financial report')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/td_This report will provide options vested,_5db3b1'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/td_This report will provide options vested,_5db3b1'), 
    'This report will provide options vested, options lapsed, options exercised, reversed options and exercise requests. You will be able to select the start and end date on the next page.')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/td_Cap table reporting'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/td_Cap table reporting'), 'Cap table report')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/td_This will take you to cap table page whe_1fbe13'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/td_This will take you to cap table page whe_1fbe13'), 
    'This will take you to cap table page where you can simulate the ownership structure of your company in different scenarios.')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/td_Option agreement report'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/td_Option agreement report'), 'Option agreement report')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/index/td_This report will provide a download of a_f115f4'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/index/td_This report will provide a download of a_f115f4'), 
    'This report will provide a download of all option agreements, the status, the option holders name, option type, and other related information.')

WebUI.verifyElementClickable(findTestObject('Object Repository/reporting/index/link_generate-shareholders'))

WebUI.verifyElementClickable(findTestObject('Object Repository/reporting/index/link_generate-financial'))

WebUI.verifyElementClickable(findTestObject('Object Repository/reporting/index/link_generate-cap-table'))

WebUI.verifyElementClickable(findTestObject('Object Repository/reporting/index/link_generate-option-agreement'))

WebUI.verifyElementClickable(findTestObject('Object Repository/reporting/index/link_Request a custom report here'))

WebUI.click(findTestObject('reporting/index/link_Request a custom report here'))

currentWindow = WebUI.getWindowIndex()
//WebUI.switchToWindowIndex(currentWindow)
WebUI.switchToWindowIndex(currentWindow + 1)

url = WebUI.getUrl()
WebUI.verifyEqual(url, 'https://usabi.li/do/1951db0cc1b3/7cf2')

WebUI.closeBrowser()


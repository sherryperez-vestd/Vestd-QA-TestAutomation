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

/**
 * Test Case: Verify all available report types and "Request a custom report" functionality
 *
 * URL: https://demo.app.vestd.com/company/50135/reports
 *
 * Steps:
 * 1. Navigate to the Reports page and confirm visibility of the "Reporting Beta" header and subtext.
 * 2. Verify the presence and text of the following reports and descriptions:
 *    - Shareholders report
 *    - Financial report
 *    - Cap table report
 *    - Option agreement report
 *    - Expense report
 * 3. Ensure all "Generate" buttons are clickable for each report.
 * 4. Click "Request a custom report here" → confirm it opens the correct external form:
 *    https://usabi.li/do/1951db0cc1b3/7cf2
 */


//WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/reports')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/heading_Reporting Beta'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/index/heading_Reporting Beta'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/heading_Reporting Beta'), 'Reporting Beta')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/lead-text_Access detailed reports'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/lead-text_Access detailed reports'), 
    'Access detailed reports tailored to your needs. Can\'t find what you\'re looking for? Request a custom report here.')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/th_Report name'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/th_Report name'), 'Report name')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/th_Description'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/th_Description'), 'Description')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/th_Action'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/th_Action'), 'Action')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/td_Shareholders report'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/td_Shareholders report'), 'Shareholders report')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/td_shareholders description'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/td_shareholders description'), 'This report will provide a download of your shareholders names, emails and other basic information.')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/link_generate-shareholders'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/link_generate-shareholders'), 'Generate')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/td_Financial report'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/td_Financial report'), 'Financial report')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/td_financial report description'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/td_financial report description'), 'This report will provide options vested, options lapsed, options exercised, reversed options and exercise requests. You will be able to select the start and end date on the next page.')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/td_Cap table report'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/td_Cap table report'), 'Cap table report')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/td_cap table description'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/td_cap table description'), 'This will take you to cap table page where you can simulate the ownership structure of your company in different scenarios.')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/td_Option agreement report'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/td_Option agreement report'), 'Option agreement report')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/index/td_option agreement description'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/index/td_option agreement description'), 'This report will provide a download of all option agreements, the status, the option holders name, option type, and other related information.')

WebUI.verifyElementVisible(findTestObject('StatSquad/reporting/index/td_Expense report'))

WebUI.verifyElementText(findTestObject('StatSquad/reporting/index/td_Expense report'), 'Expense report')

WebUI.verifyElementVisible(findTestObject('StatSquad/reporting/index/td_Expense report description'))

WebUI.verifyElementText(findTestObject('StatSquad/reporting/index/td_Expense report description'), 'This report calculates stock option expenses under the selected valuation method. It includes fair values, vesting schedules, and a monthly breakdown to ensure IFRS-compliant entries for "employee compensation expense" in the annual P&L.')

WebUI.verifyElementClickable(findTestObject('Object Repository/StatSquad/reporting/index/link_generate-shareholders'))

WebUI.verifyElementClickable(findTestObject('Object Repository/StatSquad/reporting/index/link_generate-financial'))

WebUI.verifyElementClickable(findTestObject('Object Repository/StatSquad/reporting/index/link_generate-cap-table'))

WebUI.verifyElementClickable(findTestObject('Object Repository/StatSquad/reporting/index/link_generate-option-agreement'))

WebUI.verifyElementClickable(findTestObject('StatSquad/reporting/index/link_generate-expense'))

WebUI.verifyElementClickable(findTestObject('Object Repository/StatSquad/reporting/index/link_Request a custom report here'))

WebUI.click(findTestObject('StatSquad/reporting/index/link_Request a custom report here'))

currentWindow = WebUI.getWindowIndex()

//WebUI.switchToWindowIndex(currentWindow)
WebUI.switchToWindowIndex(currentWindow + 1)

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://usabi.li/do/1951db0cc1b3/7cf2')


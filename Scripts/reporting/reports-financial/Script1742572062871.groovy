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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/reports/financial-report')

WebUI.verifyElementPresent(findTestObject('reporting/financial/heading_Financial Report'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/heading_Financial Report'), 'Financial Report')

WebUI.verifyElementPresent(findTestObject('reporting/financial/text_To generate reports, first enter a start and end date'), 
    0)

WebUI.verifyElementText(findTestObject('reporting/financial/text_To generate reports, first enter a start and end date'), 
    'To generate reports, first enter a start and end date. These dates will define the time frame for the report.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/text_Information provided in the report'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/text_Information provided in the report'), 'Information provided in the report:')

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-text_Options Vested'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-text_Options Vested'), 'Options Vested: View all stock options that vested within the selected time frame.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-text_Options Lapsed'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-text_Options Lapsed'), 'Options Lapsed: View all options that lapsed during the period.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-text_Options Exercised'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-text_Options Exercised'), 'Options Exercised: See all options that were exercised during the period.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-text_Reverse Vesting'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-text_Reverse Vesting'), 'Reverse Vesting: List any reverse vesting events within the date range.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-text_Leavers Processed'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-text_Leavers Processed'), 'Leavers Processed: Review leavers whose options were processed during the selected period.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-text_Exercise Requests'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-text_Exercise Requests'), 'Exercise Requests: Track all exercise requests made within the time frame.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/text_Once the date range is selected'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/text_Once the date range is selected'), 'Once the date range is selected, click the corresponding download button to generate and download the report in Excel (xslx) format.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/span_From Date'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/span_From Date'), 'From Date')

WebUI.verifyElementPresent(findTestObject('reporting/financial/label_Day'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/label_Day'), 'Day')

WebUI.verifyElementPresent(findTestObject('reporting/financial/label_Month'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/label_Month'), 'Month')

WebUI.verifyElementPresent(findTestObject('reporting/financial/label_Year'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/label_Year'), 'Year')

WebUI.verifyElementPresent(findTestObject('reporting/financial/input_Day_from_date_day'), 0)

WebUI.verifyElementPresent(findTestObject('reporting/financial/input_Month_from_date_month'), 0)

WebUI.verifyElementPresent(findTestObject('reporting/financial/input_Year_from_date_year'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_Fetch records from this date'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_Fetch records from this date'), 
    'Fetch records from this date')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_To Date'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_To Date'), 
    'To Date')

WebUI.verifyElementPresent(findTestObject('reporting/financial/input_Day_to_date_day'), 0)

WebUI.verifyElementPresent(findTestObject('reporting/financial/input_Month_to_date_month'), 0)

WebUI.verifyElementPresent(findTestObject('reporting/financial/input_Year_to_date_year'), 0)

WebUI.verifyElementPresent(findTestObject('reporting/financial/label_Fetch records from this date'), 0)

WebUI.verifyElementText(findTestObject('reporting/financial/label_Fetch records up to this date'), 'Fetch records up to this date')

not_run: WebUI.verifyElementClickable(findTestObject('reporting/financial/btn_Download Report'))

WebUI.verifyElementPresent(findTestObject('reporting/financial/btn_Download Report'), 0)

WebUI.setText(findTestObject('reporting/financial/input_Year_from_date_year'), '2029')

WebUI.click(findTestObject('reporting/financial/btn_Download Report'))

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-validation-message_The from date must be a date before'), 
    0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-validation-message_The from date must be a date before'), 
    'The from date must be a date before or equal to today.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-validation-message_The to date must be a date after or equal'), 
    0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-validation-message_The to date must be a date after or equal'), 
    'The to date must be a date after or equal to from date.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/label-validation-message_The from date must be a date before'), 
    0)

WebUI.verifyElementText(findTestObject('reporting/financial/label-validation-message_The from date must be a date before'), 
    'The from date must be a date before or equal to today.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/label-validation-message_The to date must be a date after or equal'), 
    0)

WebUI.verifyElementText(findTestObject('reporting/financial/label-validation-message_The to date must be a date after or equal'), 
    'The to date must be a date after or equal to from date.')

WebUI.refresh()

WebUI.setText(findTestObject('reporting/financial/input_Year_to_date_year'), '2029')

WebUI.click(findTestObject('reporting/financial/btn_Download Report'))

WebUI.verifyElementPresent(findTestObject('reporting/financial/list-validation-message_The to date must be a date before or equal'), 
    0)

WebUI.verifyElementText(findTestObject('reporting/financial/list-validation-message_The to date must be a date before or equal'), 
    'The to date must be a date before or equal to today.')

WebUI.verifyElementPresent(findTestObject('reporting/financial/label-validation-message_The to date must be a date before or equal'), 
    0)

WebUI.verifyElementText(findTestObject('reporting/financial/label-validation-message_The to date must be a date before or equal'), 
    'The to date must be a date before or equal to today.')

WebUI.refresh()

WebUI.click(findTestObject('reporting/financial/btn_Download Report'))

url = WebUI.getUrl()

split_url = url.split('/')

removedurlchars = (split_url[(split_url.size() - 1)])

partial_url = url.minus(removedurlchars)

WebUI.verifyEqual(partial_url, 'https://demo.app.vestd.com/company/50135/job-monitor/')

WebUI.delay(20)

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://demo.app.vestd.com/company/50135/temporary-file')

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/temporary-file/h1_Temporary files'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/reporting/temporary-file/h1_Temporary files'), 'Temporary files')

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/temporary-file/label_Expires in 23 hours'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/temporary-file/label_Expires in 23 hours'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/temporary-file/label_Expires in 23 hours'), 'Expires in 23 hours')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/temporary-file/btn_Download'))

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/temporary-file/btn_Download'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/reporting/temporary-file/btn_Download'), 'Download')


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

WebUI.callTestCase(findTestCase('users/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/reports')

WebUI.click(findTestObject('Object Repository/reporting/financial/Page_Reporting - Test Co 2 (Test Co) - Vestd/a_Generate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/h1_Financial Report'))

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/h1_Financial Report'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/h1_Financial Report'), 
    'Financial Report')

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/div_To generate reports, first enter a star_cdec6f'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/div_To generate reports, first enter a star_cdec6f'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/div_To generate reports, first enter a star_cdec6f'), 
    'To generate reports, first enter a start and end date. These dates will define the time frame for the report.\r\n Information provided in the report:Options Vested: View all stock options that vested within the selected time frame. Options Lapsed: View all options that lapsed during the period. Options Exercised: See all options that were exercised during the period. Reverse Vesting: List any reverse vesting events within the date range. Leavers Processed: Review leavers whose options were processed during the selected period. Exercise Requests: Track all exercise requests made within the time frame. Once the date range is selected, click the corresponding download button to generate and download the report in Excel (xslx) format.')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_From Date'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_From Date'), 
    'From Date')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Day'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Day'), 
    'Day')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Month'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Month'), 
    'Month')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Year'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Year'), 
    'Year')

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Day_from_date_day'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Month_from_date_month'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Year_from_date_year'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Day_from_date_day'))

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Month_from_date_month'))

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Year_from_date_year'))

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_To Date'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_To Date'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_To Date'), 
    'To Date')

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Day_1'))

WebUI.rightClick(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Day_to_date_day'))

WebUI.rightClick(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Day_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Month_1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Month_1'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Month_1'), 
    'Month')

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Month_to_date_month'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Month_to_date_month'))

WebUI.click(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Year_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Year_1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/label_Year_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Year_to_date_year'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/input_Year_to_date_year'))

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_Fetch records up to this date'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_Fetch records up to this date'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/span_Fetch records up to this date'), 
    'Fetch records up to this date')

WebUI.verifyElementPresent(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/button_Download Report'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/button_Download Report'))

WebUI.verifyElementText(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/button_Download Report'), 
    'Download Report')

WebUI.click(findTestObject('Object Repository/reporting/financial/Page_Financial Report - Vestd/button_Download Report'))


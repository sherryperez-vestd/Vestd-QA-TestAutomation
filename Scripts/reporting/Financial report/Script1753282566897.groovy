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
 * Test Case: Validate Financial Report generation, input validation, and file download
 *
 * URL: https://demo.app.vestd.com/company/50135/reports/financial-report
 *
 * Steps:
 * 1. Navigate to Financial Report page and verify all static UI texts, field labels, and explanations.
 * 2. Attempt download with invalid future "From" and "To" years (2029); verify corresponding validation messages.
 * 3. Refresh and repeat validations for different invalid date combinations.
 * 4. Trigger download without dates to test default behavior.
 * 5. Verify redirect to job monitor:
 *    https://demo.app.vestd.com/company/50135/job-monitor/
 * 6. Wait and confirm final redirect to:
 *    https://demo.app.vestd.com/company/50135/temporary-file
 * 7. Validate presence of expiry message and "Download" button on temporary file page.
 */
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

WebUI.navigateToUrl(GlobalVariable.reportIndexURL_UK)

WebUI.click(findTestObject('StatSquad/reporting/index/link_generate-financial'))

// Verify static elements
['input_Day_from_date_day', 'input_Month_from_date_month', 'input_Year_from_date_year'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("StatSquad/reporting/financial/$it")
    })

// Verify static elements and text
def elementsWithText = [('StatSquad/reporting/financial/heading_Financial Report') : 'Financial report', ('StatSquad/reporting/financial/span_From Date') : 'From Date'
    , ('StatSquad/reporting/financial/label_Day') : 'Day', ('StatSquad/reporting/financial/label_Month') : 'Month', ('StatSquad/reporting/financial/label_Year') : 'Year'
    , ('StatSquad/reporting/financial/span_To Date') : 'To Date', ('StatSquad/reporting/financial/label_ToDay') : 'Day', ('StatSquad/reporting/financial/label_ToMonth') : 'Month'
    , ('StatSquad/reporting/financial/label_ToYear') : 'Year', ('StatSquad/reporting/financial/span_Fetch records from this date') : 'Fetch records from this date'
    , ('StatSquad/reporting/btn_Download Report') : 'Download report', ('StatSquad/reporting/financial/text_To generate reports, first enter a start and end date') : 'To generate reports, first enter a start and end date. These dates will define the time frame for the report.'
    , ('StatSquad/reporting/financial/text_Information provided in the report') : 'Information provided in the report:', ('StatSquad/reporting/financial/list-text_Options Vested') : 'Options Vested: View all stock options that vested within the selected time frame. If a future date is selected, this also includes options scheduled to vest by that date based on the vesting schedule.'
    , ('StatSquad/reporting/financial/list-text_Options Lapsed') : 'Options Lapsed: View all options that lapsed during the period.'
    , ('StatSquad/reporting/financial/list-text_Options Exercised') : 'Options Exercised: See all options that were exercised during the period.'
    , ('StatSquad/reporting/financial/list-text_Reverse Vesting') : 'Reverse Vesting: List any reverse vesting events within the date range.'
    , ('StatSquad/reporting/financial/list-text_Leavers Processed') : 'Leavers Processed: Review leavers whose options were processed during the selected period.'
    , ('StatSquad/reporting/financial/list-text_Exercise Requests') : 'Exercise Requests: Track all exercise requests made within the time frame.'
    , ('StatSquad/reporting/financial/text_Once the date range is selected') : 'Once the date range is selected, click the corresponding download button to generate and download the report in Excel (xslx) format.']

elementsWithText.each({ def objPath, def expectedText ->
        CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'(objPath, expectedText)
    })

// Verify static elements
['input_Day_to_date_day', 'input_Month_to_date_month', 'input_Year_to_date_year', 'input_Day_from_date_day', 'input_Month_from_date_month'
    , 'input_Year_from_date_year'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/reporting/financial/$it")
    })

WebUI.verifyElementClickable(findTestObject('StatSquad/reporting/btn_Download Report'))

WebUI.setText(findTestObject('StatSquad/reporting/financial/input_Year_from_date_year'), '2029')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/reporting/btn_Download Report')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/reporting/financial/list-validation-message_The to date must be a date after or equal', 
    'The to date must be a date after or equal to from date.')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('StatSquad/reporting/financial/label-validation-message_The to date must be a date after or equal', 
    'The to date must be a date after or equal to from date.')

WebUI.refresh()

WebUI.setText(findTestObject('StatSquad/reporting/financial/input_Year_to_date_year'), '2029')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/reporting/btn_Download Report')

CustomKeywords.'UIKeywords.verifyTemporaryFileDownloadPage'()
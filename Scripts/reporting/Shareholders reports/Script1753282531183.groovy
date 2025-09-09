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
 * Test Case: Verify Shareholders report generation and download
 *
 * URL: https://demo.app.vestd.com/company/50135/reports
 *
 * Steps:
 * 1. Navigate to Reports page and click "Generate" for Shareholders report.
 * 2. Verify report page loads with correct header, instruction, and "Download report" button.
 * 3. Click "Download report" → verify redirect to job monitor:
 *    https://demo.app.vestd.com/company/50135/job-monitor/
 * 4. Wait for processing, then confirm final redirect to temporary file page:
 *    https://demo.app.vestd.com/company/50135/temporary-file
 * 5. Validate presence of "Temporary files" header, expiry message, and final "Download" button.
 */

//WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/reports')

WebUI.click(findTestObject('StatSquad/reporting/index/link_generate-shareholders'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/shareholders/h1_Shareholders Report'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/shareholders/h1_Shareholders Report'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/shareholders/h1_Shareholders Report'), 'Shareholders report')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/shareholders/p_Click the corresponding download button'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/shareholders/p_Click the corresponding download button'), 
    'Click the corresponding download button to generate and download the report in Excel (xslx) format.')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/reporting/shareholders/btn_Download Report'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/reporting/shareholders/btn_Download Report'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/reporting/shareholders/btn_Download Report'), 'Download report')

WebUI.verifyElementClickable(findTestObject('Object Repository/StatSquad/reporting/shareholders/btn_Download Report'))

WebUI.click(findTestObject('Object Repository/StatSquad/reporting/shareholders/btn_Download Report'))

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


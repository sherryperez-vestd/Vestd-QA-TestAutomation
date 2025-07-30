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
 * Test Case: Verify Option Agreement report generation and download flow
 *
 * URL: https://demo.app.vestd.com/company/50135/reports
 *
 * Steps:
 * 1. Navigate to Reports page.
 * 2. Click on "Generate Option Agreement".
 * 3. Verify redirection to job monitor:
 *    https://demo.app.vestd.com/company/50135/job-monitor/
 * 4. Wait for background processing and confirm final redirect to:
 *    https://demo.app.vestd.com/company/50135/temporary-file
 * 5. Validate presence of:
 *    - "Temporary files" header
 *    - Expiry notice ("Expires in 23 hours")
 *    - Download button with label "Download"
 */

//WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/reports')

WebUI.click(findTestObject('StatSquad/reporting/index/link_generate-option-agreement'))

url = WebUI.getUrl()

split_url = url.split('/')

removedurlchars = (split_url[(split_url.size() - 1)])

partial_url = url.minus(removedurlchars)

WebUI.verifyEqual(partial_url, 'https://demo.app.vestd.com/company/50135/job-monitor/')

WebUI.delay(45)

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


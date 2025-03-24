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

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('users/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tab_overall-value'))

'Check Overall value tab'
WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tab_overall-value'), 
    0)

WebUI.click(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tab_overall-value'))

'Check Empty Overall value graph'
WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/graph_empty'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/graph_empty'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/txt_empty-graph-This is where your potential growth'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/txt_empty-graph-This is where your potential growth'), 
    'This is where your potential growth statistics will appear!')

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/txt_empty-graph-Use the calculator to visualise'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/txt_empty-graph-Use the calculator to visualise'), 
    'Use the calculator to visualise your future values.')

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/img-empty-graph'))

WebUI.setText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/input_estimated-profit'), '1')

'Check Overall value graph'
WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/canvas'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/canvas'), 0)

'Check vesting overtime radio'
WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_Vesting-over-time'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_Vesting-over-time'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_Vesting-over-time'), 
    'Vesting over time')

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio_vesting-over-time'), 
    0)

'Check vesting overtime tooltip'
WebUI.verifyElementVisible(findTestObject('my-equity-page/graph/overall-value-graph/Page_Dashboard - Vestd/span_Vesting over time_static-content'))

not_run: WebUI.click(findTestObject('my-equity-page/graph/overall-value-graph/Page_Dashboard - Vestd/span_Vesting over time_static-content'))

not_run: WebUI.delay(0.5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-txt_vesting-over-time'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-txt_vesting-over-time'), 
    'Tracks how your options/shares will vest according to the schedule in your agreement.')

not_run: WebUI.click(findTestObject('my-equity-page/graph/overall-value-graph/Page_Dashboard - Vestd/span_Vesting over time_static-content'))

'Check vested until now radio'
WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_vested-until-now'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_vested-until-now'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_vested-until-now'), 
    'Vested until now')

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio_simulate-all'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-icon_vested-until-now'))

not_run: WebUI.click(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-icon_vested-until-now'))

not_run: WebUI.delay(0.5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-txt_vested-until-now'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-txt_vested-until-now'), 
    'Displays only the shares that have already vested.')

not_run: WebUI.click(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-icon_vested-until-now'))

'Check simulate all radio'
WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_simulate-all'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_simulate-all'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio-div_simulate-all'), 
    'Simulate all vested')

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio_vested-until-now'))

'Check simulate all tooltip'
WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip_simulate-all-vested'))

not_run: WebUI.click(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip_simulate-all-vested'))

not_run: WebUI.delay(0.5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-txt_simulate-all'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip-txt_simulate-all'), 
    'Shows the potential value of your shares once everything has fully vested.')

not_run: WebUI.click(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/tooltip_simulate-all-vested'))

not_run: WebUI.click(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio_simulate-all'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/canvas'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/canvas'))

not_run: WebUI.click(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/radio_vested-until-now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/canvas'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/graph/overall-value-graph/canvas'))


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

WebUI.callTestCase(findTestCase('user-login'), [:], FailureHandling.STOP_ON_FAILURE)

'Check EMI vesting schedule'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/section_vesting-schedule-all'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/section_vesting-schedule-all'))

not_run: WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/section_vesting-sched'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/section_vesting-sched'))

not_run: WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/icon_vesting-schedule-chevron-down'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/icon_vesting-schedule-chevron-down'))

WebUI.click(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/section_vesting-sched'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/table-heading_Full schedule (49 tranches)'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/table-heading_Full schedule (49 tranches)'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/tbody_vesting-sched'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/tbody_vesting-sched'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/th_Agreement name'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/th_Agreement name'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/th_Number of shares'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/th_Number of shares'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/th_Vested'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/th_Vested'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/th_Vesting period'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/vesting sched - emi/th_Vesting period'))

'Check GS graph'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370451')

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/graph-explained/heading_Your graph explained'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/graph-explained/heading_Your graph explained'))

WebUI.click(findTestObject('my-equity-page/vesting-schedule_graph-explained/graph-explained/heading_Your graph explained'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/graph-explained/heading_Watch your share value grow'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/graph-explained/heading_Watch your share value grow'))

WebUI.verifyElementPresent(findTestObject('my-equity-page/vesting-schedule_graph-explained/graph-explained/txt_Your graph explained paragraph'), 
    0)

WebUI.verifyElementVisible(findTestObject('my-equity-page/vesting-schedule_graph-explained/graph-explained/txt_Your graph explained paragraph'))

WebUI.closeBrowser()


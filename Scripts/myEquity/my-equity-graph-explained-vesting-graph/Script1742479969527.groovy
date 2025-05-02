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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/span_Your vesting schedule'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/span_Your vesting schedule'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/chevron_Your vesting schedule'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/chevron_Your vesting schedule'))

WebUI.click(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/chevron_Your vesting schedule'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/h5_Full schedule (49 tranches)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/h5_Full schedule (49 tranches)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/div_Your vesting schedule Full schedule (49_e2e3a5'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/div_Your vesting schedule Full schedule (49_e2e3a5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Vested'), 0)

WebUI.rightClick(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Vesting period'))

WebUI.click(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Vested'))

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Vested'), 'Vested')

WebUI.click(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Vesting period'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Vesting period'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Vesting period'), 
    'Vesting period')

WebUI.click(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Number of shares'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Number of shares'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Number of shares'), 
    'Number of shares')

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Agreement name'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/th_Agreement name'), 
    'Agreement name')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370451')

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/heading_Your graph explained'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/heading_Your graph explained'))

WebUI.verifyElementText(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/heading_Your graph explained'), 
    'Your graph explained')

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/chevron_Your vesting schedule'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/chevron_Your vesting schedule'))

WebUI.click(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/chevron_Your vesting schedule'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/txt_Watch your share value grow'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/txt_Watch your share value grow'), 
    'Watch your share value grow!')

WebUI.verifyElementPresent(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/txt_hurdle-message'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/myEquity/vesting-schedule_graph-explained/txt_hurdle-message'))

WebUI.verifyElementText(findTestObject('myEquity/vesting-schedule_graph-explained/txt_hurdle-message'), 'There is a hurdle attached to the 950 Vn shares, this means you will not benefit in the first £0.0001 per share in the event of a sale.')


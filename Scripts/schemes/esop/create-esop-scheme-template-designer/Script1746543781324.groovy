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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/scheme-template/create?type=esop')

WebUI.setText(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-template/input_Exercise price_exercise_price'), 
    '1')

'Select exercise condition'
WebUI.selectOptionByValue(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-template/select_Please selectExercisableExit only'), 
    '1', true)

'Use time based vesting'
WebUI.selectOptionByValue(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-template/select_YesNo'), 
    '0', true)

'Grant dates'
WebUI.selectOptionByValue(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-template/select_Grant all options on a specified dat_8fac1b'), 
    '1', true)

'Leaver clause'
WebUI.selectOptionByValue(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-template/select_Please select oneKeep vested options_6b824f'), 
    'discretion', true)

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-template/input_Complete discretion_btn btn-primary'))

not_run: WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-template?type=emi')

WebUI.callTestCase(findTestCase('schemes/emi/emi-add-new-recipient'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-template')

WebUI.click(findTestObject('schemes/emi/scheme-template/Page_Option-templates-index/input_Edit_text-danger'))

WebUI.acceptAlert()

WebUI.refresh()

WebUI.closeBrowser()


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

WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-template/create?type=emi')

WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/schemes/emi/scheme-template/Page_scheme-design-template/select_Please selectDefault Vestd agreement'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/scheme-template/Page_scheme-design-template/input_Exercise price_exercise_price'), 
    '1')

'Select exercise condition'
WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/schemes/emi/scheme-template/Page_scheme-design-template/select_Exercise-condition'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/ShareSquad/schemes/emi/scheme-template/Page_scheme-design-template/textarea_Criteria_criteria'), 
    'x')

'Use time based vesting'
WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/schemes/emi/scheme-template/Page_scheme-design-template/select_Time-based-vesting'), 
    '0', true)

'Grant dates'
WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/schemes/emi/scheme-template/Page_scheme-design-template/select_Grant date'), 
    '1', true)

'Leaver clause'
WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/schemes/emi/scheme-template/Page_scheme-design-template/select_Leaver-condition'), 
    'discretion', true)

WebUI.click(findTestObject('Object Repository/ShareSquad/schemes/emi/scheme-template/Page_scheme-design-template/btn_Save'))

WebUI.callTestCase(findTestCase('ShareSquad/Schemes/EMI/EMI add new recipient'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/reward-template')

WebUI.click(findTestObject('ShareSquad/schemes/emi/scheme-template/Page_Option-templates-index/input_Edit_text-danger'))

WebUI.acceptAlert()

WebUI.refresh()

WebUI.closeBrowser()


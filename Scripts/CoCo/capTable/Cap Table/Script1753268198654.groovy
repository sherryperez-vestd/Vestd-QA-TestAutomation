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

//'Login and navigate to the dashboard page'
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/cap-table')

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/h1_Cap table'), 0)

WebUI.verifyElementText(findTestObject('CoCo/capTable/h1_Cap table'), 'Cap table')

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/datepicker'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/p_Cap table leadtext'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/a_View legal register'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/capTable/a_View legal register'))

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/datepicker'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/capTable/datepicker'))

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/input_captable-view'), 0)

WebUI.click(findTestObject('CoCo/capTable/input_captable-view'))

WebUI.click(findTestObject('CoCo/capTable/li_Simulate-with-options-exercised'))

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/alert_date-selection-disabled'), 0)

WebUI.verifyElementNotClickable(findTestObject('CoCo/capTable/datepicker'))

WebUI.click(findTestObject('CoCo/capTable/input_captable-view'))

WebUI.click(findTestObject('CoCo/capTable/li_voting-control'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/capTable/alert_date-selection-disabled'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/capTable/datepicker'))

WebUI.click(findTestObject('CoCo/capTable/input_captable-view'))

WebUI.click(findTestObject('CoCo/capTable/li_Simulate-with-options-and-new-share-issuance'))

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/alert_date-selection-disabled'), 0)

WebUI.verifyElementNotClickable(findTestObject('CoCo/capTable/datepicker'))

WebUI.click(findTestObject('CoCo/capTable/input_captable-view'))

WebUI.click(findTestObject('CoCo/capTable/li_include-deferred-shares'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/capTable/alert_date-selection-disabled'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/capTable/datepicker'))

WebUI.click(findTestObject('CoCo/capTable/input_captable-view'))

WebUI.click(findTestObject('CoCo/capTable/li_simulate-with-option-pools-options-exercised'))

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/alert_date-selection-disabled'), 0)

WebUI.verifyElementNotClickable(findTestObject('CoCo/capTable/datepicker'))

WebUI.click(findTestObject('CoCo/capTable/input_captable-view'))

WebUI.click(findTestObject('CoCo/capTable/li_simulate-with-option-option-pools-new-share-issuance'))

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/alert_date-selection-disabled'), 0)

WebUI.verifyElementNotClickable(findTestObject('CoCo/capTable/datepicker'))

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/input_number-of-new-shares'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/input_share-class'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/btn_update'), 0)

WebUI.click(findTestObject('CoCo/capTable/input_captable-view'))

WebUI.click(findTestObject('CoCo/capTable/li_capital-ownership'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/capTable/alert_date-selection-disabled'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/capTable/datepicker'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/capTable/input_number-of-new-shares'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/capTable/input_share-class'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/capTable/btn_update'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/a_download-as-csv'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/a_download-as-pdf'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/h3_Overall ownership'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/h3_Share classes'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/canvas_Overall ownership'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/canvas_Share classes'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/th_Show hide'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/th_Class name'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/th_Nominal value'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/th_Number of shares'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/th_percent of the company'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/td_Total'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/h2_Ownership'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/h2_All options'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/capTable/h2_Outstanding share authorisations'), 0)

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/cap-table')

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/h1_Cap table'), 0)

WebUI.verifyElementText(findTestObject('CoCo/cap-table/h1_Cap table'), 'Cap table')

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/datepicker'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/p_Cap table leadtext'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/a_View legal register'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/cap-table/a_View legal register'))

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/select_View'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/a_download-as-csv'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/a_download-as-pdf'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/h3_Overall ownership'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/h3_Share classes'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/canvas_Overall ownership'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/canvas_Share classes'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/th_Show hide'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/th_Class name'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/th_Nominal value'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/th_Number of shares'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/th_percent of the company'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/td_Total'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/h2_Ownership'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/h2_All options'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/cap-table/h2_Outstanding share authorisations'), 0)

WebUI.closeBrowser()


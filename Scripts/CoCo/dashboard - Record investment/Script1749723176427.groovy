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

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 'Dashboard')

'Check Record an investment'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Record an investment'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Record an investment'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Record an investment'), 'Record an investment')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Record an investment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_External Investment/h1_Add an investment'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_External Investment/h1_Add an investment'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_External Investment/h1_Add an investment'), 'Add an investment')

WebUI.setText(findTestObject('CoCo/dashboard/Page_External Investment/input_Company name'), 'Test')

WebUI.setText(findTestObject('CoCo/dashboard/Page_External Investment/input_shareclass-name'), 'Ordinary A')

WebUI.setText(findTestObject('CoCo/dashboard/Page_External Investment/input_numberOfshares'), '1000')

WebUI.setText(findTestObject('CoCo/dashboard/Page_External Investment/input_amountPaid'), '10')

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/select_currency'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/dashboard/Page_External Investment/select_currency'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/input_purchaseDay'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/dashboard/Page_External Investment/input_purchaseDay'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/input_purchaseMonth'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/dashboard/Page_External Investment/input_purchaseMonth'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/input_purchaseYear'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/dashboard/Page_External Investment/input_purchaseYear'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/input_total_current_value'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/dashboard/Page_External Investment/input_total_current_value'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/select_current_value_currency'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/dashboard/Page_External Investment/select_current_value_currency'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/input_percentage_ownership'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/dashboard/Page_External Investment/input_percentage_ownership'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/input_company_number'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/dashboard/Page_External Investment/input_company_number'))

WebUI.click(findTestObject('CoCo/dashboard/Page_External Investment/button_Save'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/div_External investment success message'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/dashboard/Page_External Investment/div_External investment success message'), 'Your external investment, Test, has been added to your dashboard.')

WebUI.click(findTestObject('CoCo/dashboard/a_Delete'))

WebUI.click(findTestObject('CoCo/dashboard/Page_External Investment/button_Yes-Delete'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_External Investment/div_External investment delete message'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/dashboard/Page_External Investment/div_External investment delete message'), 'Your external investment has been deleted.')

WebUI.closeBrowser()


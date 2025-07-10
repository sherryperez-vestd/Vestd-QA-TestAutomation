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
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 'Dashboard')

'Check Request access to a company'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Ask a company to add you'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Ask a company to add you'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Ask a company to add you'), 'Ask a company to add you')

WebUI.verifyElementClickable(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Ask a company to add you'))

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Ask a company to add you'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/h1_Request access to a company'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/h1_Request access to a company'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/h1_Request access to a company'), 
    'Request access to a company')

WebUI.setText(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/input_Company name_company_name'), 
    'test')

WebUI.setText(findTestObject('CoCo/dashboard/Page_Request_access-Invite to company/input_Company email_company_email'), 
    'sherry.perez+editor2@vestd.com')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/button_Send'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/Page_Dashboard - Vestd/div_Weve sent test your request'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/Page_Dashboard - Vestd/div_Weve sent test your request'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/Page_Dashboard - Vestd/div_Weve sent test your request'), 
    'We’ve sent test your request.')

WebUI.closeBrowser()


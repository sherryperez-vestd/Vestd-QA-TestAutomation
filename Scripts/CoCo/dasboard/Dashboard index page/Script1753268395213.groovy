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

'Login and navigate to the dashboard page'
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/h1_Dashboard'), 'Dashboard')

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_Dashboard/h5_Dashboard - company'), 0)

WebUI.waitForElementVisible(findTestObject('CoCo/dashboard/Page_Dashboard/h5_Dashboard - company'), 0)

WebUI.verifyElementText(findTestObject('CoCo/dashboard/Page_Dashboard/h5_Dashboard - company'), 'QA Automation UK2 (Pls do not modify) (Test Co)')

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_Dashboard/h5_Dashboard - company2'), 0)

WebUI.waitForElementVisible(findTestObject('CoCo/dashboard/Page_Dashboard/h5_Dashboard - company2'), 0)

WebUI.verifyElementText(findTestObject('CoCo/dashboard/Page_Dashboard/h5_Dashboard - company2'), 'QA Automation IN (Pls do not modify) (Indian Co)')

'Check Potential profit graph'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Potential profit graph'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Potential profit graph'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Potential profit graph'), 'Potential profit graph')

WebUI.verifyElementClickable(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Potential profit graph'))

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Potential profit graph'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Potential value profit/h1_Potential value profit'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Potential value profit/h1_Potential value profit'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Potential value profit/h1_Potential value profit'), 
    'Potential value & profit')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Potential value profit/a_Back to Dashboard'))

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

WebUI.back()

'Check Invite a company'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Invite a company to join'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Invite a company to join'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Invite a company to join'), 'Invite a company to join')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Invite a company to join'))

WebUI.verifyElementPresent(findTestObject('CoCo/dashboard/Page_Request_access-Invite to company/h1_Invite a company'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/h1_Invite a company'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Request_access-Invite to company/h1_Invite a company'), 
    'Invite a company')

WebUI.back()

'Check Onboard a company'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Onboard a company'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Onboard a company'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Onboard a company'), 'Onboard a company')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Onboard a company'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Get started/h1_Get started'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Get started/h1_Get started'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Get started/h1_Get started'), 'Get started')

WebUI.back()

'Check Incorporate a company'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Incorporate a company'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Incorporate a company'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Incorporate a company'), 'Incorporate a company')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Incorporate a company'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Get started/a_Join Essentials'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Get started/a_Continue to plans'), 0)

WebUI.back()

'Check Record an investment'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Record an investment'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Record an investment'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Record an investment'), 'Record an investment')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/a_Record an investment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_External Investment/h1_Add an investment'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_External Investment/h1_Add an investment'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_External Investment/h1_Add an investment'), 
    'Add an investment')

WebUI.click(findTestObject('CoCo/navigation/top-nav/a_Dashboard'))

'Check Customise'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/button_Customise'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/button_Customise'), 'Customise')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/button_Customise'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Group/h1_Customise dashboard'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Group/h1_Customise dashboard'))

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Group/a_Back to Dashboard'))

'Check Add to your dashboard'
WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/button_Add to your dashboard'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/button_Add to your dashboard'))

WebUI.verifyElementText(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/button_Add to your dashboard'), 
    'Add to your dashboard')

WebUI.click(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/button_Add to your dashboard'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/div_Ask a company to add you'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CoCo/dashboard/Page_Dashboard/div_Ask a company to add you'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/img-ISO'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/img-ISO'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/p_Vestd_Ltd_authorised_and_regulated_by'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/p_Vestd_Ltd_authorised_and_regulated_by'))


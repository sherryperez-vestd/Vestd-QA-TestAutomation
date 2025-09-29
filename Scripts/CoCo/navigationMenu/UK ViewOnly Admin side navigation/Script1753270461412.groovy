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
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_viewonly, GlobalVariable.password)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/home')

not_run: WebUI.verifyElementNotVisibleInViewport(findTestObject('null'), 0)

not_run: WebUI.verifyElementNotPresent(findTestObject('null'), 0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'Staff')

not_run: WebUI.verifyElementNotVisible(findTestObject('null'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Company-staff'), 0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'Company - staff')

not_run: WebUI.verifyElementNotVisible(findTestObject('null'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_App-staff'), 0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'App - staff')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Home'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Home'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Home'), 'Home')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_ShareSchemes'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_ShareSchemes'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_ShareSchemes'), 'Share schemes')

WebUI.waitForElementVisible(findTestObject('CoCo/navigation/side-nav/a_Investment'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Investment'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Investment'), 'Investment')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_ShareCapital'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_ShareCapital'))

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_ShareCapital'), 'Share capital')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Compliance'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Compliance'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Compliance'), 'Compliance')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Documents'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Documents'), 'Documents')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_PeopleCommunication'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_PeopleCommunication'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_PeopleCommunication'), 'People & communication')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_HelpCentre'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_HelpCentre'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_HelpCentre'), 'Help centre')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Company settings'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Company settings'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Company settings'), 'Company settings')

not_run: WebUI.verifyElementVisible(findTestObject('null'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_App-staff'), 0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'App - staff')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/img-ISO'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/img-ISO'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/p_Vestd_Ltd_authorised_and_regulated_by'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/p_Vestd_Ltd_authorised_and_regulated_by'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/p_Vestd_Ltd_authorised_and_regulated_by'), 'Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992).')

WebUI.closeBrowser()


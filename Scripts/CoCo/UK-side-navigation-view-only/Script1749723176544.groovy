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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-view-only'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/home')

not_run: WebUI.verifyElementNotVisibleInViewport(findTestObject('null'), 0)

not_run: WebUI.verifyElementNotPresent(findTestObject('null'), 0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'Staff')

not_run: WebUI.verifyElementNotVisible(findTestObject('null'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Company - staff'), 0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'Company - staff')

not_run: WebUI.verifyElementNotVisible(findTestObject('null'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_App - staff'), 0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'App - staff')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Home'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Home'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Home'), 'Home')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Share schemes'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Share schemes'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Share schemes'), 'Share schemes')

WebUI.waitForElementVisible(findTestObject('CoCo/navigation/side-nav/a_Investment'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Investment'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Investment'), 'Investment')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Share capital'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Share capital'))

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Share capital'), 'Share capital')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Compliance'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Compliance'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Compliance'), 'Secretarial & admin')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_People  communication'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_People  communication'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_People  communication'), 'People & communication')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Help Centre'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Help Centre'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Help Centre'), 'Help centre')

WebUI.verifyElementVisible(findTestObject('CoCo/navigation/side-nav/a_Company settings'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Company settings'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Company settings'), 'Company settings')

not_run: WebUI.verifyElementVisible(findTestObject('null'))

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_App - staff'), 0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'App - staff')

WebUI.verifyElementVisible(findTestObject('CoCo/img-ISO'))

WebUI.verifyElementPresent(findTestObject('CoCo/img-ISO'), 0)

WebUI.verifyElementVisible(findTestObject('CoCo/p_Vestd Ltd is authorised and regulated by'))

WebUI.verifyElementPresent(findTestObject('CoCo/p_Vestd Ltd is authorised and regulated by'), 0)

WebUI.verifyElementText(findTestObject('CoCo/p_Vestd Ltd is authorised and regulated by'), 'Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992).')

WebUI.closeBrowser()


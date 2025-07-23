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
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_recipient, GlobalVariable.password)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370192')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_My equity'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_My equity'), 'My Equity')

WebUI.click(findTestObject('CoCo/navigation/side-nav/Page_MyEquity/h1_My Equity'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Page_MyEquity/h1_My Equity'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Page_MyEquity/h1_My Equity'), 'My Equity')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Communication'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Communication'), 'Communication')

WebUI.click(findTestObject('CoCo/navigation/side-nav/a_Communication'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Page_Communication/h1_Communication'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Page_Communication/h1_Communication'), 'Communication')

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Home'), 0)

WebUI.verifyElementNotVisible(findTestObject('CoCo/navigation/side-nav/a_Share schemes'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Investment'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Share capital'), 0)

//WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Compliance'), 0)
WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_People  communication'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Company - staff'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Company settings'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_App - staff'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Help Centre'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Help Centre'), 'Help centre')

WebUI.verifyElementPresent(findTestObject('CoCo/img-ISO'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/p_Vestd Ltd is authorised and regulated by'), 0)

WebUI.verifyElementText(findTestObject('CoCo/p_Vestd Ltd is authorised and regulated by'), 'Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992).')

WebUI.closeBrowser()


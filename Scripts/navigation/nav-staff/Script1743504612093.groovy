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

WebUI.callTestCase(findTestCase('users-login/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/home')

WebUI.verifyElementPresent(findTestObject('navigation/a_My equity'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_My equity'), 'My equity')

WebUI.verifyElementPresent(findTestObject('navigation/a_Home'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Home'), 'Home')

WebUI.click(findTestObject('navigation/a_Home'))

WebUI.verifyElementPresent(findTestObject('navigation/Page_Home/h1_Reid Ltd'), 0)

WebUI.verifyElementText(findTestObject('navigation/Page_Home/h1_Reid Ltd'), 'Reid Ltd')

WebUI.verifyElementPresent(findTestObject('navigation/a_Share schemes'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Share schemes'), 'Share schemes')

WebUI.click(findTestObject('navigation/a_Share schemes'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/li_Schemes'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/li_Schemes'), 'SCHEMES')

WebUI.verifyElementPresent(findTestObject('navigation/a_Investment'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Investment'), 'Investment')

WebUI.verifyElementPresent(findTestObject('navigation/a_Share capital'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Share capital'), 'Share capital')

WebUI.verifyElementPresent(findTestObject('navigation/a_Secretarial  admin'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Secretarial  admin'), 'Secretarial & admin')

WebUI.verifyElementPresent(findTestObject('navigation/a_People  communication'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_People  communication'), 'People & communication')

WebUI.verifyElementPresent(findTestObject('navigation/a_Company - staff'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Company - staff'), 'Company - staff')

WebUI.verifyElementPresent(findTestObject('navigation/a_Help Centre'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Help Centre'), 'Help Centre')

WebUI.verifyElementPresent(findTestObject('navigation/a_Company settings'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Company settings'), 'Company settings')

WebUI.verifyElementPresent(findTestObject('navigation/a_App - staff'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_App - staff'), 'App - staff')

WebUI.verifyElementPresent(findTestObject('navigation/img'), 0)

WebUI.verifyElementPresent(findTestObject('navigation/p_Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992)'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/p_Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992)'), 
    'Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992).')

WebUI.closeBrowser()


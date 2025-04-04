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

WebUI.callTestCase(findTestCase('users-login/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/users/dashboard/a_View'))

not_run: WebUI.verifyElementNotVisibleInViewport(findTestObject('Object Repository/users/home-page/a_Staff'), 
    0)

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/users/home-page/a_Staff'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Staff'), 'Staff')

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/users/home-page/a_Company - staff'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/users/home-page/a_Company - staff'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Company - staff'), 
    'Company - staff')

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/users/home-page/a_App - staff'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/users/home-page/a_App - staff'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_App - staff'), 
    'App - staff')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/a_Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/a_Home'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Home'), 'Home')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/a_Share schemes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/a_Share schemes'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Share schemes'), 'Share schemes')

WebUI.waitForElementVisible(findTestObject('Object Repository/users/home-page/a_Investment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/a_Investment'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Investment'), 'Investment')

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/a_Share capital'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/a_Share capital'))

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Share capital'), 'Share capital')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/a_Secretarial  admin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/a_Secretarial  admin'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Secretarial  admin'), 
    'Secretarial & admin')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/a_People  communication'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/a_People  communication'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_People  communication'), 
    'People & communication')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/a_Help Centre'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/a_Help Centre_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Help Centre_1'), 'Help Centre')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/a_Company settings'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/a_Company settings'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_Company settings'), 
    'Company settings')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/a_App - staff'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/users/home-page/a_App - staff'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/a_App - staff'), 
    'App - staff')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/img'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/img'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/img_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/img_1'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/img_1'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/users/home-page/p_Vestd Ltd is authorised and regulated by _eda586'))

WebUI.verifyElementPresent(findTestObject('Object Repository/users/home-page/p_Vestd Ltd is authorised and regulated by _eda586'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/users/home-page/p_Vestd Ltd is authorised and regulated by _eda586'), 
    'Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992).')


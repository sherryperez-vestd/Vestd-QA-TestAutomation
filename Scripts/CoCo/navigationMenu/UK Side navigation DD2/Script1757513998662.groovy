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

'Login and navigate to the home page'
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/home')

// Define side nav items as an array of maps
def sideNavItems = [
    [obj: 'CoCo/navigation/side-nav/a_My equity', text: 'My Equity'],
    [obj: 'CoCo/navigation/side-nav/a_Home', text: 'Home'],
    [obj: 'CoCo/navigation/side-nav/a_Share schemes', text: 'Share schemes'],
    [obj: 'CoCo/navigation/side-nav/a_Investment', text: 'Investment'],
    [obj: 'CoCo/navigation/side-nav/a_Share capital', text: 'Share capital'],
    [obj: 'CoCo/navigation/side-nav/a_Compliance', text: 'Compliance'],
    [obj: 'CoCo/navigation/side-nav/a_Documents', text: 'Documents'],
    [obj: 'CoCo/navigation/side-nav/a_People  communication', text: 'People & communication'],
    [obj: 'CoCo/navigation/side-nav/a_Company - staff', text: 'Company - staff'],
    [obj: 'CoCo/navigation/side-nav/a_Help Centre', text: 'Help centre'],
    [obj: 'CoCo/navigation/side-nav/a_Company settings 2'],
    [obj: 'CoCo/navigation/side-nav/a_App - staff', text: 'App - staff']
]

// Loop through and check
sideNavItems.each { menu ->
	CustomKeywords.'UIKeywords.verifyElementPresentVisible'(menu.obj)
    if (menu.text) {
        CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'(menu.obj, menu.text)
    }
   
}



WebUI.closeBrowser()


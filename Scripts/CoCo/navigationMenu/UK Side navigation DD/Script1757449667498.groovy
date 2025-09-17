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


// Define side nav items as an array of maps
def sideNavShareschemesItems = [
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_ESU/a_Existing scheme uploads', text: 'Existing scheme uploads', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_ESU/h1_Existing scheme uploads', verifyText: 'Existing scheme uploads'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_EMI/a_EMI', text: 'EMI', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_EMI/h1_EMI', verifyText: 'EMI'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_Unapproved Options/a_Unapproved options', text: 'Unapproved options', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_Unapproved Options/h1_Unapproved options', verifyText: 'Unapproved options'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_CSOP/a_CSOP', text: 'CSOP', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_CSOP/h1_CSOP', verifyText: 'CSOP'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_Phantom/a_Phantom shares', text: 'Phantom shares', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_Phantom/h1_Phantom', verifyText: 'Phantom'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_All-options-agreements/a_All option agreements', text: 'All option agreements', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_All-options-agreements/h1_All option agreements', verifyText: 'All option agreements'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_GS/a_Growth shares', text: 'Growth shares', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_GS/h1_Growth shares', verifyText: 'Growth shares'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_RSA/a_RSAs', text: 'RSAs', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_RSA/h1_RSAs', verifyText: 'RSAs'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_Agile partnerships/a_Agile Partnership', text: 'Agile Partnership', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_Agile partnerships/h1_Agile Partnerships', verifyText: 'Agile Partnerships'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_Valuations/a_Valuations', text: 'Valuations', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_Valuations/h1_Valuations', verifyText: 'Valuations'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_Share-pools/a_Share pools', text: 'Share pools', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_Share-pools/h1_Authorisations', verifyText: 'Authorisations'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_Annual HMRC notifications/a_Annual notifications', text: 'Annual notifications', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_Annual HMRC notifications/h1_Annual notifications', verifyText: 'Annual notifications'],
	[obj: 'CoCo/navigation/side-nav/Share schemes/Page_Initial-Notification/a_Initial notifications', text: 'Initial notifications', verifyObj: 'CoCo/navigation/side-nav/Share schemes/Page_Initial-Notification/h1_EMI initial notifications to HMRC', verifyText: 'EMI initial notifications to HMRC'],
]

WebUI.closeBrowser()


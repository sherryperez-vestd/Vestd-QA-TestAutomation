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
CustomKeywords.'UIKeywords.loginToApp'(userName, GlobalVariable.password)

// If emi user → skip navigate and click My equity
if (userName == 'sherry.perez+emi@vestd.com') {
	WebUI.click(findTestObject('Object Repository/CoCo/dashboard/a_My equity'))
} else {
	WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/home')
}

// Base Top menu items 
def topNavItems = [
	[obj: 'Object Repository/CoCo/navigation/top-nav/a_Dashboard', text: 'Dashboard', url: 'https://demo.app.vestd.com/company/all'],
	[obj: 'Object Repository/CoCo/navigation/top-nav/a_Earn', text: 'Earn £100'],
	[obj: 'Object Repository/CoCo/navigation/top-nav/a_Information'],
	[obj: 'Object Repository/CoCo/navigation/top-nav/a_Notification'],
	[obj: 'Object Repository/CoCo/navigation/top-nav/a_user-account']
]

// Staff only user
if (userName == 'sherry.perez@vestd.com') {
	topNavItems << [obj: 'Object Repository/CoCo/navigation/top-nav/a_Staff', text: 'Staff']
}

topNavItems.each { menu ->
	if (menu.text) {
		CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'(menu.obj, menu.text)
	} else {
		CustomKeywords.'UIKeywords.verifyElementPresentVisible'(menu.obj)
	}

	if (menu.url) {
		CustomKeywords.'UIKeywords.verifyURL'(menu.obj, menu.url)
		WebUI.back()
	}
}

'Check Earn referal menu is not present in all company page'
WebUI.click(findTestObject('Object Repository/CoCo/navigation/top-nav/a_Dashboard'))
WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/top-nav/a_Earn'), 0)
WebUI.back()

'Check Information menu opens correct URL'
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/CoCo/navigation/top-nav/a_Information')
WebUI.click(findTestObject('CoCo/navigation/top-nav/a_Information'))

String currentWindow = WebUI.getWindowIndex()
WebUI.switchToWindowIndex(currentWindow + 1)

url = WebUI.getUrl()
split_url = url.split('/')
removedurlchars = (split_url[(split_url.size() - 1)])
partial_url = url.minus(removedurlchars)
WebUI.verifyEqual(partial_url, 'https://www.vestd.com/')
WebUI.click(findTestObject('CoCo/navigation/top-nav/btn_Accept'))
WebUI.switchToWindowIndex(currentWindow)

WebUI.closeBrowser()


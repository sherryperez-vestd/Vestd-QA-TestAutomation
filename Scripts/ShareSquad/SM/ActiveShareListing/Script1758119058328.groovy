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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/52618')

WebUI.setText(findTestObject('ShareSquad/secondaryMarket/ActiveShareList/Page_403 - Vestd/input_Email address_email'), 'radhika.chaudhary+1@vestd.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_403 - Vestd/input_Password_password'), 
    '5ayXGn/UQ1Ic+1mHCRSZgA==')

WebUI.click(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_403 - Vestd/button_Log in'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_DoNotUse_AutomationTest - Vestd/div_Secondary market  Update'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_DoNotUse_AutomationTest - Vestd/div_Secondary market  Update'))

//WebUI.verifyElementClickable(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_DoNotUse_AutomationTest - Vestd/a_View listing'))


def clickElementByXPath(String xpath) {
	TestObject dynamicObject = new TestObject('dynamicObject')
	dynamicObject.addProperty('xpath', ConditionType.EQUALS, xpath)
	WebUI.click(dynamicObject)
}

clickElementByXPath('//a[text()="View listing"]')


//WebUI.click(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_DoNotUse_AutomationTest - Vestd/a_View listing'))

WebUI.waitForElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/h1_Active share listings'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/h1_Active share listings'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/p_Manage all shares for sale in the seconda_fe1926'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/h3_Shareholders'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/button_Add filter'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/input_Search_table-search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/label_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/th_Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/th_Number of shares offered'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/th_Shares accepted'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/th_Price per share'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/th_Listing date'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/th_Actions'), 
    0)

//WebUI.verifyElementClickable(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/a_Recipient User'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/td_111'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/td_111_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/td_1.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/td_8th May 2025'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/td_Pending'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/a_Delete'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/div_Total of shares offered 111  Total of s_d20070'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/b_111'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/b_111_1'))

WebUI.click(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/a_Delete'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/h5_Are you sure you want to delete this listing'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/p_Once deleted, the listing will be permane_6e2047'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/button_Yes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/button_No, go back'))

WebUI.click(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/button_No, go back'))

WebUI.click(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/a_Delete'))

WebUI.click(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/button_Yes'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/div_Offers deleted'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/div_Offers deleted'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/secondaryMarket/ActiveShareList/Page_Secondary Market - Share listings - Vestd/td_No data available in table'))

WebUI.closeBrowser()


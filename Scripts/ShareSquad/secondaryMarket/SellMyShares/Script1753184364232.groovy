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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/52618/dashboard')

WebUI.setText(findTestObject('Object Repository/SM/SellShares/Page_403 - Vestd/input_Email address_email'), 'radhika.chaudhary+2@vestd.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SM/SellShares/Page_403 - Vestd/input_Password_password'), '5ayXGn/UQ1Ic+1mHCRSZgA==')

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_403 - Vestd/button_Log in'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/h1_My Equity'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/div_Secondary market trading now open for S_c7448b'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/h3_Secondary market trading now open for St_eb3874'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/p_You can now selltrade your shares in the _581bc6'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/a_Sell my shares'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/p_Click below to proceed to the share trading form'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/a_Sell my shares'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/a_Back to Dashboard'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/h1_Share selling form'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/p_As a shareholder, this form allows you to_d53221'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Share class'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/input_Share class_Kp8qEyJdgYljnTq8'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Number of shares'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/p_You can request to sell all your shares o_a200a1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/span_Sell all shares'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/span_Specific number of shares'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Set the price per share at which you _8b7c2d'))

WebUI.verifyElementText(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/input__Uflt6tK1xqM7YeIM'), 
    '')

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/span_Enter your desired price within the ra_d51983'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Offer shares for sale'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Offer shares for sale'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/h5_Are you sure you want to offer shares for sale'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/p_You have chosen to list all shares of Ord_d9bdff'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Yes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_No, go back'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Yes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/div_Sell offer is created successfully'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/a_View my offer'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/a_View my offer'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Delete Offer'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Delete Offer'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Delete Offer'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/h5_Are you sure you want to delete this offer'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/h5_Are you sure you want to delete this offer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/p_Once deleted, this offer will be removed _dfe0ee'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Yes'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/div_Sell offer is deleted successfully'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/div_Sell offer is deleted successfully'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/a_Sell my shares_1'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/a_Sell my shares_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Specific number of shares'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Specific number of shares'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Specific number of shares'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Enter the number of shares'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Enter the number of shares'))

WebUI.setText(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/input_Enter the number of shares_num_shares_5115e3'), 
    '111')

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Offer shares for sale'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Offer shares for sale'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Yes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/div_Sell offer is created successfully'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/a_View my offer_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Offer shares for sale'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Offer shares for sale'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Delete Offer'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/label_Sell all shares'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/span_Specific number of shares'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/span_Sell all shares'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/span_Specific number of shares'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Offer shares for sale'))

WebUI.click(findTestObject('Object Repository/SM/SellShares/Page_Secondary Market - Share selling form - Vestd/button_Yes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/SellShares/Page_Dashboard - Vestd/div_Sell offer is updated successfully'))

WebUI.closeBrowser()


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
import java.time.LocalDate as LocalDate

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/52618')

WebUI.setText(findTestObject('Object Repository/SM/Page_403 - Vestd/input_Email address_email'), 'radhika.chaudhary+1@vestd.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SM/Page_403 - Vestd/input_Password_password'), '5ayXGn/UQ1Ic+1mHCRSZgA==')

WebUI.click(findTestObject('Object Repository/SM/Page_403 - Vestd/button_Log in'))

WebUI.verifyElementPresent(findTestObject('SM/Page_DoNotUse_AutomationTest - Vestd/a_Company settings'), 0)

WebUI.click(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/a_Company settings'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/span_Secondary market'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/p_Your go-to space for shareholders to sell_a36c2f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/a_Turn on'))

WebUI.click(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/a_Turn on'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/h1_Secondary market'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/h1_Secondary market'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/span_Activate the Secondary Market to let y_0a1909'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Enable share sales in Secondary Marke_1eb124'), 
    0)

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Enable share sales in Secondary Marke_1eb124'))

TestObject shareClassLabel = findTestObject('Object Repository/SM/Page_Secondary market - Vestd/label_Share class')

TestObject enableShareSalesCheckbox = findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Enable share sales in Secondary Marke_1eb124')

// Check if the element is present (visible on the page)
if (WebUI.verifyElementPresent(shareClassLabel, 3, FailureHandling.OPTIONAL)) {
    WebUI.comment('✅ Share class label is visible.')

    WebUI.verifyElementVisible(shareClassLabel)
} else {
    WebUI.comment('❌ Share class label not visible. Clicking checkbox to reveal it.')

    WebUI.click(enableShareSalesCheckbox)
}

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/label_Share class'), 0)

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Share class_lqsNn8eUC0pcBijw'))

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Share class_lqsNn8eUC0pcBijw'))

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/li_Ordinary A'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/div_Sales window Select a date range in whi_83d30a'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/span_Start date'))

// Get today's date
LocalDate today = LocalDate.now()

LocalDate endDate = today.plusDays(7)

// Extract day, month, and year
String day = today.getDayOfMonth().toString().padLeft(2, '0')

String month = today.getMonthValue().toString().padLeft(2, '0')

String year = today.getYear().toString()

// Fill the date inputs
// Extract parts for end date
String endDay = endDate.getDayOfMonth().toString().padLeft(2, '0')

String endMonth = endDate.getMonthValue().toString().padLeft(2, '0')

String endYear = endDate.getYear().toString()

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Day_started_at_day'), day)

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Month_started_at_month'), month)

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Year_started_at_year'), year)

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/span_End date'), 0)

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Day_ended_at_day'), '1')

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Month_ended_at_month'), '1')

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Year_ended_at_year'), '2024')

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/label_Enter price per share'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/span_'))

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input__ul7KyLCn7tiEks2M'), '1')

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/p_Allowed price deviation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/label_Lower limit'))

WebUI.setText(findTestObject('SM/Page_Secondary market - Vestd/input_Lower limit_HrqnbbuGPZpk4YUQ'), '5')

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/span_Minimum percentage deviation from the _b64591'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/label_Upper limit'), 0)

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Upper limit_v2KBh3fr7eoLpQTu'), '10')

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/span_Maximum percentage deviation from the _173e0d'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/button_Save'))

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/h5_Are you sure you want to save these settings'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/p_Shareholders of the selected share class _7cecbd'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/button_Yes'))

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/button_Yes'))

TestObject dateError = new TestObject()

dateError.addProperty('xpath', ConditionType.EQUALS, '//*[@id="main-content-wrapper"]//div[1]/ul/li')

WebUI.waitForElementVisible(dateError, 10)

String errorText = WebUI.getText(dateError)

println('Date Error Message: ' + errorText)

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Day_ended_at_day'), endDay)

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Month_ended_at_month'), endMonth)

WebUI.setText(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Year_ended_at_year'), endYear)


WebUI.scrollToElement(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Share class_lqsNn8eUC0pcBijw'), 5)
WebUI.waitForElementClickable(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Share class_lqsNn8eUC0pcBijw'), 5)
WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Share class_lqsNn8eUC0pcBijw'))

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/input_Share class_lqsNn8eUC0pcBijw'))

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/li_Ordinary A'))


WebUI.verifyElementClickable(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/button_Save'))

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/h5_Are you sure you want to save these settings'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/p_Shareholders of the selected share class _7cecbd'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/button_Yes'))

WebUI.click(findTestObject('Object Repository/SM/Page_Secondary market - Vestd/button_Yes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/div_Success, secondary market have been suc_6b17f4'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/div_Ordinary A'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/div_Ordinary A'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/time_5th May 2025'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/time_6th May 2025'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/span_5'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/Page_DoNotUse_AutomationTest - Vestd/span_10'))

WebUI.callTestCase(findTestCase('Test Cases/SM/SellMyShares') // Path to the test case
    , [:] // Pass parameters here if needed
    , FailureHandling.STOP_ON_FAILURE // Choose failure handling mode
    )

WebUI.callTestCase(findTestCase('Test Cases/SM/ActiveShareListing') // Path to the test case
    , [:] // Pass parameters here if needed
    , FailureHandling.STOP_ON_FAILURE // Choose failure handling mode
    )

WebUI.callTestCase(findTestCase('Test Cases/SM/ShareListingUpdates') // Path to the test case
    , [:] // Pass parameters here if needed
    , FailureHandling.STOP_ON_FAILURE // Choose failure handling mode
    )


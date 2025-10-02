 /**
 * Waterfall Modelling Page Test Script
 * -------------------------------------
 * This Katalon test script performs the following actions:
 * 1. Logs into the application using staff credentials.
 * 2. Navigates to the Waterfall Modelling page.
 * 3. Verifies presence and visibility of key static elements.
 * 4. Verifies table headers for Shareclasses, Warrants, Growth Shares, and Final Payouts.
 * 5. Sets exit amount and calculates waterfall.
 * 6. Verifies payout distribution chart and calculation log.
 * 7. Resets the form and confirms all elements are cleared.
 * 8. Changes currency and verifies that labels update accordingly.
 *
 * Custom Keywords Used:
 * - UIKeywords.loginToApp(username, password): Logs in a user.
 * - UIKeywords.verifyElementPresentVisible(testObject): Verifies an element is present and visible.
 * - UIKeywords.clickElement(testObject): Clicks a web element.
 *
 * Functions:
 * - verifyTableHeaders(List<String> headers, int timeout): Verifies that all table headers in a list are present.
 *
 * Notes:
 * - Uses dynamic TestObject creation with XPath to check table headers.
 * - Uses loops to iterate over multiple elements and tables to reduce code repetition.
 */ import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testdata.TestData as TestData

// -------------------- LOGIN --------------------
// Log in using staff credentials
not_run: CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

// Navigate to the Waterfall Modelling page
WebUI.navigateToUrl(appURL)

// -------------------- VERIFY STATIC ELEMENTS --------------------
// List of key elements to verify
['dd_Currency', 'input_exitAmount', 'btn_addClass', 'btn_addWarrant', 'btn_addGrowthShare', 'btn_calculateWaterfall', 'input_IncludeVanillaDebt'
    , 'input_IncludeConvertibleDebt', 'btn_deleteShareClass', 'btn_deleteGrowthShares'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/StatSquad/waterfallModelling/$it")
    })

// -------------------- VERIFY TABLE HEADERS --------------------
// Shareclasses table headers
def ShareclassesHeaders = ['Class', 'Type', 'Shares', 'Investment', 'Seniority', 'Pref x', 'Participates?', 'Cap x', 'Conversion ratio'
    , 'Date']

verifyTableHeaders(ShareclassesHeaders)

// Warrants table headers
def WarrantsHeaders = ['Class', 'Shares', 'Price']

verifyTableHeaders(WarrantsHeaders)

// Growth shares table headers
def GrowthSharesHeaders = ['Class', 'Shares', 'Hurdle rate']

verifyTableHeaders(GrowthSharesHeaders)

// -------------------- CALCULATION --------------------
// Set exit amount
WebUI.setText(findTestObject('StatSquad/waterfallModelling/input_exitAmount'), '1000000')

// Click calculate waterfall
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/waterfallModelling/btn_calculateWaterfall')

// Final Payouts table headers
def FinalPayoutsHeaders = ['Class', 'Preferred payout', 'Participation payout', 'Total payout']

verifyTableHeaders(FinalPayoutsHeaders)

// Verify payout distribution chart
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/waterfallModelling/h3_payoutDistribution')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/waterfallModelling/canvas_graph')

// Verify calculation log
WebUI.verifyTextPresent('View calculation log', false)

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/waterfallModelling/chevron_viewCalculationLog')

WebUI.verifyTextPresent('Exit Amount: £1,000,000', false)

// -------------------- RESET FORM --------------------
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/waterfallModelling/btn_resetAll')

// Verify reset messages and that tables are cleared
WebUI.verifyTextPresent('Form has been reset successfully. You may begin a new calculation.', false)

WebUI.verifyTextNotPresent('Final payouts', false)

WebUI.verifyTextNotPresent('Payout distribution', false)

WebUI.verifyTextNotPresent('View calculation log', false)

// -------------------- CURRENCY CHANGE --------------------
CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/waterfallModelling/dd_Currency')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/waterfallModelling/li_INR')

WebUI.verifyTextPresent('Exit amount (₹)', false) // -------------------- FUNCTIONS --------------------
/**
 * Verifies that table headers are present on the page.
 * Dynamically creates a TestObject for each header.
 *
 * @param headers List of header names to verify
 * @param timeout Time in seconds to wait for each header (default 10)
 */
// Create dynamic TestObject with XPath matching the header text
// Verify the element is present

def verifyTableHeaders(List<String> headers, int timeout = 10) {
    headers.each({ def header ->
            TestObject thHeader = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//th[contains(normalize-space(.), '$header')]")

            WebUI.verifyElementPresent(thHeader, timeout)
        })
}


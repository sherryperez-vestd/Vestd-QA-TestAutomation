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

/**
 * Test Case: Verify visibility and content of buyback program alert on My Equity page
 *
 * Steps:
 * 1. Navigate directly to the recipient’s My Equity dashboard.
 * 2. Confirm that the buyback alert banner is present.
 * 3. Verify the heading text, eligibility message, and presence of the "View offer" link.
 * 4. Ensure the "View offer" link is clickable.
 */

//WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/dashboard?user_id=370324')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/buyback/alert buyback'), 0)

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/buyback/h3_alert heading'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/buyback/h3_alert heading'), 'Indian Co\'s option buyback program is now open!')

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/buyback/txt buyback eligible'), 0)

//WebUI.verifyElementText(findTestObject('StatSquad/myEquity/buyback/txt buyback eligible'), 'The buyback window is open from 1st Jan 2025 to 1st Jan 2026.')
WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/buyback/a_view offer'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/buyback/a_view offer'), 'View offer')

WebUI.waitForElementClickable(findTestObject('StatSquad/myEquity/buyback/a_view offer'), 0)


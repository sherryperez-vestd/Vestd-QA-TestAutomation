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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys

/**
 * Test Case: Verify “Your Tax Benefits” pop‑over for different scheme types
 *
 * Steps:
 * 1. Log in as staff and navigate to each user’s My Equity dashboard:
 *    • EMI: https://demo.app.vestd.com/company/50135/dashboard?user_id=370192
 *    • CSOP: https://demo.app.vestd.com/company/50135/dashboard?user_id=370432
 *    • Growth Shares: https://demo.app.vestd.com/company/50135/dashboard?user_id=370450
 * 2. Enter estimated profit per share, open “Your tax benefits” pop‑over.
 * 3. Verify:
 *    • EMI user sees “14%”
 *    • CSOP user sees “20%”
 *    • Growth Shares user sees explanatory text
 * 4. Assert expected content is shown in each case.
 */
WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

'Login and navigate to My equity page'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370192')

WebUI.setText(findTestObject('StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), '10')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/taxBenefits/i_Your tax benefits_'))

//CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/myEquity/taxBenefits/p_emi_14percent')
//CustomKeywords.'UIKeywords.verifyElementContainsPartialText'('Object Repository/StatSquad/myEquity/taxBenefits/p_emi_14percent','14%')
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/taxBenefits/p_emi_14percent'), 0)

def elementText = WebUI.getText(findTestObject('Object Repository/StatSquad/myEquity/taxBenefits/p_emi_14percent'))

assert elementText.contains('14%')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370432')

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/overall-value-graph/select_estimatedProfit'), 0)

WebUI.click(findTestObject('StatSquad/myEquity/graph/overall-value-graph/select_estimatedProfit'))

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/overall-value-graph/select_estimatedProfit_perShare'), 0)

not_run: WebUI.click(findTestObject('StatSquad/myEquity/graph/overall-value-graph/select_estimatedProfit_perShare'))

WebUI.clearText(findTestObject('StatSquad/myEquity/_common/input_estimatedProfitIn5Years'))

WebUI.setText(findTestObject('StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), '10')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/taxBenefits/i_Your tax benefits_'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/taxBenefits/p_csop_20percent'), 0)

def elementText2 = WebUI.getText(findTestObject('StatSquad/myEquity/taxBenefits/p_csop_20percent'))

assert elementText2.contains('20%')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=370450')

WebUI.setText(findTestObject('StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), '10')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/taxBenefits/i_Your tax benefits_'))

WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/taxBenefits/p_Growth shares tax profit calculations'), 0)

WebUI.verifyElementText(findTestObject('StatSquad/myEquity/taxBenefits/p_Growth shares tax profit calculations'), 'Growth shares tax & profit calculations (these are indicative and will depend on your personal tax circumstances)')


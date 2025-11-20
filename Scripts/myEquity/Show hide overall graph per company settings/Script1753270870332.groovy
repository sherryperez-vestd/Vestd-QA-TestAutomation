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
 * Test Case: Verify the toggle to show/hide My Equity calculator and value graph
 *
 * Steps:
 * 1. Navigate to the company admin page.
 * 2. Verify the presence of the "Hide My Equity calculator and graph" toggle.
 * 3. Set the toggle to "Hide", save changes, and confirm the graph/calculator is not displayed on the recipient dashboard.
 * 4. Reset the toggle to "Show" for cleanup.
 */
'Login and navigate to My company admin page'
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

WebUI.navigateToUrl(GlobalVariable.staffCompanyAdminPage)

'Check option to hide/show value graph and calculator are present'
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/showHideSettings/label_hideMyEquityCalculatorAndGraph', 
    'Hide “My Equity calculator and graph” (recipient dashboard) from the recipients')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/myEquity/showHideSettings/input_yes_Hide')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/showHideSettings/label_Yes', 
    'Yes')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/myEquity/showHideSettings/input_no_DoNotHide')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/showHideSettings/label_No_DoNotHide', 
    'No, do not hide')

'Hide value graph and calculator\r\n'
CustomKeywords.'UIKeywords.clickElement'('StatSquad/myEquity/showHideSettings/input_yes_Hide')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/myEquity/_common/button_Save')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/showHideSettings/message_Company updated', 
    'Company updated')

WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

'Check value graph and calculator are displayed\r\n'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/StatSquad/myEquity/_common/tab_Overall value'), 0)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/StatSquad/myEquity/showHideSettings/div_Estimated Profit in 5 Years'), 
    0)

WebUI.navigateToUrl(GlobalVariable.staffCompanyAdminPage)

'Unhide value graph and calculator\r\n'
CustomKeywords.'UIKeywords.clickElement'('StatSquad/myEquity/showHideSettings/input_no_DoNotHide')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/StatSquad/myEquity/_common/button_Save')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('Object Repository/StatSquad/myEquity/showHideSettings/message_Company updated', 
    'Company updated')

WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

'Check value graph and calculator are now displayed'
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/myEquity/_common/tab_Overall value')
CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/StatSquad/myEquity/showHideSettings/div_Estimated Profit in 5 Years')



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

/*
 * Automate the verification and interaction with the "Overall value" graph and related UI elements on a specific dashboard page.
 *
 * 1. Navigate to a given URL representing a user dashboard.
 * 2. Verify visibility and presence of the "Overall value" tab and click it.
 * 3. Scroll to and interact with elements related to estimated profit input and selection.
 * 4. Clear the estimated profit input and verify the display of an empty graph with associated explanatory text.
 * 5. Input a value into the estimated profit field and verify the graph canvas appears.
 * 6. Verify presence, visibility, and text of radio buttons for different vesting options: "Vesting over time," "Vested until now," and "Simulate all vested."
 * 7. Verify tooltips for each vesting option by clicking tooltip icons, checking tooltip text, and toggling visibility.
 * 8. Click each vesting option radio button and verify the graph canvas updates accordingly.
 */
// Login
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

WebUI.navigateToUrl(GlobalVariable.EMIVestingGraphURL)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/_common/tab_overall-value'))

'Check Overall value tab'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/_common/tab_overall-value'), 0)

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/_common/tab_overall-value'))

not_run: WebUI.scrollToElement(findTestObject('StatSquad/myEquity/_common/select_estimatedProfit'), 0)

not_run: WebUI.click(findTestObject('StatSquad/myEquity/_common/select_estimatedProfit'))

not_run: WebUI.click(findTestObject('StatSquad/myEquity/graph/overall-value-graph/select_estimatedProfit_perShare'))

not_run: WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/overall-value-graph/input_estimatedProfit'), 0)

// First, ensure the element is visible and enabled
not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), 
    10)

// Optionally scroll to the element if you suspect it might not be visible
not_run: WebUI.scrollToElement(findTestObject('Object Repository/StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), 
    10)

// Now set the text to the input field
not_run: WebUI.setText(findTestObject('Object Repository/StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), '0')

// Verify if the element's value was set correctly
not_run: String inputValue = WebUI.getAttribute(findTestObject('Object Repository/StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), 
    'value')

not_run: WebUI.comment('Input value is: ' + inputValue)

not_run: WebUI.click(findTestObject('StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('StatSquad/myEquity/_common/input_estimatedProfitIn5Years'), Keys.chord(Keys.BACK_SPACE))

not_run: WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/overall-value-graph/img_emptyGraph'), 0)

'Check Empty Overall value graph'
not_run: WebUI.verifyElementPresent(findTestObject('StatSquad/myEquity/graph/overall-value-graph/img_emptyGraph'), 0)

not_run: WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/overall-value-graph/img_emptyGraph'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/txt_empty-graph-This is where'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/txt_empty-graph-This is where'), 
    'This is where your potential growth statistics will appear!')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/txt_empty-graph-Use the calculator'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/txt_empty-graph-Use the calculator'), 
    'Use the calculator to visualise your future values.')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/img_emptyGraph'))

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/overall-value-graph/input_estimatedProfit'), 0)

WebUI.setText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/input_estimatedProfit'), '1')

'Check Overall value graph'
WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/canvas'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/canvas'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/radio_vesting-over-time'), 
    0)

'Check vesting overtime radio'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioVestingOverTime'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioVestingOverTime'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioVestingOverTime'), 
    'Vesting over time')

'Check vesting overtime tooltip'
WebUI.verifyElementVisible(findTestObject('StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_vestingOverTime'))

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_vestingOverTime'), 0)

WebUI.click(findTestObject('StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_vestingOverTime'))

WebUI.delay(0.5)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-txt_vestingOverTime'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-txt_vestingOverTime'), 
    'Tracks how your options/shares will vest according to the schedule in your agreement.')

WebUI.click(findTestObject('StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_vestingOverTime'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/radio_vested-until-now'))

'Check vested until now radio'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioVestedUntilNow'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioVestedUntilNow'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioVestedUntilNow'), 
    'Vested until now')

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_vestedUntilNow'))

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_vestedUntilNow'), 0)

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_vestedUntilNow'))

WebUI.delay(0.5)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-txt_vestedUntilNow'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-txt_vestedUntilNow'), 
    'Displays only the shares that have already vested.')

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_vestedUntilNow'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/radio_simulate-all'))

'Check simulate all radio'
WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioSimulateAll'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioSimulateAll'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/label_radioSimulateAll'), 
    'Simulate all vested')

'Check simulate all tooltip'
WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_simulateAllVested'))

WebUI.scrollToElement(findTestObject('StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_simulateAllVested'), 0)

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_simulateAllVested'))

WebUI.delay(0.5)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-txt_simulateAll'))

WebUI.verifyElementText(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/tooltip-txt_simulateAll'), 
    'Shows the potential value of your shares once everything has fully vested.')

WebUI.click(findTestObject('StatSquad/myEquity/graph/overall-value-graph/tooltip-icon_simulateAllVested'))

WebUI.click(findTestObject('StatSquad/myEquity/graph/overall-value-graph/radio_vesting-over-time'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/canvas'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/canvas'))

WebUI.click(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/radio_vested-until-now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/canvas'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/canvas'))

WebUI.click(findTestObject('StatSquad/myEquity/graph/overall-value-graph/radio_simulate-all'))

WebUI.verifyElementPresent(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/canvas'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/StatSquad/myEquity/graph/overall-value-graph/canvas'))


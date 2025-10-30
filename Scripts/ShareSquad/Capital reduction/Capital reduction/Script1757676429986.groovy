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

// Login
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)
WebUI.navigateToUrl(capitalReductionURL)
CustomKeywords.'UIKeywords.clickElement'('Object Repository/ShareSquad/capitalReduction/btn_Continue')

//------- Verify more than 12 decimals are not accepted as nominal value

// Enter a valid 12-decimal value and verify if accepted
String validValue = '0.000000000001'
WebUI.setText(findTestObject('ShareSquad/capitalReduction/input_nominalValue'), validValue)
String actualValue = WebUI.getAttribute(findTestObject('ShareSquad/capitalReduction/input_nominalValue'), 'value')
assert actualValue == validValue

// Enter more than 12 decimals and verify last digit is not accepted
String overLimitValue = '0.0000000000001' // 13 decimals
WebUI.setText(findTestObject('ShareSquad/capitalReduction/input_nominalValue'), overLimitValue)
String resultValue = WebUI.getAttribute(findTestObject('ShareSquad/capitalReduction/input_nominalValue'), 'value')

// Validate the field didn’t accept more than 12 decimal digits
int decimalPartLength = resultValue.contains('.') ? (resultValue.split('\\.')[1]).length() : 0
assert decimalPartLength <= 12
println("✅ Field correctly restricted to 12 decimal places. Actual value: $resultValue")

//------- Extract the nominal value and input incremented value

// Get the full text from the element
String fullText = WebUI.getText(findTestObject('ShareSquad/capitalReduction/label_nominalValue'))

// Extract the decimal value
def matcher = (fullText =~ /£([0-9]+\.[0-9]+)/)
String decimalValue = matcher ? matcher[0][1] : null

// Convert to BigDecimal
BigDecimal value = new BigDecimal(decimalValue)

// Define a fixed increment of 0.000000000001
BigDecimal increment = new BigDecimal('0.000000000001')

// Add increment
BigDecimal newValue = value.add(increment)

// Convert back to string with same precision
String formattedValue = newValue.setScale(12, BigDecimal.ROUND_UNNECESSARY).toPlainString()

// Set the text in the input field
WebUI.setText(findTestObject('ShareSquad/capitalReduction/input_nominalValue'), formattedValue)

println("✅ Incremented value: $formattedValue")


// Set text current date in the input date fields
def dateParts = getCurrentDateParts()

WebUI.setText(findTestObject('ShareSquad/capitalReduction/input_day'), dateParts.day)

WebUI.setText(findTestObject('ShareSquad/capitalReduction/input_month'), dateParts.month)

WebUI.setText(findTestObject('ShareSquad/capitalReduction/input_year'), dateParts.year) //Get current date parts as strings
CustomKeywords.'UIKeywords.clickElement'('Object Repository/ShareSquad/capitalReduction/btn_Submit')

WebUI.verifyTextPresent('Capital reduction has been successfully done.', false)

// Assume formattedValue is already set
String valueToVerify = formattedValue

// Check if the last character is '0'
if (formattedValue.endsWith('0')) {
    valueToVerify = formattedValue[0..-2]  // Remove last '0'
    println("Removed trailing zero. Value to verify: $valueToVerify")
} else {
    println("No trailing zero. Value to verify: $valueToVerify")
}

// Verify that the value is present on the page
WebUI.verifyTextPresent(valueToVerify, false)

WebUI.closeBrowser()


def getCurrentDateParts() {
    Calendar calendar = Calendar.getInstance()

    return [('day') : calendar.get(Calendar.DAY_OF_MONTH).toString(), ('month') : (calendar.get(Calendar.MONTH) + 1).toString()
        , ('year') : calendar.get(Calendar.YEAR).toString()]
}


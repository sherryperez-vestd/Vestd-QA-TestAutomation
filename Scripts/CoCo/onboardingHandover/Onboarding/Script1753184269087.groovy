import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import static org.junit.Assert.assertEquals
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50470/home')

WebUI.setText(findTestObject('CoCo/handoverObjects/Tabs/Page_403 - Vestd/input_Email address_email'), 'radhika.chaudhary@vestd.com')

WebUI.setEncryptedText(findTestObject('CoCo/handoverObjects/Tabs/Page_403 - Vestd/input_Password_password'), 'dKUWoKfqioauKpv97TPFcQ==')

WebUI.click(findTestObject('CoCo/handoverObjects/Tabs/Page_403 - Vestd/button_Log in'))

// Step 1: Get the WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Step 2: Get current URL
String currentUrl = driver.getCurrentUrl()

println('Current URL: ' + currentUrl)

// Step 3: Modify the URL (replace '/home' with '/handover')
String newUrl = currentUrl.replace('/home', '/handover')

println('Modified URL: ' + newUrl)

// Step 4: Open a new tab
//   WebDriver driver = DriverFactory.getWebDriver()
((JavascriptExecutor) driver).executeScript('window.open()')

// Step 5: Switch to the new tab
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles())

driver.switchTo().window(tabs.get(1))

// Step 6: Navigate to the new URL
driver.get(newUrl)

TestObject createHandoverCTA = new TestObject()

createHandoverCTA.addProperty('xpath', ConditionType.EQUALS, '//button[@type=\'submit\']')

if (WebUI.verifyElementPresent(createHandoverCTA, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(createHandoverCTA)

    WebUI.waitForPageLoad(10)

    println('Clicked \'Create Handover\' button and waited for page reload')
} else {
    println('\'Create Handover\' button not present, skipping')
}

// Wait for the tab section to be visible
TestObject tabList = new TestObject()

tabList.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//form/div[1]/ul')

WebUI.waitForElementVisible(tabList, 10)

// Fetch all tab elements
List<WebElement> navTabs = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//form/div[1]/ul/li/a'), 
    10)

//click on handover cta directly to check validation msgs
List<WebElement> navTabToVerifyValidationError = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, 
        '//*[@id=\'main-content-wrapper\']//form/div[1]/ul/li'), 10)

(navTabToVerifyValidationError[5]).click()

println("🖱️ Clicked on sixth tab: '$navTabToVerifyValidationError[5].getText()'")

WebUI.delay(5)

TestObject handoverCta = new TestObject()

handoverCta.addProperty('xpath', ConditionType.EQUALS, '(//button[@type=\'submit\'])[2]')

WebUI.click(handoverCta)

println('📥 Clicked on \'handover\' button')

WebUI.delay(5)

TestObject alertBox = new TestObject()

alertBox.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'alert-danger\')]')

WebUI.waitForElementVisible(alertBox, 10)

List<WebElement> actualElements = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'alert-danger\')]//li'), 
    5)

List<String> actualMessages = actualElements.collect({ 
        it.getText().trim()
    })

// Define full list of expected validation messages
List<String> expectedMessages = ['does customer know number of options / shares to grant field is required.', 'valuation field is required.'
    , 'share / option pool field is required.', 'share / option pool authorisation field is required.', 'Cap table field is required.'
    , 'Cap table visibility field is required.', 'do record names match field is required.', 'co sec functionality field is required.'
    , 'disable shareholder management field is required.', 'any planned changes in next 6 months field is required.', 'Articles & governance type field is required.'
    , 'Articles / clause field is required.', 'must sign shareholders field is required.', 'majority consent matters field is required.'
    , 'more than 75 percent approval field is required.', 'customer personality field is required.', 'call with onboarding contact required before contacting customer field is required.'
    , 'knowledge level field is required.', 'communication method field is required.', 'The AML risk score is required when approving the company.'
    , 'The G-Drive link is required.']

// Sort both lists for consistent comparison
actualMessages.sort()

expectedMessages.sort()

List<String> cleanedActualMessages = actualMessages.collect({ 
        it.replaceAll('\\s+', ' ' // Replace multiple spaces/newlines with single space
            ).replaceAll('\\.\\.+', '.' // Replace multiple periods with one
            ).trim()
    })

// Normalize expected messages
List<String> cleanedExpectedMessages = expectedMessages.collect({ 
        it.replaceAll('\\s+', ' ').replaceAll('\\.\\.+', '.').trim()
    })

// Find mismatches
def missingInActual = cleanedExpectedMessages - cleanedActualMessages

def unexpectedInActual = cleanedActualMessages - cleanedExpectedMessages

if (!(missingInActual.isEmpty()) || !(unexpectedInActual.isEmpty())) {
    println('❌ Validation mismatch detected!')

    if (!(missingInActual.isEmpty())) {
        println('\n❗ Missing in actual:\n' + missingInActual.join('\n'))
    }
    
    if (!(unexpectedInActual.isEmpty())) {
        println('\n⚠️ Unexpected in actual:\n' + unexpectedInActual.join('\n'))
    }
    
    assert false : 'Validation messages do not match.'
} else {
    println('✅ All validation messages match as expected.')
}

WebUI.refresh()

WebUI.delay(10)

// Define the TestObject
TestObject schemeTypeHeader = new TestObject()

schemeTypeHeader.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//form//div/h5[1][contains(text(), \'Type of scheme(s)\')]')

// Find the WebElement
WebElement headerElement = WebUI.findWebElement(schemeTypeHeader, 2)

// Optional: Print text to verify
println('Found heading: ' + headerElement.getText())

int index = 1

while (true) {
    String baseXpath = ('//*[@id=\'main-content-wrapper\']//form//div[contains(@class,\'form-group mb-3\')][' + index) + 
    ']'

    TestObject option = new TestObject()

    option.addProperty('xpath', ConditionType.EQUALS, baseXpath)

    // ✅ Use findWebElements to avoid exception
    List<WebElement> elements = WebUI.findWebElements(option, 2)

    if (elements.isEmpty()) {
        println("✅ All scheme options processed. Exiting loop at index $index.")

        break
    }
    
    WebElement element = elements[0]

    String labelText = element.getText()

    println("Option $index: $labelText")

    // Find the checkbox inside this div
    TestObject checkbox = new TestObject()

    checkbox.addProperty('xpath', ConditionType.EQUALS, baseXpath + '//input[@type=\'checkbox\']')

    WebElement checkboxElement = WebUI.findWebElements(checkbox, 2).getAt(0)

    if (checkboxElement == null) {
        println("⚠️ No checkbox found for '$labelText'")
    } else {
        boolean isChecked = checkboxElement.isSelected()

        if (isChecked) {
            println("✅ Checkbox for '$labelText' is selected")
        } else {
            println("❌ Checkbox for '$labelText' is NOT selected")

            WebUI.click(checkbox)

            println("☑️ Now checked: '$labelText'")
        }
    }
    
    index++
}

// === CHECKBOX: Option Agreement Templates ===
TestObject checkboxOption = new TestObject( // Give it a name
)

checkboxOption.addProperty('xpath', ConditionType.CONTAINS, '//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'[option_agreement_templates]\')]')

WebUI.click(checkboxOption)

//WebUI.verifyElementChecked(checkboxOption, 2)
// === RADIO: Customer knows number of options (Yes) ===
TestObject radioButtonYes = new TestObject()

radioButtonYes.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'radio\' and @value=\'Yes\' and contains(@name, \'does_customer_know_number_of_options_or_shares_to_grant\')]')

WebUI.click(radioButtonYes)

//WebUI.verifyElementChecked(radioButtonYes, 2)
verifyHeading('Number / Percentage')

TestObject numberPercentageInput = new TestObject()

numberPercentageInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name, \'number_of_options_or_shares_to_grant\')]')

WebUI.setText(numberPercentageInput, '1000')

// === Exercisable Section ===
verifyHeading('Exercisable')

['Yes', 'exit_only', 'both'].each({ 
        selectRadioOption('exercisable', it)
    })

// === Valuation Section ===
verifyHeading('Valuation')

['not_required', 'yes_by_us', 'already_have_own_valuation', 'obtaining_own_valuation'].each({ 
        selectRadioOption('valuation', 'yes_by_us')
    })

verifyHeading('Type')

['simple', 'complex'].each({ 
        selectRadioOption('type', 'simple')
    })

// === Share/Option Pool ===
verifyHeading('Share/option pool')

['over_new_shares', 'over_existing_shareholder_shares', 'over_treasury_shares'].each({ 
        selectRadioOption('share_or_option_pool', it)
    })

// === Share/Option Pool Authorisation ===
verifyHeading('Share/option pool authorisation')

['not_required', 'yes_by_us', 'already_have_own_authorisation', 'obtaining_own_authorisation'].each({ 
        selectRadioOption('share_or_option_pool_authorisation', it)
    })

// === Subdivision ===
verifyHeading('Subdivision')

//TestObject subdivisionLabel = new TestObject()
//
//subdivisionLabel.addProperty('xpath', ConditionType.EQUALS, '//label[contains(., \'Subdivision needed\')]')
//
//WebUI.verifyElementPresent(subdivisionLabel, 5)
//
//println('✅ Label \'Subdivision needed\' is present.')

TestObject subdivisionCheckbox = new TestObject()

subdivisionCheckbox.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'checkbox\' and contains(@name, \'subdivision\') and @value=\'1\']')

WebUI.verifyElementPresent(subdivisionCheckbox, 5)

println('✅ Checkbox for \'Subdivision needed\' is present.')

WebUI.click(subdivisionCheckbox)

verifyHeading('New total shares')

TestObject newTotalSahres = new TestObject()

newTotalSahres.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name, \'new_total_shares\')]')

WebUI.setText(newTotalSahres, '1000')

// === New Share Class for EMI/UO ===
verifyHeading('New share class for EMI/CSOP/UO')

TestObject yesCheckbox = new TestObject()

yesCheckbox.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'checkbox\' and contains(@name, \'new_share_class\') and @value=\'1\']')

WebUI.verifyElementPresent(yesCheckbox, 5)

WebUI.click(yesCheckbox)

println('🖱️ Clicked on the \'Yes\' checkbox for New share class.')

WebUI.verifyElementChecked(yesCheckbox, 3)

println('☑️ Checkbox is selected after clicking.')

// === Growth Shares Section ===
verifyHeading('Growth Shares')

TestObject radioYes = new TestObject()

radioYes.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'radio\' and contains(@name, \'growth_share\') and @value=\'Yes\']')

WebUI.click(radioYes)

println('🖱️ Clicked on \'Yes\' for Growth Shares.')

WebUI.verifyElementChecked(radioYes, 3)

// === Adopting Vestd Articles ===
verifyHeading('Adopting Vestd Articles or adding growth share provisions?')

TestObject radioYesAdopt = new TestObject()

radioYesAdopt.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'radio\' and contains(@name, \'adopting_vestd_articles\') and @value=\'Yes\']')

WebUI.click(radioYesAdopt)

println('🖱️ Clicked on \'Adopting Vestd Articles\'')

WebUI.verifyElementChecked(radioYesAdopt, 3)

// === Save as Draft ===
TestObject submitBtn = new TestObject()

submitBtn.addProperty('xpath', ConditionType.EQUALS, '//button[@type=\'submit\']')

WebUI.click(submitBtn)

println('📥 Clicked on \'Save as draft\' button')

TestObject savedAlert = new TestObject()

savedAlert.addProperty('xpath', ConditionType.EQUALS, '//div[@data-test-id=\'alert-content\']')

WebUI.verifyElementPresent(savedAlert, 5)

println('✅ Draft save alert is present.')

// === Click on the second tab (Existing scheme) ===
List<WebElement> navTabsSecond = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//form/div[1]/ul/li'), 
    10)

(navTabsSecond[1]).click()

println("🖱️ Clicked on second tab: '$navTabsSecond[1].getText()'")

WebUI.delay(2)

// === Verify second tab header ===
TestObject secondTabHeader = new TestObject()

secondTabHeader.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space()=\'Existing scheme\']')

WebUI.waitForElementVisible(secondTabHeader, 5)

println('✅ Second tab content is now visible.')

// === Existing scheme upload? checkbox ===
TestObject schemeUploadLabel = new TestObject()

schemeUploadLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Existing scheme upload?\']')

WebUI.verifyElementPresent(schemeUploadLabel, 0)

//println "✅ Title is present: '${navTabs[1].getText()}'"
TestObject schemeCheckbox = new TestObject()

schemeCheckbox.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//div/label/input[@type=\'checkbox\' and contains(@name,\'existing_scheme_upload\')]')

WebUI.click(schemeCheckbox)

TestObject schemeCheckboxNotesField = new TestObject()

schemeCheckboxNotesField.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,\'[existing_scheme_upload][notes]\')]')

WebUI.waitForElementPresent(schemeCheckboxNotesField, 3)

WebUI.setText(schemeCheckboxNotesField, 'adding notes')

// === Number and type of agreements ===
TestObject agreementLabel = new TestObject()

agreementLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Number and type of agreements\']')

WebUI.verifyElementPresent(agreementLabel, 0)

String agreementText = WebUI.getText(agreementLabel)

assertEquals('Mismatch in agreement title', 'Number and type of agreements', agreementText)

TestObject agreementInput = new TestObject()

agreementInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'do_they_have_their_own_agreements\')]')

WebUI.setText(agreementInput, 'one')

// === Number of rounds ===
TestObject roundsLabel = new TestObject()

roundsLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Number of rounds\']')

WebUI.verifyElementPresent(roundsLabel, 0)

String roundsText = WebUI.getText(roundsLabel)

assertEquals('Number of Rounds title', 'Number of rounds', roundsText)

TestObject roundsInput = new TestObject()

roundsInput.addProperty('xpath', ConditionType.EQUALS, '(//input[@type=\'text\' and contains(@data-test-id,\'form-number-input\')])[2]')

WebUI.setText(roundsInput, '1')

// === Vesting structure ===
TestObject vestingLabel = new TestObject()

vestingLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Vesting structure\']')

WebUI.verifyElementPresent(vestingLabel, 2)

assertEquals('Vesting structure title', 'Vesting structure', WebUI.getText(vestingLabel))

TestObject vestingInput = new TestObject()

vestingInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'vesting_structure\')]')

WebUI.setText(vestingInput, 'test')

// === Migration process ===
TestObject migrationLabel = new TestObject()

migrationLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Migration process\']')

WebUI.verifyElementPresent(migrationLabel, 2)

assertEquals('Migration process title', 'Migration process', WebUI.getText(migrationLabel))

TestObject migrationInput = new TestObject()

migrationInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'migration_process\')]')

WebUI.setText(migrationInput, 'testing...')

WebUI.click(submitBtn)

// === Navigate to third tab ===
List<WebElement> navTabsNew = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//form/div[1]/ul/li'), 
    10)

(navTabsNew[2]).click()

// === Cap table ===
TestObject captableHeader = new TestObject()

captableHeader.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//form//div/h5[1][contains(text(), \'Cap table\')]')

WebUI.verifyElementPresent(captableHeader, 2)

TestObject captableLabel = new TestObject()

captableLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Is their cap table accurate?\']')

WebUI.verifyElementPresent(captableLabel, 2)

assertEquals('Cap table accuracy title', 'Is their cap table accurate?', WebUI.getText(captableLabel))

TestObject capNo = new TestObject()

capNo.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'[cap_table][is_correct]\') and @value=\'No\']')

WebUI.waitForElementClickable(capNo, 10)

WebUI.click(capNo)

WebUI.verifyElementChecked(capNo, 3)

verifyHeading('Cap table issues')

TestObject captableIssuesNotes = new TestObject()

captableIssuesNotes.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,\'[cap_table][reason_for_incorrect_cap_table]\')]')

WebUI.waitForElementPresent(captableIssuesNotes, 3)

WebUI.setText(captableIssuesNotes, 'cap table issues reason')

// === Visible to shareholders? ===
TestObject visibleToSH = new TestObject()

visibleToSH.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Do they want their cap table visible to shareholders?\']')

WebUI.verifyElementPresent(visibleToSH, 2)

assertEquals('Shareholder visibility title', 'Do they want their cap table visible to shareholders?', WebUI.getText(visibleToSH))

TestObject visibleYes = new TestObject()

visibleYes.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'[visible_to_shareholder]\') and @value=\'Yes\']')

WebUI.click(visibleYes)

WebUI.verifyElementChecked(visibleYes, 3)

// === Update names ===
TestObject updateNamesLabel = new TestObject()

updateNamesLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Do we need to update any PSC/Director/Shareholder/Editor names?\']')

WebUI.verifyElementPresent(updateNamesLabel, 2)

assertEquals('Update names title', 'Do we need to update any PSC/Director/Shareholder/Editor names?', WebUI.getText(updateNamesLabel))

TestObject updateNamesYes = new TestObject()

updateNamesYes.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'do_record_names_match\') and @value=\'Yes\']')

WebUI.click(updateNamesYes)

WebUI.verifyElementChecked(updateNamesYes, 3)

verifyHeading('Enter the correct names of those who need changing.')

TestObject updateNameReason = new TestObject()

updateNameReason.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,\'[cap_table][reason_for_not_matching_names]\')]')

WebUI.waitForElementPresent(updateNameReason, 3)

WebUI.setText(updateNameReason, 'update name reason')

// === Co-Sec functionality ===
TestObject coSecLabel = new TestObject()

coSecLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Do they plan to use the platform’s Co-Sec functionality?\']')

WebUI.verifyElementPresent(coSecLabel, 2)

assertEquals('Co-Sec functionality title', 'Do they plan to use the platform’s Co-Sec functionality?', WebUI.getText(coSecLabel))

TestObject coSecNo = new TestObject()

coSecNo.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'co_sec_functionality\') and @value=\'No\']')

WebUI.click(coSecNo)

WebUI.verifyElementChecked(coSecNo, 3)

//verifyHeading("Reason")
TestObject cosecNoReason = new TestObject()

cosecNoReason.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,\'[cap_table][reason_for_not_using_co_sec_functionality]\')]')

WebUI.waitForElementPresent(cosecNoReason, 3)

WebUI.setText(cosecNoReason, 'cosec no reason')

// === Shareholder management ===
TestObject shMgmtLabel = new TestObject()

shMgmtLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Do they want to disable shareholder management?\']')

WebUI.verifyElementPresent(shMgmtLabel, 2)

assertEquals('Shareholder management title', 'Do they want to disable shareholder management?', WebUI.getText(shMgmtLabel))

TestObject shMgmtYes = new TestObject()

shMgmtYes.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'disable_shareholder_management\') and @value=\'Yes\']')

WebUI.click(shMgmtYes)

WebUI.verifyElementChecked(shMgmtYes, 3)

TestObject shMgtReason = new TestObject()

shMgtReason.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,\'[cap_table][reason_for_disabling_shareholder_management]\')]')

WebUI.waitForElementPresent(shMgtReason, 3)

WebUI.setText(shMgtReason, 'disable share management reason')

// === Future changes ===
TestObject futureChangesLabel = new TestObject()

futureChangesLabel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Are they planning on changing anything or expect any share movements in the next 6 months?\']')

WebUI.verifyElementPresent(futureChangesLabel, 2)

assertEquals('Future change title', 'Are they planning on changing anything or expect any share movements in the next 6 months?', 
    WebUI.getText(futureChangesLabel))

TestObject futureChangeYes = new TestObject()

futureChangeYes.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'any_planned_changes_in_next_6_months\') and @value=\'Yes\']')

WebUI.click(futureChangeYes)

WebUI.verifyElementChecked(futureChangeYes, 3)

verifyHeading('Ordinary share issuance')

TestObject checkboxOrdinary = new TestObject()

checkboxOrdinary.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'[ordinary_share_issuance]\')]')

//clickIfNotChecked(checkboxOrdinary, "Checkbox for 'ordinary_share_issuance'")
WebUI.click(checkboxOrdinary)

WebUI.verifyElementChecked(checkboxOrdinary, 3)

verifyHeading('Stock transfers')

TestObject checkboxStockTransfer = new TestObject()

checkboxStockTransfer.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'[stock_transfers]\')]')

WebUI.click(checkboxStockTransfer)

WebUI.verifyElementChecked(checkboxStockTransfer, 3)

//clickIfNotChecked(checkboxStockTransfer, "Checkbox for 'stock_transfers'")
verifyHeading('Share class conversions')

TestObject checkboxShareclass = new TestObject()

checkboxShareclass.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'share_class_conversions]\')]')

//clickIfNotChecked(checkboxShareclass, "Checkbox for 'share_class_conversions'")
WebUI.click(checkboxShareclass)

WebUI.verifyElementChecked(checkboxShareclass, 3)

verifyHeading('Buy backs')

TestObject checkboxBuyback = new TestObject()

checkboxBuyback.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'buy_backs]\')]')

WebUI.click(checkboxBuyback)

WebUI.verifyElementChecked(checkboxBuyback, 3)

//clickIfNotChecked(checkboxBuyback, "Checkbox for 'buy_backs'")
// === Final save ===
WebUI.click(submitBtn)

println('✅ Clicked on Save as Draft button')

WebUI.verifyElementPresent(savedAlert, 5)

List<WebElement> navTabsAfterRefresh = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, 
        '//*[@id=\'main-content-wrapper\']//form/div[1]/ul/li'), 10)

// ✅ Click the second tab (index 1 since it's zero-based)
(navTabsAfterRefresh[3]).click()

println("🖱️ Clicked on second tab: '$navTabsAfterRefresh[3].getText()'")

// Optionally wait for content to load
WebUI.delay(5)

TestObject fourthTabHeader = new TestObject()

fourthTabHeader.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space()=\'Articles & governance\']')

WebUI.waitForElementVisible(fourthTabHeader, 5)

println('✅ fourth tab content is now visible.')

TestObject articleHeader = new TestObject()

articleHeader.addProperty('xpath', ConditionType.EQUALS, '//*[@id=\'main-content-wrapper\']//form//div/h5[1][contains(text(), \'Articles & governance\')]')

WebUI.verifyElementPresent(articleHeader, 2)

String articleTitle = WebUI.getText(articleHeader)

println(articleTitle)

TestObject articleOfAssociation = new TestObject()

articleOfAssociation.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'What are their current Articles of Association?\']')

WebUI.verifyElementPresent(articleOfAssociation, 2)

String article = WebUI.getText(articleOfAssociation)

assertEquals('What are their current Articles of Association? title', 'What are their current Articles of Association?', 
    article)

//TestObject unknownArc = new TestObject()
//unknownArc.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'articles_and_governance') and @value='unknown']")
//
TestObject model = new TestObject()

model.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'articles_and_governance\') and @value=\'model_articles\']')

//TestObject bespoke = new TestObject()
//bespoke.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'articles_and_governance') and @value='bespoke_articles']")
WebUI.waitForElementClickable(model, 5)

WebUI.click(model)

println('🖱️ Clicked on \'model article\' radio button')

TestObject changeArticleOfAssociation = new TestObject()

changeArticleOfAssociation.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Are they changing their Articles of Association?\']')

WebUI.verifyElementPresent(changeArticleOfAssociation, 2)

String articleChange = WebUI.getText(changeArticleOfAssociation)

assertEquals('Are they changing their Articles of Association? title', 'Are they changing their Articles of Association?', 
    articleChange)

TestObject keepArticles = new TestObject()

keepArticles.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'articles_and_governance\') and @value=\'keep_current_articles\']')

//TestObject adoptVestdArticles = new TestObject()
//adoptVestdArticles.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'articles_and_governance') and @value='adopt_vestd_articles']")
//
//TestObject adoptGsClause = new TestObject()
//adoptGsClause.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'articles_and_governance') and @value='adopt_growth_share_clause']")
WebUI.waitForElementClickable(keepArticles, 5)

WebUI.click(keepArticles)

println('🖱️ Clicked on \'keep_current_articles\' radio button')

WebUI.verifyElementChecked(keepArticles, 3)

println('✅ \'keep_current_articles\' radio button is selected')

verifyHeading('If exercisable, do they need to add drag and tag?')

['Yes', 'no_existing_articles'].each({ 
        selectRadioOption('exercisable_drag_and_tag', 'Yes')
    })

verifyHeading('Good/Bad Leaver provisions')

['Yes', 'no_existing_articles'].each({ 
        selectRadioOption('leaver_provisions', 'Yes')
    })

TestObject shareholderAgreement = new TestObject()

shareholderAgreement.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Do they have a Shareholders’ Agreement in place?\']')

WebUI.verifyElementPresent(shareholderAgreement, 2)

String shAgreement = WebUI.getText(shareholderAgreement)

assertEquals('Do they have a Shareholders’ Agreement in place? title', 'Do they have a Shareholders’ Agreement in place?', 
    shAgreement)

TestObject existingShareholderAgreement = new TestObject()

existingShareholderAgreement.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'checkbox\' and contains(@name,\'existing_shareholder_agreements\') and @value=\'Yes\']')

WebUI.click(existingShareholderAgreement)

println('🖱️ Clicked on \'Existing shareholder agreement\' checkbox')

TestObject notesText = new TestObject()

notesText.addProperty('xpath', ConditionType.EQUALS, '(//div[contains(@class,\'form-group--optional\')]//label[normalize-space()=\'Notes\'])[6]')

WebUI.verifyElementPresent(notesText, 0)

TestObject inputNotes = new TestObject()

inputNotes.addProperty('xpath', ConditionType.EQUALS, '//textarea[@class=\'form-control\' and contains(@name,\'[articles_and_governance][notes]\')]')

WebUI.verifyElementPresent(inputNotes, 2, FailureHandling.CONTINUE_ON_FAILURE)

TestObject existingAuthorisationStatusTitle = new TestObject()

existingAuthorisationStatusTitle.addProperty('xpath', ConditionType.EQUALS, '//h5[contains(text(), \'Existing authorisation status\')]')

WebUI.verifyElementPresent(existingAuthorisationStatusTitle, 1, FailureHandling.CONTINUE_ON_FAILURE)

TestObject optionsAvailableToGrant = new TestObject()

optionsAvailableToGrant.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'options_available\')]')

WebUI.verifyElementPresent(optionsAvailableToGrant, 0, FailureHandling.CONTINUE_ON_FAILURE)

TestObject sharesToIssues = new TestObject()

sharesToIssues.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'shares_available\')]')

WebUI.verifyElementPresent(sharesToIssues, 0, FailureHandling.CONTINUE_ON_FAILURE)

TestObject convertibleNotes = new TestObject()

convertibleNotes.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'warrants_or_convertible_loan_notes\')]')

WebUI.verifyElementPresent(convertibleNotes, 0, FailureHandling.CONTINUE_ON_FAILURE)

TestObject corporateGovernance = new TestObject()

corporateGovernance.addProperty('xpath', ConditionType.EQUALS, '//h5[contains(text(), \'Corporate governance\')]')

WebUI.verifyElementPresent(corporateGovernance, 1, FailureHandling.CONTINUE_ON_FAILURE)

TestObject signShareholder = new TestObject()

signShareholder.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Any must-sign shareholders?\']')

WebUI.verifyElementPresent(signShareholder, 2)

String mustSignShareholder = WebUI.getText(signShareholder)

assertEquals('Any must-sign shareholders? title', 'Any must-sign shareholders?', mustSignShareholder)

TestObject yesSign = new TestObject()

yesSign.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'must_sign_shareholders\') and @value=\'Yes\']')

//TestObject noSign = new TestObject()
//noSign.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'must_sign_shareholders') and @value='No']")
//
//TestObject unknownSign = new TestObject()
//unknownSign.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'must_sign_shareholders') and @value='Unknown']")
WebUI.waitForElementClickable(yesSign, 5)

WebUI.click(yesSign)

println('🖱️ Clicked on \'Yes\' radio button')

WebUI.verifyElementChecked(yesSign, 3)

println('✅ \'Yes\' radio button is selected')

verifyHeading('Names and email addresses')

TestObject yesSignTextBox = new TestObject()

yesSignTextBox.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,\'[must_sign_shareholders][names_and_emails]\')]')

WebUI.setText(yesSignTextBox, 'test name and test@gmail.com')

TestObject consentMatters = new TestObject()

consentMatters.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Any majority consent matters?\']')

WebUI.verifyElementPresent(consentMatters, 2)

String consent = WebUI.getText(consentMatters)

assertEquals('Any majority consent matters? title', 'Any majority consent matters?', consent)

TestObject yesConsent = new TestObject()

yesConsent.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'majority_consent_matters\') and @value=\'Yes\']')

//TestObject noConsent = new TestObject()
//noConsent.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'majority_consent_matters') and @value='No']")
//
//TestObject unknownConsent = new TestObject()
//unknownConsent.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'majority_consent_matters') and @value='Unknown']")
WebUI.waitForElementClickable(yesConsent, 5)

WebUI.click(yesConsent)

println('🖱️ Clicked on \'Yes\' radio button')

WebUI.verifyElementChecked(yesConsent, 3)

println('✅ \'Yes\' radio button is selected')

verifyHeading('Details')

TestObject majorityConsentTextbox = new TestObject()

majorityConsentTextbox.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,\'reason_for_majority_consent_matters\')]')

WebUI.setText(majorityConsentTextbox, 'reason for consent')

TestObject equityIssues = new TestObject()

equityIssues.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'More than 75% approval for equity related issues?\']')

WebUI.verifyElementPresent(equityIssues, 2)

String equity = WebUI.getText(equityIssues)

assertEquals('More than 75% approval for equity related issues? title', 'More than 75% approval for equity related issues?', 
    equity)

TestObject yesEquityIssues = new TestObject()

yesEquityIssues.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'radio\' and contains(@name,\'more_than_75_percent_approval\') and @value=\'Yes\']')

//TestObject noEquityIssues = new TestObject()
//noEquityIssues.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'more_than_75_percent_approval') and @value='No']")
//
//TestObject unknownEquityIssues = new TestObject()
//unknownEquityIssues.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='radio' and contains(@name,'more_than_75_percent_approval') and @value='Unknown']")
//
WebUI.waitForElementClickable(yesEquityIssues, 5)

WebUI.click(yesEquityIssues)

println('🖱️ Clicked on \'Yes\' radio button')

//WebUI.verifyElementChecked(noEquityIssues, 3)
//println "✅ 'Yes' radio button is selected"
verifyHeading('Pass percentage')

TestObject passPercentTextbox = new TestObject()

passPercentTextbox.addProperty('xpath', ConditionType.EQUALS, '//label[text()=\'Pass percentage\']/following-sibling::div/input[@type=\'text\']')

WebUI.setText(passPercentTextbox, '50')

WebUI.click(submitBtn)

WebUI.verifyElementPresent(savedAlert, 5)

// Submit the form
WebUI.click(submitBtn)

println('✅ Clicked on Save as draft button')

// Verify success alert
WebUI.verifyElementPresent(savedAlert, 5)

// ✅ Click the second tab (index 1 since it's zero-based)
List<WebElement> navTabsAfterReload = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, 
        '//*[@id=\'main-content-wrapper\']//form/div[1]/ul/li'), 10)

(navTabsAfterReload[4]).click()

println("🖱️ Clicked on second tab: '$navTabsAfterReload[4].getText()'")

// Optionally wait for content to load
WebUI.delay(5)

TestObject fifthTabHeader = new TestObject()

fifthTabHeader.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space()=\'Articles & governance\']')

WebUI.waitForElementVisible(fifthTabHeader, 5)

println('✅ fifth tab content is now visible.')

TestObject historicalCaptable = new TestObject()

historicalCaptable.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Historical cap table?\']')

WebUI.verifyElementPresent(historicalCaptable, 2)

String historical = WebUI.getText(historicalCaptable)

assertEquals('Historical cap table? title', 'Historical cap table?', historical)

TestObject yesHistoricalCaptable = new TestObject()

yesHistoricalCaptable.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'checkbox\' and contains(@name,\'historical_cap_table\') and @value=\'1\']')

WebUI.waitForElementClickable(yesHistoricalCaptable, 3)

WebUI.click(yesHistoricalCaptable)

WebUI.verifyElementPresent(yesHistoricalCaptable, 3)

TestObject additionalCharges = new TestObject()

additionalCharges.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Additional charges\']')

WebUI.verifyElementPresent(additionalCharges, 2)

String charges = WebUI.getText(additionalCharges)

assertEquals('Additional charges title', 'Additional charges', charges)

TestObject yesAdditionalCharges = new TestObject()

yesAdditionalCharges.addProperty('xpath', ConditionType.EQUALS, '//label/input[@type=\'checkbox\' and contains(@name,\'billing\') and @value=\'1\']')

WebUI.waitForElementClickable(yesAdditionalCharges, 3)

WebUI.click(yesAdditionalCharges)

WebUI.verifyElementPresent(yesAdditionalCharges, 3)

verifyHeading('For example ESU, HCT, etc. Who’s taking payment?')

TestObject takingPayment = new TestObject()

takingPayment.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,\'[billing][notes]\')]')

WebUI.setText(takingPayment, 'ESU')

verifyHeading('Has payment been received?')

['Yes', 'No'].each({ 
        selectRadioOption('payment_received', 'Yes')
    })

//TestObject yesHistoricalCaptableText = new TestObject()
//yesHistoricalCaptableText.addProperty("xpath", ConditionType.EQUALS,
//	"//label/input[@type='checkbox' and contains(@name,'historical_cap_table') and @value='1']")
TestObject seisEis = new TestObject()

seisEis.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Discussed and interested in SEIS/EIS?\']')

WebUI.verifyElementPresent(seisEis, 3)

String seisEisText = WebUI.getText(seisEis)

assertEquals('Discussed and interested in SEIS/EIS? title', 'Discussed and interested in SEIS/EIS?', seisEisText)

TestObject seisEisInput = new TestObject()

seisEisInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'interested_in_seis_eis\')]')

WebUI.verifyElementPresent(seisEisInput, 2)

TestObject subscriptionType = new TestObject()

subscriptionType.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Reason for subscription type\']')

WebUI.verifyElementPresent(subscriptionType, 3)

String subscription = WebUI.getText(subscriptionType)

assertEquals('Reason for subscription type title', 'Reason for subscription type', subscription)

TestObject inputSubscriptionType = new TestObject()

inputSubscriptionType.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'subscription_type_reason\')]')

WebUI.verifyElementPresent(inputSubscriptionType, 2)

TestObject renewalText = new TestObject()

renewalText.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Discussed Tickover for renewal?\']')

WebUI.verifyElementPresent(renewalText, 3)

String renewal = WebUI.getText(renewalText)

assertEquals('Discussed Tickover for renewal? title', 'Discussed Tickover for renewal?', renewal)

TestObject inputRenewal = new TestObject()

inputRenewal.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'discussed_tickover\')]')

WebUI.verifyElementPresent(inputRenewal, 2)

WebUI.click(submitBtn)

WebUI.verifyElementPresent(savedAlert, 5)

// Reopen the sixth tab to verify saved data
List<WebElement> navTabsAfterReloading = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, 
        '//*[@id=\'main-content-wrapper\']//form/div[1]/ul/li'), 10)

// ✅ Click the sixth tab (index 5, zero-based)
(navTabsAfterReloading[5]).click()

println("🖱️ Clicked on sixth tab: '$navTabsAfterReloading[5].getText()'")

WebUI.delay(5)

TestObject sixthTabHeader = new TestObject()

sixthTabHeader.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space()=\'Contact details\']')

WebUI.waitForElementVisible(sixthTabHeader, 5)

println('✅ Sixth tab content is now visible.')

// ✅ Contact name
TestObject contactName = new TestObject()

contactName.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Contact name\']')

WebUI.verifyElementPresent(contactName, 3)

assertEquals('Contact name title', 'Contact name', WebUI.getText(contactName))

TestObject selectedContact = new TestObject()

selectedContact.addProperty('xpath', ConditionType.EQUALS, '//span[contains(@class,\'multiselect-tag-wrapper\')]')

WebUI.verifyElementPresent(selectedContact, 3)

// ✅ Job title
TestObject jobTitle = new TestObject()

jobTitle.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Job title\']')

WebUI.verifyElementPresent(jobTitle, 3)

assertEquals('Job title', 'Job title', WebUI.getText(jobTitle))

TestObject inputJobTitle = new TestObject()

inputJobTitle.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'text\' and contains(@name,\'job_title\')]')

WebUI.verifyElementPresent(inputJobTitle, 2)

// ✅ Checkbox validations
['key_partner', 'other_companies_with_vestd', 'third_party_editor', 'complex_customer'].each({ def field ->
        TestObject checkboxValues = new TestObject()

        checkboxValues.addProperty('xpath', ConditionType.EQUALS, "//label/input[@type='checkbox' and contains(@name,'$field')]")

        WebUI.verifyElementPresent(checkboxValues, 2)
    })

// ✅ Customer personality
TestObject customerPersonality = new TestObject()

customerPersonality.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()=\'Customer personality\']')

WebUI.verifyElementPresent(customerPersonality, 3)

assertEquals('Customer personality title', 'Customer personality', WebUI.getText(customerPersonality))

List<WebElement> options = driver.findElements(By.xpath("(//label[text()='Customer personality']/following-sibling::div[@class='radio-controls']/div/label)"))

println("🔍 Total personality options found: ${options.size()}")

options.eachWithIndex({ def el, def idx ->
        println("Option ${idx + 1}: ${el.getText()}")
    })

TestObject standardOption = new TestObject()

standardOption.addProperty('xpath', ConditionType.EQUALS, "//input[@type='radio' and @value='Standard']")

WebUI.click(standardOption)

WebUI.verifyElementChecked(standardOption, 2)

verifyHeading('Need a call with Onboarding about this customer?')

['Yes', 'No'].each({ 
        selectRadioOption('call_with_onboarding_contact_required_before_contacting_customer', 'Yes')
    })

// ✅ Knowledge level
TestObject knowledgeLevel = new TestObject()

knowledgeLevel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()="Knowledge level"]')

WebUI.verifyElementPresent(knowledgeLevel, 3)

assertEquals('Knowledge level title', 'Knowledge level', WebUI.getText(knowledgeLevel))

TestObject knowledgeLevelDropdown = new TestObject()

knowledgeLevelDropdown.addProperty('xpath', ConditionType.EQUALS, '(//input[@type="text" and @class="multiselect-search"])[1]')

//WebUI.waitForElementClickable(knowledgeLevelDropdown, 5)
WebUI.setText(knowledgeLevelDropdown, "2")

WebUI.sendKeys(knowledgeLevelDropdown, Keys.chord(Keys.ENTER))
//WebUI.click(knowledgeLevelDropdown)

//TestObject optionTwo = new TestObject()
//
//optionTwo.addProperty('xpath', ConditionType.EQUALS, '(//li[@class="multiselect-option" and @aria-label="2"])[1]')
//
//WebUI.scrollToElement(optionTwo, 5)
//
//WebUI.waitForElementClickable(optionTwo, 5)
//
//WebUI.click(optionTwo)

TestObject optionTwoVerified = new TestObject()

optionTwoVerified.addProperty('xpath', ConditionType.EQUALS, '//span[@class="multiselect-single-label-text"]')

assert WebUI.getText(optionTwoVerified).contains('2')

println('✅ Knowledge level value 2 is selected')

// ✅ AML risk score
TestObject amlLevel = new TestObject()

amlLevel.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()="AML risk score (1-4)"]')

WebUI.verifyElementPresent(amlLevel, 3)

assertEquals('AML risk score (1-4) title', 'AML risk score (1-4)', WebUI.getText(amlLevel))

TestObject amlLevelDropdown = new TestObject()

amlLevelDropdown.addProperty('xpath', ConditionType.EQUALS, '(//input[@type="text" and @class="multiselect-search"])[2]')

WebUI.waitForElementClickable(amlLevelDropdown, 5)

WebUI.click(amlLevelDropdown)

TestObject amlOptionTwo = new TestObject()

amlOptionTwo.addProperty('xpath', ConditionType.EQUALS, '(//li[contains(@class,"multiselect-option") and @aria-label="2"])[2]')

WebUI.scrollToElement(amlOptionTwo, 5)

WebUI.waitForElementClickable(amlOptionTwo, 5)

WebUI.click(amlOptionTwo)

String isSelected = WebUI.getAttribute(amlOptionTwo, 'aria-selected')

println(isSelected == 'true' ? '✅ AML Risk value 2 is selected' : '❌ AML Risk value 2 is NOT selected')

// ✅ AML Document
TestObject amlDocument = new TestObject()

amlDocument.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space()="AML document"]')

println(WebUI.getText(amlDocument) + 'is present')

// ✅ Method of communication
TestObject methodCommunication = new TestObject()

methodCommunication.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()="Preferred method of communication or notes about the preferred method"]')

assertEquals('Preferred method of communication or notes about the preferred method title', 'Preferred method of communication or notes about the preferred method', 
    WebUI.getText(methodCommunication))

TestObject methodCommunicationInput = new TestObject()

methodCommunicationInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type="text" and contains(@name,"communication_method") ]')

WebUI.setText(methodCommunicationInput, 'mail')

// ✅ Add more users
TestObject addUsers = new TestObject()

addUsers.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()="Do they want to add any more Editors (Admin users), or read only Directors/Shareholders?"]')

assertEquals('Do they want to add any more Editors (Admin users), or read only Directors/Shareholders? title', 'Do they want to add any more Editors (Admin users), or read only Directors/Shareholders?', 
    WebUI.getText(addUsers))

TestObject addUsersInput = new TestObject()

addUsersInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type="text" and contains(@name,"add_more_editors") ]')

WebUI.verifyElementPresent(addUsersInput, 2)

// ✅ Co-Sec managed
TestObject cosecManaged = new TestObject()

cosecManaged.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()="How is their Co-Sec currently managed?"]')

assertEquals('How is their Co-Sec currently managed? title', 'How is their Co-Sec currently managed?', WebUI.getText(cosecManaged))

TestObject cosecManagedInput = new TestObject()

cosecManagedInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type="text" and contains(@name,"co_sec_currently_managed") ]')

WebUI.verifyElementPresent(cosecManagedInput, 2)

// ✅ G-Drive
TestObject driveLink = new TestObject()

driveLink.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()="G-Drive link"]')

assertEquals('G-Drive link title', 'G-Drive link', WebUI.getText(driveLink))

TestObject driveLinkInput = new TestObject()

driveLinkInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type="text" and contains(@name,"g_drive") ]')

WebUI.verifyElementPresent(driveLinkInput, 2)

WebUI.setText(driveLinkInput, 'drive')

// ✅ Additional comments
TestObject additionalComments = new TestObject()

additionalComments.addProperty('xpath', ConditionType.EQUALS, '//*[@id="main-content-wrapper"]//h5[normalize-space()="Additional comments"]')

WebUI.verifyElementPresent(additionalComments, 2)

TestObject comments = new TestObject()

comments.addProperty('xpath', ConditionType.EQUALS, '//label[normalize-space()="Comments"]')

assertEquals('Comments title', 'Comments', WebUI.getText(comments))

TestObject commentsInput = new TestObject()

commentsInput.addProperty('xpath', ConditionType.EQUALS, '//textarea[contains(@name,"additional_comments") ]')

WebUI.verifyElementPresent(commentsInput, 2)

// Final submission
WebUI.click(submitBtn)

println('✅ Final submission done')

WebUI.verifyElementPresent(savedAlert, 5)

//List<WebElement> lastTab = WebUI.findWebElements(
//	new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[@id='main-content-wrapper']//form/div[1]/ul/li"),
//	10
//)
//
//lastTab[5].click()
//println "🖱️ Clicked on last tab: '${lastTab[5].getText()}'"
//
//TestObject handoverCta2 = new TestObject()
//handoverCta2.addProperty("xpath", ConditionType.EQUALS,
//	"(//button[@type='submit'])[2]")
//WebUI.click(handoverCta2)
//println "📥 Clicked on 'handover' button"
//user should navigate to the tabs to verify if data is being saved
Map<Integer, Map> tabValidationMap = [(0) : [ // Tab 1: New scheme
        ('checkboxes') : ['//input[@type=\'checkbox\' and contains(@name,\'[share_schemes][emi]\')]', '//input[@type=\'checkbox\' and contains(@name,\'[share_schemes][uo]\')]'
            , '//input[@type=\'checkbox\' and contains(@name,\'[share_schemes][gs]\')]', '//input[@type=\'checkbox\' and contains(@name,\'[share_schemes][ap]\')]'
            , '//input[@type=\'checkbox\' and contains(@name, \'[option_agreement_templates]\')]', '//input[@type=\'checkbox\' and contains(@name, \'[subdivision]\')]'
            , '//input[@type=\'checkbox\' and contains(@name, \'[new_share_class]\')]'], ('fields') : [[('xpath') : '//input[@type=\'text\' and contains(@name, \'number_of_options_or_shares_to_grant\')]'
                , ('expected') : '1000'], [('xpath') : '//input[@type=\'text\' and contains(@name, \'[new_total_shares]\')]'
                , ('expected') : '1000']], ('radios') : [[('name') : 'does_customer_know_number_of_options_or_shares_to_grant'
                , ('value') : 'Yes'], [('name') : 'exercisable', ('value') : 'both'], [('name') : 'valuation', ('value') : 'yes_by_us']
            , [('name') : 'valuation_by_us', ('value') : 'simple'], [('name') : 'share_or_option_pool', ('value') : 'over_treasury_shares']
            , [('name') : 'share_or_option_pool_authorisation', ('value') : 'obtaining_own_authorisation'], [('name') : 'vestd_nominees_structure'
                , ('value') : 'Yes'], [('name') : 'adopting_vestd_articles', ('value') : 'Yes']]], (1) : [ // Tab 2: Existing scheme
        ('checkboxes') : ['//input[@type=\'checkbox\' and contains(@name,\'existing_scheme_upload\')]'], ('fields') : [[
                ('xpath') : '//textarea[contains(@name,\'[existing_scheme_upload][notes]\')]', ('expected') : 'adding notes']
            , [('xpath') : '//input[@type=\'text\' and contains(@name,\'do_they_have_their_own_agreements\')]', ('expected') : 'one']
            , [('xpath') : '(//input[@type=\'text\' and contains(@data-test-id,\'form-number-input\')])[2]', ('expected') : '1']
            , [('xpath') : '//input[@type=\'text\' and contains(@name,\'vesting_structure\')]', ('expected') : 'test'], [
                ('xpath') : '//input[@type=\'text\' and contains(@name,\'migration_process\')]', ('expected') : 'testing...']]]
    , (2) : [ // Tab 3: Cap table
        ('radios') : [[('name') : '[cap_table][is_correct]', ('value') : 'No'], [('name') : '[visible_to_shareholder]', ('value') : 'Yes']
            , [('name') : 'do_record_names_match', ('value') : 'Yes'], [('name') : 'co_sec_functionality', ('value') : 'No']
            , [('name') : 'disable_shareholder_management', ('value') : 'Yes'], [('name') : 'any_planned_changes_in_next_6_months'
                , ('value') : 'Yes']], ('fields') : [[('xpath') : '//textarea[contains(@name,\'[cap_table][reason_for_incorrect_cap_table]\')]'
                , ('expected') : 'cap table issues reason'], [('xpath') : '//textarea[contains(@name,\'[cap_table][reason_for_not_matching_names]\')]'
                , ('expected') : 'update name reason'], [('xpath') : '//textarea[contains(@name,\'[cap_table][reason_for_not_using_co_sec_functionality]\')]'
                , ('expected') : 'cosec no reason'], [('xpath') : '//textarea[contains(@name,\'[cap_table][reason_for_disabling_shareholder_management]\')]'
                , ('expected') : 'disable share management reason']], ('checkboxes') : ['//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'[ordinary_share_issuance]\')]'
            , '//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'[stock_transfers]\')]', '//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'share_class_conversions]\')]'
            , '//*[@id=\'main-content-wrapper\']//input[@type=\'checkbox\' and contains(@name, \'buy_backs]\')]']], (3) : [
        // Tab 4: Articles & governance
        ('checkboxes') : ['//input[@type=\'checkbox\' and contains(@name,\'existing_shareholder_agreements\') and @value=\'Yes\']']
        , ('radios') : [[('name') : 'articles_and_governance', ('value') : 'model_articles'], [('name') : 'articles_and_governance'
                , ('value') : 'keep_current_articles'], [('name') : 'exercisable_drag_and_tag', ('value') : 'Yes'], [('name') : 'leaver_provisions'
                , ('value') : 'Yes'], [('name') : 'must_sign_shareholders', ('value') : 'Yes'], [('name') : 'majority_consent_matters'
                , ('value') : 'Yes'], [('name') : 'more_than_75_percent_approval', ('value') : 'Yes']], ('fields') : [[('xpath') : '//textarea[contains(@name,\'[must_sign_shareholders][names_and_emails]\')]'
                , ('expected') : 'test name and test@gmail.com'], [('xpath') : '//textarea[contains(@name,\'reason_for_majority_consent_matters\')]'
                , ('expected') : 'reason for consent'], [('xpath') : '//input[contains(@name,\'pass_percentage\')]', ('expected') : '50']]]
    , (4) : [ // Tab 5: SEIS/EIS, subscriptions
        ('checkboxes') : ['//input[@type=\'checkbox\' and contains(@name,\'historical_cap_table\') and @value=\'1\']', '//input[@type=\'checkbox\' and contains(@name,\'billing\') and @value=\'1\']']
        , ('fields') : [[('xpath') : '//input[@type=\'text\' and contains(@name,\'interested_in_seis_eis\')]', ('expected') : '']
            , [('xpath') : '//input[@type=\'text\' and contains(@name,\'subscription_type_reason\')]', ('expected') : '']
            , [('xpath') : '//input[@type=\'text\' and contains(@name,\'discussed_tickover\')]', ('expected') : ''], [('xpath') : '//textarea[contains(@name,\'[billing][notes]\')]'
                , ('expected') : 'ESU']], ('radios') : [[('name') : 'payment_received', ('value') : 'Yes']]], (5) : [ // Tab 6: Contact & final details
        //    checkboxes: [
        //        "//label/input[@type='checkbox' and contains(@name,'key_partner')]",
        //        "//label/input[@type='checkbox' and contains(@name,'other_companies_with_vestd')]",
        //        "//label/input[@type='checkbox' and contains(@name,'third_party_editor')]",
        //        "//label/input[@type='checkbox' and contains(@name,'complex_customer')]"
        //    ],
        ('verifyOnly') : true // ✅ This ensures we only check presence, not selection
        , ('radios') : [[('name') : '', ('value') : 'Standard'], [('name') : 'call_with_onboarding_contact_required_before_contacting_customer'
                , ('value') : 'Yes']], ('fields') : [[('xpath') : '//input[@type=\'text\' and contains(@name,\'job_title\')]'
                , ('expected') : ''], [('xpath') : '//input[@type=\'text\' and contains(@name,\'communication_method\')]'
                , ('expected') : 'mail'], [('xpath') : '//input[@type=\'text\' and contains(@name,\'add_more_editors\')]'
                , ('expected') : ''], [('xpath') : '//input[@type=\'text\' and contains(@name,\'co_sec_currently_managed\')]'
                , ('expected') : ''], [('xpath') : '//input[@type=\'text\' and contains(@name,\'g_drive\')]', ('expected') : 'drive']
            , [('xpath') : '//textarea[contains(@name,\'additional_comments\')]', ('expected') : '']], ('dropdowns') : [
            [('xpath') : '//input[@type=\'hidden\' and contains(@name,\'knowledge_level\')]', ('expected') : '2/5'], [('xpath') : '//input[@type=\'hidden\' and contains(@name,\'aml_risk_score\')]'
                , ('expected') : '2']]]]

for (int i = 0; i <= 5; i++) {
    // Re-fetch tabs each time to avoid stale references
    List<WebElement> navigationTabs = WebUI.findWebElements(new TestObject().addProperty('xpath', ConditionType.EQUALS, 
            '//*[@id=\'main-content-wrapper\']//form/div[1]/ul/li/a'), 10)

    WebElement tab = navigationTabs[i]

    WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', Arrays.asList(tab))

    WebUI.delay(1)

    WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(tab))

    WebUI.delay(2)

    println("🔍 Validating tab ${i + 1}: '${tab.getText()}'")

    def tabData = tabValidationMap[i]

    if (!(tabData)) {
        println('ℹ️ No validation logic defined for this tab.')

        continue
    }
    
    // ✅ Check checkboxes
    tabData.checkboxes.each({ def xpath ->
            def checkboxchecked = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath)

            if (tabData.verifyOnly) {
                WebUI.verifyElementPresent(checkboxchecked, 5, FailureHandling.CONTINUE_ON_FAILURE)

                println("🔍 Checkbox present at: $xpath")
            } else {
                WebUI.verifyElementChecked(checkboxchecked, 5, FailureHandling.CONTINUE_ON_FAILURE)

                println("✅ Checkbox is selected: $xpath")
            }
        })

    // 📻 Check radios
    tabData.radios.each({ def r ->
            if (!(r.name && r.value)) {
            }
            
            def radio = new TestObject().tap({ 
                    def xpath = "//*[@type='radio' and contains(@name,'$r.name') and @value='$r.value']"

                    addProperty('xpath', ConditionType.EQUALS, xpath)
                })

            if (WebUI.waitForElementPresent(radio, 5, FailureHandling.OPTIONAL) && WebUI.waitForElementVisible(radio, 5, 
                FailureHandling.OPTIONAL)) {
                try {
                    WebUI.verifyElementChecked(radio, 5)

                    println("✅ Radio checked: $r.name = '$r.value'")
                }
                catch (Exception e) {
                    println("❌ Radio not checked: $r.name = '$r.value'")
                } 
            } else {
                println("❌ Radio not found: $r.name = '$r.value'")
            }
        })

    // ✏️ Check field values
    tabData.fields.each({ def item ->
            def field = new TestObject().addProperty('xpath', ConditionType.EQUALS, item.xpath)

            def actualValue = WebUI.getAttribute(field, 'value')

            WebUI.verifyMatch(actualValue, item.expected, false, FailureHandling.CONTINUE_ON_FAILURE)

            println("✅ Verified field value for '$item.xpath': '$actualValue'")
        })

    // ✅ Validate dropdowns (if defined)
    // ✅ Validate dropdown hidden fields by value
    tabData.dropdowns.each({ def dropdown ->
            def dropdownObj = new TestObject().addProperty('xpath', ConditionType.EQUALS, dropdown.xpath)

            WebUI.verifyElementPresent(dropdownObj, 5, FailureHandling.CONTINUE_ON_FAILURE)

            String actualValue = WebUI.getAttribute(dropdownObj, 'value')

            WebUI.verifyMatch(actualValue, dropdown.expected, false, FailureHandling.CONTINUE_ON_FAILURE)

            println("✅ Dropdown '$dropdown.xpath' has expected value: '$actualValue'")
        })
}

WebUI.click(handoverCta)

println('📥 Clicked on \'handover\' button')

void selectRadioOption(String nameFragment, String value) {
    TestObject radio = new TestObject()

    radio.addProperty('xpath', ConditionType.EQUALS, "//input[@type='radio' and contains(@name, '$nameFragment') and @value='$value']")

    WebUI.waitForElementVisible(radio, 3)

    WebUI.click(radio)

    println("☑️ Selected '$value' for '$nameFragment'")

    WebUI.verifyElementChecked(radio, 3)

    WebUI.delay(1)
}

void verifyHeading(String headingText) {
    TestObject heading = new TestObject()

    heading.addProperty('xpath', ConditionType.EQUALS, "//*[normalize-space()='$headingText']")

    WebUI.verifyElementPresent(heading, 5)

    println("✅ '$headingText' heading is present.")
}
WebUI.closeBrowser()

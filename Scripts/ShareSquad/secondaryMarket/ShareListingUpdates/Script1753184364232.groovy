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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/51742')

WebUI.setText(findTestObject('SM/ShareListEditST/Page_403 - Vestd/input_Email address_email'), 'radhika.chaudhary+1@vestd.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SM/ShareListEditST/Page_403 - Vestd/input_Password_password'), 
    '5ayXGn/UQ1Ic+1mHCRSZgA==')

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_403 - Vestd/button_Log in'))

WebUI.waitForElementPresent(findTestObject('Object Repository/SM/ShareListEditST/Page_Jones Ltd - Vestd/div_Secondary market  Update'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Jones Ltd - Vestd/div_Secondary market  Update'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Jones Ltd - Vestd/a_View listing'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Jones Ltd - Vestd/a_View listing'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Add filter'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Add filter'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/strong_Status'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/input_Status_status_pending'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/input_Pending_status_complete'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Status Pending, Completed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Clear filter'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Clear filter'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Add filter'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/strong_Status'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/input_Pending_status_complete'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/td_No data available in table'), 
    0)

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/input_Status_status_pending'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/div_Status Pending, Completed StatusPending_4faf16'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/td_No data available in table'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/td_first last'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Add filter'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/strong_Status'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/label_Pending'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Clear filter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/a_Edit'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/a_Edit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/h5_Edit share accepted'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/label_Shares accepted'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/input_Shares accepted_share-accepted'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Cancel'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Cancel'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/a_Edit'))

WebUI.setText(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/input_Shares accepted_share-accepted'), 
    '111')

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/h5_Data validation error'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/h5_Data validation error'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/li_The num shares approved may not be great_eb16d6'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Ok'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/a_Edit'))

WebUI.setText(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/input_Shares accepted_share-accepted'), 
    '2')

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/div_Edit share accepted                    _9a7bae'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/b_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/div_Total of shares offered 4  Total of sha_8a27eb'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Secondary Market - Share listings - Vestd/a_Stock transfer'))

WebUI.waitForElementPresent(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/h1_New stock transfer'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/h1_New stock transfer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/label_Share class'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/select_Please selectOrdinary (voting) (0.00_0f5091'), 
    0)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/select_Please selectOrdinary (voting) (0.00_0f5091'))

WebUI.verifyElementPresent(findTestObject('SM/ShareListEditST/Page_Building the equity economy - Vestd/div_first last (4 shares)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/label_From'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/div_first last (4 shares)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/div_ToPlease select.Please select.Chasity F_f5903e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/input_To_MJgADa6s5wsDmDY8'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/p_The recipient will need an address on fil_8eac17'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/input_To_MJgADa6s5wsDmDY8'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/li_Chasity Feeney'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/input_Number of shares_DI1cNsUu4aEY6X8O'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/label_Cash consideration (total for all sha_e25671'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/input_Cash consideration (total for all sha_20407e'))

WebUI.setText(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/input_Cash consideration (total for all sha_20407e'), 
    '1')

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/p_This will be in the currency of the selec_4b1d52'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/p_This will be in the currency of the selec_4b1d52'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/label_Is this part of a number of related t_09f6e2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/select_Please selectNoYes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/select_Please selectNoYes'), 
    '0', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/p_If the transfer exceeds 1000, stamp duty _cd53df'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/label_Investment round'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/select_NoneIncorporationFFRound oneRound two'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/p_If this stock transfer is part of an inve_b0cada'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/input_create one_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/SM/ShareListEditST/Page_Building the equity economy - Vestd/input_create one_btn btn-primary'))

//WebUI.closeBrowser()
TestObject resolutiomTitle = new TestObject()

resolutiomTitle.addProperty('xpath', ConditionType.EQUALS, '//*[@id="stock-transfer-form"]/fieldset[1]/h4')

WebUI.verifyElementPresent(resolutiomTitle, 5)

TestObject formsTitle = new TestObject()

formsTitle.addProperty('xpath', ConditionType.EQUALS, '//*[@id="stock-transfer-form"]/fieldset[2]/h4')

WebUI.verifyElementPresent(formsTitle, 5)

TestObject uploadDirResolution = new TestObject()

uploadDirResolution.addProperty('xpath', ConditionType.EQUALS, '//*[@id="director_resolution_action_upload"]')

WebUI.click(uploadDirResolution)

TestObject uploadInput = new TestObject('uploadInput')

uploadInput.addProperty('id', ConditionType.EQUALS, 'director_resolution_file')

// Upload file (provide full path to the file on your system)
WebUI.uploadFile(uploadInput, 'C:\\Users\\Radhika Chaudhary\\Downloads\\DOA Signed AT Jul 24.pdf')

LocalDate today = LocalDate.now()

LocalDate endDate = today.plusDays(7)

// Extract day, month, and year
String day = today.getDayOfMonth().toString().padLeft(2, '0')

String month = today.getMonthValue().toString().padLeft(2, '0')

String year = today.getYear().toString()

TestObject dirDate = new TestObject()

dirDate.addProperty('xpath', ConditionType.EQUALS, '//*[@id="director-resolution-date-day"]')

WebUI.setText(dirDate, day)

TestObject dirMonth = new TestObject()

dirMonth.addProperty('xpath', ConditionType.EQUALS, '//*[@id="director-resolution-date-month"]')

WebUI.setText(dirMonth, month)

TestObject dirYear = new TestObject()

dirYear.addProperty('xpath', ConditionType.EQUALS, '//*[@id="director-resolution-date-year"]')

WebUI.setText(dirYear, year)

TestObject uploadShareholderResolution = new TestObject()

uploadShareholderResolution.addProperty('xpath', ConditionType.EQUALS, '//*[@id="shareholder_resolution_action_upload"]')

WebUI.click(uploadShareholderResolution)

TestObject uploadInputRes = new TestObject('uploadInput')

uploadInputRes.addProperty('id', ConditionType.EQUALS, 'shareholder_resolution_file')

// Upload file (provide full path to the file on your system)
WebUI.uploadFile(uploadInputRes, 'C:\\Users\\Radhika Chaudhary\\Downloads\\DOA Signed AT Jul 24.pdf')

//LocalDate today = LocalDate.now()
//
//LocalDate endDate = today.plusDays(7)
//
//// Extract day, month, and year
//String day = today.getDayOfMonth().toString().padLeft(2, '0')
//
//String month = today.getMonthValue().toString().padLeft(2, '0')
//
//String year = today.getYear().toString()
TestObject shDate = new TestObject()

shDate.addProperty('xpath', ConditionType.EQUALS, '//*[@id="shareholder-resolution-date-day"]')

WebUI.setText(shDate, day)

TestObject shMonth = new TestObject()

shMonth.addProperty('xpath', ConditionType.EQUALS, '//*[@id="shareholder-resolution-date-month"]')

WebUI.setText(shMonth, month)

TestObject shYear = new TestObject()

shYear.addProperty('xpath', ConditionType.EQUALS, '//*[@id="shareholder-resolution-date-year"]')

WebUI.setText(shYear, year)

TestObject uploadForm = new TestObject()

uploadForm.addProperty('xpath', ConditionType.EQUALS, '//*[@id="spa_action_upload"]')

WebUI.click(uploadForm)

TestObject uploadInputForm = new TestObject('uploadInput')

uploadInputForm.addProperty('id', ConditionType.EQUALS, 'spa_file')

// Upload file (provide full path to the file on your system)
WebUI.uploadFile(uploadInputForm, 'C:\\Users\\Radhika Chaudhary\\Downloads\\DOA Signed AT Jul 24.pdf')

TestObject formDate = new TestObject()

formDate.addProperty('xpath', ConditionType.EQUALS, '//*[@id="spa-date-day"]')

WebUI.setText(formDate, day)

TestObject formMonth = new TestObject()

formMonth.addProperty('xpath', ConditionType.EQUALS, '//*[@id="spa-date-month"]')

WebUI.setText(formMonth, month)

TestObject formYear = new TestObject()

formYear.addProperty('xpath', ConditionType.EQUALS, '//*[@id="spa-date-year"]')

WebUI.setText(formYear, year)

TestObject saveAsDraft = new TestObject()

saveAsDraft.addProperty('xpath', ConditionType.EQUALS, '//input[@value="Save as draft"]')

WebUI.click(saveAsDraft)

TestObject startStockTransfer = new TestObject()

startStockTransfer.addProperty('xpath', ConditionType.EQUALS, '//button[contains(normalize-space(.), "Start the stock transfer")]')

WebUI.click(startStockTransfer)

TestObject confirmStockTransfer = new TestObject()

confirmStockTransfer.addProperty('xpath', ConditionType.EQUALS, '//button[contains(@class, "btn-primary") and contains(normalize-space(.), "Ok, Start stock transfer")]')

WebUI.click(confirmStockTransfer)

// List of span labels to verify
def disabledLabels = ['Edit', 'Stock transfer', 'Delete']

// Loop through each label and verify opacity
for (String label : disabledLabels) {
    TestObject link = createSpanObject(label)

    String style = WebUI.getAttribute(link, 'style')

    println("$label style: $style")

    assert style.contains('opacity: 0.6')
}

def createSpanObject(String labelText) {
    TestObject obj = new TestObject(labelText)

    obj.addProperty('xpath', ConditionType.EQUALS, "//*[@id='DataTables_Table_0']//span[normalize-space(.)='$labelText']")

    return obj
}


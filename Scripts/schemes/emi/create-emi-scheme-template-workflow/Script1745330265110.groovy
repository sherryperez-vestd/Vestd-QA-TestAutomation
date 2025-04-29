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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/option/emi')

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_EMI Home page/a_Create new template'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_Vestd option agreement template Most _34cc47'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_Over time This is the most common app_5d4bea'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.setText(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/input_Duration years_answer_years'), 
    '10')

WebUI.setText(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/input_Duration months_answer_months'), 
    '0')

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/span_Options will regularly vest in tranche_879dcc'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_No cliff Options will start vesting o_2d0e5e'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_Monthly'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_Distribute partial options evenly'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_Yes Options will vest regularly over _6b8c6b'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/span_Yes'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/span_Yes'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_As soon as the option is accepted Eac_0c9b85'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_Exit event When the business is sold,_14cf4b'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/span_If there has not been an exit event af_c489be'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_No Vested options will be exercisable_b53712'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.setText(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/input_What will the exercise price be_UhIIi_fb356f'), 
    '1')

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_All done, nothing more to add Most co_864bad'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/label_Allow vested options to be exercised _57b0fc'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Next'))

WebUI.click(findTestObject('Object Repository/schemes/emi/scheme-template/Page_scheme-design-workflow/button_Confirm details and create option scheme'))

WebUI.verifyElementVisible(findTestObject('Object Repository/schemes/emi/add-new-recipient/div_Template created, you can now begin add_c0bb11'))

WebUI.verifyElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/div_Template created, you can now begin add_c0bb11'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/schemes/emi/add-new-recipient/div_Template created, you can now begin add_c0bb11'), 
    'Template created, you can now begin adding recipient details')

WebUI.click(findTestObject('Object Repository/schemes/emi/add-new-recipient/div_Template created, you can now begin add_c0bb11_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/schemes/emi/add-new-recipient/div_Template created, you can now begin add_c0bb11_1'), 
    0)

WebUI.click(findTestObject('schemes/emi/add-new-recipient/a_Back to list of templates'))

WebUI.waitForElementPresent(findTestObject('schemes/emi/scheme-template/Page_Option-templates-index/input_Edit_text-danger'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('schemes/emi/scheme-template/Page_Option-templates-index/input_Edit_text-danger'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.closeBrowser()


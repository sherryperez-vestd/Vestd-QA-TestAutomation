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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.Keys as Keys

CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934?nav_p=account')

List<String> t_expectedLabels = ['Details', 'Payments', 'Governance', 'Relevant documents + features']

t_expectedLabels.each({ def label ->
        TestObject dynamicLabel = new TestObject('dynamic_' + label.replaceAll('\\s', ''))

        dynamicLabel.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, ('//span[normalize-space()=\'' + 
            label) + '\']')

        WebUI.scrollToElement(dynamicLabel, 0, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementPresent(dynamicLabel, 5)
    })

List<String> s_expectedLabels = ['Legal name', 'Company email', 'Scheme members', 'Company number', 'Display name', 'Investor relations contact'
    , 'Incorporation date', 'VAT number', 'Registered address', 'Bank account details', 'Website', 'Accounting reference date'
    , 'SIC codes']

s_expectedLabels.each({ def label ->
        TestObject dynamicLabel = new TestObject('dynamic_' + label.replaceAll('\\s', ''))

        dynamicLabel.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, ('//strong[normalize-space()=\'' + 
            label) + '\']')

        WebUI.scrollToElement(dynamicLabel, 0, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementPresent(dynamicLabel, 5)
    })

List<String> p_expectedLabels = ['Subscription', 'Payment', 'Billing address']

p_expectedLabels.each({ def label ->
        TestObject dynamicLabel = new TestObject('dynamic_' + label.replaceAll('\\s', ''))

        dynamicLabel.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, ('//p[normalize-space()=\'' + 
            label) + '\']')

        WebUI.scrollToElement(dynamicLabel, 0, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementPresent(dynamicLabel, 5)
    })

List<String> expectedLinks = ['Share authorisations', 'Option authorisations', 'New share classes', 'Company articles', 'Variations of share class rights'
    , 'Subdivision of share classes', 'Stock transfers + preemption waivers', 'Share buybacks', 'Share class conversions'
    , 'Changing the company name', 'Appointing a new director', 'Terminating a director', 'Refer a friend', 'Articles of Association'
    , 'Statutory Books', 'Confirmation Statements', 'Legal Owner Register', 'Company Valuations']

expectedLinks.each({ def label ->
        TestObject dynamicLabel = new TestObject('dynamic_' + label.replaceAll('\\s', ''))

        dynamicLabel.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, ('//a[normalize-space()=\'' + 
            label) + '\']')

        WebUI.scrollToElement(dynamicLabel, 0, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementPresent(dynamicLabel, 5)

        WebUI.verifyElementClickable(dynamicLabel)
    })

WebUI.closeBrowser()


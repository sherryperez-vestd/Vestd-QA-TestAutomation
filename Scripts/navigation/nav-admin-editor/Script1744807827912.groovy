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

WebUI.callTestCase(findTestCase('users-login/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/home')

WebUI.verifyElementNotPresent(findTestObject('navigation/a_My equity'), 0)

WebUI.verifyElementPresent(findTestObject('navigation/a_Home'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Home'), 'Home')

WebUI.click(findTestObject('navigation/a_Home'))

WebUI.verifyElementPresent(findTestObject('navigation/Page_Home/h1_Reid Ltd'), 0)

WebUI.verifyElementText(findTestObject('navigation/Page_Home/h1_Reid Ltd'), 'Reid Ltd')

WebUI.verifyElementPresent(findTestObject('navigation/a_Share schemes'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Share schemes'), 'Share schemes')

WebUI.click(findTestObject('navigation/a_Share schemes'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/li_Schemes'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/li_Schemes'), 'SCHEMES')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_ESU/a_Existing scheme uploads'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_ESU/a_Existing scheme uploads'), 'Existing scheme uploads')

WebUI.click(findTestObject('navigation/Share schemes/Page_ESU/a_Existing scheme uploads'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_ESU/h1_Existing scheme uploads'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_ESU/h1_Existing scheme uploads'), 'Existing scheme uploads')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_EMI/a_EMI'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_EMI/a_EMI'), 'EMI')

WebUI.click(findTestObject('navigation/Share schemes/Page_EMI/a_EMI'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_EMI/h1_EMI'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_EMI/h1_EMI'), 'EMI')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Unapproved Options/a_Unapproved options'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Unapproved Options/a_Unapproved options'), 'Unapproved options')

WebUI.click(findTestObject('navigation/Share schemes/Page_Unapproved Options/a_Unapproved options'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Unapproved Options/h1_Unapproved options'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Unapproved Options/h1_Unapproved options'), 'Unapproved options')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_CSOP/a_CSOP'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_CSOP/a_CSOP'), 'CSOP')

WebUI.click(findTestObject('navigation/Share schemes/Page_CSOP/a_CSOP'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_CSOP/h1_CSOP'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_CSOP/h1_CSOP'), 'CSOP')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Phantom/a_Phantom shares'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Phantom/a_Phantom shares'), 'Phantom shares')

WebUI.click(findTestObject('navigation/Share schemes/Page_Phantom/a_Phantom shares'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Phantom/h1_Phantom'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Phantom/h1_Phantom'), 'Phantom')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_All-options-agreements/a_All option agreements'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_All-options-agreements/a_All option agreements'), 
    'All option agreements')

WebUI.click(findTestObject('navigation/Share schemes/Page_All-options-agreements/a_All option agreements'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_All-options-agreements/h1_All option agreements'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_All-options-agreements/h1_All option agreements'), 
    'All option agreements')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_GS/a_Growth shares'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_GS/a_Growth shares'), 'Growth shares')

WebUI.click(findTestObject('navigation/Share schemes/Page_GS/a_Growth shares'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_GS/h1_Growth shares'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_GS/h1_Growth shares'), 'Growth shares')

WebUI.verifyElementNotPresent(findTestObject('navigation/Share schemes/Page_RSA/a_RSAs'), 0)

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Agile partnerships/a_Agile Partnership'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Agile partnerships/a_Agile Partnership'), 'Agile Partnership')

WebUI.click(findTestObject('navigation/Share schemes/Page_Agile partnerships/a_Agile Partnership'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Agile partnerships/h1_Agile Partnerships'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Agile partnerships/h1_Agile Partnerships'), 'Agile Partnerships')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/li_Compliance'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/li_Compliance'), 'COMPLIANCE')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Valuations/a_Valuations'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Valuations/a_Valuations'), 'Valuations')

WebUI.click(findTestObject('navigation/Share schemes/Page_Valuations/a_Valuations'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Valuations/h1_Valuations'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Valuations/h1_Valuations'), 'Valuations')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Share-pools/a_Share pools'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Share-pools/a_Share pools'), 'Share pools')

WebUI.click(findTestObject('navigation/Share schemes/Page_Share-pools/a_Share pools'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Share-pools/h1_Authorisations'), 0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Share-pools/h1_Authorisations'), 'Authorisations')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Annual HMRC notifications/a_Annual notifications'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Annual HMRC notifications/a_Annual notifications'), 
    'Annual notifications')

WebUI.click(findTestObject('navigation/Share schemes/Page_Annual HMRC notifications/a_Annual notifications'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Annual HMRC notifications/h1_Annual notifications'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Annual HMRC notifications/h1_Annual notifications'), 
    'Annual notifications')

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Initial-Notification/a_Initial notifications'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Initial-Notification/a_Initial notifications'), 'Initial notifications')

WebUI.click(findTestObject('navigation/Share schemes/Page_Initial-Notification/a_Initial notifications'))

WebUI.verifyElementPresent(findTestObject('navigation/Share schemes/Page_Initial-Notification/h1_EMI initial notifications to HMRC'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/Share schemes/Page_Initial-Notification/h1_EMI initial notifications to HMRC'), 
    'EMI initial notifications to HMRC')

WebUI.verifyElementPresent(findTestObject('navigation/a_Investment'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Investment'), 'Investment')

WebUI.click(findTestObject('navigation/a_Investment'))

WebUI.verifyElementPresent(findTestObject('navigation/Investment/li_investment rounds'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/li_investment rounds'), 'INVESTMENT ROUNDS')

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_Investment-hub/a_Investment hub'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/Page_Investment-hub/a_Investment hub'), 'Investment hub')

WebUI.click(findTestObject('navigation/Investment/Page_Investment-hub/a_Investment hub'))

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_Investment-hub/h1_Investment - InVestd Raise'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/Page_Investment-hub/h1_Investment - InVestd Raise'), 'Investment - InVestd Raise')

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_Guided-Flow/a_Guided flow'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/Page_Guided-Flow/a_Guided flow'), 'Guided flow')

WebUI.click(findTestObject('navigation/Investment/Page_Guided-Flow/a_Guided flow'))

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_Guided-Flow/h1_Investment via InVestd'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/Page_Guided-Flow/h1_Investment via InVestd'), 'Investment via InVestd')

WebUI.verifyElementPresent(findTestObject('navigation/Investment/li_Related tools'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/li_Related tools'), 'RELATED TOOLS')

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_All-share-issues/a_All share issues'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/Page_All-share-issues/a_All share issues'), 'All share issues')

WebUI.click(findTestObject('navigation/Investment/Page_All-share-issues/a_All share issues'))

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_All-share-issues/h1_Share movement history'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/Page_All-share-issues/h1_Share movement history'), 'Share movement history')

WebUI.click(findTestObject('navigation/a_Investment'))

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_SEIS-EIS/a_SEIS  EIS'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/Page_SEIS-EIS/a_SEIS  EIS'), 'SEIS & EIS')

WebUI.click(findTestObject('navigation/Investment/Page_SEIS-EIS/a_SEIS  EIS'))

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_SEIS-EIS/h1_SEISEIS'), 0)

WebUI.verifyElementText(findTestObject('navigation/Investment/Page_SEIS-EIS/h1_SEISEIS'), 'SEIS/EIS')

WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_Share authorisations/a_Share authorisations'), 0)

not_run: WebUI.verifyElementText(findTestObject('navigation/Investment/Page_Share authorisations/a_Share authorisations'), 
    'Share authorisations')

not_run: WebUI.click(findTestObject('navigation/Investment/Page_Share authorisations/a_Share authorisations'))

not_run: WebUI.verifyElementPresent(findTestObject('navigation/Investment/Page_Share authorisations/h1_Authorisations'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('navigation/Investment/Page_Share authorisations/h1_Authorisations'), 'Authorisations')

WebUI.verifyElementPresent(findTestObject('navigation/a_Share capital'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Share capital'), 'Share capital')

WebUI.click(findTestObject('navigation/a_Share capital'))

WebUI.verifyElementPresent(findTestObject('navigation/a_Secretarial  admin'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Secretarial  admin'), 'Secretarial & admin')

WebUI.verifyElementPresent(findTestObject('navigation/a_People  communication'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_People  communication'), 'People & communication')

WebUI.verifyElementNotPresent(findTestObject('navigation/a_Company - staff'), 0)

WebUI.verifyElementPresent(findTestObject('navigation/a_Help Centre'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Help Centre'), 'Help Centre')

WebUI.verifyElementPresent(findTestObject('navigation/a_Company settings'), 0)

WebUI.verifyElementText(findTestObject('navigation/a_Company settings'), 'Company settings')

WebUI.verifyElementNotPresent(findTestObject('navigation/a_App - staff'), 0)

WebUI.verifyElementPresent(findTestObject('navigation/img'), 0)

WebUI.verifyElementPresent(findTestObject('navigation/p_Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992)'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/p_Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992)'), 
    'Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992).')

WebUI.closeBrowser()


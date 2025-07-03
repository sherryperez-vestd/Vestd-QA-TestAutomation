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

//import java.text.SimpleDateFormat
//import java.util.Calendar
WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/director')

WebUI.click(findTestObject('CoSec/directors/a_Directorname'))

WebUI.verifyElementPresent(findTestObject('CoSec/directors/a_Resign'), 0)

WebUI.verifyElementText(findTestObject('CoSec/directors/a_Resign'), 'Resign')

WebUI.verifyElementNotPresent(findTestObject('CoSec/directors/th_Resigned'), 0)

WebUI.click(findTestObject('CoSec/directors/a_Resign'))

//// Get calendar instance with current date
//Calendar calendar = Calendar.getInstance()
//
//// Increment the day by 1
//calendar.add(Calendar.DATE, 1)
//
//// Format to get just the day (dd)
//SimpleDateFormat dayFormat = new SimpleDateFormat("dd")
//String incrementedDay = dayFormat.format(calendar.getTime())
//
//// Print to console (optional)
////println("Incremented day is: " + incrementedDay)
//
//WebUI.setText(findTestObject('CoSec/directors/input_ResignDay'), incrementedDay)
WebUI.setText(findTestObject('CoSec/directors/input_ResignDay'), '1')

WebUI.setText(findTestObject('CoSec/directors/input_ResignMonth'), '2')

WebUI.setText(findTestObject('CoSec/directors/input_ResignYear'), '2025')

WebUI.check(findTestObject('CoSec/directors/input_checkboxActions'))

WebUI.click(findTestObject('CoSec/directors/btn_ResignDirector'))

WebUI.click(findTestObject('CoSec/directors/btn_ResignConfirm'))

WebUI.verifyElementPresent(findTestObject('CoSec/directors/alert_Director resigned'), 0)

WebUI.verifyElementText(findTestObject('CoSec/directors/alert_Director resigned'), 'Director resigned.')

WebUI.verifyElementPresent(findTestObject('CoSec/directors/label_Resigned'), 0)

WebUI.verifyElementText(findTestObject('CoSec/directors/label_Resigned'), 'Resigned')

WebUI.verifyElementPresent(findTestObject('CoSec/directors/th_Resigned'), 0)

WebUI.verifyElementText(findTestObject('CoSec/directors/th_Resigned'), 'Resigned')

WebUI.verifyElementPresent(findTestObject('CoSec/directors/a_Reappoint'), 0)

WebUI.verifyElementText(findTestObject('CoSec/directors/a_Reappoint'), 'Reappoint')

WebUI.click(findTestObject('CoSec/directors/a_Reappoint'))

//// Get calendar instance with current date
//Calendar calendar2 = Calendar.getInstance()
//
//// Increment the day by 2
//calendar2.add(Calendar.DATE, 2)
//
//// Format to get just the day (dd)
//SimpleDateFormat dayFormat = new SimpleDateFormat("dd")
//String incrementedDay2 = dayFormat.format(calendar2.getTime())
//
//WebUI.setText(findTestObject('CoSec/directors/input_appointedDay'), incrementedDay2)
WebUI.setText(findTestObject('CoSec/directors/input_appointedDay'), '2')

WebUI.setText(findTestObject('CoSec/directors/input_appointedMonth'), '2')

WebUI.setText(findTestObject('CoSec/directors/input_appointedYear'), '2025')

WebUI.verifyElementPresent(findTestObject('CoSec/directors/btn_Reappoint'), 0)

WebUI.click(findTestObject('CoSec/directors/btn_Reappoint'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('CoSec/directors/alert_Director reappointment'), 0)

WebUI.verifyElementText(findTestObject('CoSec/directors/alert_Director reappointment'), 'Director reappointment started.')

WebUI.verifyElementPresent(findTestObject('CoSec/directors/th_Appointed'), 0)

WebUI.closeBrowser()


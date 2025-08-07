import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.util.Calendar

/**
 * 
 * TEST CASE: Resign and Reappoint Director
 * 
 * URL: https://demo.app.vestd.com/company/50934/director
 *
 * STEPS:
 * - Logs in as an Editor user
 * - Navigates to the Directors page of company 50934
 * - Opens a director's profile
 * - Resigns the director using today's date
 * - Reappoints the director again using today's date
 * - Verifies appropriate status labels and success messages
 * 
 */

// Login and navigate
WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/director')
WebUI.click(findTestObject('CoSec/directors/a_Directorname'))

// Perform resign and reappoint flows
resignDirector()
reappointDirector()

// Final cleanup
WebUI.closeBrowser()

//Get current date parts as strings
def getCurrentDateParts() {
	Calendar calendar = Calendar.getInstance()
	return [
		day  : calendar.get(Calendar.DAY_OF_MONTH).toString(),
		month: (calendar.get(Calendar.MONTH) + 1).toString(), // Calendar.MONTH is zero-based
		year : calendar.get(Calendar.YEAR).toString()
	]
}

// Resign a director
def resignDirector() {
    def dateParts = getCurrentDateParts()
    WebUI.verifyElementPresent(findTestObject('CoSec/directors/a_Resign'), 0)
    WebUI.verifyElementText(findTestObject('CoSec/directors/a_Resign'), 'Resign')
    WebUI.verifyElementNotPresent(findTestObject('CoSec/directors/th_Resigned'), 0)
    WebUI.click(findTestObject('CoSec/directors/a_Resign'))

    WebUI.setText(findTestObject('CoSec/directors/input_ResignDay'), dateParts.day)
    WebUI.setText(findTestObject('CoSec/directors/input_ResignMonth'), dateParts.month)
    WebUI.setText(findTestObject('CoSec/directors/input_ResignYear'), dateParts.year)

    WebUI.check(findTestObject('CoSec/directors/input_checkboxActions'))
    WebUI.click(findTestObject('CoSec/directors/btn_ResignDirector'))
    WebUI.click(findTestObject('CoSec/directors/btn_ResignConfirm'))

    WebUI.verifyElementPresent(findTestObject('CoSec/directors/alert_Director resigned'), 0)
    WebUI.verifyElementText(findTestObject('CoSec/directors/alert_Director resigned'), 'Director resigned.')
    WebUI.verifyElementPresent(findTestObject('CoSec/directors/label_Resigned'), 0)
    WebUI.verifyElementText(findTestObject('CoSec/directors/label_Resigned'), 'Resigned')
    WebUI.verifyElementPresent(findTestObject('CoSec/directors/th_Resigned'), 0)
    WebUI.verifyElementText(findTestObject('CoSec/directors/th_Resigned'), 'Resigned')
}

// Reappoint a director
def reappointDirector() {
    def dateParts = getCurrentDateParts()
    WebUI.verifyElementPresent(findTestObject('CoSec/directors/a_Reappoint'), 0)
    WebUI.verifyElementText(findTestObject('CoSec/directors/a_Reappoint'), 'Reappoint')
    WebUI.click(findTestObject('CoSec/directors/a_Reappoint'))

    WebUI.setText(findTestObject('CoSec/directors/input_appointedDay'), dateParts.day)
    WebUI.setText(findTestObject('CoSec/directors/input_appointedMonth'), dateParts.month)
    WebUI.setText(findTestObject('CoSec/directors/input_appointedYear'), dateParts.year)

    WebUI.verifyElementPresent(findTestObject('CoSec/directors/btn_Reappoint'), 0)
    WebUI.click(findTestObject('CoSec/directors/btn_Reappoint'))
    WebUI.delay(5) // consider replacing with a smarter wait if possible

    WebUI.verifyElementPresent(findTestObject('CoSec/directors/alert_Director reappointment'), 0)
    WebUI.verifyElementText(findTestObject('CoSec/directors/alert_Director reappointment'), 'Director reappointment started.')
    WebUI.verifyElementPresent(findTestObject('CoSec/directors/th_Appointed'), 0)
}



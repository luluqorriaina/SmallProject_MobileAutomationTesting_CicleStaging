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

'Tap Chat "notimetocook"'
Mobile.tapAtPosition(881, 899)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Tap Delete Button\r\n'
Mobile.tapAtPosition(526, 1954)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Tap Ok on Popup Button'
Mobile.tapAtPosition(717, 1104)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Tap Deleted Chat'
Mobile.tapAtPosition(796, 899)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Tap Copy Button\r\n'
Mobile.tapAtPosition(541, 1933)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Group Chat (Negative)/VerifyCopyDeleted ChatField'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


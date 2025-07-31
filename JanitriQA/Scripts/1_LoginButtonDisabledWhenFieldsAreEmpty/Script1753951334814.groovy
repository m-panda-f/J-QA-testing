import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject


// Step 1: Open browser and navigate to Janitri login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://dev-dash.janitri.in/')
WebUI.delay(2) // wait for page to load fully

// Step 2: Ensure fields are empty (optional)
WebUI.setText(findTestObject('Email_Input'), '')
WebUI.setText(findTestObject('Password_Input'), '')
WebUI.delay(1)

// Step 3: Try checking if login button is DISABLED using attribute
// Step 3: Check if Login button is clickable
boolean isClickable = WebUI.verifyElementClickable(
    findTestObject('Login_Button'),
    FailureHandling.OPTIONAL
)

if (isClickable) {
    println "❌ Login button is clickable when fields are empty — FAIL"
	WebUI.delay(2)
	
	
	TestObject errorObj = findTestObject('Error_Message')  // you must create this
	String errorText = ''

	if (WebUI.verifyElementPresent(errorObj, 2, FailureHandling.OPTIONAL)) {
		errorText = WebUI.getText(errorObj)
		println "⚠️ Error message captured: " + errorText
	} else {
		println "⚠️ No error message found after clicking Login with empty fields."
	}
} else {
    println "✅ Login button is not clickable when fields are empty — PASS"
}

// Step 4: Close browser
WebUI.closeBrowser()

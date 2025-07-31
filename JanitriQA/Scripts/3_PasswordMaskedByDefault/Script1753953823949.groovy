import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.model.FailureHandling

// Step 1: Open browser and go to login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://dev-dash.janitri.in/')
WebUI.delay(2)

// Step 2: Enter dummy password
WebUI.setText(findTestObject('Password_Input'), 'MyTestPassword123')
WebUI.delay(1)

// Step 3: Check if input type is "password"
String fieldType = WebUI.getAttribute(findTestObject('Password_Input'), 'type')

if (fieldType == 'password') {
    println "✅ Password field is masked by default — PASS"
} else {
    println "❌ Password field is not masked — FAIL"
}

// Step 4: Close browser
WebUI.closeBrowser()

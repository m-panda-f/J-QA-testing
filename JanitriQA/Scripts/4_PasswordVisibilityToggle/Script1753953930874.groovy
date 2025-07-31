import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Step 1: Open browser and go to login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://dev-dash.janitri.in/')
WebUI.delay(2)

// Step 2: Enter password
WebUI.setText(findTestObject('Password_Input'), 'MyPassword123')
WebUI.delay(1)

// Step 3: Click eye icon to toggle visibility
WebUI.click(findTestObject('Eye_Icon'))
WebUI.delay(1)

// Step 4: Check if password is now visible (type="text")
String fieldTypeAfter = WebUI.getAttribute(findTestObject('Password_Input'), 'type')

if (fieldTypeAfter == 'text') {
    println "✅ Password is visible after clicking eye icon — PASS"
} else {
    println "❌ Password is still masked after clicking eye icon — FAIL"
}

// Step 5: Close browser
WebUI.closeBrowser()

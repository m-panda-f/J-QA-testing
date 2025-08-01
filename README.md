# 🧪 Janitri QA Automation Assignment

This repository contains test automation for the **Janitri login page** as part of the QA Internship Assignment.  
Two different approaches were implemented:

- ✅ `JanitriQA` – Automated using **Katalon Studio**
- ✅ `qa-automation` – Automated using **Java + Selenium + TestNG + Maven**

---

## 📁 Project Structure

J-QA-testing/

├── JanitriQA/ ← Katalon Studio project

├── qa-automation/ ← Selenium + TestNG (Java) framework

└── TestCases.xlsx ← Manual test cases with expected & actual results

yaml
Copy
Edit

---

## 🚀 How to Run the Java (Selenium) Project

### 1. 📦 Prerequisites
- Java JDK 8 or above
- Maven
- Chrome Browser
- IDE (Eclipse / IntelliJ)
- Internet (for WebDriverManager)

### 2. 📥 Steps
1. Clone this repo:
   ```bash
   git clone https://github.com/m-panda-f/J-QA-testing.git
   cd qa-automation
Open in your IDE

Run using testng.xml:

Right-click on testng.xml → Run as → TestNG Suite

OR use:

bash
Copy
Edit
mvn test
🧪 How to Run the Katalon Project
1. Requirements
Katalon Studio (free version)

2. Steps
Open Katalon Studio

Import the JanitriQA folder

Open any test case

Click Run → Choose browser (Chrome preferred)

✅ Test Cases Covered
Login button disabled/enabled validation

Password masking and visibility toggle

Invalid login error handling

Placeholder visibility

Janitri logo display

UI field alignment

Responsiveness checks (Katalon)

📊 A complete Excel file (TestCases.xlsx) is included to document:

Test Scenarios

Steps

Test Data

Expected vs Actual Results

Pass/Fail status

🔗 Author
Mohammed Faizan

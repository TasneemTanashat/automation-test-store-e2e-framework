# 🛒 Automation Test Store E2E Automation Framework

## 📌 Overview

**Automation Test Store E2E Automation Framework** is a web automation testing project developed using **Selenium WebDriver, Java, and TestNG**.

The main goal of this project is to automate a complete end-to-end user journey on the **Automation Test Store** website, starting from creating a new account and authentication, then browsing products, handling different product options, adding items to the cart, and completing the checkout workflow.

This project demonstrates practical skills in **UI Automation Testing, Test Scenario Automation, Dynamic Test Data Handling, Assertions, and Test Evidence Collection.**

---

## 🌐 Application Under Test

**Automation Test Store**

🔗 https://automationteststore.com/

---

# 🛠️ Tech Stack

- **Java** - Programming Language
- **Selenium WebDriver** - Web UI Automation
- **TestNG** - Test Execution & Assertions
- **Maven** - Dependency Management
- **ChromeDriver** - Browser Automation
- **Git & GitHub** - Version Control
- **Eclipse IDE** - Development Environment

---

# 📂 Project Structure
automation-test-store-e2e-framework
│
├── src/main/java
│ └── myTestCases
│ ├── Class1.java
│ └── Class2.java
│
├── screenshots
│ └── Test Execution Evidence
│
├── pom.xml
└── README.md

---

# ✅ Automated Test Scenarios

## 1. User Registration

Automates the complete signup process:

✔ Navigate to registration page  
✔ Fill registration information  
✔ Generate random user data  
✔ Select country and state values  
✔ Accept terms and conditions  
✔ Submit registration form  

### Validations:
- Verify account creation success
- Verify page title
- Verify registered user information

---

## 2. User Login

Automates login functionality using generated credentials.

### Validations:
- Verify successful login
- Verify account page navigation
- Verify user details are displayed

---

## 3. User Logout

Automates logout functionality.

### Validations:
- Verify logout page
- Verify logout URL
- Verify logout confirmation message

---

## 4. Product Browsing & Add To Cart

Automates product selection workflow:

✔ Browse products  
✔ Open product details  
✔ Handle different product configurations:

- Dropdown lists
- Radio buttons
- Product options

✔ Add products to shopping cart  
✔ Capture screenshots during execution

---

## 5. Cart Validation

Automates cart verification:

✔ Navigate to cart page  
✔ Extract product information from cart table  
✔ Validate cart data  
✔ Capture execution screenshots

---

## 6. Checkout & Order Confirmation

Automates the checkout workflow:

✔ Navigate to checkout  
✔ Submit order confirmation  
✔ Verify successful completion  
✔ Capture screenshots as test evidence

---

# ⭐ Framework Features

## 🔹 Dynamic Test Data Generation

The framework generates unique test data automatically for registration:

- First Name
- Last Name
- Email
- Phone Number
- Company Name
- Username

This helps execute tests repeatedly without using duplicate accounts.

---

## 🔹 Different Web Element Handling

The framework handles multiple web elements:

- Text Fields
- Buttons
- Dropdown Menus
- Radio Buttons
- Tables
- Links

Using different Selenium locators:

- XPath
- CSS Selector
- ID

---

## 🔹 Test Validation

TestNG assertions are used to verify expected results:

- URL validation
- Page title verification
- Text verification
- Workflow completion validation

---

## 🔹 Screenshot Capture

The framework captures screenshots during important test steps to provide execution evidence and simplify debugging.

Generated screenshots are stored in:

---

# ▶️ How To Run

### Prerequisites

Make sure you have installed:

- Java JDK
- Maven
- Chrome Browser
- Eclipse IDE


### Installation

Clone the repository:

```bash
git clone https://github.com/TasneemTanashat/automation-test-store-e2e-framework.git
```
Open the project in Eclipse and install Maven dependencies:
```bash
mvn clean install
```
Run the TestNG test cases.

---
## 📊 Test Coverage

| Test Scenario | Status |
|---|---|
| User Registration | ✅ |
| Login | ✅ |
| Logout | ✅ |
| Product Selection | ✅ |
| Product Options Handling | ✅ |
| Add To Cart | ✅ |
| Cart Validation | ✅ |
| Checkout Process | ✅ |
| Order Confirmation | ✅ |

---

## 📸 Test Evidence

The project automatically generates screenshots during execution to document test execution results.

---

## 👩‍💻 Author

Eng. Tasneem Tanashat


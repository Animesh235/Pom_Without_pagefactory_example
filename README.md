# POM Automation Framework

This project is an automation testing framework for the **Website** built using **Selenium WebDriver**, **TestNG**, and **Maven**. The framework follows a **POM (Page Object Model)** structure, excluding the usage of the `PageFactory` class.

## Key Features
- **Selenium WebDriver** for browser automation.
- **TestNG** for test execution, parallel testing, and reporting.
- **Maven** for dependency management and running the tests.
- **POM Structure** without PageFactory pattern.

## Project Structure

```
automation
│
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── portfolio
│   │               ├── base
│   │               │   └── BaseTest.java
│   │               ├── pages
│   │               │   ├── HomePage.java
│   │               │   └── ContactPage.java
│   │               └── utils
│   │                   └── WebDriverFactory.java
│   └── test
│       └── java
│           └── com
│               └── portfolio
│                   └── tests
│                       ├── HomePageTest.java
│                       └── ContactPageTest.java
└── testng.xml
```

### Key Folders and Files

- **`pom.xml`**: Contains the project’s dependencies, plugins, and build configurations.
- **`src/main/java/com/automation/base/BaseTest.java`**: The base class containing setup and teardown methods, initializing WebDriver.
- **`src/main/java/com/automation/pages`**: Contains classes for each page of the portfolio website (e.g., `HomePage.java`, `ContactPage.java`), implementing the POM without PageFactory.
- **`src/main/java/com/automation/utils/WebDriverFactory.java`**: Utility class responsible for WebDriver configuration and management.
- **`src/test/java/com/automation/tests`**: Contains test classes where each class corresponds to tests for specific pages or features.
- **`testng.xml`**: TestNG configuration file specifying which tests to run.

## Setup and Installation

### Prerequisites

- **Java 8** or higher
- **Maven 3.6** or higher
- **Git**
- **ChromeDriver** or other WebDriver binaries

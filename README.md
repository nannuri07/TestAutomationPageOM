# TestAutomationPageOM

Using Selenium Webdriver and Page Object Model developed this Scenario. I will be expanding the repo with more test scenarios and testcases along with HomePage and ProductPage development. 

Test scenario covered in this repo:
1. Launch Chrome
2. Navigate to www.amazon.com
3. Select “Books” under search dropdown
4. Search for “Selenium”
5. Find and select the book titled “Selenium Testing Tools” by author “Unmesh Gundecha” 
6. In the product page, note the price of Hardcover edition
7. Add the hardcover version to shopping cart
8. Navigate to shopping cart
9. Assert that the Subtotal amount matches the hardcover price from the product page

Instructions to run test automation:
1. Clone repo or download the source code into local system.
2. Launch the Project from IDE (example : eclipse)
3. Goto < TestAutomationPageOM/src/main/java/com/automation/testmain/TestMain.java >
   and set chromedriver property.
4. Set Maven Goals and run the pom.xml as Maven clean and Maven Test.
5. This can also run as TestNg Test.

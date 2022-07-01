<div align="center">
 <img  src="https://user-images.githubusercontent.com/68038931/147390936-c6228337-9787-4aab-b5d6-826bc8e4e4a3.gif" alt="test-light" width="1000" height="250" />
 </div>
 
# ✨ *My Store* ==> *GUI* *Test Automation* ✨
## 💥   Automate different functionalities of an E-commerce website called *"My Store"* 💥
### Website URL: http://automationpractice.com/index.php
 
- ### 📝 The main Frameworks included in the project:
 **SHAFT Engine on the Top of:**

 *Selenium Webdriver*
 
 *TestNG*
 
 *Allure Report*
 
 *Extent Reports*
 
 *Remote Execution { Selenium Grid4 & Docker Compose }*
 
-  ### 🏗️ Project Design:
 *Page Object Model (POM) design pattern*
 
 *Data Driven framework*
 
 *Fluent design approach*
 
 *Java Docs*
 
 - ### 🔍️ Covered Test cases in this project :
#### ✅1. Test Case - Automate User Registration process.
 Steps to Automate:
1. Open this url  http://automationpractice.com/index.php
2. Click on sign in link.
3. Enter your email address in 'Create and account' section.
4. Click on Create an Account button.
5. Enter your Personal Information, Address and Contact info.
6. Click on Register button.
7. Validate that user is created.

#### ✅2. Test Case - Verify invalid email address error.
Steps to Automate:
1. Open this url  http://automationpractice.com/index.php
2. Click on sign in link.
3. Enter invalid email address in the email box and click enter.
4. Validate that an error message is displaying saying "Invalid email address"

#### ✅3. Test Case - Verify error messages for mandatory fields.
Steps to Automate:
1. Open this url  http://automationpractice.com/index.php
2. Click on sign in link.
3. Enter email address and click Register button.
4. Leave the mandatory fields (marked with *) blank and click Register button.
5. Verify that error has been displayed for the mandatory fields.

#### ✅4. Test Case - Automate 'Search Product' feature of the website.
Steps to Automate:
1. Open link http://automationpractice.com/index.php
2. Move your cursor over Women's link.
3. Click on sub menu 'T-shirts'
4. Get Name/Text of the first product displayed on the page.
5. Now enter the same product name in the search bar present on top of page and click search button.
6. Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page.

#### ✅5. Test Case - Automate end-to-end "Buy Product" feature of the website.
Steps to Automate:
1. Open link http://automationpractice.com/index.php
2. Login to the website.
3. Move your cursor over Women's link.
4. Click on sub menu 'T-shirts'.
5. Mouse hover on the second product displayed.
6. 'More' button will be displayed, click on 'More' button.
7. Increase quantity to 2.
8. Select size 'L'
9. Select color.
10. Click 'Add to Cart' button.
11. Click 'Proceed to checkout' button.
12. Complete the buy order process till payment.
13. Make sure that Product is ordered.

#### ✅6. Test Case - Verify that 'Add to Wishlist' only works after login.
Steps to Automate:
1. Open link http://automationpractice.com/index.php
2. Move your cursor over Women's link.
3. Click on sub menu 'T-shirts'.
4. Mouse hover on the second product displayed.
5. 'Add to Wishlist' will appear on the bottom of that product, click on it.
6. Verify that error message is displayed 'You must be logged in to manage your wish list.'

#### ✅7. Test Case - Verify that Total Price is reflecting correctly if user changes quantity on 'Shopping Cart Summary' Page.
Steps to Automate:
1. Open link http://automationpractice.com/index.php
2. Login to the website.
3. Move your cursor over Women's link.
4. Click on sub menu 'T-shirts'.
5. Mouse hover on the second product displayed.
6. 'More' button will be displayed, click on 'More' button.
7. Make sure quantity is set to 1.
8. Select size 'M'
9. Select color of your choice.
10. Click 'Add to Cart' button.
11. Click 'Proceed to checkout' button.
12. Change the quantity to 2.
13. Verify that Total price is changing and reflecting correct price.
Similar way you can add few more test cases.

#### 🏷️ NB: If you wish to use SHAFT with IntelliJ please apply these settings:
Run/Debug Configurations > Edit Configurations... > Templates > TestNG > Configuration > Listeners > Add all SHAFT_Engine Listeners [AlterSuite, InvokedMethod, Suite]
 
 

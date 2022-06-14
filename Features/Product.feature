 Feature: Product Search

Scenario: User should login app and search product check its specification
Given User is able to launch chrome browser
  When User is able to open  URL with "https://www.flipkart.com"
  And User enters username as "saurabhpowarhp@gmail.com" and password as "saurabhpo"
  And Click On Login
  Then Homepage Title Should be "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
  When User is click on search button
  And enters product name as "realme Buds 2 Wired Headset  (Orange, In the Ear)" and clicks enter
  Then User should click on product
 
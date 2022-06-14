 Feature: Application Login

  Scenario: Login with Valid Credentials
  Given User is able to launch chrome browser
  When User is able to open  URL with "https://www.flipkart.com"
  And User enters username as "saurabhpowarhp@gmail.com" and password as "saurabhpo"
  And Click On Login
  Then Homepage Title Should be "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"


  Scenario Outline: Login with Datadriven
  Given User is able to launch chrome browser
  When User is able to open  URL with "https://www.flipkart.com"
  And User enters username as "<username>" and password as "<password>" 
  And Click On Login
  Then Homepage Title Should be "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"

   Examples: 
   |username                |password    |
   |saurabhpowarhp@gmail.com|saurabhpo   |
   
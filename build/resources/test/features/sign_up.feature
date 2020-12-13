@driver:chrome
Feature: Sign up
  As user
  I'd like to sign up into the PHP travels Website
  To access to other functionalities


  Background: example
    Given He is on PHP Travels website

  Scenario Outline: Sign up successful
    When He signs up on PHP travels website
      | firstName   | lastName   | mobileNumber   | email   | password   |
      | <firstName> | <lastName> | <mobileNumber> | <email> | <password> |
    Then He should be able to see the text <greeting>
    Examples:
      | firstName | lastName | mobileNumber | email                  | password  | greeting        |
      | Elvis     | Perez    | 3046161616   | roccoperez12@ruinososs.com | 123454678 | Hi, Elvis Perez |
#      | Rocco     | Perez    | 3046161616   | rocco12@ruinoso.com     | 123454678 | Hi, Rocco Perez |
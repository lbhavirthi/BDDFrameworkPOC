$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FB CReate Account.feature");
formatter.feature({
  "line": 1,
  "name": "Signup button with less password characters",
  "description": "",
  "id": "signup-button-with-less-password-characters",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate signup button with less password characters",
  "description": "",
  "id": "signup-button-with-less-password-characters;validate-signup-button-with-less-password-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Chrome browser and launch Facebook Signup page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the required fileds with password length less than 6 characters",
  "rows": [
    {
      "cells": [
        "FirstName",
        "SurName",
        "MobileNumber",
        "Password",
        "Day",
        "Month",
        "Year"
      ],
      "line": 6
    },
    {
      "cells": [
        "John",
        "Campbell",
        "9618675723",
        "test",
        "29",
        "12",
        "1988"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Validate invalid password Error message \t‘Your password must be at least 6 characters long. Please try another.’",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Chrome_browser_and_launch_Facebook_Signup_page()"
});
formatter.result({
  "duration": 12172929000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 57
    }
  ],
  "location": "Steps.enter_the_required_fileds_with_password_length_less_than_characters(int,DataTable)"
});
formatter.result({
  "duration": 2046132200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 73
    }
  ],
  "location": "Steps.validate_invalid_password_Error_message_Your_password_must_be_at_least_characters_long_Please_try_another(int)"
});
formatter.result({
  "duration": 7993118200,
  "status": "passed"
});
});
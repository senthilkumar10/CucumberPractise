$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OHRMDataTableWithExampleKeyword.feature");
formatter.feature({
  "line": 2,
  "name": "This is the Login feature for Orange HRM test",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WebTC"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": ": This is Login Scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm-test;:-this-is-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Proceed to Login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"\u003cUserName\u003e\" and Password \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Clicked button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Home page Landed",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm-test;:-this-is-login-scenario;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 11,
      "id": "this-is-the-login-feature-for-orange-hrm-test;:-this-is-login-scenario;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 12,
      "id": "this-is-the-login-feature-for-orange-hrm-test;:-this-is-login-scenario;;2"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 13,
      "id": "this-is-the-login-feature-for-orange-hrm-test;:-this-is-login-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1308717664,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": ": This is Login Scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm-test;:-this-is-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@WebTC"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Proceed to Login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"Admin\" and Password \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Clicked button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Home page Landed",
  "keyword": "Then "
});
formatter.match({
  "location": "OHRMDataTableWithExampleKeyword.proceed_to_Login()"
});
formatter.result({
  "duration": 3558036714,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin123",
      "offset": 34
    }
  ],
  "location": "OHRMDataTableWithExampleKeyword.user_enters_and_Password(String,String)"
});
formatter.result({
  "duration": 303387348,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithExampleKeyword.clicked_button()"
});
formatter.result({
  "duration": 4113964945,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithExampleKeyword.Home_page_Landed()"
});
formatter.result({
  "duration": 384823530,
  "status": "passed"
});
formatter.after({
  "duration": 86936,
  "status": "passed"
});
formatter.before({
  "duration": 531880497,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": ": This is Login Scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm-test;:-this-is-login-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@WebTC"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Proceed to Login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"Admin\" and Password \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Clicked button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Home page Landed",
  "keyword": "Then "
});
formatter.match({
  "location": "OHRMDataTableWithExampleKeyword.proceed_to_Login()"
});
formatter.result({
  "duration": 3600225197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin123",
      "offset": 34
    }
  ],
  "location": "OHRMDataTableWithExampleKeyword.user_enters_and_Password(String,String)"
});
formatter.result({
  "duration": 281981475,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithExampleKeyword.clicked_button()"
});
formatter.result({
  "duration": 3516860103,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithExampleKeyword.Home_page_Landed()"
});
formatter.result({
  "duration": 546238198,
  "status": "passed"
});
formatter.after({
  "duration": 79779,
  "status": "passed"
});
formatter.uri("OHRMDataTableWithHeader.feature");
formatter.feature({
  "line": 2,
  "name": "This is the Login feature for Orange HRM test",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WebTC"
    }
  ]
});
formatter.before({
  "duration": 492144712,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "This is Login Scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm-test;this-is-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Login to Orange HRM",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Input UN and Password as below",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 6
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on the Login button to land Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "OHRMDataTableWithHeader.login_to_Orange_HRM()"
});
formatter.result({
  "duration": 3626009244,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithHeader.input_UN_and_Password_as_below(DataTable)"
});
formatter.result({
  "duration": 349063110,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithHeader.click_on_the_Login_button_to_land_Home_Page()"
});
formatter.result({
  "duration": 3343948369,
  "status": "passed"
});
formatter.after({
  "duration": 337218814,
  "status": "passed"
});
formatter.uri("OHRMDataTableWithOutHeader.feature");
formatter.feature({
  "line": 2,
  "name": "This is the Login feature for Orange HRM",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WebTC"
    }
  ]
});
formatter.before({
  "duration": 502777151,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "This is Login Scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "You are on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "You enter the below credentials",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "You should see the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "OHRMDataTableWithOutHeader.you_are_on_the_Login_Page()"
});
formatter.result({
  "duration": 3984515686,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithOutHeader.you_enter_the_below_credentials(DataTable)"
});
formatter.result({
  "duration": 248014268,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithOutHeader.click_the_login_button()"
});
formatter.result({
  "duration": 3937158300,
  "status": "passed"
});
formatter.match({
  "location": "OHRMDataTableWithOutHeader.you_should_see_the_home_page()"
});
formatter.result({
  "duration": 1631458780,
  "status": "passed"
});
formatter.after({
  "duration": 108048,
  "status": "passed"
});
formatter.uri("OpenGoogle.feature");
formatter.feature({
  "line": 2,
  "name": "This is to test Google search",
  "description": "",
  "id": "this-is-to-test-google-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WebTC"
    }
  ]
});
formatter.before({
  "duration": 450414995,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Google Search scenario",
  "description": "",
  "id": "this-is-to-test-google-search;google-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is entering google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is typing the search term \"Dumbo\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enters the return key",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user shoulld see the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenGoogleDefinitions.user_is_entering_google_com()"
});
formatter.result({
  "duration": 3342936660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dumbo",
      "offset": 32
    }
  ],
  "location": "OpenGoogleDefinitions.user_is_typing_the_search_term(String)"
});
formatter.result({
  "duration": 102133380,
  "status": "passed"
});
formatter.match({
  "location": "OpenGoogleDefinitions.enters_the_return_key()"
});
formatter.result({
  "duration": 1950583916,
  "status": "passed"
});
formatter.match({
  "location": "OpenGoogleDefinitions.the_user_shoulld_see_the_search_results()"
});
formatter.result({
  "duration": 392337131,
  "status": "passed"
});
formatter.after({
  "duration": 54450,
  "status": "passed"
});
formatter.uri("OrangeHRM.feature");
formatter.feature({
  "line": 2,
  "name": "This is the Login feature for Orange HRM",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WebTC"
    }
  ]
});
formatter.before({
  "duration": 496373734,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "A valid user should be able to login Orange HRM",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;a-valid-user-should-be-able-to-login-orange-hrm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the login page of Orange HRM is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters the valid userName and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should be navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMLogin.the_login_page_of_Orange_HRM_is_launched()"
});
formatter.result({
  "duration": 4484934737,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMLogin.the_user_enters_the_valid_userName_and_Password()"
});
formatter.result({
  "duration": 241387340,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMLogin.clicks_the_login_button()"
});
formatter.result({
  "duration": 4050066835,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMLogin.the_user_should_be_navigated_to_home_page()"
});
formatter.result({
  "duration": 208018453,
  "status": "passed"
});
formatter.after({
  "duration": 205689,
  "status": "passed"
});
});
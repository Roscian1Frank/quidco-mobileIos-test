$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LogIn.feature");
formatter.feature({
  "line": 1,
  "name": "Create user and login in to Quidco app",
  "description": "",
  "id": "create-user-and-login-in-to-quidco-app",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20833261022,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create a user account",
  "description": "",
  "id": "create-user-and-login-in-to-quidco-app;create-a-user-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@joinUs"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Join Us\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "As a user I am filling the registration form",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I check user is logged in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.launchTheApp()"
});
formatter.result({
  "duration": 908572607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Join Us",
      "offset": 12
    }
  ],
  "location": "Login_steps.iClickOn(String)"
});
formatter.result({
  "duration": 740175209,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.asAUserIAmFillingTheRegistrationForm()"
});
formatter.result({
  "duration": 8006258119,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.iCheckUserIsLoggedInTheApp()"
});
formatter.result({
  "duration": 15043730737,
  "status": "passed"
});
formatter.after({
  "duration": 373740798,
  "status": "passed"
});
formatter.before({
  "duration": 20557737743,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login as a existing user",
  "description": "",
  "id": "create-user-and-login-in-to-quidco-app;login-as-a-existing-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on \"Sign In\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Log in as existing user",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I check user is logged in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.launchTheApp()"
});
formatter.result({
  "duration": 695128419,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign In",
      "offset": 12
    }
  ],
  "location": "Login_steps.iClickOn(String)"
});
formatter.result({
  "duration": 702060702,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.logInAsExistingUser()"
});
formatter.result({
  "duration": 16637879683,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.iCheckUserIsLoggedInTheApp()"
});
formatter.result({
  "duration": 2372126329,
  "status": "passed"
});
formatter.after({
  "duration": 364892697,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn.feature");
formatter.feature({
  "line": 2,
  "name": "Create user and login in to Quidco app",
  "description": "",
  "id": "create-user-and-login-in-to-quidco-app",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginPage"
    }
  ]
});
formatter.before({
  "duration": 28738450516,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Create a user account",
  "description": "",
  "id": "create-user-and-login-in-to-quidco-app;create-a-user-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@joinUs"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Join Us\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "As a user I am filling the registration form",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I check user is logged in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.launchTheApp()"
});
formatter.result({
  "duration": 1846727036,
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
  "duration": 757274488,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.asAUserIAmFillingTheRegistrationForm()"
});
formatter.result({
  "duration": 9781654846,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.iCheckUserIsLoggedInTheApp()"
});
formatter.result({
  "duration": 2927294122,
  "status": "passed"
});
formatter.after({
  "duration": 602242641,
  "status": "passed"
});
formatter.before({
  "duration": 27614283030,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login as a existing user",
  "description": "",
  "id": "create-user-and-login-in-to-quidco-app;login-as-a-existing-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "launch the app",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on \"Sign In\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Log in as existing user",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I check user is logged in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.launchTheApp()"
});
formatter.result({
  "duration": 1035604126,
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
  "duration": 713642296,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.logInAsExistingUser()"
});
formatter.result({
  "duration": 13598756556,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.iCheckUserIsLoggedInTheApp()"
});
formatter.result({
  "duration": 3652122652,
  "status": "passed"
});
formatter.after({
  "duration": 606643580,
  "status": "passed"
});
});
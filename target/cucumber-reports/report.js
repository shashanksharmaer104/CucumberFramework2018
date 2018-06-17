$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Test login feature",
  "description": "",
  "id": "test-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4939327597,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify that user is able to login with valid username and password",
  "description": "",
  "id": "test-login-feature;verify-that-user-is-able-to-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on TalentCentral Admin",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enteres \"automation.admin@shl.com\" as username and \"Shlonline@123\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminLoginPage.openTCAdmin()"
});
formatter.result({
  "duration": 6847411397,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation.admin@shl.com",
      "offset": 14
    },
    {
      "val": "Shlonline@123",
      "offset": 57
    }
  ],
  "location": "AdminLoginPage.enterUsernamePassword(String,String)"
});
formatter.result({
  "duration": 234217792,
  "status": "passed"
});
formatter.match({
  "location": "AdminLoginPage.clickSubmitButton()"
});
formatter.result({
  "duration": 1380681864,
  "status": "passed"
});
formatter.match({
  "location": "AdminLoginPage.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 8441211,
  "status": "passed"
});
formatter.after({
  "duration": 647386662,
  "status": "passed"
});
});
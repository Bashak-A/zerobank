$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  Only authorized users should be able to login to the application.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as authorized user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@valid_credential"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "account summary page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.account_summary_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
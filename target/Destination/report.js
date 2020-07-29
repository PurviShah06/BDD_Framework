$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/Register_Page.feature");
formatter.feature({
  "line": 1,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9120945000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should able to register successfully so that user can use all user functionality",
  "description": "on my application.",
  "id": "registration-feature;user-should-able-to-register-successfully-so-that-user-can-use-all-user-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@trail"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is already on HomePage.",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters all required registration Details.",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on register Complete button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.user_is_already_on_HomePage()"
});
formatter.result({
  "duration": 132728100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 586916200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_enters_all_required_registration_Details()"
});
formatter.result({
  "duration": 10262172300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_clicks_on_register_Complete_button()"
});
formatter.result({
  "duration": 1617036200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 91456400,
  "status": "passed"
});
formatter.after({
  "duration": 75513000,
  "status": "passed"
});
});
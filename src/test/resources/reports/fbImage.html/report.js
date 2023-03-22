$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/loginPage.feature");
formatter.feature({
  "name": "Validating Facebook Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on FB page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "FB page Title validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User print title",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_print_title()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on FB page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "FB page URL validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User print URL",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_print_url()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});
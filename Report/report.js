$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/TaggedHooksDemo.feature");
formatter.feature({
  "name": "eBay HomePage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for input",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@link"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on  HomePgae",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.TaggedHooksdemo.user_is_on_HomePgae()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.TaggedHooksdemo.user_click_on_the_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to new page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TaggedHooksdemo.navigate_to_new_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
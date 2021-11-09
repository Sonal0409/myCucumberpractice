$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/EbayHomePage.feature");
formatter.feature({
  "name": "Ebay HomePage Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Home Page links",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test7"
    }
  ]
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I Click on a \u0027\u003clink\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I validate the page navigated to \u0027\u003curl\u003e\u0027 and title contains \u0027\u003ctitle\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "link",
        "url",
        "title"
      ]
    },
    {
      "cells": [
        "Fashion",
        "https://www.ebay.com/b/Fashion/bn_7000259856",
        "Fashion"
      ]
    },
    {
      "cells": [
        "Sports",
        "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031",
        "Sporting"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Home Page links",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test7"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayHomePage.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on a \u0027Fashion\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHomePage.i_Click_on_a(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the page navigated to \u0027https://www.ebay.com/b/Fashion/bn_7000259856\u0027 and title contains \u0027Fashion\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHomePage.i_validate_the_page_navigated_to_and_title_contains(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Home Page links",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test7"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayHomePage.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on a \u0027Sports\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHomePage.i_Click_on_a(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the page navigated to \u0027https://www.ebay.com/b/Sporting-Goods/888/bn_1865031\u0027 and title contains \u0027Sporting\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHomePage.i_validate_the_page_navigated_to_and_title_contains(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
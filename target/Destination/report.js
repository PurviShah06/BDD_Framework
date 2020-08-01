$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/Category_Page.feature");
formatter.feature({
  "line": 1,
  "name": "Category Scenario",
  "description": "",
  "id": "category-scenario",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user should able to navigate to correct category page so that she can use all product featurs from categories",
  "description": "",
  "id": "category-scenario;user-should-able-to-navigate-to-correct-category-page-so-that-she-can-use-all-product-featurs-from-categories",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is already on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on \"\u003ccategory\u003e\" link from homePage.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should able to navigate to \"\u003crelevant category page\u003e\" successfully.",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "category-scenario;user-should-able-to-navigate-to-correct-category-page-so-that-she-can-use-all-product-featurs-from-categories;",
  "rows": [
    {
      "cells": [
        "category",
        "relevant category page"
      ],
      "line": 10,
      "id": "category-scenario;user-should-able-to-navigate-to-correct-category-page-so-that-she-can-use-all-product-featurs-from-categories;;1"
    },
    {
      "cells": [
        "Computers",
        "https://demo.nopcommerce.com/computers"
      ],
      "line": 11,
      "id": "category-scenario;user-should-able-to-navigate-to-correct-category-page-so-that-she-can-use-all-product-featurs-from-categories;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7069070800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "user should able to navigate to correct category page so that she can use all product featurs from categories",
  "description": "",
  "id": "category-scenario;user-should-able-to-navigate-to-correct-category-page-so-that-she-can-use-all-product-featurs-from-categories;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is already on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on \"Computers\" link from homePage.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/computers\" successfully.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.userIsAlreadyOnHomePage()"
});
formatter.result({
  "duration": 151733200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 15
    }
  ],
  "location": "MyStepDef.userClickOnLinkFromHomePage(String)"
});
formatter.result({
  "duration": 644627000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://demo.nopcommerce.com/computers",
      "offset": 33
    }
  ],
  "location": "MyStepDef.userShouldAbleToNavigateToSuccessfully(String)"
});
formatter.result({
  "duration": 6042800,
  "status": "passed"
});
formatter.after({
  "duration": 74239600,
  "status": "passed"
});
});
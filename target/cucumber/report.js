$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/BDDCucumber/BDDCucumberDemo/Example.feature");
formatter.feature({
  "line": 1,
  "name": "Google Page",
  "description": "",
  "id": "google-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7819672201,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Launch google Page",
  "description": "",
  "id": "google-page;launch-google-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Google Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter search key",
  "rows": [
    {
      "cells": [
        "searchkey"
      ],
      "line": 6
    },
    {
      "cells": [
        "Cheese!"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Page title should be \"Cheese! - Google Search\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.browseGoogleDotCom()"
});
formatter.result({
  "duration": 3768528430,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.searchFor(DataTable)"
});
formatter.result({
  "duration": 210512789,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cheese! - Google Search",
      "offset": 22
    }
  ],
  "location": "StepDef.checkGooglePageTitle(String)"
});
formatter.result({
  "duration": 536353828,
  "status": "passed"
});
formatter.after({
  "duration": 857352337,
  "status": "passed"
});
});
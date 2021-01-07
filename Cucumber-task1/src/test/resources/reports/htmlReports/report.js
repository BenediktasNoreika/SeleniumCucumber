$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/demo.features");
formatter.feature({
  "line": 1,
  "name": "Create user and log in on theDemoSite",
  "description": "",
  "id": "create-user-and-log-in-on-thedemosite",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "",
  "description": "",
  "id": "create-user-and-log-in-on-thedemosite;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I add new user to the site \u003cadd user\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the site will display new user \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "create-user-and-log-in-on-thedemosite;;",
  "rows": [
    {
      "cells": [
        "USER",
        "PASSWORD"
      ],
      "line": 11,
      "id": "create-user-and-log-in-on-thedemosite;;;1"
    },
    {
      "cells": [
        "guest",
        "password"
      ],
      "line": 12,
      "id": "create-user-and-log-in-on-thedemosite;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I can open the demo site",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "create-user-and-log-in-on-thedemosite;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I add new user to the site \u003cadd user\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the site will display new user \u003cresult\u003e",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
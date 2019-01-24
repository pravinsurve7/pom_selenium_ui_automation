$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Bank.feature");
formatter.feature({
  "line": 2,
  "name": "Feature to test Bank\u0027s functionality",
  "description": "",
  "id": "feature-to-test-bank\u0027s-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@bank"
    }
  ]
});
formatter.scenarioOutline({
  "line": 23,
  "name": "To create customer \u003cID\u003e",
  "description": "",
  "id": "feature-to-test-bank\u0027s-functionality;to-create-customer-\u003cid\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@smoke"
    },
    {
      "line": 22,
      "name": "@customer"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I read data from excel \u003cID\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "url is loaded",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I login",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should see on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I create new customer",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I should get customerId",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I logout",
  "keyword": "And "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "",
  "id": "feature-to-test-bank\u0027s-functionality;to-create-customer-\u003cid\u003e;",
  "rows": [
    {
      "cells": [
        "ID"
      ],
      "line": 33,
      "id": "feature-to-test-bank\u0027s-functionality;to-create-customer-\u003cid\u003e;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 34,
      "id": "feature-to-test-bank\u0027s-functionality;to-create-customer-\u003cid\u003e;;2"
    },
    {
      "cells": [
        "2"
      ],
      "line": 35,
      "id": "feature-to-test-bank\u0027s-functionality;to-create-customer-\u003cid\u003e;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 285725,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "To create customer 1",
  "description": "",
  "id": "feature-to-test-bank\u0027s-functionality;to-create-customer-\u003cid\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@smoke"
    },
    {
      "line": 22,
      "name": "@customer"
    },
    {
      "line": 1,
      "name": "@bank"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I read data from excel 1",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "url is loaded",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I login",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should see on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I create new customer",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I should get customerId",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 23
    }
  ],
  "location": "BankStepDefinition.read_data_from_excel(String)"
});
formatter.result({
  "duration": 811229324,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.url_is_loaded()"
});
formatter.result({
  "duration": 10597756976,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_login()"
});
formatter.result({
  "duration": 4291751577,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_should_see_on_home_page()"
});
formatter.result({
  "duration": 53254885,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_create_new_customer()"
});
formatter.write("Customer details : abc, abc@abc.com");
formatter.result({
  "duration": 16671894423,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_should_get_customerID()"
});
formatter.write("Customer Id : 123456");
formatter.result({
  "duration": 3897109,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_logout()"
});
formatter.result({
  "duration": 3583012576,
  "status": "passed"
});
formatter.after({
  "duration": 2124456261,
  "status": "passed"
});
formatter.before({
  "duration": 44336,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "To create customer 2",
  "description": "",
  "id": "feature-to-test-bank\u0027s-functionality;to-create-customer-\u003cid\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@smoke"
    },
    {
      "line": 22,
      "name": "@customer"
    },
    {
      "line": 1,
      "name": "@bank"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I read data from excel 2",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "url is loaded",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I login",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should see on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I create new customer",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I should get customerId",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 23
    }
  ],
  "location": "BankStepDefinition.read_data_from_excel(String)"
});
formatter.result({
  "duration": 55184350,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.url_is_loaded()"
});
formatter.result({
  "duration": 12385447233,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_login()"
});
formatter.result({
  "duration": 3593762572,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_should_see_on_home_page()"
});
formatter.result({
  "duration": 64774204,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_create_new_customer()"
});
formatter.write("Customer details : bcd, abc@abc.com");
formatter.result({
  "duration": 5703181319,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_should_get_customerID()"
});
formatter.write("Customer Id : 123456");
formatter.result({
  "duration": 329651,
  "status": "passed"
});
formatter.match({
  "location": "BankStepDefinition.i_logout()"
});
formatter.result({
  "duration": 3262459830,
  "status": "passed"
});
formatter.after({
  "duration": 1923635458,
  "status": "passed"
});
});
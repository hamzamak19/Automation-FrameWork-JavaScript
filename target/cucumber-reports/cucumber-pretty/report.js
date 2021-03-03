$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "",
  "id": "register",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User Should be Able To Register on to site.",
  "description": "",
  "id": "register;user-should-be-able-to-register-on-to-site.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@nazoor"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "URL Should Open Successfully.",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify User is on Home Screen.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Click On Register Button.",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be ble to Enter First name \"Nazoor\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should be ble to Enter Last name \"Ahmed\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should be ble to Enter Email \"nazoorahmed@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be ble to Enter Phone \"03359985988\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be ble to Enter Company \"Nisum\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should be ble to Enter Address \"nisum building 3rd Floor\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should be ble to Enter Address2 \"nisum building 3rd Floor\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should be ble to Enter City \"Karachi\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should be ble to Enter State \"Pakistan\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User should be ble to Enter PostalCode \"75850\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User should be ble to click Country Drop Down.",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User should be ble to Enter Mobile Number \"03348524846\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User should be ble to Enter Password \"123456789\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User should be ble to Enter Confirm Password \"123456789\"",
  "keyword": "When "
});
formatter.match({
  "location": "Register.OpenURL()"
});
formatter.result({
  "duration": 12955333200,
  "status": "passed"
});
formatter.match({
  "location": "Register.VerifyHomeScreen()"
});
formatter.result({
  "duration": 131770700,
  "status": "passed"
});
formatter.match({
  "location": "Register.ClickRegisterBtn()"
});
formatter.result({
  "duration": 2122770100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nazoor",
      "offset": 40
    }
  ],
  "location": "Register.EnterFirstName(String)"
});
formatter.result({
  "duration": 83789400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ahmed",
      "offset": 39
    }
  ],
  "location": "Register.EnterLastName(String)"
});
formatter.result({
  "duration": 82492800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nazoorahmed@gmail.com",
      "offset": 35
    }
  ],
  "location": "Register.EnterEmail(String)"
});
formatter.result({
  "duration": 108498700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "03359985988",
      "offset": 35
    }
  ],
  "location": "Register.EnterPhone(String)"
});
formatter.result({
  "duration": 97252300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nisum",
      "offset": 37
    }
  ],
  "location": "Register.EnterCompany(String)"
});
formatter.result({
  "duration": 103871600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nisum building 3rd Floor",
      "offset": 37
    }
  ],
  "location": "Register.EnterAddress(String)"
});
formatter.result({
  "duration": 124831700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nisum building 3rd Floor",
      "offset": 38
    }
  ],
  "location": "Register.EnterAddress2(String)"
});
formatter.result({
  "duration": 102593400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karachi",
      "offset": 34
    }
  ],
  "location": "Register.EnterCity(String)"
});
formatter.result({
  "duration": 80630900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pakistan",
      "offset": 35
    }
  ],
  "location": "Register.EnterState(String)"
});
formatter.result({
  "duration": 95075800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "75850",
      "offset": 40
    }
  ],
  "location": "Register.EnterPostalCode(String)"
});
formatter.result({
  "duration": 79594400,
  "status": "passed"
});
formatter.match({
  "location": "Register.CickCountryDropDown()"
});
formatter.result({
  "duration": 98954300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "03348524846",
      "offset": 43
    }
  ],
  "location": "Register.EnterNumber(String)"
});
formatter.result({
  "duration": 244320900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 38
    }
  ],
  "location": "Register.EnterPassword(String)"
});
formatter.result({
  "duration": 95749000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 46
    }
  ],
  "location": "Register.EnterConfirmPassword(String)"
});
formatter.result({
  "duration": 120433700,
  "status": "passed"
});
});
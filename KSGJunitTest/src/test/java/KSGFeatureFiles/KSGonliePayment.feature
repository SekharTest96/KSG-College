#Author: sunkuramanasekhar@btsinfotech.com
Feature: KSG Online Payment Module

  Scenario: Validation of online payment with Valid Data
    Given Website launched with the URL
    Then navigated to Online Payment and clicked on it
    Then Entered Valid details and clicked on pay
    And Entered valiid card details

  Scenario: Validation of online payment with Invalid Data
    Then navigated to Online Payment and clicked on it
    Then Entered Invalid details and clicked on pay
    And Entered Invaliid card details

  Scenario: Validation of online payment with no Data
    Then navigated to Online Payment and clicked on it
    Then Entered no details and clicked on pay
    And Entered no card details

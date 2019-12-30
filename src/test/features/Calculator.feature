Feature: To Automate the Calculator flow using Appium

  @calculator
  Scenario: Calculator Appium Automation

    Given When the app connection is configured
    When User opens the Calculator App and enters the digits for Addition
    Then Calculator produces the result


  @cal-op
  Scenario: Addition of 2 digit numbers

    Given When the app connection is configured
    When User opens the Calculator App and enters first set of number
      | 123 |
    Then Enter the required operation
      | mul |
    And  Enters second set of number
      | 234 |
    Then Calculator produces the result


Feature: To Automate the Calculator flow using Appium

  @calculator
  Scenario: Calculator Appium Automation

    Given When the app connection is configured
    When User opens the Calculator App and enters the digits for Addition
    Then Calculator produces the result


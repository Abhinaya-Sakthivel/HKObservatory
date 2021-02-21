@testing

Feature: Nine days weather forecast

Scenario: To check 9 Day weather forecast is displayed
  Given user launch the app
  When user agree the Terms and conditions
  When user click on the side menu
  And selects nine Day weather forecast
  Then nine Day weather forecast should be displayed
  And screenshot will be captured if any test case failed

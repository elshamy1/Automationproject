@regression

Feature: user should be able to follow us
  Background: user navigate to section
    Given user navigate to follow us icons


  Scenario: user follow us facebook
    When user click in facebook icon
    Then the facebook top open in new page

  Scenario: user follow us twitter
    When user click in twitter icon
    Then the twitter top open in new page

  Scenario: user follow us rss
    When user click in rss icon
    Then the rss top open in new page

  Scenario: user follow us youtube
    When user click in youtube icon
    Then the youtube top open in new page



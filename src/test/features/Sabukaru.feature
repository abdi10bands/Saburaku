Feature:  Test Sabukaru Website

  Scenario: Home Page
    Given I am on the sabukaru.com page
    When I click on Articles
    Then I should find myself in the sabukaru articles Page

    Scenario: Verify Manga/Anime tab
      Given I am on the above page
      When I click on Manga/Anime on the menu tab
      Then I should be in a new Manga/Anime page


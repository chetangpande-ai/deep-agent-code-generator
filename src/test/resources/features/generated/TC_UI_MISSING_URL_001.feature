@TC_UI_MISSING_URL_001
Feature: Search product by name

  Scenario: Search product by name
    Given Open product search.
    Then Search page is visible.
    When Search for laptop.
    Then Laptop results are displayed.
    When Open the first result.
    Then Product detail page is displayed.

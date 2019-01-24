@bank
Feature: Feature to test Bank's functionality

  @smoke @login
  Scenario Outline: To verify Login functionality with valid credetials
    Given url is loaded
    When I login using valid <username> and <password>
    Then I should see on home page
    And I logout

    Examples: 
      | username   | password |
      | mngr150997 | mudEzan  |

  @smoke @login
  Scenario: To verify Login functionality with valid credetials[from properties file]
    Given url is loaded
    When I login
    Then I should see on home page
    And I logout

  @smoke @customer
  Scenario Outline: To create customer <ID>
    Given I read data from excel <ID>
    And url is loaded
    When I login
    Then I should see on home page
    When I create new customer
    Then I should get customerId
    And I logout

    Examples: 
      | ID |
      |  1 |
      |  2 |

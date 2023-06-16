
Feature: To login with valid and invalid credentials  

  @tag2
 Scenario Outline: To login with valid and invalid credentials 
    Given Click on login1
    When Enter username1 as "<username>"
    And Enter password1 as "<password>"
    Then Click on Login1

   
   
    Examples: 
      | username                | password          	| 
      | sa888@gmail.com         |     krishhhhzzzzz   | 
      | a123@gmail.com          |     bbbbv         	| 

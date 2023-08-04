Feature: AppTest
  @login
  Scenario Outline: user login
    Given app apk is there
    When user enters '<username>'and '<passWord>'
    Then user will navigate to home screen

    Examples:
      | username | passWord|
      | company  |company  |

  @MakePayment
  Scenario Outline: Making payment
    Given Click on make payment
    When Input Phone '<number>'
    And Input Receiver '<name>'
    And Input '<Amount>'
    And Select '<Country>'
    Then Send Payment

    Examples:
      |number|name|Amount|Country|
      |12345 |Kanon|01   |USA    |

  @MortgageRequest
  Scenario Outline: Mortgage Request
    Given Click on Mortgage
    When Enter '<FirstName>' and '<LastName>'
    And Enter '<Age>'
    And Enter '<Addresses>' with '<Addressess>'
    And Selections '<Countries>' and go next
    And Type of loan and years and Occupations and MonthlyIncome
    Then Click Save

    Examples:
      |FirstName |LastName|Age|Addresses|Addressess|Countries|
      |Tasnim    |Hasan   |30 |Banani   |Dhaka     |Bangladesh|

  @ExpenseReport
    Scenario: Report
    Given Click on Expense Report

    When Add report abd Back
    Then Logout



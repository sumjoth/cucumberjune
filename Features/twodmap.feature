Feature: To add customer

  @tag1
  Scenario: To add customer
    Given The user should be in telecom homepage
    When The user provide valid details
      | fname   | lname    | mail            | address  | phone        |
      | ganesh  | js       | gggg@gmail.com  | chennai  |  96564613646 |
      | aravind | kumar    | aks@gmail.com   | trichy   |    785223233 |
      | dinesh  | kumar    | deena@gmail.com | naamakal |     82546611 |
      | vignesh | murugesh | puli@gmail.com  | erode    | 444556553322 |
    Then The user should generate customer ID

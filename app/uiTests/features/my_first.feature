Feature: Welcome feature

  @WP_welcome
  Scenario: As a valid user I can log into my app

  Given my app is running
  Then I press view with id "bt_welcome"
  
  Then I wait

  Then I press view with id "tv_welcome"

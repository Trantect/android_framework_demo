#create by lemons
#easy to use
require 'calabash-android/calabash_steps'
require 'calabash-android/operations'


When (/^I enter username "([^\"]*)" and password "([^\"]*)" on login page$/) do |username,password|
  steps %{
      Then I enter "#{username}" into input field number 1
      Then I enter "#{password}" into input field number 2
      Then I wait for 2 seconds
  }
end



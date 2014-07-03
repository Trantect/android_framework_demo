require 'calabash-android/calabash_steps'
require 'calabash-android/operations'


When (/^I enter username "([^\"]*)" and verifycode "([^\"]*)" on register page$/) do |username,verifycode|
  steps %{
      Then I enter "#{username}" into input field number 1
      Then I enter "#{verifycode}" into input field number 2
      Then I wait for 1 seconds
  }
end


Then(/^I press view with id "(.*?)" number (\d+)$/) do |arg1, arg2|
   performAction('press_list_item',arg1,arg2)
end

# Then(/^I clear field number (\d+)$/) do |arg1|
#    step %{
#     Then I clear filed number #{arg1}
#   }
# end

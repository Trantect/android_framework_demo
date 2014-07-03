require 'calabash-android/calabash_steps'

Then /^I clear app data$/ do
	clear_app_data
end

Then /^I close app$/ do
	shutdown_test_server
end

Then /^I wait for the translated "([^\"]*)" to appear$/ do |l10nkey|
  performAction('wait_for_l10n_element', l10nkey)
end

Then /^I press text of translated "([^\"]*)"$/ do |l10nkey|
  performAction('press_l10n_element', l10nkey)
end

Then /^I press button of translated "([^\"]*)"$/ do |l10key|
  performAction('press_l10n_element', l10key,'button')
end

Then /^I press menu item of translated "([^\"]*)"$/ do |l10key|
  performAction('press_l10n_element', l10key,'menu_item')
end

Then /^I press toggle button of translated "([^\"]*)"$/ do |l10key|
  performAction('press_l10n_element', l10key,'toggle_button')
end

Then /^I set mypreferences$/ do
   set_preferences("com.singuloid.workphone_preferences", {:"PnServerUrlDebug" => "http://tapi.wcloud-server.com",:"PnPushServerUrlDebug" => "ws://tpushs.wcloud-server.com/ws/",:"EpServerUrlDebug" => "http://tqs.wcloud-server.com",:"PnDownloadServerUrlDebug" => "http://tmy.wcloud-server.com/download"})
end

Then /^I set SharedPreferences with "([^\"]*)"$/ do |configValue|
	set_preferences("com.xthinkers.workphone_preferences", {:config => configValue})
end

Then /^I set ServerUrl with "([^\"]*)" and "([^\"]*)"$/ do |api_url,push_server_url|
	set_preferences("com.xthinkers.workphone_preferences", {:API_URL => api_url,:PUSH_SERVER_URL => push_server_url})
end

Then /^I scroll down until I see the "([^\"]*)" text$/ do |text|
  q = query("TextView text:'#{text}'")
  while q.empty?
    performAction('scroll_down')
    q = query("TextView text:'#{text}'")
  end
end

Then /^I scroll up until I see the "([^\"]*)" text$/ do |text|
  q = query("TextView text:'#{text}'")
  while q.empty?
    performAction('scroll_up')
    q = query("TextView text:'#{text}'")
  end
end


Then /^I should see of translated "([^\"]*)"$/ do |l10key|
   performAction('assert_text', l10key, true)
end



Then /^Ready for user account$/ do
   res = system('../ready_for_account.py')
   puts res
end




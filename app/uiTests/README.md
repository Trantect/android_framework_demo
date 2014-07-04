
Calabash
==========
--------------------------------------------------------------------------
##INSTALLATION

Refer to https://github.com/calabash/calabash-android/tree/master/documentation/installation.md

Set ANDROID_HOME to environment classpath.  

	sudo apt-get install ruby1.9.1-dev	 
	sudo gem1.9.1 install cucumber
	sudo gem1.9.1 install calabash-android

NOTE: if only 1.9.1 is installed, you can download them by gem directly.

--------------------------------------------------------------------------
##RUNNING

To run all tests  

	calabash-android run ../build/outputs/apk/app-debug.apk

To run some specified tests,  

	calabash-android run ../build/outputs/apk/app-debug.apk features/my_first.feature  
   
To run with certian tag:  

	calabash-android run ../build/outputs/apk/app-debug.apk features/my_first.feature --tag @xxx  

--------------------------------------------------------------------------
##HOW-TO WRITE TESTING SCRIPT

###[Calabash Android comes with predefined steps.](https://github.com/calabash/calabash-android/tree/master/ruby-gem/lib/calabash-android/canned_steps.md)
###[Ruby API](https://github.com/calabash/calabash-android/blob/master/documentation/ruby_api.md)
###User-defined:[./features/step_definitions/utilities.rb](./features/step_definitions/utilities.rb)(You can modify this file)


--------------------------------------------------------------------------
##CONTINOUS INTEGRATION

For integration in Jenkins, please search “cucumber-reports” plugin.


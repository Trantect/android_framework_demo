android_framework_demo
===================================

Setup
-----------------------------------

### 1. Git
- 1.2. Installation: <code>sudo apt-get install git</code> for Linux/Ubuntu
- 1.3. Configuration:<br />

1.3.1. Change your identity

    	git config --global user.name [username]
		git config --global user.email [email]

1.3.2. Change your diff tool

		git config --global merge.tool [toolname]
Note: Git accepts kdiff3, tkdiff, meld, xxdiff, emerge, vimdiff, gvimdiff, ecmerge, opendiff and others as merge tools.

1.3.3. There are 3 levels of configuration for git:<br />

1.3.3.1. system level: config is in <code>/etc/gitconfig</code>; use <code>-- system</code> parameters to set<br />
1.3.3.2. user level: config is in <code>/home/[username]/.gitconfig</code>; use <code>-- global</code> parameters to set<br />
1.3.3.3. project level: config is in <code>[project dir]/.git/config</code><br />
Note: the priority of configurations is 3 > 2 > 1.

1.3.4. We could also edit config file like below (the mergetool in example is [DiffMerge](http://www.sourcegear.com/diffmerge/))

		[user]
			name = [username]
			email = [email]
		[diff]
			tool = diffmerge
		[difftool "diffmerge"]
			cmd = diffmerge \"$LOCAL\" \"$REMOTE\"
		[merge]
			tool = diffmerge
		[mergetool "diffmerge"]
			cmd = "diffmerge --merge --result=\"$MERGED\" \"$LOCAL\" \"$(if test -f \"$BASE\"; then echo \"$BASE\"; else echo \"$LOCAL\"; fi)\" \"$REMOTE\""
			trustExitCode = true
		[color]
			ui = true

- 1.4. Customize ignored files and folders in git<br />
Please refer to the <code>.gitignore</code> file in this repo.

- 1.5. Add your computer's SSH keys to GitHub (All git operations to interact with Github do NOT require name/password any more)<br />
Note: You can clone repos in Github with HTTPS, SHH or Subversion. However, we prefer SSH. Please refer to this [link](https://help.github.com/articles/generating-ssh-keys).<br />
1.5.1. Generate your local ssh keys <code>ssh-keygen -t rsa</code> in command line. Use default settings.<br />
1.5.2. Private and public key files (<code>id_rsa</code> and <code>id_rsa.pub</code>) locate in folder <code>/home/[username]/.ssh/</code><br />
1.5.3. Login your Github account -> Account settings -> SSH keys -> Add SSH key<br />
1.5.4. Input the title of SSH key (like your PC's name); Copy the content of <code>/home/[username]/.ssh/id_rsa.pub</code> and paste it in Github

Build
-----------------------------------
We use gradle to build project:

- use terminal and change current directory to WorkPhone root directory
- run command<code>./gradlew clean</code> to clean project
- run command<code>./gradlew assemble</code> to assemble debug and release builds
- run command<code>./gradlew assembleDebug</code> to assemble debug build
- run command<code>./gradlew assembleRelease</code> to assemble release build
- Then you can see apk files in folder <code>./build/outputs/apk/</code>

Tests
-----------------------------------
### Unit Tests

### Integration Tests

### UI Tests

Code Coverage
-----------------------------------
Since gradle 10.0.+, the code coverage feature of Jacoco is integrated with gradle build tool. Please refer to build.gradle file for config details.
- run command <code>./gradlew clean connectedCheck</code> to run Android tests and code coverage.
- The reports locate in <code>app/build/outputs/reports</code>

Dependencies
-----------------------------------
We use some third-party libraries:


Thanks to
-----------------------------------
- [guoyunsky](https://github.com/guoyunsky) for his [演示Markdown的各种语法](https://github.com/guoyunsky/Markdown-Chinese-Demo)
# Bank-Management-System
The Bank app is a console-based application that simulates banking operations. A customer can apply for an account, view their balance, and make withdrawals and deposits. An employee can approve or deny accounts and view account balances for their customers.
#Technologies used:

JAVA
JDBC
JUnit4
Git
Log4J


#Features
Admin can Login,Deposit, Withdraw amount.
Employee can Login, Rvivew.
Customer can raise a ticket if he has a issue.

To-Do list:

Should use JWT for User Authentication
Getting Started
Front-end part

install angular
npm install -g @angular/cli
Crate new Angular Application
ng new <application-name>
Create Components, Pipes, Modules, Guards, Routing based on requirement
ng generate component <component-name>
ng generate pipe <pipe-name>
ng generate module <module-name>
ng generate guard <your-guard-name>
Run angular application
ng serve --open
Back-end part

  
  
Installing STS
The easiest way to install STS is right from within Eclipse. Just select Help > Eclipse Marketplace… from the main menu and type “STS” in the search bar of the Eclipse Marketplace dialog.
Creating a New Project
STS includes its own starter project to get you started. It is accessible from the New Project Wizard. Navigate to File > New > Other…
Project Settingd
On the New Spring Starter Project dialog, you’ll have to choose a name for your project. Let’s call it “HelloWorld”. Select Maven as the build tool, and JAR packaging and your Java version. Assign a Group of “com.developer” for the package name. Artifact is the name of the JAR file you are going to build
Project Dependencies
In the New Spring Starter Project Dependencies window, use the search field and type “web” into it, we can choose the dependencies we want in out project
Push Project to Github

Initialize the local directory as a Git repository.
git init
Use git status to know the status of your application
git status
Add the files in your new local repository. This stages them for the first commit.
git add .
Commit the files that you've staged in your local repository.
git commit -m "First commit"
In the Command prompt, add the URL for the remote repository where your local repository will be pushed.
git remote add origin <REMOTE_URL>
git remote -verify
Switch between branches if required
git checkout -b <new_branch>
Push the changes in your local repository to GitHub.
git push origin <selected branch>
use git clone to clone your repository to local machine
git clone https://github.com/YOUR-USERNAME/Restaurant-Management
  
  
  
  
#Usage
open website and login based on role
Customer can login and add items to cart, customize the items added to cart, choose a payment mode, place the order.
Admin can login to his account, can (Add, Edit, Delete) Items, Chefs, Supervisors.
Chef can login to his account, Serve the orders placed.
Supervisor resolves the customer quaries.

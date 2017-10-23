# Syllabus Coverage App


Problem: Students follow several modules in the University and under a module there will be several topics to be covered within the semester. 

Since students dont have quantified data of how much of the total topics they have covered / studied, they cant properly prepare for year end exams.
The application helps students add the Level of university, the semester of that level, the modules in that semester and the topics in the module. 

At the beginning of the year, student can add the necessary information in the application and as they keep learning topics they can tick off the topics form the application.
So at any time, students have quantified data of how much of the total topics they have covered and what percentage they have to cover.


Architecture: For student to be able to access the data, the application will be hosted online. Thus it is recommended to have a standalone back end which stores and provides the data
 and a separate frontend client which gets the data from backend and views it to the student.
 
 
Since this is a big application the development is expected to be done in iterations (Following Agile Methodology),
each iteration resulting in a MVP. (Minimum Viable Product). First iteration will be easy to develop, and as you continue the project will become more exciting and challenging.
The idea is for you to start with the easy steps and keep working until you feel like its tough. Then you can evaluate yourself how much you can work. Dont worry we will be helping you out all the way till the end. :)


#### MVP 01 (Easy)

First you have to develop the backend which stores the data and provides as required. The challenge here is developing a java application which uses OOP concepts as necessary.

The concepts such as Module, Semester, Student, Topics have to be mapped as objects in the application.
Data can be persisted in binary files and required input can be received through console/terminal.

Required/Preferred Technology: Java

Keywords: Java, File Storage, OOP Concepts

Minimum features expected to be rolled out as MVP:
1) Signup of student to the app. Name, Email ID, password should be captured at registration.
2) login with email password combination
3) Ability to 3 years.
4) Ability to add 2 semesters under each year.
5) Ability to add up to 4 modules under a semester.
6) Ability to add unlimited amount of topics under a module.
7) Ability to assign and change state of topics as follows: Yet to cover -> Studying -> Covered
8) Ability to check the number of topics covered, Currently studying, yet to study at any time
9) Basic statistics like percentage of module covered, etc


#### MVP 02 (Medium)

Expose the backend data as APIs so that student can access it from anywhere in the world without the need of his personal computer.

Required/Preferred Technology: Java, Jersey, Tomcat

Keywords: Java, Micro services, REST services, Application Servers, APIs

(Details and wireframes to be added)


#### MVP 03 (Hard)

Build a client web application that consumes the APIs developed in MVP 02. 

Required/Preferred Technology: React, Bootstrap, Node, Webpack, Tomcat

(Details and wireframes to be added)



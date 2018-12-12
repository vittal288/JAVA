# JAVA INFORMATION 

### Java operator precedense 
[Operator Precedence](http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)

### Unicode Table 
[Unicode Table](https://unicode-table.com/en/#miscellaneous-technical)


### Method Overloading: 
+ It is feature allows us to create more than one method with same name, as long as we use different paramters
+ It improves code reusablity and readability 
+ It is easier to remember one method rather remembering multiple methods 
+ It is ability to call the same with different parameters 
+ Providing two or more separate methods in class with same name but different set of parameters 

### METHOD OVERRIDING (Runtime Polymorphism or Dynamic Method Dispatch)
+ Defining a same method with same signiture in child class as its parent class in inheritance 

[Difference Between Method Overloading and Overriding](ScreenShots/MethodOverLoadingOverriding.PNG)
### CONTINUE and BREAK
+ continue will skipe the below code of it and executes loops next iteration 
+ break will  exit from the loop, if condition is met

### CONSTRUCTOR 
+ Should not call any method inside the constructor 

## this and super keyword 
+ this is the keyword used to call the current class members and methods 
+ super is used to call the parent class members and methods 

### STATIC and INSTANCE methods 
#### STATIC METHODS:
+ Static methods are declared using statuc modifier 
+ Static methods cant access instance methods and instance variables directly 
+ In static methods we cant use the **this** keyword directly 
+ Whenever you see a method that **does not use instance variables** that method should be declared as static method 
+ For example **main** is static method and is called by **JVM** when it starts an application 
+ [For More Info](ScreenShots/Static-Method.PNG)
+ Static variables will share between the instances 

#### INSTANCE METHODS:
+ Instance methods belongs to an instance of a class 
+ Instance method can access static methods and static variables directly 

### COMPOSITION 

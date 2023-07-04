# STRINGS' NOTES
* String is the most commonly used class in java's class library.
* Everything that starts with a capital letter is a class.
* Every string you creates is actually an object of class String.
* String name = "Shruti Sharma" ; //here String is datatype, name is reference variable, and "Shruti Sharma" is object.
## 2 Concepts :
* 1. String Pool is a separate memory structure inside the heap.
 
     How it looks in memory ?
     ![image](https://github.com/ShrutiSharma-27/STRINGS/assets/53565103/b7e15d44-d84c-446a-b3ef-cfd6feaac7be)

     Example : String a = "Kunal"; String b = "Kunal";

     How it will save inside memory ?
     ![image](https://github.com/ShrutiSharma-27/STRINGS/assets/53565103/0fa64564-882c-4be1-ad8b-402cc747d7bc)

     Why String pool ? [Usecase]

     Because similar values of strings aren't recreated inside string pool and makes our program optimised

* 2. Immutability
     
     You can't modify string objects in java as they are immutable but you can create another object for the same desired reference variable. Strings are immutable for security reasons. As if an object is modified with the help of a particular reference variable then  

     Example :
     ![image](https://github.com/ShrutiSharma-27/STRINGS/assets/53565103/6b89f56c-27e3-4ea3-b311-2ec30521ec88)
     ![image](https://github.com/ShrutiSharma-27/STRINGS/assets/53565103/e9f9cca8-2b4e-480a-bd2d-bb14313e8c21)

     Now, what will happen to the object "Kunal" ?

     Answer is 'Garbage Collection'.

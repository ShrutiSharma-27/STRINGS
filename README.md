# STRINGS' NOTES
* String is the most commonly used class in java's class library.
* Everything that starts with a capital letter is a class.
* Every string you creates is actually an object of class String.
* String name = "Shruti Sharma" ; //here String is datatype, name is reference variable, and "Shruti Sharma" is object.
## 2 Concepts :
* 1. String Pool is a separate memory structure inside the heap.
 
How it looks in memory ?
![image](https://github.com/ShrutiSharma-27/STRINGS/assets/53565103/b7e15d44-d84c-446a-b3ef-cfd6feaac7be)

Example : String a = "Kunal";
          String b = "Kunal";

How it will save inside memory ?
![image](https://github.com/ShrutiSharma-27/STRINGS/assets/53565103/f1655b09-5a89-4e84-a671-e9e0951c0040)


Why String pool ? [Usecase]

Similar values of strings aren't recreated inside string pool.

* 2. Immutability 

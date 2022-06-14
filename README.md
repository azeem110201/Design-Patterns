# Singleton Design Pattern

The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
Sometimes we need to have only one instance of our class for example a single DB connection shared by multiple objects
as creating a separate DB connection for every object may be costly. Similarly, there can be a single configuration manager or error manager in an application that handles all problems instead of creating multiple managers.

Singleton DP can be created in 4 different ways:
- Lazy Instantiation: here we invoke getInstance() to create the single object of the class
- Eager Instantiation: here we directly assign singleton class to the instance variable of type SingletonClass
- By using synchronised keyword to make sure it's thread collision free. Basically it all the threads are executed in the critical section, so this help to process single thread at a time.
- Double Checked locking: by using volatile keyword for singleton instance variable so that it first check whether the object is created and then synchronise it

### Problem Description:

Create a whatsapp application demo using Singleton Design Pattern. Assume whatsapp only allows single point of contact rather than having multiple point of contacts.


### Sources:
    - From Head First Design Pattern book
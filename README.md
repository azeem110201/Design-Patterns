# Prototype Design Pattern

Copying each and every field from the object to another object is hectic task as it has to copy all the contents from its parent object, and sometimes
it's not possible to copy private variables. The Prototype pattern delegates the cloning process to the actual objects that are being cloned.
The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object without coupling your code to the class of that object.
Usually, such an interface contains just a single clone method.



### Problem Description:

Prototype Design Pattern for demonstration of cloning circle object in another circle object with the help of Shape abstract class and an abstract method clone() inside it.


### Sources:
    - https://refactoring.guru/design-patterns/prototype
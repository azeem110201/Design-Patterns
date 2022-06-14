# FlyWeight Design Pattern

Creating a object for a class whose implementation is huge is a hectic process. When more such objects are created, it will lead to memory
leak problems which may down grade the performance of the application. To avoid these hectics, we use FlyWeight DP.

In these DP, we create the object once and store it in some place (say hashmap), and when the client requests the object,
we check if it is there in the hashmap, and if it is present then we pass the reference of the object to the client. If not present, we create and store it in hashmap.

Also we don't need to create the object if only few of it's attributes are changing like the color of the vehicle etc. So we are basically creating a pool of similar objects.

### Problem Description:

Create a generalized vehicle interface, and implement that interface for class such as Cycle, Truck by only changing it's extrenic properties. Also show the demostration of object storage in hashmap.


### Sources:
    Video Tutorial:
    - https://www.youtube.com/watch?v=OUhIn3qp_yI
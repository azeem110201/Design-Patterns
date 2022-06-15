# Proxy Design Pattern

The Proxy pattern suggests that you create a new proxy class with the same interface as an original service object.
Then you update your app so that it passes the proxy object to all of the original object’s clients. Upon receiving a request from a client,
the proxy creates a real service object and delegates all the work to it.

There are different Proxy Types:
- Remote Proxy: In this we use RMI concept so that data between client and server can shared. As client and server both are in different env,
  we create a stub and this stub is passed to network and marshalling and unmarshalling can be done to process data.

- Virtual Proxy: Virtual Proxy acts as a representative for an object that may be expensive to create. The Virtual Proxy often defers the
  creation of the object until it is needed; the Virtual Proxy also acts as a surrogate for the object before and while it is being created. After that, the
  proxy delegates requests directly to the RealSubject.

- Java Proxy API: Java has it's own Proxy API in java.lang.reﬂect package. It has pre-defined methods and classes/interfaces. One of the interface is InvocationHandler which has invoke(),
  this method invoke the proxy based on the bussiness logic of the application.

### Problem Description:

Creating a proxy to check if then desktop user is authenticated to make any changes in the file directory or not using proxy DP


### Sources:
    - Head First Design Pattern
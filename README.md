# Strategy Design Pattern

In General software application, we create a base class A and extend it to other classes B,C..., but the main
drawback for these types of the programming style is that, if you don't need some methods from A into any of your derived class, then the method that is
inherited by that class is of no use. So we have create a more specific implementation of those methods/classes which a particular class or a
family of class uses it.

For ex: If a soldier class(Base class) have methods such as attack, reload, refill, repair..., then it is not necessary that
all these methods or actions will be used by it's derived class such as Spearmen, Gunmen, sniper or Robot Machine. So we create a interface of those methods which are not common
to the other soldiers and then based on the type of soldier, we call that interface methods.

### Problem Description:

Demonstration of working of Strategy DP with the above given example senario.


### Sources:
    Video:
    - https://www.youtube.com/watch?v=Nx8iUv-ZnPw
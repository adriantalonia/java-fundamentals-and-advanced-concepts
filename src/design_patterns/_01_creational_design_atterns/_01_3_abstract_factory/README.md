## Abstract Factory Pattern

Almost similar to Factory Pattern, except the fact that it’s more like factory of factories. If you are familiar with
factory design pattern in java, you will notice that we have a single Factory class that returns the different
sub-classes based on the input provided. Generally, factory class uses if-else or switch-case statement to achieve this.
However, in Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class and then
an Abstract Factory class that will return the sub-class, based on the input factory class.

In fact, An abstract factory is a factory that returns factories. Why is this layer of abstraction useful? A normal
factory can be used to create sets of related objects. An abstract factory returns factories. Hence, an abstract factory
is used to return factories that can be used to create sets of related objects.

For example, you could have a Honda factory that returns car objects (Brio, Civic, etc.) associated with a Honda
factory. You could also have a Hyundai factory that returns car objects (Santro, EON) associated with a Hyundai factory.
However, we could create an abstract factory that returns these different types of car factories depending on the car
that we were interested in. Furthermore, we could then obtain car objects from the car factories. Via polymorphism, we
can use a common interface to get the different factories, and we could then use a common interface to get the different
cars.

![image](https://www.baeldung.com/wp-content/uploads/2018/11/updated_abstract_factory.jpg)

```java
public interface IMobileFactory {

    IMobileFactory createMobile(String type);
}
```

```java
public class MobileFactory implements IMobileFactory {

    @Override
    public IMobileFactory createMobile(String type) {

        IMobileFactory mob = null;
        if ("lenf".equalsIgnoreCase(type)) {
            mob = new LenovoMobileFactory();
        } else if ("samf".equalsIgnoreCase(type)) {
            mob = new SamsungMobileFactory();
        }
        return mob;
    }
}
```

```java
public class LenovoMobileFactory extends MobileFactory {

    Lenovo createLenovoMobile() {
        return new Lenovo();
    }
}
```

```java
public class SamsungMobileFactory extends MobileFactory {

    Samsung createSamsungMobile() {
        return new Samsung();
    }
}
```

```java
public class AbstractFactoryTest {

    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();
        LenovoMobileFactory lmf = (LenovoMobileFactory) factory.createMobile("lenf");
        Lenovo ln = (Lenovo) lmf.createLenovoMobile();
        ln.pictureCapacity();
    }
}
```

```
Lenovo camera capacity starts from 10 MP
```

### Benefits

- Abstract Factory pattern also offers an approach to code for interface rather than implementation.
- Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products. For
  example, we can add another sub-class ‘Dell’ and a factory ‘LaptopFactory’.
- Abstract Factory pattern is robust and it eliminates conditional logic unlike Factory pattern.

## Table of Content 
- [Factory Method Pattern](#factory-method-pattern)

- [Abstract Factory Pattern](#abstract-factory-pattern)
---

## Factory Method Pattern

Define an `interface` or `abstract class` for creating an object but let the `subclasses` decide which class to instantiate.  
In other words, `subclasses` are responsible to create the instance of the class.

The Factory Method Pattern is also known as Virtual Constructor.

---

## Abstract Factory Pattern

Define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.   
That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
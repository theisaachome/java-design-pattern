# Observer  Pattern

known as **_publish-subscribe_** pattern.

There are four participants in the Observer pattern:

### **Subject**,
- which is used to register observers. Objects use this interface to register as observers and also to remove themselves from being observers.

### **Observer** 
- defines an updating interface for objects that should be notified of changes in a subject. All observers need to implement the Observer interface. This interface has a method update (), which gets called when the Subject’s state changes.

### **ConcreteSubject**,
- stores the state of interest to ConcreteObserver objects. It sends a notification to its observers when its state changes. A concrete subject always implements the Subject interface. The notifyObservers () method is used to update all the current observers whenever the state changes.

### **ConcreateObserver** 
- maintains a reference to a ConcreteSubject object and implements the Observer interface. Each observer registers with a concrete subject to receive updates.


* Subject provides interface for observers to register and unregister themselves with the subject.

* Subject knows who its subscribers are.

* Multiple observers can subscribe for notifications.

* Subject publishes the notifications.

* Subject just sends the notification saying the state has changed. It does not pass any state information.

* Once the notification is received from subject, observers call the subject and get data that is changed.
package collectionFramworkPkg;





/*
Collections Framework (introduced in Java 1.2 version)
The collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
Java collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet)…/

Hierarchy of collection Framework (The java.util package contains all the classes and interfaces for the Collection framework.)
(See the image file in the project)



****Iterable Interface: This is the super Interface of Collection Interface. 
The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface. It contains only one abstract method. i.e.,
Iterator<T> iterator()
*<T> specifically stands for generic type. (T is for Type)

All Known Subinterfaces: BeanContext, BeanContextServices, BlockingQueue<E>, Collection<E>, List<E>, Queue<E>, Set<E>, SortedSet<E>
All Known Implementing Classes: AbstractCollection, AbstractList, AbstractQueue, AbstractSequentialList, AbstractSet, ArrayBlockingQueue, ArrayList, AttributeList, BeanContextServicesSupport, BeanContextSupport, ConcurrentLinkedQueue, CopyOnWriteArrayList, CopyOnWriteArraySet, DelayQueue, EnumSet, HashSet, JobStateReasons, LinkedBlockingQueue, LinkedHashSet, LinkedList, PriorityBlockingQueue, PriorityQueue, RoleList, RoleUnresolvedList, Stack, SynchronousQueue, TreeSet, Vector

*****Collection Interface:  The Collection interface is the interface which is implemented by all the classes in the collection framework. It declares the methods that every collection will have. In other words, we can say that the Collection Interface builds the foundation on which the collection framework depends.
 A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it provides implementations of more specific sub interfaces like Set and List. 


Before Start Learning: Good to Know-> 
3Cs
c-collections – concept of collection framework
C-Collections—Class of java.util package
C-Collection –Interface of java.util package

Implements & Extends 
Implements -> An Interface needs to be implemented->only Class can implement an Interface or multiple Interfaces (Java support multiple implementations)
Extends ->As per OOP concept Java allows a Class (child) to extend another Class (parent) AND an Interface extends another Interface (a class can’t extend multiple classes)


List Interface
->List interface is the child interface of Collection interface. 
->It inhibits a list type data structure in which we can store the ordered collection of objects. 
->It can have duplicate values.
->List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
To instantiate the List interface, we must use :
1.	List <data-type> list1= new ArrayList();  
2.	List <data-type> list2 = new LinkedList();  
3.	List <data-type> list3 = new Vector();  
4.	List <data-type> list4 = new Stack();  
There are various methods in List interface that can be used to insert, delete, and access the elements from the list.
The classes that implement the List interface are given below.
 
ArrayList Class
*****************************************************************
implements the List interface
uses a dynamic array
duplicate element
different data types (Heterogeneous elements are allowed)
maintains the insertion order (insertion order will be preserved ->will print as you add)
non-synchronized 
elements stored in the ArrayList class can be randomly accessed (by using get(index)
stores values in the basis of index
null insertion is possible (String)
 
Good to know:
->add(), size(), get()
->get all values by using for loop, iterator()
->generic and non generic
->user-defined class obj
->addAll()
->removeAll()
->retainAll()
->how array is fixed but ArrayList not
->why ArrayList is slow
*    in case of adding element and removing element🡪for shifting needs time
->ArrayList is better choice 
*for data retrieval 
   ar.get(0);----for example it will take 1 m.sec
   ar.get(1000)-- -- it will take 1 m.sec too

 
*/
public class ArrayList_1_1_Info {

}

import java.util.Arrays;
import java.util.Comparator;
class Start {
    public static void main(String[] data){
        System.out.println("Welcome to Java-19");
        int cmp = "Latte".compareTo("Ochaya"); //Three way comparison => compare that return zero, more than zero, and less than zero
        System.out.println(cmp);
        Car c = new Car();
        c.weight = 1572.0;
        c.serial = "KXW-3821-6659";
        System.out.println(c instanceof Car); //true // c is initial by Car
        System.out.println(c instanceof Vehicle); //true  //Car is subclass of Vehicle, so c is instance of Vehicle as well
        System.out.println(c instanceof Object); // true
        Vehicle[] a = {new Car(), new Truck(), new Car(), new Car(), new Car(), new Truck(), new Car(), new Truck(), new Truck()};
        int count = 0;
        for (int i = 0; i<a.length; i++) {
            if (a[i] instanceof Car) {
                count++;
            }
        }
        System.out.println("Car count: "+count);
        
        Book b = new Book();
        b.price = 170;
        System.out.println(b.getTax()); 
        
        Taxable[] book = {new Book(), new EBook(), new Book(), new EBook(), new EBook()};
        double totalTax = 0;
        for (int i = 0; i<book.length; i++) {
//            System.out.println("Tax: "+book[i].getTax());
//            System.out.println("Charge: "+book[i].getCharge());
            totalTax += book[i].getTax();
        }
        System.out.println(totalTax);
        
        Player[] p = {new Player("David",7),
                        new Player("Michael",10),
                        new Player("John",2),
                        new Player("Stephen",4),
                        new Player("Frank",8)};
//        Arrays.sort(p, new PlayerComparator());
//        Arrays.sort(p, (j,k)-> j.number- k.number); // new version of java allow to use lambda fn
        Arrays.sort(p, (j,k)-> (j.name).compareTo(k.name));
        for (int i = 0; i< p.length; i++) {
            System.out.println("Player name: "+p[i].name);
            System.out.println("Player number: "+p[i].number);

           
        }
    }
}

class Vehicle { // class Vehicle extends Object (Object is superclass of every class)
    double weight;
    String serial;
}

class Car extends Vehicle {
    
}
// Car is a subclass of Vehicle
// Vehicle is the superclass of Car

class Truck extends Vehicle {
    int wheels;
}
// but class are not allowed to have multiple immediate super class (multiple inheritant) // class xx extends a,b {} is forbidden
// some language can do multiple inheritant such as Python, C++
// if Java need to do multiple inheritant by using interface

interface A {}
interface B {}
interface C {}
interface D extends A {}
interface E extends A, B {}

// but interface is only protocol (policy- tell only direction of working but not provide detail) 
// if interface is need to be mordetial is need to "implement"

interface Taxable {
    double getTax();
    default double getCharge () { // default method in interface dont have to override
        return 5.0;
    }
}

class Book implements Taxable {
    double price;
    public double getTax() {
        return price*0.01;
    }
}
class EBook implements Taxable {
    double price;
    public double getTax() {
        return 15.0;
    }
    public double getCharge () {
        return 10;
    }
}
// all methods in interface have to declair in class which implement the corresponding interface

class Player {
    String name;
    int number;
    Player(){}
    Player(String name) {
        this.name = name;
    }
    Player(String name, int number) {
        this(name); //call 2nd Player(String name)
        this.number = number;
    }
}
//overload is about methods with the same name but have different signature(different argument) 


class PlayerComparator implements Comparator {
    public int compare(Object a, Object b) {
        Player p = (Player)a;
        Player q = (Player)b;
        
//        return p.name.compareTo(q.name);
        return p.number-q.number;
    }
}
//Comparator and Comparable is interface have to always implements
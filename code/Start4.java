class Start4 {
    public static void main (String[] data){
        System.out.println("Welcome Java-20");
        Character c;
        Player p = new Player("Stephen");
        A.B.C w = new A.B.C();
        w.showDetial();
//        A.M m = new A.M(); //error because class M not static
        Player x = new Player ("Stephen");
        System.out.println(p.equals(x));
    }
}
// final class -> class that cannot have subclass or cannot extends final class
// the goal of interface is to allow class to have multiple super class (because extends keyword allow us to extend only 1 class)
// String is the good example of final class
// Serializable -> is interface which mean that the class that implement this interface can be saved data to DB
// Object
// '--Number      ---> abstract class is not able to create instant directly (using new keyword)
//    '--- Byte
//    '--- Short
//    '--- Integer
//    '--- Long
//    '--- Float
//    '--- Double
// abstract class have to extends only. and all abstract method have to be writen in the class that extend abstract method
// abstract class vs interface
// abstract class is "is a" relationship
//                      '--> class Integer extends Number {} => Integer is a number
// interface is "has a" relationship
//                   '--> class Player implements Runnable, Serializable, Payable {}
//                         Player has a Runnable ability
//                         Player has a Serializable ability
//                         Player has a Payable ability


//public class allow us to use this class in different folder or package

//sealed class is similar to final class, but permits to have only specific subclass
//sealed class Product permits Online, Offline {}
//final class Online extends Product {}  // subclass of sealed class have to be final class
// class Offline extends Product {} // error

sealed class Product permits Online, Offline {}
final class Online extends Product {}
final class Offline extends Product {}

sealed class Pool permits Student, Staff {}
final class Student extends Pool {}
non-sealed class Staff extends Pool {} // need Staff class to can be extended
class NationalTeam extends Staff {} 

//public class must have to name as filename so one file have only one public class

// nested class or inner class
class A {
    static class B{
        static class C {
            void showDetial () {
                System.out.println("ABC");
            }
        }
    }
    class M {}
    static class Z {
        
    }
    interface I {}
    record R() {}
    enum E {}
}
//Allow to use A.B.C but B C have to be a static class
// so A.M will error
package Encapsulation;

public class Main {
    public static void main(String[] args) {
        RWOnly object1 = new RWOnly();
//        object1.name = "AksharaShetty";
//        System.out.println(object1.name);
//        received 2 errors as name is a private member we cannot get or set we need geeters and setters to access them
          object1.setName("AksharaShetty");
          System.out.println(object1.getName());


    }
}

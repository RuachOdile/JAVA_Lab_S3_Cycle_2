class A{

    void OutputA() {
        System.out.println("This is Parent class");
    }
}

class B extends A{
    void OutputB() {
        System.out.println("This is Child class");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        //calling method of parent class by object of parent class
        A ob1 = new A();
        ob1.OutputA();

        //calling method of child class by object of child class
        B ob2 = new B();
        ob2.OutputB();



        //calling method of parent class by object of child class
        ob2.OutputA();




    }
}

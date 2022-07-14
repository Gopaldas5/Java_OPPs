package Methods;

public class MainOverload {
    public static void main(String[] args) {
            System.out.println("First main method");
            MainOverload mainOverload = new MainOverload();
            mainOverload.main(1);
            mainOverload.main(2,"H");
            mainOverload.m1(1);
            mainOverload.m1();
            mainOverload.m2();
            mainOverload.m3();

//              main(1);
//              main(2, "H");
//              m1(1);     //we can call static method directly.
//              m2();

           //     m1();    //we can't call non-static method directly. its show compile time error.
    }

    public static void main(int a) {
        System.out.println("Second main method");
    }

    public static void main( int b, String s) {
        System.out.println("Third main method ");
    }

    static void m1(int a){
        System.out.println("I am  static void  method m1");
    }

    void m1(){                // void method return statement is not mandatory. Its optional
        System.out.println("I am non-static void method m1 ");
        return ;           // optional
    }

    static  int m2(){         // non-void method return statement is mandatory
        System.out.println("I am static non-void method m2");
        return (10);
    }
    int m3(){
        System.out.println("I am non-static non-void method m3");
        return 10;

    }



}

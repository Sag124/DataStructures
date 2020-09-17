class test
{
    static int x = 10;
    int y = 20;
    
    void show()
    {
        System.out.println(x + " " +y);  
    }
    
    static void display()
    {
        System.out.println(x);
        //System.out.println(y); Not allowed coz static methods cannot access non static variables
    }
}

public class Main {
    public static void main(String[] args) {
        test t1 = new test();
        t1.x = 1000;
        t1.y = 2000;
        t1.show();
        
        
        test t2 = new test(); 
        t2.show();
        // static data is shared between objects
        
    }
}
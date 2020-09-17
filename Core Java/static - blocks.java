class test
{
    static 
    {
        System.out.println("Block 1");
    }
    static 
    {
        System.out.println("Block 2");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Method");
        test t1 = new test();
        // static blocks are called whenever the class is loaded
        
    }
}
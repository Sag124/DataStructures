class Test
{
    public final void show()
    {
        System.out.println("Hello");
    }
}

class Test1 extends Test
{
    public void show()
    {
       System.out.println("Test 1");  // final methods cannot be overridden
    }
}


public class Main {
    
    public static void main(String[] args) {
        
        
    }
}
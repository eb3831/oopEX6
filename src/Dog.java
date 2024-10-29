public class Dog extends Animal implements Runnable
{
    @Override
    public void makeSound()
    {
        System.out.println("Woof!");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog loves meat");
    }

    @Override
    public void run ()
    {
        System.out.println( "the dog runs" );
    }
}
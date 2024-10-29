public class Cat extends Animal implements Runnable
{
    @Override
    public void makeSound()
    {
        System.out.println("Meow!");
    }

    @Override
    public void eat()
    {
        System.out.println("Cat enjoys fish");
    }

    @Override
    public void run ()
    {
        System.out.println( "the cat runs" );
    }
}
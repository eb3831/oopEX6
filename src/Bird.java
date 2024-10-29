public class Bird extends Animal implements Flyable
{
    @Override
    public void makeSound()
    {
        System.out.println("Chirp");
    }

    @Override
    public void eat()
    {
        System.out.println("Birds like seeds.");
    }

    @Override
    public void fly ()
    {
        System.out.println( "the bird flies" );
    }
}

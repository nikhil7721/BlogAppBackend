
public class DatabasePersistence extends Persistence{
    @Override
    public void persist()
    {
        System.out.println("Overiding in FIle persistence");
    }
}

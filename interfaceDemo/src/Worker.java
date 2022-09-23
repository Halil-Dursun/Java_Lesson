public class Worker implements IWorkable,IEatable,IPayable{
    @Override
    public void work() {
        System.out.println("Company workers are working now.");
    }

    @Override
    public void eat() {
        System.out.println("Company workers eating now.");
    }

    @Override
    public void pay() {

    }
}

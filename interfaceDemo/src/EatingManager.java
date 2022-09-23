public class EatingManager {
    private IEatable eatable;
    public EatingManager(IEatable eatable){
        this.eatable = eatable;
    }
    public void eat(){
        eatable.eat();
    }
}

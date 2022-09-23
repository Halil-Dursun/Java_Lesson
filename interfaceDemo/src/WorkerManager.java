public class WorkerManager {
    private IWorkable workable;
    public WorkerManager(IWorkable workable){
        this.workable = workable;
    }
    public void  work(){
        workable.work();
    }
}

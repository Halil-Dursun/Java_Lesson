public class Main {
    public static void main(String[] args) {
        WorkerManager workerManager = new WorkerManager(new OutSourceWorker());
        workerManager.work();

        EatingManager eatingManager = new EatingManager(new Worker());
        eatingManager.eat();
    }
}
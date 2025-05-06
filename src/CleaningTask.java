public class CleaningTask implements Runnable {
    public void run(){
        System.out.println("clean the room");
    }
}
class CleaningManager extends CleaningTask{
    public void run(){
        System.out.println("supervises all the cleaning process");
        super.run();
        System.out.println("all areas are..");
    }
}
class CleaningSimulation {
    public static void main(String[] args) {
//        Thread cleaningTaskThread = new Thread(new CleaningTask());
//        Thread cleaningManagerThread = new Thread(new CleaningManager());
//
//        cleaningTaskThread.start();
//        cleaningManagerThread.start();
    }
}
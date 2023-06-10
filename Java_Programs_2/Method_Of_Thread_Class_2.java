// Example of method of Thread Class.....
// sleep function is used to hold the screeen
class FirstThread extends Thread {
    public void run() {
        System.out.println("My First Thread..");
    }
}

class Method_Of_Thread_Class_2 {
    public static void main(String args[]) {
        FirstThread ft = new FirstThread();
        ft.start();
    }
}
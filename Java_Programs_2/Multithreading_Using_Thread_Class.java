// Example of multithreading using thread class.....
class MyFirstThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - My First  Thread.");
        }
    }
}

class MySecondThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - My Second Thread.");
        }
    }
}

class MyThirdThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - My Third  Thread.");
        }
    }
}

class Multithreading_Using_Thread_Class {
    public static void main(String args[]) {
        MyFirstThread mft = new MyFirstThread();
        MySecondThread mst = new MySecondThread();
        MyThirdThread mtt = new MyThirdThread();
        mft.start();
        mst.start();
        mtt.start();
    }
}
// Example of multithreading using runnable interface.....
class MyFirstRunnanbleInterface implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - My First  Runnanble Interface");
        }
    }
}

class MySecondRunnanbleInterface implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - My Second Runnanble Interface");
        }
    }
}

class MyThirdRunnanbleInterface implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - My Third  Runnanble Interface");
        }
    }
}

class Multithreading_Using_Runnable_Interface {
    public static void main(String args[]) {
        MyFirstRunnanbleInterface mfri = new MyFirstRunnanbleInterface();
        MySecondRunnanbleInterface msri = new MySecondRunnanbleInterface();
        MyThirdRunnanbleInterface mtri = new MyThirdRunnanbleInterface();
        Thread t = new Thread(mfri);
        Thread tt = new Thread(msri);
        Thread ttt = new Thread(mtri);
        t.start();
        tt.start();
        ttt.start();
    }
}
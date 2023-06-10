//Example of method of Thread Class.....
class First extends Thread {
    public void run() {
        System.out.println("My First Thread" + currentThread().getName());
        System.out.println("My First Thread" + currentThread().getName() + " " + currentThread().getId());
        System.out.println("My First Thread" + currentThread().getName() + " " + currentThread().getPriority());
    }
}

class Method_Of_Thread_Class_1 {
    public static void main(String args[]) {
        First obj1 = new First();
        First obj2 = new First();
        First obj3 = new First();
        obj1.start();
        obj2.start();
        obj3.start();
        System.out.println("Obj1 = " + obj1.getName());
        System.out.println("Obj2 = " + obj2.getName());
        System.out.println("Obj3 = " + obj3.getName());
    }
}
// example of default  arrgument constructor......
class Demo{
    private int x, y;
    Demo( int a, int b) // argument constructor..
    {
        x = a;
        y = b;
    }
    // constuctor is alws of class...
    void show()
    {
        System.out.println("X is " + x + "\n Y is " + y);
    }
}
class ParameterisedConstructorExample{
    public static void main(String args[]){
        Demo d = new Demo(500, 700);
        d.show();
    }
}
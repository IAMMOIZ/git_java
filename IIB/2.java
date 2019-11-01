class B
{
//constructor
B()
{
System.out.println("constructor");
}

//initializer block
{
System.out.println("initializer block");
}

public static void main(String gg[])
{
B b = new B();
System.out.println("=========");
B b1 = new B();
}
}
//before calling constructor initializer block will be exicute at the time of object creation
//it used to initialize non static property of the class
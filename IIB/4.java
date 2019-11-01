class D
{

//default constructor
D()
{
System.out.println("default constructor");
}

//parameterized constructor
D(int i)
{
this();
System.out.println("parameterized constructor");
}

//initializer block
{
System.out.println("initializer block");
}

public static void main(String gg[])
{
D d1 = new D();
System.out.println("===========");
D d2 = new D(4);
}
}

//initializer block run only one time when object is created.
class J
{

static int counter;

J()
{
}

J(int i)
{
this();
}

{
System.out.println("object created [inside initializer block]");
counter++;
}

public static void main(String gg[])
{
J j1 = new J(5);
System.out.println("Number of objects created is : "+j1.counter);
}
}
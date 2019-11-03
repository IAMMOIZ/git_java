class A
{
A()
{
System.out.println("A()");
}

{
System.out.println("A-iib4");
System.out.println("A-iib5");
System.out.println("A-iib6");
}

{
System.out.println("A-iib1");
System.out.println("A-iib2");
System.out.println("A-iib3");
}

public static void main(String gg[])
{
A obj = new A();
System.out.println("============");
A obj1 =new A();
}
}


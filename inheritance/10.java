class A
{
A()
{
System.out.println("A()");
}

//iib1
{
System.out.println("A-iib4");
System.out.println("A-iib5");
System.out.println("A-iib6");
}

//iib2
{
System.out.println("A-iib1");
System.out.println("A-iib2");
System.out.println("A-iib3");
}

public static void main(String gg[])
{
A obj1 = new A();
System.out.println("========");
A obj2 = new A();
}

}

//iib always exicutes in order in which they defined
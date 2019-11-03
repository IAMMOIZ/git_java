class A
{
A()
{
//super calling stmt
//all sib stmt
System.out.println("A()");
}

//iib
{
System.out.println("A-iib4");
System.out.println("A-iib5");
System.out.println("A-iib6");
}

A(int i)
{
this();
//super calling stmt
//all iib stmt
System.out.println("A(int i)");
}

//iib
{
System.out.println("A-iib1");
System.out.println("A-iib2");
System.out.println("A-iib3");
}

public static void main(String gg[])
{
A a1 = new A();
System.out.println("=================");
A a2 = new A(5);
}
}

// in the constructor body if first stmt is any kind of this stmt then iib block are incorporate in body
// iib block execute only one time for object creation ,even though two constructor are there

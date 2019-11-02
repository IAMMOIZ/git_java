//use of this keyword
//iib
//inheritance
class A
{
A()
{
this(10);//to call default constructor of same class
System.out.println("A()");
}

//iib1
{
System.out.println("A-iib4");
System.out.println("A-iib5");
System.out.println("A-iib6");
}

A(int i)
{
System.out.println("A(int i)");
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
A obj2 = new A(10);
}

}

//iib always exicutes in order in which they defined
//we can use this() constructor to call same class another constructor

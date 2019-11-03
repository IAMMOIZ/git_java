class ab1
{
ab1()
{
System.out.println("ab1()");
}
}
class ab2 extends ab1  
{
ab2()
{
System.out.println("ab2()");
}
}
class ab3 extends ab2
{
ab3()
{
this(90);
System.out.println("ab3()");
}
ab3(int i)
{
System.out.println("ab3(int)");
}
}
class A extends ab3
{
A()
{
super(10);
System.out.println("A()");
}
A(int i)
{
System.out.println("A(int)");
}
public static void main(String[] args) 
{
ab1 a = new ab1();
System.out.println("------------");
ab2 b = new ab2();
System.out.println("------------");
ab3 c = new ab3();
System.out.println("------------");
ab3 d = new ab3(10);
System.out.println("------------"); 
A e = new A();
System.out.println("------------");
A f = new A(10);
System.out.println("------------"); 
}
}

// if already not there super calling or this calling then compiler provide super with no arg
// Super is referencing to the extended class. By default it is the Object class
// The constructor in Object does nothing. ... If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.

//default constructor
class A
{
A()//constructor must have a same name as a class name in which constructor is defined
{
System.out.println("A()");
}

public static void main(String gg[])
{
A a1 = new A();
System.out.println("=============");
A a2 = new A();
}
}


// constructor shouldn't have a return type
// constructor executing automatically while object is created
// constructor shouldn't be static , always non-static
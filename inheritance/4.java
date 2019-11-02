class abc
{
int i;
static int j;
void test1()
{
System.out.println("abc-test1()");
}
static void test2()
{
System.out.println("static abc-test2()");
}
}

class A extends abc
{
int m;
static int n;
void test3()
{
System.out.println("A-test2");
}
static void test4()
{
System.out.println("static A-test4()");
}


public static void main(String gg[])
{
A obj = new A();
System.out.println(obj.i);
System.out.println(obj.m);
System.out.println(A.j);
System.out.println(A.n);
obj.test1();

//obj.test1();//non static member cnt accessed in static context

obj.test2();//static can accessed as member of object

//A.test3();//non static member cnt accessed in static context

A.test4();//static member of same class can be accessible with object or without object [throw class]

A.test2();//static member of super class can be accessible with object or without object of drive class

obj.test1();//nonstatic can accessed as member of object of drived class

}
}
class M
{

//default constructor
M()
{
System.out.println("M()");
}

//parameterized constructor
M(int i)
{
System.out.println("M(int i)");
}

public static void main(String gg[])
{
M m1 = new M();
System.out.println("=========");
M m2 = new M(40);
System.out.println("=========");}
}

// a class can have any no. of constructors.
// while developing multiple constructors in a classe there should be changing of no of argument or datatype of arguments.
// developing multiple constructors in the same class by choosing either different no of arguments or datatypes of arguments is called CONSTRUCTOR OVERLOADING.
// while object is created by default only specified constructor is executed.
// M(int i) / M() - constructor signature

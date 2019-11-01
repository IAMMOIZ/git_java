//use of this keyword to call same class another construction
class R
{
R()
{
System.out.println("default");
}
R(int i)
{
this();//almost like method calling statement will call to current class no arg constructor
System.out.println("parameterized");
}


public static void main(String gg[])
{
R r1 = new R();
System.out.println("=======");
R r2 = new R(5);
}
}


// for using multiple constructors we have to use "this()"
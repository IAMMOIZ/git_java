//use of this keyword to call same class another construction
class S
{
S()
{
this(30);//almost like method calling statement will call to current class no arg constructor
System.out.println("default");
}
S(int i)
{
System.out.println("parameterized");
}


public static void main(String gg[])
{
S s1 = new S();
System.out.println("=======");
S s2 = new S(5);
}
}


// for using multiple constructors we have to use "this()"
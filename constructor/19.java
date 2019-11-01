//use of this keyword to call same class another construction
class T
{
T()
{
System.out.println("default");
this(30);//Error : this() should be the first stmt of constructor
System.out.println("default");
}
T(int i)
{
System.out.println("parameterized");
}


public static void main(String gg[])
{
T t1 = new T();
System.out.println("=======");
T t2 = new T(5);
}
}


// for using multiple constructors we have to use "this()"
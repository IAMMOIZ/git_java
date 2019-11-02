class abc
{
abc()
{
System.out.println("abc-constrctr");
}
}

class A extends abc
{
A()
{
System.out.println("A-contrctr");
}

public static void main(String gg[])
{
A obj = new A();
System.out.println("=================");
A obj1 = new A();
}
}

//in case of inheritance
//base class constructor will exicute first thn drived class constructor will exicute
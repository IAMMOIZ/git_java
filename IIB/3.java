class C
{

//constructor default
C()
{
System.out.println("default constructor");
}
//parameterized constructor
C(int i)
{
System.out.println("parameterized constructor");
}

//initializer block
{
System.out.println("intitializer block");
}

public static void main(String gg[])
{
C c1 = new C();
System.out.println("============");
C c2 = new C(4);
}
}

//for every styles of object creation same initializer block will be called.

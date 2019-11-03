class A
{
A()
{
System.out.println("A()");
}

{
System.out.println("A-iib");
}

public static void main(String gg[])
{
A obj = new A();
System.out.println("============");
A obj1 =new A();
}
}


// if 1st stmt is any kind of super then compiler in corporate call the IIB block after the super no arg stmt
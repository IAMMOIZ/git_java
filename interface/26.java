interface abc
{
void test1();
}
interface B extends abc
{
void test2();
}
interface C extends abc,B
{
void test3();
}

class A implements C
{
public void test1()
{
System.out.println("test1()");
}
public void test2()
{
System.out.println("test2()");
}
public void test3()
{
System.out.println("test3()");
}
public static void main(String gg[])
{
A obj = new A();
obj.test1();
obj.test2();
obj.test3();
System.out.println("hellow");
}
}

//a single class can extends only one class like [class A extends abc , xyz] it not possible if xyz and abc are concreate classes
//a interface can extends multiple interface like [interface A extends abc , xyz] it is possible if xyz and abc both are interfaces

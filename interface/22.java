interface abc
{
void test1();
void test2();
}
interface bcd
{
void test3();
void test4();
}

abstract class cde implements abc,bcd
{
public void test1()
{
System.out.println("test1");
}
public void test2()
{
System.out.println("test2");
}
public void test3()
{
System.out.println("test3");
}
}

class def extends cde
{
public void test4()
{
System.out.println("test4()");
}
}
class A
{
public static void main(String gg[])
{
def obj = new def();
obj.test1();
obj.test2();
obj.test3();
obj.test4();
System.out.println("Hellow world");
}

}
//method overloading : multiple method has same name in a class but
//rule 1 : number of parameter is diffrent
class A
{

//test with no parameters
public static void test()
{
System.out.println("no parameters");
}

//test with one parameters
public static void test(int i)
{
System.out.println("one parameters");
}

//test with two  parameters
public static void test(int i , int j)
{
System.out.println("two parameters");
}

//test with three parameters
public static void test(int i, int j , int k)
{
System.out.println("three parameters");
}

public static void main(String gg[])
{
A.test();
System.out.println("==============");

A.test(2);
System.out.println("==============");

A.test(3,5);
System.out.println("==============");

A.test(3,4,5);
System.out.println("==============");

}
}

//only suitable method will be call.
class A
{
public void test()
{
System.out.println("base class test()");
}
}


class K extends A
{
public void test(int i)
{
System.out.println("drive class test(int i)");
}

public static void main(String gg[])
{
K obj = new K();
obj.test();//base class test no signature
obj.test(6);//drive class test with one signature
}
}

//this is not example of method overidding bcz both method has same name but with diffrent signatures.
//this is example of method overloadin
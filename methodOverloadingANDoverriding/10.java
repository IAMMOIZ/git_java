class A
{
public void test()
{
System.out.println("base A-test");
}
}

class J 
{
public void test()
{
System.out.println("drive J -test");
}

public static void main(String gg[])
{
J obj = new J();
obj.test();
System.out.println("Hello world");
}
}


//A class test method overriding in inheritence J class.
//if signituer is same method can be override.
//always drive class method will be exicute.
class A 
{
void test1()
{
System.out.println("A-test()");
}
void test2()
{
System.out.println("A-test2()");
}
}
class T extends A
{
void test1()
{
System.out.println("S-test(int) begin");
super.test1();//by using super keyword we can call base class same method
super.test2();//by using super keyword we can call base class diffrent method
//test2();//without using super keyword we can call base class same method
//test1();//it will call itself and this will be causes of infinite loop
System.out.println("S-test(int) end");
}

public static void main(String[] args) 
{
T t1 = new T();
t1.test1();
}
}
 
 
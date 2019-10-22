//assign some value by calling a function
//recived should have same datatype same as function returntype.
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int a = test();
long b = test1();
short c = test2();
byte d = test3();
float e = test4();
double f = test5();
System.out.println("main end");
}

public static int test()//returntype int.
{
System.out.println("test");
return 100; //return statement integer type.
}

public static long test1()//returntype long.
{
System.out.println("test1");
return 100334; //return statement long type.
}

public static short test2()//returntype short.
{
System.out.println("test2");
return 122; //return statement short type.
}

public static byte test3()//returntype byte.
{
System.out.println("test3");
return 14; //return statement byte type.
}

public static float test4()//returntype float.
{
System.out.println("test4");
return 10.555f; //return statement float type.
}

public static double test5()//returntype double.
{
System.out.println("test5");
return 10.55; //return statement is double type.
}

}
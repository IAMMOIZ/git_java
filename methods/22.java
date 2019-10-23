//parameter passing to a function
//pass variable as a argument
class A
{
public static void main(String gg[])
{
int i=10,j=20;
System.out.println("main begin");
test(i,j);//argument [parameter passing ]
System.out.println("main end");
}

//test
public static void test(int p , int q)//receiver[formal parameter]
{
System.out.println("parameter is : "+p+" and "+q);
}
}
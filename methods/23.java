//parameter passing 
//only suitable function will call if function name is same and number of parameter is diffrent [polymorphism(method overloadding)]

class A
{
public static void main(String gg[])
{
int i=10,j=20,k=30,l=40;
System.out.println("main begin");
test();
test(i);
test(i,j);
test(i,j,k);
test(i,j,k,l);
System.out.println("main end");
}
public static void test()
{
System.out.println("No parameter");
}
public static void test(int p)
{
System.out.println("parameter : "+p);
}
public static void test(int p , int q)
{
System.out.println("parameter : "+p+" and "+q);
}
public static void test(int p, int q, int r)
{
System.out.println("parameter : "+p+" "+q+" "+r);
}
public static void test(int p,int q,int r, int s)
{
System.out.println("parameter : "+p+" "+q+" "+r+" "+s);
}
}
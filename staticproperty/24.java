class A
{
static int i = 10;
public static void main(String gg[])
{
System.out.println(i);//static i
int i = 30;
System.out.println(i);//local i
System.out.println(A.i);//static i//if you want to print global variable use it with the class name.
}
}

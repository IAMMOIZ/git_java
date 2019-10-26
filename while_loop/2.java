class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i = 0;
while(i<=20)
{
System.out.println("while begin : "+i);
System.out.println("while end : "+i);
System.out.println("===========");
i+=2;
//i=i+2;
}
System.out.println("main end : "+i);
}
}
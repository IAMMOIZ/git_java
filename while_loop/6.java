//use of continue oprator
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i=0;
while(i<=5)
{
System.out.println("while begin : "+i);
i++;
if(i>=3)
{
System.out.println("Skip the itration ");
continue;
}
System.out.println("while end : "+i);
System.out.println("==============");
}
System.out.println("main end : "+i);
}
}
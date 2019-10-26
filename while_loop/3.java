//use of continue opraotr inside while loop
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i=0;
while(i<=5)
{
System.out.println("while begin : "+i);
if(i==3)
{
continue;
}
System.out.println("while end : "+i);
System.out.println("=============");
i++;
}
System.out.println("main end");
}
}
//infinite loop will be exicute 
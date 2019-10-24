//nested for loop
//
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
loop1:
for(int i=1;i<=5;i++)
{
System.out.println("Outer begin : "+i);
xyz:
for(int j=20;j<=22;j++)
{
System.out.println("inner begin : "+i+" , "+j);
if(j>21)
{
System.out.println("inside if");
break loop1;
}
System.out.println("inner end : "+i+" , "+j);
}
System.out.println("Outer end : "+i);
System.out.println("================");
}
System.out.println("main end");
}
}
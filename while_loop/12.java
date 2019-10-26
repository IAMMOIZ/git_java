//nasted while loop
//break
//lable
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i=0;
while(i<=5)
{
System.out.println("outer loop : "+i);
int j=30;
inner:
while(j<=32)
{
System.out.println("inner loop begin : "+i+" , "+j);
if(j==31)
{
System.out.println("Loop break");
break inner;
}
System.out.println("inner loop end : "+i+" , "+j);
j++;
}
System.out.println("Outer loop end : "+i);
System.out.println("==========");
i++;
}
System.out.println("main end "+i);
}
}
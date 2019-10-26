//nasted while loop
//continue
//lable

class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i=0;
abc:
while(i<=5)
{
System.out.println("outer loop : "+i);
int j=30;
xyz:
while(j<=33)
{
System.out.println("inner loop begin : "+i+" , "+j);
if(j==32)
{
System.out.println("Loop break");
continue xyz;
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
//use of break :- break is used for breaking loop
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
for(int i=0;i<=10;i++)
{
System.out.println("loop begin "+i);
if(i==8)
{
System.out.println("inside if");
break;
}
System.out.println("loop end"+i);
}
System.out.println("main end");
}
}
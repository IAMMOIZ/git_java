//use of break keyword
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i =0;
while(i<=5)
{
System.out.println("while begin : "+i);
if(i==3)
{
System.out.println("loop will be break");
break;
}
System.out.println("while end : "+i);
System.out.println("==================");
i++;
}

System.out.println("main end : "+i);
}
}
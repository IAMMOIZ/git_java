//use of break
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i = 0;
do{
System.out.println("loop begin: "+i);
if(i==3)
{
break;//continue;break; error as they should be last statements
}
System.out.println("loop end : "+i);
i++;
}while(i<=5);

System.out.println("main end");
}
}
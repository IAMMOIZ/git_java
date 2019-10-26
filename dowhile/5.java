class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i=0;
do{
System.out.println("Loop begin: "+i);
if(i==3)
{
continue;
}
System.out.println("Loop end : "+i);}
while(i++<=5);

System.out.println("main end");
}
}
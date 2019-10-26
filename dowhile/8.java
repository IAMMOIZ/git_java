class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i=0;
do{
System.out.println("Loop begin: "+i);
if(i>=3)
{
i++;//in while and do-while if continue is there, changes should be before continue
continue;
}
System.out.println("Loop end : "+i);
i++;}
while(i<=5);

System.out.println("main end");
}
}
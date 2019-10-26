//use of continue
//lable	
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i = 0;
hello:
do{
System.out.println("loop begin: "+i);
if(i==3)
{
break hello;

}
System.out.println("loop end : "+i);
i++;
}while(i<=5);

System.out.println("main end");
}
}
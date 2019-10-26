//experiment
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i = 0;
while(i<=10)
{
System.out.println("while begin");
if(i==5)
{
continue;//error : break should be the last stmt of any block
System.out.println("inside if");
}
System.out.println("while end");

}
System.out.println("main end");
}}
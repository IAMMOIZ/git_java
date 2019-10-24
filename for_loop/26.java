//use of countinue oprator

class A
{
public static void main(String gg[])
{
System.out.println("main begin");
for(int i=1;i<=5;i++)
{
System.out.println("begin : "+i);
if(i<=3)
{
System.out.println("inside if : "+i);
continue;
i=3;//continue should be last stamt of the block . no stmt should written after continue
}
System.out.println("end "+i);
}
System.out.println("main end");
}
}
//bcz of continue remaining exicution of loop will not exicute and next itration will be exicute.

//continue used to skip itrations
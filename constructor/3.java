//default constructor
class C
{
int i;//i is the non static memeber of class C
C()
{
i = 10;
}

public static void main(String gg[])
{
C c1 =new C();
System.out.println("default value [without initialization ] : "+ c1.i);

c1.i=20;//update default value
System.out.println("new modified value : "+c1.i);
}
}
//in constructor we can initialize non static member of the object

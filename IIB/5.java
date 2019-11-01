//logic for counting number of objects of a class 
class F
{
static int i;//common to all object [global property]

//default constructor
F()
{
System.out.println("constructor : "+ i);
i++;
}

public static void main(String gg[])
{
F f1 = new F();
F f2 = new F();
F f3 = new F();
F f4 = new F();
F f5 = new F();
System.out.println("number of object created is : "+F.i);
}
}
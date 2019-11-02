//sib in superclass and subclass
class ab
{

//sib
static 
{
System.out.println("ab-sib");
}
}

class abc extends ab
{

//sib
static 
{
System.out.println("abc-sib");
}
}

class A extends abc
{

//sib
static
{
System.out.println("A-sib");
}

public static void main(String gg[])
{
ab obj1 = new ab();
System.out.println("============");
abc obj2 = new abc();
System.out.println("============");
System.out.println("main");
}
}
//in case of inheritance super class sib will run first then drive class sib will exicute
//sib runs only when the class is exicuting first time in then it will not exicute
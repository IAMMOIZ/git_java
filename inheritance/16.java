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
System.out.println("main");
}
}
//in case of inheritance super class sib will run first then drive class sib will exicute
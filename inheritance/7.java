//in case of inheritance super class constructor provoided by jvm here we are provoiding super constructor explicitly which shows this nature is true
class ab
{
ab()
{
super();
System.out.println("ab-constrctr");
}
}


class abc extends ab
{
abc()
{
super();
System.out.println("abc-constrctr");
}
}

class A extends abc
{
A()
{
super();
System.out.println("A-contrctr");
}

public static void main(String gg[])
{
A obj = new A();
System.out.println("=================");
A obj1 = new A();
}
}

//in case of inheritance
//base class constructor will exicute first thn drived class constructor will exicute
//this nature is because of super() constructor which is responsible to call super class constructor
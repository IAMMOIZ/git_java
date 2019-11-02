//use of implement keyword

interface abc
{
void test1();
}

class A implements abc
{

public void test1()//public is required because every method for interface class is a public member.
{
System.out.println("test");
}

public static void main(String gg[])
{
A obj = new A();
obj.test1();
System.out.println("hellow world");
}
}


//to use method of interface through object you have to use implements word with class name to get the data from the interface
//implements is used while creating a class to interface
//inheriting every member of interface class.
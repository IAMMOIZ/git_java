class I 
{
//parametarized constructor
I(int x)
{
}

public static void main(String[] args) 
{
I obj = new I();
System.out.println("done");
}
}
// object creation should be one of available constructor
// if already 1 constructor is there then compiler will not providing 1 more constructor by default
// every class should have minimum 1 constructor
// if no constructor are there in class then compiler will providing no argument constructor as default.
//if coder provoiding a parameter constructor then constructor will not provoid defaulat constructor and we are calling defaulat constructor here.
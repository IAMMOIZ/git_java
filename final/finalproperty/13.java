class A
{
final int i;//error : variable should be initialized or should be initialize inside default constaructor
A()
{
i=20;
}
}
//if final object variable is not initialized at the time of declaration then it should be initialized inside default constructor
////arithmatic oprator
//there are two type of arithmetic opration 1=>AND[&&]. 2=>OR[||]
//use of OR oprator 
//post increament 
class A
{
public static void main(String gg[])
{
int i = 10;
System.out.println((i++ == 10 ) || (i++ == 11));
System.out.println(i);
}
}
//in case of OR oprator if first condition is true then second condition wonot exicute.
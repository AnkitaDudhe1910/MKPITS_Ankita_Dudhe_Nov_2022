class arrayDemo //Single dimensional array
{
void fun()
{
 int a [] ={1,2,3,4,5}; //first type of declarig array
 int [] b ; //second type declaring array
 for(int i =0; i<5;i++)  //simple for loop
 {
  System.out.println("array:"+a[i]);
 }
 System.out.println("");

 for(int i =0; i<a.length;i++)  //for loop with .length variable
  {
   System.out.println("array:"+a[i]);
 }
  System.out.println("");

/*foreach loop : used for 1. collection of array
                          2. collection of character
                          3. coolection of string
                          4. collection of object  */
 for(int v : a)
 {
	 System.out.println("array:"+v);
 }
}
}
class arrayExample
{
 public static void main(String[]args)
 {
  arrayDemo demo = new arrayDemo();
  demo.fun();
 }
}
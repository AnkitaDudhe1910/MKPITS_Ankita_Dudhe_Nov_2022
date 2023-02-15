                                             /* throw keyword with msg and constructur */
     class KangalException extends Exception
     {
       KangalException (String s)
       {
         super(s);
       }
     }
   class Program_3
   {
     public static void main(String [] args) throws Exception
     {
       int bal = 3000;
       int width = 5000;
       if(bal>width)
       {
          System.out.println("rupay le lo");

       }
       else
       {
           KangalException ob = new KangalException("paise nahi hai");
           throw ob;
       }
     }
   }
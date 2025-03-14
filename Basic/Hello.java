

class Bank

{

    void getBalance()
    {
     System.out.println("Money deposited in Bank A is $1000");
    }

    void getBalance(int a)
     {

       System.out.println("Money deposited in Bank B is $1500");

     }

     void getBalance(int a,int b)

   {

       System.out.println("Money deposited in Bank C is $2000");

   }

     

}



public class Hello

{

public static void main(String[] args)

{

    Bank A = new Bank();

    A.getBalance();
    A.getBalance(1);
    A.getBalance(1,2);

}

}
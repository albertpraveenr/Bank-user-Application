public class Account {
    private  String id;
    private  String name;
    private  Integer Balance;



    Account(String id ,String name){
        this.id=id;
        this.name=name;
    }
    Account(String id,String name,Integer Balance){
        this.id=id;
        this.name=name;
        this.Balance=Balance;

    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setBalance(int Balance){
        this.Balance=Balance;
    }

    public int getBalance(){
        return this.Balance;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return this.id;
    }



    public int Credit(int credit){

         System.out.println("Amount Credited Successfully");
         System.out.println("Current Balance");
         setBalance(this.Balance+credit);
         return this.Balance;

    }

    public int Debit(int debit){

        System.out.println("Amount Debited Successfully");
        System.out.println("Current Balance");
        setBalance(this.Balance-debit);
        return this.Balance;
    }

    public Integer transferAccount(Account acc,int amt){
       if(this.Balance<amt){
           return this.Balance;
       }
      acc.setBalance(amt+acc.getBalance());
       setBalance(this.Balance-amt);

     System.out.println("Current Balance");
        return this.Balance;
    }


    public String toString(){
        String s="AccountId : "+this.id+" AccountName : "+this.name+" Account Balance : "+this.Balance;
        return s;
    }

}

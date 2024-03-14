import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


public class Main{

    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        String id;
        String name;
        int Balance;
        Account acc;
        System.out.println("Enter the numbers of Accounts you need to be created");
         n=Integer.parseInt(br.readLine());
         Account arr[]=new Account[n];
         int d=0;
         while(n-->0){
             System.out.println("Enter the Id / Account no");
             id= br.readLine();
             System.out.println("Enter the name");
             name= br.readLine();
             System.out.println("Enter the Balance");
             Balance=Integer.parseInt(br.readLine());
             acc=new Account(id,name,Balance);
             arr[d++]=acc;
         }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }



        while(true){
            System.out.println("Enter Debit or Credit or Transfer or Exit");
            String det=br.readLine();
            if(det.equals("Credit")){
                System.out.println("Enter the Amount to be credited");
                int amt=Integer.parseInt(br.readLine());
                System.out.println("Enter Account Name");
                String accName=br.readLine();
                for(int i=0;i<arr.length;i++){
                    if((arr[i].getId()).equals(accName)){
                        System.out.println(arr[i].Credit(amt));
                    }
                }
            }else if(det.equals("Debit")){
                System.out.println("Enter the Amount to be Debited");
                int amt=Integer.parseInt(br.readLine());
                System.out.println("Enter Account Name");
                String accName=br.readLine();
                for(int i=0;i<arr.length;i++){
                    if((arr[i].getId()).equals(accName)){
                        System.out.println(arr[i].Debit(amt));
                    }
                }
            }else if(det.equals("Transfer")){
                System.out.println("Enter the Amount to be Transfer");
                int amt=Integer.parseInt(br.readLine());
                System.out.println("Enter Account Name");
                String accName=br.readLine();
                System.out.print("Enter the Account Name to be Transfered");
                String destaccName=br.readLine();
                int startacc=0;
                int destacc=0;
                for(int i=0;i<arr.length;i++){
                    if(arr[i].getId().equals(accName)){
                        startacc=i;
                    }
                    if(arr[i].getId().equals(destaccName)){
                        destacc=i;
                    }
                }
                System.out.println(arr[startacc].transferAccount(arr[destacc],amt));
            }else {
                break;
            }
        }

        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }






    }
}
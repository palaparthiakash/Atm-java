import java.util.Scanner;
public class Atm {
      static int accno=1234567890;
      static int pin=1234;
      static double balance=9836536;
      static String name="Elon Musk";
      static String branch="Auston";
      static String acctp="Business Account Spacex";
     static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
while(true){
System.out.println("                       WELCOME TO COFFCODERS BANK                                                     ");
System.out.println(" ACCOUNT DETAILS   <PRESS 1>");
System.out.println(" ACCOUNT BALANCE   <PRESS 2>");
System.out.println(" AMOUNT WITHDRAWAL <PRESS 3>");
System.out.println(" AMOUNT DEPOSIT    <PRESS 4>");
System.out.println(" CHANGE PIN.NO     <PRESS 5>");
System.out.println("CHOOSE YOUR OPTION");
int opt=sc.nextInt();

        switch(opt) {
        case 1:accDetails();
        break;
        case 2:accBalance();
        break;  
        case 3:amtWithDraw();
        break;
        case 4:  amtDeposit();
          break;
        case 5:  changePassword();
        break;
default:
System.out.println("NOT A VALID INPUT");
}
}
}
 static void accDetails(){
  
  System.out.println("ENETR YOUR TEN DIGIT ACCOUNT NUMBER:");
        int num=sc.nextInt();
        if(num==accno) {
        System.out.println("ENTER FOUR DIGIT PIN");
            int pn=sc.nextInt();
        if(pn==pin) {
        System.out.println("NANE : "+name);
        System.out.println("BRANCH : "+branch);
        System.out.println("ACCOUNT TYPE : "+acctp);
        System.out.println("THANK YOU VISIT AGAIN");
        }else {
        System.out.println("N0T A VALID PIN ");
        }
        }else {
        System.out.println("NOT A VALID ACCOUNT NUMBER");
        }
}
static void accBalance(){
  System.out.println("ENETR YOUR TEN DIGIT ACCOUNT NUMBER:");
          int num=sc.nextInt();
          if(num==accno) {
          System.out.println("ENTER FOUR DIGIT PIN");
          int pn=sc.nextInt();
               if(pn==pin) {
              System.out.println("YOUR ACCOUNT BALANCE IS "+balance);
               }else {
              System.out.println("NOT A VALID PIN");
               }
        }else {
        System.out.println("NOT A VALID ACCOUNT NUMBER ");
        }
}
static void amtWithDraw(){
  System.out.println("ENETR YOUR TEN DIGIT ACCOUNT NUMBER:");
        
        int num=sc.nextInt();
        if(num==accno) {
        System.out.println("ENTER FOUR DIGIT PIN");
        int pn=sc.nextInt();
             if(pn==pin) {
            System.out.println("ENTER THE AMOUNT ");
            int wd=sc.nextInt();
            if(wd<balance) {
            System.out.println("HERE IS YOUR AMOUNT");
            balance=balance-wd;
            System.out.println("BALANCE AMOUNT : "+balance);
            System.out.println("THANK YOU HAVE A NICE DAY");
            }else {
            System.out.println("NO SUFFICIENT BALANCE");
            }
             }else {
            System.out.println("NOT A VALID PIN");
             }
        }else {
        System.out.println("NOT A VALID ACCOUNT NUMBER");
        }
}
 static void amtDeposit(){
  System.out.println("ENETR YOUR TEN DIGIT ACCOUNT NUMBER:");
         int  num=sc.nextInt();
          if(num==accno) {
          System.out.println("ENTER FOUR DIGIT PIN");
          int pn=sc.nextInt();
              if(pn==pin) {
             System.out.println("ENTER DEPOSIT AMOUNT");
             int deptAmt=sc.nextInt();
             if(deptAmt>0 ) {
             balance=balance+deptAmt;
             System.out.println("PROCESS DONE");
             System.out.println("BALANCE AMOUNT: "+balance);
              }else {
             System.out.println("NOT A VALID AMOUNT ");
              }
              }else {
             System.out.println("NOT A VALID PIN");
            }
             
          }else {
          System.out.println("NOT A VALID ACCOUNT NUMBER");
          }
 }
  static void changePassword(){
    System.out.println("ENETR YOUR TEN DIGIT ACCOUNT NUMBER:");
          int num=sc.nextInt();
          if(num==accno) {
          System.out.println("ENTER FOUR DIGIT PIN");
          int pn=sc.nextInt();
               if(pn==pin) {
              System.out.println("ENTER YOUR OLD PIN");
              int pas=sc.nextInt();
              if(pas==pn) {
              System.out.println("ENTER YOUR NEW PIN");
              int sap=sc.nextInt();
              System.out.println("ENTER YOUR NEW PIN AGAIN");
              int kc=sc.nextInt();
              if(kc==sap) {
              pin=kc;
              System.out.println("PROCESS DONE");
              System.out.println("THANK YOU HAVE A NICE DAY");
              }else {
              System.out.println("NOT MATCHING");
              }
              }else {
              System.out.println("INVALID PIN");
              }
        }else {
        System.out.println("NOT A VALID PIN");
        }
}else {
System.out.println("NOT A VALID ACCOUNT NUMBER");
}
  }
}
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String userName, password;
        int right = 3,balance = 1500, select ,price;
        while (right>0){
            System.out.print("Enter The User Name: ");
            userName= input.nextLine();
            System.out.print("Enter The Password: ");
            password = input.nextLine();
            if (userName.equals("eralp") && password.equals("speytra")){
                System.out.println("Hello, Welcome ot Mart Bank!");
               do {
                   System.out.println("1- Para yatirma\n" + "2 - Para cekme \n" + "3- Ask Balance \n" + "4- Out");
                   System.out.print("Choose which businnes you need to do: ");
                   select = input.nextInt();
                   if (select == 1) {
                       System.out.print("Money Amount : ");
                        price = input.nextInt();
                       balance += price;
                   } else if (select == 2) {
                       System.out.print("Money Amount : ");
                        price = input.nextInt();
                       if (price > balance) {
                           System.out.println("Bakiye yetersiz.");
                       } else {
                           balance -= price;
                       }
                   } else if (select == 3) {
                       System.out.println("Bakiyeniz : " + balance);
                   }

               }while (select !=4);
                System.out.println("See you soon!");
                break;
            }
            else {
                right --;
                System.out.println("Acces Denied!!");
                if (right==0){
                    System.out.println("Accces Blocked!! Contact your bank");
                }
                else {
                    System.out.println("Entery right: " + right);
                }

            }
        }


    }
}

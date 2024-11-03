import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstName = "Salem";
        String lastName = "Almutairi";
        int age = 24;
        double amount = 189;
        boolean married = false;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(amount);

        String deposit = "Deposit";
        String withdraw = "Withdraw";
        System.out.println("The amount is " + amount +"KD");
        System.out.println("Would you like to "+ withdraw+ " or "+ deposit +" the amount?");

        int amount2 = 5;
        System.out.println(amount2+" plus "+amount2 +" makes " + (amount2+amount2));
        String fullName ="Jhon doe";
        System.out.println("My name is "+ fullName.substring(0,4)+ "and my lastname length is "+ fullName.substring(5).length() );

        //challange
        System.out.println(fullName.substring(5).startsWith("d"));

    }
    }




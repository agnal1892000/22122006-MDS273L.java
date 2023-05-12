
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.print("Enter employee gender (m/f): ");
        char gender = scanner.nextLine().charAt(0);
        
        System.out.print("Enter employee state : ");
        String state = scanner.nextLine();
        
        System.out.println("Employee name: " + name);
        System.out.println("Employee age: " + age);
        System.out.println("Employee salary: " + salary);
        System.out.println("Employee gender: " + (gender == 'm' ? "MALE" : "FEMALE"));
        System.out.println("Employee state : " + state);
        
        
        switch (state.toLowerCase()) {
            case "andhra pradesh":
            case "karnataka":
            case "kerala":
            case "tamil nadu":
            case "telangana":
            
                System.out.println("The Employee is from the southern states of India;Preferable work location  " + state);
                break;
            default:
                
        }
        switch(state.toLowerCase()){
            case "jammu and kashmir":
            case "himachal Pradesh":
            case "punjab":
            case  "uttarakhand":
            case "haryana":
            case "delhi":
            case "rajasthan":
            case "uttar pradesh":
            case "chandigarh":
            System.out.println("The Employee is from the northern states of India; Preferable work location "+state);
        }
        switch(state.toLowerCase()){
            case "nagaland":
            case "manipur":
            case "meghalaya":
            case "tripura":
            case "arunachal pradesh":
            case "assam":
            case "mizoram":
            case "sikkim":
            case "bihar":
            case "jarkhand":
            case "orissa":
            System.out.println("The Employee is from the western states of India; Preferable work location  "+state); 
        }
        switch(state.toLowerCase()){
        case "gujarat":
        case "rajasthan":
        case "goa":
        case "west bengal":
        
        System.out.println("The Employee is from the eastern states of India; Preferable work location "+state);
        }
        
        
        String[] topMncCompanies = {"Facebook", "Google", "Microsoft", "Samsung", "IBM", "Apple"};
        for (String company : topMncCompanies) {
            if (name.contains(company)) {
                System.out.println("The employee is working in Top MNC Companies");
                break;
            }
        }
    }
}


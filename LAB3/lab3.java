import java.util.Scanner;

public class lab3 {
  static String[] names = new String[1024];
  static String[][] details = new String[1024][5];
  static int count = 0;

  
  public static void collectDetails() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the details of the student:");
    System.out.print("Name: ");
    String name = scan.nextLine();
    if (searchName(name) != -1) {
      System.out.println("Details of this student are already entered!");
      return;
    }
    names[count] = name;
    System.out.print("Register Number: ");
    details[count][1] = scan.nextLine();
    System.out.print("Email: ");
    details[count][2] = scan.nextLine();
    System.out.print("Class: ");
    details[count][3] = scan.nextLine();
    System.out.print("Department: ");
    details[count][4] = scan.nextLine();
    count++;
  }

public static void displayDetails() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the name of the student: ");
    String name = scan.nextLine();
    int index = searchName(name);
    if (index == -1) {
      System.out.println("Details of this student are not found!");
      return;
    }
    System.out.println("Details of the student:");
    System.out.println("Name: " + names[index]);
    System.out.println("Register Number: " + details[index][1]);
    System.out.println("Email: " + details[index][2]);
    System.out.println("Class: " + details[index][3]);
    System.out.println("Department: " + details[index][4]);
  }

  // Function to search the name in the list of students
  public static int searchName(String name) {
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("Menu:");
      System.out.println("1. Enter the details of a student");
      System.out.println("2. Display the details of a student");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");
      int choice = scan.nextInt();
      switch (choice) {
        case 1:
          collectDetails();
          break;
        case 2:
          displayDetails();
          break;
        case 3:
          System.exit(0);
        default:
          System.out.println("Invalid choice! Try again.");
}
}
  }
}






import java.util.Scanner;
public class lab2 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int choice;
        while(true){
        System.out.println(" press 1 Enter the name:");
        System.out.println("press 2 search for a name");
        System.out.println("press 3 remove a name");

        String arr[]=new String[1024];
        for(int i=0;i<arr.length;i++){
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter name");
            String name=scan.nextLine();
            System.out.println("user input:"+ name);

            System.out.println(arr);
            System.out.println();
         for(String i:arr){ 
             System.out.print(i+" ");
         }

        



    }
    System.out.println("Make your choice");
    choice = Scanner.nextInt();
    

    
    
    



 

    
}
}
}



    


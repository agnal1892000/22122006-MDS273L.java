
import java.util.*;
public class lab2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String arr[]=new String[1024];
        int nameCount=0;
        char cont ='n';
do{
        System.out.println("1.Enter a name\n2.list all\n3.search a name\n4.remove a name");
        int userChoice=Integer.parseInt(scan.nextLine());
        switch(userChoice){
            case 1:
            System.out.println("enter the name to be inserted");
            String newName =scan.nextLine();
            boolean addName=false;
            if(nameCount ==0){
                addName =true;
            }else{
                for(int i=0;i<nameCount;i++){
                    if(!arr[i].equalsIgnoreCase(newName)){
                        addName=false;
                    }else{
                        addName=true;
                    }
                }
            }
            if(addName){
                arr[nameCount]=newName;
                nameCount +=1;
                System.out.println("name added successfully..!");
    
            }else{
                System.out.println("name exists..!");
            }
            break;
            case 2:
            System.out.println("list all names in the array:");
            for(int i=0;i<nameCount;i++){
                System.out.print(arr[i]+"\t");
            }
            break;
            case 3:
            System.out.print("enter the name to search:");
            String searchName=scan.nextLine();
            if(nameCount==0){
                System.out.println("empty array to be searched");

            }else{
                for(int i=0;i<nameCount;i++){
                    if(arr[i].equalsIgnoreCase(searchName)){
                        System.out.println("name fount at index: "+i);
                    }
                }
            }
            break;
            case 4:
            System.out.print("enter the name to delete:");
            String deleteName=scan.nextLine();
            if(nameCount==0){
                System.out.println("empty array to be searched");

            }else{
                int postionToRemove=-1;
                for(int i=0;i<nameCount;i++){
                    if(arr[i].equalsIgnoreCase(deleteName)){
                       // System.out.println("name fount at index: "+i);
                       postionToRemove=i;
                    }
                }
                if(postionToRemove!=-1 || nameCount==0){
                    for(int i=postionToRemove;i<nameCount;i++){
                        arr[i]=arr[i+1];
                    }
                    nameCount=nameCount-1;
                }
            }
            break;
            default:
System.out.println("invalid choice..!");



        }

        //perform the operations
        System.out.println("press 'y' to continue..");
    
        cont=scan.nextLine().charAt(0);




    }
    while(cont=='y' ||cont=='Y');
    System.out.println("program over ..!");
    
}
}

    
    
    



 



    


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class student{
    String regno;
    String name;
    String email;
    int phone;
    String Class;
    String department;
     
    student(String regno,String name,String email,int phone,String Class,String department){
        this.regno=regno;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.Class=Class;
        this.department=department;
    }
    void printDetails(){
        System.out.println("Reg no:"+regno);
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Phone:"+phone);
        System.out.println("Class:"+Class);
        System.out.println("Department:"+department);
    }
    void printStudent(){
        System.out.println(name +"\t"+Integer.toString(phone));
    

    }  

    void display(){
        System.out.println(this.regno + "|"+this.name+"|"+this.email+"|"+this.phone+"|"+this.Class+"|"+this.department);
    
 }
 boolean search(String name,String regno){
    boolean result=(name.equalsIgnoreCase(name))&&(regno.equalsIgnoreCase(regno));
    if(result){
        printDetails();
    }
    return result;
    }
    }


    


public class lab6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        student[] Stdetails=new student[100];
        int ch; 
        int count=0;

        
        do{
            System.out.println("Enter 1:to add student,2:search for a student,3:display details,4:to end the program");
            
            ch=Integer.parseInt(scan.nextLine());
            

            switch(ch){
                case 1:
                System.out.println("Enter the Reg no:");
                 String regno=scan.nextLine();
        
                System.out.println("Enter your name");
                String name=scan.nextLine();
        
                System.out.println("Enter your email");
                String email=scan.nextLine();
        

                System.out.println("Enter your phone number");
                int phone=scan.nextInt();
       
                System.out.println("Enter your class");
                String Class=scan.nextLine();
        
                System.out.println("Enter your Department");
               String department=scan.nextLine();
               Stdetails[count]=new student(regno,name,email,phone,Class,department);
                
                count+=1;
                String filename=name+".txt";
                try{
                    File file=new File(filename);
    
                   /// FileWriter write=new FileWriter(file,true); 
                    if(file.exists()){
                        System.out.println("File exixts..");
                        FileWriter write=new FileWriter(file,true); 
                        write.write("\nregno"+regno+"\nname"+name+"\nemail"+email+"\nphone"+phone+"\nclass"+Class+"\ndepartment"+department);
                        write.close();
                    }else{
                        System.out.println("File is missing");
                        if(file.createNewFile()){
                            System.out.println("File created");
                            FileWriter write=new FileWriter(file,true); 
                            write.write("\nregno"+regno+"\nname"+name+"\nemail"+email+"\nphone"+phone+"\nclass"+Class+"\ndepartment"+department);
                        write.close();
                        }else{
                            System.out.println("File creation error");
                        }
                    }
                    
// FileWriter write =new FileWriter(file);
//                     write.write("File write");
//                     write.close();
        
                
                    Scanner sc= new Scanner(file);
                    while(scan.hasNextLine()){
                        System.out.println(scan.nextLine()); 
                    }
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            
                break;

                case 2:
                System.out.println("Enter the regno of the student you want to search");
                String reg=scan.nextLine();
                System.out.println("Enter the name of the student you want to search");
                String name1=scan.nextLine();
                boolean found=false;
                for(int i=0;i<count;i++){
                    if(Stdetails[i].search(name1,reg))
                  {
                    found=true;
                    break;
                }}
                if(!found){
                    System.out.println("Student not found");

                }break;
                
                case 3:
                for(int i=0;i<count;i++){
                    Stdetails[i].printDetails();
                }
                break;

                case 4:
                System.out.println("end");
                break;  
            }
           }
           while(ch!=4);
                
      }
     
    

    }
           

    
    


        
    


import java.io.*;

import java.util.*;

public class lab7 {

 
    static void   Mean(float[] arr,int m){
    float sum=0;
    for(int i=0;i<m;i++){
        sum+=arr[i];

    }float mean=sum/m;
    System.out.println("mean="+mean) ;
    }



    static float[] sort(float[] arr,int n){

        float temp=0;
        for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 
                 if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
             }
            }return arr;   
    }


    static void median(float arr[],int n){
     float[] arr1=sort(arr,n);
     if(arr1.length%2==0){
        int a=(n/2);
        int b=a+1;
       double median=(arr1[a-1]+arr1[b-1])/(2.0);
       System.out.println("median="+median);
       }
       else{
        double median=((arr1[(n)/2]));
        System.out.println("median="+median);
       }
    }

    
    
    static void mode(float[] arr,int l){
        
      
            int max=0;
            float max_val=0;
             int n=arr.length;
             //int m_arr[]=new int[n];
             for(int i=0;i<n;i++){
              int count=0;
              for(int j=i+1;j<n;j++){
                  if(arr[i]==arr[j]){
                      count+=1;
                  }
              }
             if(count>max){
              max=count;
              max_val=arr[i];
             }
      
             
            
             }
      
             System.out.println("mode="+max_val);
           
             
          
        
    }


        static void max(float[] arr,int n){
            float[] arr1 = sort(arr,n);
            float max = arr1[n-1];
            System.out.println("max="+max);;
        }

        static void min(float[] arr,int n){
            float[] arr1 = sort(arr,n);
            float min = arr1[0];
            System.out.println("min="+min);
        }
    

        
    

public static void main(String[] args ) {
    String[][] arr=new String[1024][6];
    int n=0;   
    
    try{
        
        
    File file = new File("Iris.csv");
    Scanner scan = new Scanner(file);
    
    while (scan.hasNextLine()) { 
        
        String temp=scan.nextLine();
        arr[n]=temp.split(",");
        n++;
    } scan.close();

    }
    catch(Exception io){
        System.out.println(io.getMessage());
    }

     n--; 
    float[] seplen =new float[n];
    float[] sepwid =new float[n];
    float[] petlen =new float[n];
    float[] petwid =new float[n];
    String[] species =new String[n];
    
    for(int i =1;i<=n;i++){
        seplen[i-1]=Float.parseFloat(arr[i][1]);
        sepwid[i-1]=Float.parseFloat(arr[i][2]);
        petlen[i-1]=Float.parseFloat(arr[i][3]);
        petwid[i-1]=Float.parseFloat(arr[i][4]);
        species[i-1]=arr[i][5];
}
    float[][] total = {seplen, sepwid, petlen, petwid};
    float[][] setosa =new float[4][n]; 
    float[][] versicolor =new float[4][n]; 
    float[][] virginica =new float[4][n];
    int setCount = 0;
    int verCount = 0; 
    int virCount = 0; 
    for(int i = 0; i < n; i++){
        if(species[i].equals("setosa")){
            
            for(int j = 0; j < 4; j++){
                setosa[j][setCount] = total[j][i];
            }
            setCount++; 
        }
        else if(species[i].equals("versicolor")){
            
            for(int j = 0; j < 4; j++){
                versicolor[j][verCount] = total[j][i];
            }
            verCount++; 
        }
        else if(species[i].equals("virginica")){
            
            for(int j = 0; j < 4; j++){
                virginica[j][virCount] = total[j][i];
            }
            virCount++; 
        }
    }
    float[] seplen_set =new float[setCount];
    float[] sepwid_set =new float[setCount];
    float[] petlen_set =new float[setCount];
    float[] petwid_set=new float[setCount];
    for(int i =1;i<setCount;i++){
        seplen_set[i]=setosa[1][i];
        sepwid_set[i]=setosa[2][i];
        petlen_set[i]=setosa[3][i];
        petwid_set[i]=setosa[4][i];
    }

System.out.println("###############################################");
System.out.println("summary of sepal length:");
Mean(seplen,n);
median(seplen,n);
mode(seplen,n);
max(seplen,n);
min(seplen,n);
System.out.println("###############################################");

System.out.println("summary of sepal width:");
Mean(sepwid,n);
median(sepwid,n);
mode(sepwid,n);
max(sepwid,n);
min(sepwid,n);
System.out.println("###############################################");

System.out.println("summary of petal length:");
Mean(petlen,n);
median(petlen,n);
mode(petlen,n);
max(petlen,n);
min(petlen,n);
System.out.println("###############################################");

System.out.println("summary of petal width:");
Mean(petwid,n);
median(petwid,n);
mode(petwid,n);
max(petwid,n);
min(petwid,n);
System.out.println("###############################################");

System.out.println("summary of setosa sepal length:");
 Mean(seplen_set,setCount);
 median(seplen_set,setCount);

}
}

    
    


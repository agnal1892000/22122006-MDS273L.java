
import java.io.*;
import java.util.*;

public class lab7{

    public static float max(float[] a){
        float max_val = -100.f;
        for(float k:a){
            if(k > max_val){
                max_val = k;
            }
        }
        return max_val;
    }

    public static float min(float[] a){
        float min_val = 1000.f;
        for(float k:a){
            if(k < min_val){
                min_val = k;
            }
        }
        return min_val;
    }

    public static float mean(float[] a){
        float sum = 0;
        for(float i: a){
            sum += i;
        }
        float mean = sum/(a.length);
        return mean;
    }

    public static int[] frequency(float[] arr ){
        int [] freq = new int [arr.length];
        int num = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;            
                    freq[j] = num;
                }
            }
            if(freq[i] != num)
            freq[i] = count;
        }
        return freq;
    }

    public static float mode(float[] a){
        int[] f= frequency(a);
        int max = 0;
        int max_index = 0;
        for(int i = 0; i < f.length; i++){  
            if(f[i] != -1){
                if(max > f[i]){
                    max = f[i];
                    max_index = i;
                }
            }
        }	
        return a[max_index];
    }

    public static float[] sort(float[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                float tmp = 0;
                if (arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    
    public static float median(float[] a){
        float[] sorted_array = sort(a);
        if(sorted_array.length%2 == 1){
            return (float)sorted_array[a.length/2];
        }
        else{
            return (float)(sorted_array[a.length/2] + sorted_array[a.length/2 +1])/2;  
        }
    }

    public static void display(float[] sl,float[] sw,float[] pl,float[] pw) {
    
        
        System.out.printf(" SEPAL LENGTH ");
        System.out.printf("Mean",mean(sl));
        System.out.printf("Median",median(sl));
        System.out.printf("Mode",mode(sl));
        System.out.printf("Max",max(sl));
        System.out.printf("Min",min(sl));
        

        
      
        System.out.printf(" SEPAL WIDTH ");
        System.out.printf("Mean",mean(sw));
        System.out.printf("Median",median(sw));
        System.out.printf("Mode",mode(sw));
        System.out.printf("Max",max(sw));
        System.out.printf("Min",min(sw));
        

        System.out.printf("PETAL LENGTH");
        System.out.printf("Mean",mean(pl));
        System.out.printf("Median",median(pl));
        System.out.printf("Mode",mode(pl));
        System.out.printf("Max",max(pl));
        System.out.printf("Min",min(pl));
        


        
        System.out.printf("PETAL WIDTH");
        System.out.printf("Mean",mean(pw));
        System.out.printf("Median",median(pw));
        System.out.printf("Mode",mode(pw));
        System.out.printf("Max",max(pw));
        System.out.printf("Min",min(pw));
    
    }  
    
    public static void main(String[] args) {
        try{
        File csv = new File("Iris.csv");
        Scanner sc = new Scanner(csv);
        sc.nextLine();
        sc.useDelimiter(",");
        float[] sl = new float[150];
        float[] sw = new float[150];
        float[] pl = new float[150];
        float[] pw = new float[150];
        int k = 0;
        System.out.println(sc.next());
        System.out.println(sc.nextFloat());
        System.out.println(sc.nextFloat());
        System.out.println(sc.nextFloat()); 
        System.out.println(sc.nextFloat());
        System.out.println(sc.nextLine());

        while(sc.hasNextLine()){
        sc.next();
        sl[k] = Float.parseFloat(sc.next());
        sw[k] = Float.parseFloat(sc.next());
        pl[k] = Float.parseFloat(sc.next());
        pw[k] = Float.parseFloat(sc.next());
        sc.nextLine();
        k++;
        sc.close();
        }
        
        
        System.out.printf("The Total Statistics");
        

        display(sl,sw,pl,pw);
        Scanner scan = new Scanner(csv);
        scan.nextLine();
        scan.useDelimiter(",");
        String s[] = {"SETOSA" , "VERSICOLOR" , "VIRGINICA"};

        float[] sl1 = new float[50];
        float[] sw1 = new float[50];
        float[] pl1 = new float[50];
        float[] pw1 = new float[50];

        for(String o:s){

            
            System.out.printf("",o);
            

            for(int i = 0;i<50;i++){

                scan.next();
                sl1[i] = Float.parseFloat(scan.next());
                sw1[i] = Float.parseFloat(scan.next());
                pl1[i] = Float.parseFloat(scan.next());
                pw1[i] = Float.parseFloat(scan.next());
                scan.nextLine();
            }
            display(sl1,sw1,pl1,pw1);
            scan.close();
        }
        } catch(Exception e){
        System.out.println(e.getMessage());
        }
    }
}
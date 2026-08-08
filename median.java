import java.util.Scanner;
class demo{
    void sort(int arr[]){
         int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1])
                {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }
    public double Median(int arr[]){
        int a=arr.length;
        double median;
        if (a%2==0){
             return median = ((arr[a/2] + arr[(a-1)/2])/2);
        }
        else{
             return median =(arr[a/2]);
        }
        
    }
}

public class median {
    public static void main(String args[])
    {
        demo d=new demo();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no elements for 1st array");
        int m=sc.nextInt();
        int arr1[] = new int[m];
        System.out.println("Enter the no of elements for the 2nd array");
        int n=sc.nextInt();
        int arr2[]=new int[n];
        System.out.println("enter the values for the 1 st array");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the values for the 2nd array");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        d.sort(arr1); 
        d.sort(arr2);
        System.out.println("The Median of 1st array is :"+d.Median(arr1));
        System.out.println("the median of 2nd array is:"+d.Median(arr2));
        double sum=(d.Median(arr1)) + (d.Median(arr2));
        System.out.println("The median of both the arrays is" +sum/2);
    }
}

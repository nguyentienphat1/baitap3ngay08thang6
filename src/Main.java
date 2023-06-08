import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int x;
        int v;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n= scanner.nextInt();
        System.out.println("nhap x");
        x= scanner.nextInt();
        System.out.println("nhap v");
        v= scanner.nextInt();
        int array[] = new int[n];
        for(int i=0 ; i<n ;i++){
            System.out.println("gia tri phan tu : "+i);
            array[i]= scanner.nextInt();
        }
        int array1[] = new int[n+1];
        for (int i=0;i<n;i++){
            array1[i]= array[i];
        }
        for (int i= array1.length-1;i>v;i--) {
                array1[i]=array1[i-1];
        }
        array1[v] = x;

        for (int i=0;i< array1.length;i++){
            System.out.println(array1[i]);
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

ArrayExample arrayExample=new ArrayExample();
Integer[] arr =arrayExample.random();

        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap phan tu bat ky");
        int x= scanner.nextInt();

        try {
            System.out.println("gia tri cua phan tu : "+x +"La : "+arr[x]);

        }catch (IndexOutOfBoundsException exception){
            System.out.println(" chi so vuot qua giowi han : ");
        }
    }
    public static Integer[] random(){
        Random rd =new Random();
        Integer[]arr =new Integer[100];
        System.out.println("Danh sach phan tu cua mang");
        for (int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(100)+10;
            System.out.println(arr[i]+"");
        }
        return arr;
    }
}

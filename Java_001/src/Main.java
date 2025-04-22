import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void nhapMang(int[][] arr, int row, int col){
        for(int i=0; i< row ; i++){
            for(int j=0; j< col; j++){
                System.out.println("Nhap phan tu tai vi tri a[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void xuatMang(int[][] arr, int row, int col){
        for(int i=0; i< row ; i++){
            for(int j=0; j< col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int tinhTongDuongCheoChinh(int[][] arr, int row, int col){
        int sum =0;
        for(int i=0; i< row ; i++){
            for(int j=0; j< col; j++){
                if(i == j){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int tinhTongDuongCheoPhu(int[][] arr, int row, int col){
        int sum =0;
        for(int i=0; i< row ; i++){
            for(int j=0; j< col; j++){
                if(j == col - i - 1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Nhap so hang: ");
        int row = sc.nextInt();
        System.out.println("Nhap so cot: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        nhapMang(arr, row, col);
        System.out.println("Mang 2 chieu vua nhap la: ");
        xuatMang(arr, row, col);
        System.out.println("Tong duong cheo chinh: " + tinhTongDuongCheoChinh(arr, row, col));
        System.out.println("Tong duong cheo phu: " + tinhTongDuongCheoPhu(arr, row, col));
    }
}
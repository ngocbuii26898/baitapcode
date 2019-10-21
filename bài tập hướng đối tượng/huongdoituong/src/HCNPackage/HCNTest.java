package HCNPackage;

import java.util.Scanner;

public class HCNTest extends Hinhchunhat{

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap So Phan Tu Cua Mang : ");
        int n = scan.nextInt();
        System.out.println();

        Hinhchunhat[] arrayHCN = new HCNTest[n];
       
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin HCN thu " +(i+1));
            arrayHCN[i] = new HCNTest();
            System.out.print("Nhap Chieu Dai = ");
            int cd = scan.nextInt();
            System.out.print("Nhap Chieu Rong = ");
            int cr = scan.nextInt();
            arrayHCN[i].setDaiRong(cd, cr);
        }
        xuatMang(arrayHCN);
        thongTinHCNLonNhat(arrayHCN);
    }
    public static void xuatMang(Hinhchunhat[] arrayHCN){
       
        for (int i = 0; i < arrayHCN.length; i++) {
            System.out.println("Thong Tin HCN Thu " +(i+1)+" La :");
            System.out.println("Chieu Dai = " +arrayHCN[i].getChieuDai());
            System.out.println("Chieu Rong = " +arrayHCN[i].getChieuRong());
            System.out.println("Dien Tich = " +arrayHCN[i].DientichHCN());
        }
    }
    public static void thongTinHCNLonNhat(Hinhchunhat[] arrayHCN){
        int max = arrayHCN[0].DientichHCN();
        for (int i = 1; i < arrayHCN.length; i++) {
            if (max < arrayHCN[i].DientichHCN()) {
                max = arrayHCN[i].DientichHCN();
            }
        }
        for (int i = 0; i < arrayHCN.length; i++) {
            if (arrayHCN[i].DientichHCN() == max) {
                System.out.println("Thong Tin HCN Lon Nhat");
                System.out.println("Chieu Dai = " +arrayHCN[i].getChieuDai());
                System.out.println("Chieu Rong = " +arrayHCN[i].getChieuRong());
                System.out.println("Dien Tich = " +arrayHCN[i].DientichHCN());
            }
        }
       
    }
}

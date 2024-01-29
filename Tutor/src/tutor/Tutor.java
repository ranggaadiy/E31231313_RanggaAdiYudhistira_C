/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutor;

/**
 *
 * @author rangg
 */
public class Tutor {
    public static void main(String[] args) {
    int bulan = 4;
    switch(bulan)
{
        case 1:
            System.out.println("pertama");
        case 2:
            System.out.println("kedua");
        case 3:
            System.out.println("kuartal 1");
            break;
        case 4:
            System.out.println("keempat");
        case 5:
        case 6:
            System.out.println("kuartal 2");
            break;
        case 7:
        case 8:
        case 9:
            System.out.println("kuartal 3");
            break;
        default:
            System.out.println("kuartal 4");
}
    System.out.println("keluar dari switch");
   }
}
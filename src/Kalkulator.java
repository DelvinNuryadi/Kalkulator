import java.util.Scanner;
public class Kalkulator {
    
    private int number1;
    private int number2;
    private double hasil;
    private int choice;
    private Scanner input;

    public Kalkulator(){
        input = new Scanner(System.in);
        System.out.println("PILIH OPERATOR");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("input angka : ");
        choice = input.nextInt();

        System.out.print("angka pertama : ");
        number1 = input.nextInt();

        System.out.print("angka kedua : ");
        number2 = input.nextInt();
    
        switch(choice){
            case 1:
            hasil = number1 + number2;
            System.out.println("hasilnya adalah : "+hasil);
            break;
            case 2:
            hasil = number1 - number2;
            System.out.println("hasilnya adalah : "+hasil);
            break;
            case 3:
            hasil = number1 * number2;
            System.out.println("hasilnya adalah : "+hasil);
            break;
            case 4:
            hasil = number1 / number2;
            System.out.println("hasilnya adalah : "+hasil);
            break;
            default:
            System.out.println("tidak memilih apa apa");
        }

    }

    public void setNumber1(int number1){
        this.number1 = number1;
    }

    public int getNumber1(){
        return number1;
    }

    public void setNumber2(int number2){
        this.number2 = number2;
    }

    public int getNumber2(){
        return number2;
    }
}

import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int firstside,secondside;
        double hipotenus ;
        Scanner input=new Scanner(System.in);
        System.out.println("Üçgenin birinci kenar uzunluğunu giriniz: ");
        firstside=input.nextInt();
        System.out.println("üçgenin ikinci kenar uzunluğunu giriniz: ");
        secondside=input.nextInt();

         hipotenus=Math.sqrt((firstside*firstside)+(secondside*secondside));
        System.out.print("Ücgenin Hipotenüsü:"+hipotenus);





    }



}

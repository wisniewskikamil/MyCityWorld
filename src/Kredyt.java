import java.util.Scanner;

public class Kredyt{

    public static int dzien_kredytu = 0, dzien_splaty = 0, pozyczka = 0, splata = 0;

    public void kredyt(){

        Scanner scan = new Scanner(System.in);

        if(pozyczka == 0) {

            System.out.println("Możesz teraz wziąć kredyt z banku.\n" +
                    "Pamiętaj jesnak, że po 10 dniach trzeba spłacić to co pożyczysz i dać dodatkowo 10%\n" +
                    "Nie możesz pożyczyć więcej niż 2000zł");

            System.out.println("Ile kredytu chcesz wziąć?");

            System.out.print("Biorę: ");
            pozyczka = scan.nextInt();

            if (pozyczka <= 2000 && pozyczka > 0) {
                Gra.kasa = Gra.kasa + pozyczka;
                dzien_kredytu = Gra.dzien;
                dzien_splaty = dzien_kredytu + 10;
                splata = (int) (pozyczka * 1.1);
            } else {
                System.out.println("Wybrałeś niepoprawną kwotę.");
                Gra.dzien--;
            }
        }else{
            System.out.println("Najpierw musisz spłacić poprzedni kredyt");
            Gra.dzien--;
        }
    }
}

import java.util.Scanner;

public class Budowanie{
    public void budowanie(){

        Scanner scan = new Scanner(System.in);


        System.out.println("Obywatele miasta: "+Gra.obywatele);
        System.out.println("Budżet: " + Gra.kasa);
        System.out.println("\n");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("- - - - - Co chciałbyś wybudować? - - - - - ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("- - 1. Altana (koszt 200zł; ludzie + 20)- - ");
        System.out.println("- - 2. Chata (koszt 380zł; ludzie + 50)- - -");
        System.out.println("- - 3. Dom (koszt 550zł; ludzie + 112)- - - ");
        System.out.println("-4. Wieżowiec (koszt 1000zł; ludzie + 250)- ");
        System.out.println("-5. Apartament (koszt 1800zł; ludzie + 500)-");
        System.out.println("- - - - - - - - 6. Wróć do gry - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - ");

        System.out.print("Wybieram: ");

        Wybieranie wybieranie = new Wybieranie();
        wybieranie.wybieranie();

        if (Wybieranie.wybor == 1) {

                Gra.kasa = Gra.kasa - 200;
                Gra.obywatele = Gra.obywatele + 20;
                System.out.println("Wybudowałeś altanę.");
                Gra.altana = Gra.altana + 1;

            } else if (Wybieranie.wybor == 2) {

                Gra.kasa = Gra.kasa - 380;
                Gra.obywatele = Gra.obywatele + 50;
                System.out.println("Wybudowałeś chatę.");
                Gra.chata = Gra.chata + 1;

            } else if (Wybieranie.wybor == 3) {

                Gra.kasa = Gra.kasa - 550;
                Gra.obywatele = Gra.obywatele + 112;
                System.out.println("Wybudowałeś dom.");
                Gra.dom = Gra.dom + 1;

            } else if (Wybieranie.wybor == 4) {

                Gra.kasa = Gra.kasa - 1000;
                Gra.obywatele = Gra.obywatele + 250;
                System.out.println("Wybudowałeś wieżowiec.");
                Gra.wiezowiec = Gra.wiezowiec + 1;

            } else if (Wybieranie.wybor == 5) {

                Gra.kasa = Gra.kasa - 1800;
                Gra.obywatele = Gra.obywatele + 500;
                System.out.println("Wybudowałeś apartament.");
                Gra.apartament = Gra.apartament + 1;

            } else if (Wybieranie.wybor == 6) {

                Gra.dzien--;

            }else {
            System.out.println("Wybierz ponownie cyfrę z zakresu 1-6");
            Budowanie budowanie = new Budowanie();
            budowanie.budowanie();
        }
    }
}

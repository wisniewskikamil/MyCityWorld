import java.util.Scanner;

public class Zarabianie {

    public void zarabianie(){

        Zarabianie zarabianie = new Zarabianie();

        Scanner scan = new Scanner(System.in);

        System.out.println("Obywatele miasta: "+Gra.obywatele);
        System.out.println("Budżet: " + Gra.kasa);
        System.out.println("\n");

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("- - - - - - - - - - - Co chciałbyś wybudować? - - - - - - - - - - - ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("- - 1. Garaże pod wynajem (koszt 300zł; ludzie - 10; zarobek 10)- - ");
        System.out.println("- - - - - 2. Sklep (koszt 400zł; ludzie - 15; zarobek 25)- - - - - -");
        System.out.println("- - - - 3. Klub nocny (koszt 600zł; ludzie - 50; zarobek 60) - - - -");
        System.out.println("- - - - 4. Restauracja (koszt 800zł; ludzie - 100; zarobek 120)- - -");
        System.out.println("- - - - 5. Korporacja (koszt 2000zł; ludzie - 500; zarobek 250)- - -");
        System.out.println("- - - - - - - - - - - - - 6. Wróć do gry - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.print("Wybieram: ");

        Wybieranie wybieranie = new Wybieranie();
        wybieranie.wybieranie();

        if (Wybieranie.wybor == 1) {

            if(Gra.obywatele>=10){
                Gra.kasa = Gra.kasa - 300;
                Gra.obywatele = Gra.obywatele - 10;
                Gra.zarobek = Gra.zarobek + 10;
                System.out.println("\n\nWybudowałeś garaże pod wynajem.\n\n");
                Gra.garaz = Gra.garaz + 1;
            }else{
                System.out.println("\n\nMasz za mało wolnych obywateli\n\n");
                zarabianie.zarabianie();
            }

        } else if (Wybieranie.wybor == 2) {

            if(Gra.obywatele>=15) {
                Gra.kasa = Gra.kasa - 400;
                Gra.obywatele = Gra.obywatele - 15;
                Gra.zarobek = Gra.zarobek + 25;
                System.out.println("\n\nWybudowałeś sklep.\n\n");
                Gra.sklep = Gra.sklep + 1;
            }else{
                System.out.println("\n\nMasz za mało wolnych obywateli\n\n");
                zarabianie.zarabianie();
            }

        } else if (Wybieranie.wybor == 3) {

            if(Gra.obywatele>=50) {
                Gra.kasa = Gra.kasa - 600;
                Gra.obywatele = Gra.obywatele - 50;
                Gra.zarobek = Gra.zarobek + 60;
                System.out.println("\n\nWybudowałeś klub nocny.\n\n");
                Gra.klub = Gra.klub + 1;
            }else{
                System.out.println("\n\nMasz za mało wolnych obywateli\n\n");
                zarabianie.zarabianie();
            }

        } else if (Wybieranie.wybor == 4) {

            if(Gra.obywatele>=100) {
                Gra.kasa = Gra.kasa - 800;
                Gra.obywatele = Gra.obywatele - 100;
                Gra.zarobek = Gra.zarobek + 120;
                System.out.println("\n\nWybudowałeś restauracje.\n\n");
                Gra.restauracja = Gra.restauracja + 1;
            }else{
                System.out.println("\n\nMasz za mało wolnych obywateli\n\n");
                zarabianie.zarabianie();
            }

        } else if (Wybieranie.wybor == 5) {

            if(Gra.obywatele>=500) {
                Gra.kasa = Gra.kasa - 2000;
                Gra.obywatele = Gra.obywatele - 500;
                Gra.zarobek = Gra.zarobek + 250;
                System.out.println("\n\nWybudowałeś korporacje.\n\n");
                Gra.korporacja = Gra.korporacja + 1;
            }else{
                System.out.println("\n\nMasz za mało wolnych obywateli\n\n");
                zarabianie.zarabianie();
            }

        } else if (Wybieranie.wybor == 6) {

            Gra.dzien--;

        }else{
            System.out.println("\n\nWybierz ponownie cyfrę z zakresu 1-6\n\n");
            zarabianie.zarabianie();
        }

    }
}

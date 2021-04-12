public class Gra{

    public static int kasa = 2000, obywatele = 0, dzien = 1, zarobek = 1, ost_dzien=1;
    public static int altana = 0, chata = 0, dom = 0, wiezowiec = 0, apartament = 0;
    public static int garaz = 0, sklep = 0, klub = 0, restauracja = 0, korporacja = 0;
    public static int wygrana = 3000;

    public void gra(){

        int przegrana = -1000, pouczenie = 0, czekanie = 1, max_czekanie = 10, dochod = 0;


            for (;;dzien++) {


                if(Kredyt.dzien_splaty == dzien){
                    kasa = kasa - Kredyt.splata;
                    Kredyt.pozyczka = 0;
                }

                if(ost_dzien == dzien - 1) {
                    if(Trudnosc.poziom_trudnosci==1) {
                        dochod = (int) (zarobek * 1.2);
                        kasa = kasa + dochod;
                    }else if(Trudnosc.poziom_trudnosci==2){
                        kasa=kasa+zarobek;
                    }else{
                        dochod = (int) (zarobek * 0.8);
                        kasa = kasa + dochod;
                    }
                }

                ost_dzien=dzien;

                if(kasa<=0 && pouczenie == 0 && kasa>=przegrana){
                    System.out.println("Dostaniesz kolejną szansę. Bank daje ci możliwość posiadania debetu na koncie do " + przegrana + "zł");
                    pouczenie++;
                }
                if(kasa<przegrana){
                    System.out.println("Niestety Twoje miasto zbankrutowało... Spróbuj ponownie");
                    break;
                }
                if(obywatele < wygrana) {
                    System.out.println("\n\n\n");
                    System.out.println("Obywatele miasta: "+obywatele);
                    System.out.println("Budżet: " + kasa);
                    System.out.println("Dzień: " + dzien);

                    if(Kredyt.pozyczka > 0){
                        System.out.println("Dzień wzięcia kredytu: " + Kredyt.dzien_kredytu);
                        System.out.println("Dzień spłaty kredytu: " + Kredyt.dzien_splaty);
                        System.out.println("Do oddania dla banku: " + Kredyt.splata);
                    }

                    System.out.println("\n");
                    System.out.println("- - - - - - - - - - - - ");
                    System.out.println("- - - - MENU GRY - - - -");
                    System.out.println("- - - - - - - - - - - - ");
                    System.out.println("- - 1. Buduj miasto- - -");
                    System.out.println("- - 2. Buduj gospodarkę-");
                    System.out.println("- - - 3. Kredyt - - - - ");
                    System.out.println("- - 4. Pokaż dobytek - -");
                    System.out.println("- - - 5. Czekaj - - - - ");
                    System.out.println("- - - 6. Wyjście - - - -");
                    System.out.println("- - - - - - - - - - - - ");

                    System.out.print("\nWybieram: ");

                    Wybieranie wybieranie = new Wybieranie();
                    wybieranie.wybieranie();


                    if (Wybieranie.wybor == 1) {

                        Budowanie budowanie = new Budowanie();
                        budowanie.budowanie();

                    } else if (Wybieranie.wybor == 2) {

                        Zarabianie zarabianie = new Zarabianie();
                        zarabianie.zarabianie();

                    } else if (Wybieranie.wybor == 3) {

                        Kredyt kredyt = new Kredyt();
                        kredyt.kredyt();

                    } else if (Wybieranie.wybor == 4){

                        Dobytek dobytek = new Dobytek();
                        dobytek.dobytek();

                    } else if (Wybieranie.wybor == 5) {

                        if(czekanie <= max_czekanie){
                            System.out.println("Pominąłeś turę.\nWykorzystane pominięcia "+czekanie+"/"+max_czekanie);
                            czekanie++;
                        }else{
                            System.out.println("Wykorzystałeś już wszystkie pominięcia.");
                            dzien--;
                        }

                    } else if(Wybieranie.wybor == 6){

                        break;

                    } else {
                        System.out.println("BŁĄD!!! Wybierz ponownie cyfrę z zakresu 1-6 ");
                        dzien--;
                    }
                }else if(obywatele == wygrana) {
                    System.out.println("Gratulacje wygrałeś :) Twoje miasto osiągnęło liczbę " + wygrana + " mieszkańców");
                    break;
                } else if(obywatele > wygrana){
                    System.out.println("Gratulacje wygrałeś :) Twoje miasto osiągnęło liczbę ponad " + wygrana + " mieszkańców");
                    break;
            }
        }
    }
}

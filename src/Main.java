public class Main {

    public static void main(String[] args2) {

        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - Witaj w MyCityWorld - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");

        System.out.println("\n\n\n");

        for(;;) {
            System.out.println("- - - - - - - - - - - - - - - -");
            System.out.println("- - - - 1. Zacznij grę - - - - ");
            System.out.println("- - - - 2. Instrukcja - - - - -");
            System.out.println("- - - 3. Informacje o grze - - -");
            System.out.println("- - - - 4. Zakończ grę - - - - ");
            System.out.println("- - - - - - - - - - - - - - - -");

            System.out.print("\nWybieram: ");

            Wybieranie wybieranie = new Wybieranie();
            wybieranie.wybieranie();

            if (Wybieranie.wybor == 1) {

                Trudnosc trudnosc = new Trudnosc();
                trudnosc.trudnosc();
                Gra gra = new Gra();
                gra.gra();

            } else if (Wybieranie.wybor == 2) {

                Instrukcja instrukcja = new Instrukcja();
                instrukcja.instrukcja();

            } else if (Wybieranie.wybor == 3) {

                Informacje informacje = new Informacje();
                informacje.informacje();

            } else if(Wybieranie.wybor == 4){

                break;

            } else {
                System.out.println("BŁĄD!!! Wybierz ponownie cyfrę z zakresu 1-4 \n\n");
            }
        }
        System.out.println("\n\n\nDo zobaczenie ponownie ;)");
    }
}

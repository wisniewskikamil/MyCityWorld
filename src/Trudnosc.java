public class Trudnosc {

    public static int poziom_trudnosci;

    public void trudnosc(){

        System.out.println("\n\nWybierz poziom trudności: \n" +
                "1. ŁATWY  (dostajesz od państwa dotacje w wysokości 20% dochodu)\n" +
                "2. ŚREDNI (radzisz sobie sam)\n" +
                "3. TRUDNY (płacisz podatek w wysokości 20% dochodu)\n\n");

        System.out.print("Wybieram: ");

        Wybieranie wybieranie = new Wybieranie();
        wybieranie.wybieranie();

        poziom_trudnosci = Wybieranie.wybor;

        if(poziom_trudnosci==0 || poziom_trudnosci>3){

            System.out.println("\n\nWybierz prawidłowy poziom trudności\n\n");
            Trudnosc trudnosc = new Trudnosc();
            trudnosc.trudnosc();

        }


    }
}

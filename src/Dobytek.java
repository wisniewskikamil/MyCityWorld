public class Dobytek {
    public void dobytek(){

        System.out.println("Twoje miasto posiada "+ Gra.obywatele + " wolnych obywateli.\n" +
                "Aktualny budżet Twojego miasta to " + Gra.kasa + "zł.\n" +
                "Ogólny przychód dla miasta na turę wynosi " + Gra.zarobek + "zł.\n\n");

        System.out.println("\nBudynki jakie posiadasz to:\n" +
                Gra.altana + " altany\n" +
                Gra.chata + " chaty\n" +
                Gra.dom + " domy\n" +
                Gra.wiezowiec + " wieżowce\n" +
                Gra.apartament + " apartamenty\n" +
                Gra.garaz + " garaże\n" +
                Gra.sklep + " sklepy\n" +
                Gra.klub + " kluby nocne\n" +
                Gra.restauracja + " restauracje\n" +
                Gra.korporacja + " korporacje\n\n\n");

        Gra.dzien--;
    }
}

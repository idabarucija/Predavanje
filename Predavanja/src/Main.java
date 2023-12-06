public class Main {
    public static void main(String[] args) {

        //foreach
        int[] prviniz = {1, 2, 3};
        for (int element : prviniz) {

            System.out.println("Ispis brojeva:" + element);
        }


        System.out.println("Hello world!");
        //while petlja
        //napisati program koji se izvrsava i ispisuje poruku " Poruka"dok god je brojac < ili = 10. poc vr je 5
        System.out.println(" Printanje u while petlji");
        int brojac = 5;
        while (brojac <= 10) {

            System.out.println("Poruka");
            brojac++;
        }

        //do while
        //pocetna vrijednost int = 5 koristeci do while petlju

        int broj = 5;
        do {
            System.out.println("Ispis");
        } while (broj > 5);

        //break
        //napisati program koji se izvrsava dok god je broj < od 5, poc vr je 0, prekini program kada je broj = 3

        int broj1 = 0;
        while (broj1 < 5) {
            if (broj1 == 3) {
                break;
            }

            System.out.println("Ispis");
            broj1++;
        }
        

    }
}




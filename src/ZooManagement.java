import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {
     /*   int nbrCages=20;
        String zooName="my Zoo";

        System.out.println(" Le Zoo "+zooName+" est composé de "+nbrCages+" cages");
*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le nom du zoo");
        String zooName = sc.nextLine();

        int nbrCages;

        do {
            System.out.println("Entrez le nombre de cages :");
            nbrCages=sc.nextInt();
        }while (nbrCages<=0);

        System.out.println(" Le Zoo "+zooName+" est composé de "+nbrCages+" cages");





    }

}

import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        System.out.println("veuillez entrez le decallage horaire entre vous domicile et votre destinanation ," +
                " Entres une valeur negative si la destination est en retard sur le domicile ");

        Scanner scanner = new Scanner(System.in);
        int decallagehoraire = scanner.nextInt();

        int heureDeDestinationNuit = decallagehoraire <0 ? 24 + decallagehoraire : decallagehoraire;
        int heureDestinationJourn√©e = 12 + decallagehoraire;

        System.out.println("Il sera " + heureDestinationJourn√©e + "H  √† la destination  lorsqu'il sera 12h " +
                "au domicile et il sera heure destination"+heureDeDestinationNuit+ "H lorsquil sera 00h au domicle  ");
    }
}

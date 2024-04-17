import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int loop = entrada.nextInt();
        for(int i = 0; i < loop; i ++){
            Contestant contestent = new Contestant(entrada.next());
            DivingLeadboards divingLeadboards = new DivingLeadboards();
            double factor = entrada.nextDouble();
            for(int j = 0; j < 7; j++){
               divingLeadboards.addToLeadboardList(entrada.nextDouble());
            }
            divingLeadboards.removeHighestScore();
            divingLeadboards.removeLowestScore();
            System.out.printf("%s %.2f\n", contestent.getName(), divingLeadboards.LeadboardTotalValue(factor));

        }



    }

}




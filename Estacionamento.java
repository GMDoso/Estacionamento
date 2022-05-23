import java.util.Scanner;
public class ExerciseEstacionamento {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) { 
            //SCANNER PARA INPUTAR INFORMAÇÕES
            System.out.print("Digite '1' se voce for Idoso, '2' se voce for Deficiente, '3 se for Gestante ou '0' se nao for nenhum dos tres: ");

            int num = scan.nextInt(); 
            //condicionais para definir em que caso a pessoa se enquadra e SE enquadra em algum caso
            if (num == 1) 
            { System.out.print("Ok, voce pode estacionar"); }

            else if (num == 2)
            { System.out.print("Ok, voce pode estacionar"); }
            
            else if (num == 3)
            { System.out.print("Ok, voce pode estacionar"); }

            else 
            {System.out.print("Voce nao pode estacionar!"); }
        }

         }

}
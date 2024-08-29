import java.util.Scanner;
public class Contador {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int param1 = Integer.parseInt(in.nextLine());
        int param2 = Integer.parseInt(in.nextLine());

        try {
            contar(param1,param2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("ERROR");
        }

        in.close();
    }
    public static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1>=param2) {
            throw new ParametrosInvalidosException("Parâmetros inválidos.");
        }
        int contador = param2 - param1;
        for (int i = 0; i < contador; i++) {
            System.out.println(i);
        }
    }
}

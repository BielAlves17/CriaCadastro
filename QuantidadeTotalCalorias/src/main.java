import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Tabela de opções de pratos, sobremesas e bebidas
        String[][] opcoes = {
                {"Vegetariano", "180", "Abacaxi", "75", "Chá", "20"},
                {"Peixe", "230", "Sorvete Diet", "110", "Suco Laranja", "70"},
                {"Frango", "250", "Mouse Diet", "170", "Suco Melão", "100"},
                {"Carne", "350", "Mouse Chocolate", "200", "Refrigerante Diet", "65"}
        };

        // Imprime a tabela de opções
        System.out.println("Escolha um prato, uma sobremesa e uma bebida:");
        System.out.println("| Prato       | Calorias | Sobremesa        | Calorias | Bebida            | Calorias |");
        for (int i = 0; i < opcoes.length; i++) {
            System.out.printf("| %11s | %8s | %15s | %8s | %16s | %8s |\n",
                    opcoes[i][0], opcoes[i][1], opcoes[i][2], opcoes[i][3], opcoes[i][4], opcoes[i][5]);
        }

        // Lê as opções escolhidas pelo usuário
        System.out.print("Digite o número do prato escolhido: ");
        int numPrato = entrada.nextInt();
        System.out.print("Digite o número da sobremesa escolhida: ");
        int numSobremesa = entrada.nextInt();
        System.out.print("Digite o número da bebida escolhida: ");
        int numBebida = entrada.nextInt();

        // Calcula a quantidade total de calorias da refeição
        int totalCalorias = Integer.parseInt(opcoes[numPrato-1][1]) +
                Integer.parseInt(opcoes[numSobremesa-1][3]) +
                Integer.parseInt(opcoes[numBebida-1][5]);

        // Imprime o resultado
        System.out.printf("Total de calorias: %d cal\n", totalCalorias);
    }
}

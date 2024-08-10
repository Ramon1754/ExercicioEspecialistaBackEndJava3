import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrocoGuloso {

    public static void main(String[] args) {
        int quantia = 32;
        List<Integer> moedasDisponiveis = Arrays.asList(5, 2, 1);
        List<Integer> resultado = calcularTroco(quantia, moedasDisponiveis);
        System.out.println("Moedas utilizadas: " + resultado);
    }

    public static List<Integer> calcularTroco(int quantia, List<Integer> moedasDisponiveis) {
        // Ordenar as moedas em ordem decrescente
        moedasDisponiveis.sort((a, b) -> b - a);

        List<Integer> troco = new ArrayList<>();
        for (int moeda : moedasDisponiveis) {
            while (quantia >= moeda) {
                troco.add(moeda);
                quantia -= moeda;
            }
        }

        // Verifica se o troco foi corretamente calculado
        if (quantia > 0) {
            System.out.println("Não foi possível fornecer o troco com as moedas disponíveis.");
        }

        return troco;
    }
}

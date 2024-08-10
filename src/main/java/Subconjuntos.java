import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {

    public static void main(String[] args) {
        List<Integer> conjunto = List.of(1, 2, 3, 4);
        int n = 2;
        List<List<Integer>> resultados = encontrarSubconjuntos(conjunto, n);
        for (List<Integer> subconjunto : resultados) {
            System.out.println(subconjunto);
        }
    }

    public static List<List<Integer>> encontrarSubconjuntos(List<Integer> conjunto, int n) {
        List<List<Integer>> resultados = new ArrayList<>();
        backtrack(conjunto, n, 0, new ArrayList<>(), resultados);
        return resultados;
    }

    private static void backtrack(List<Integer> conjunto, int n, int start, List<Integer> atual, List<List<Integer>> resultados) {
        if (atual.size() == n) {
            resultados.add(new ArrayList<>(atual));
            return;
        }
        for (int i = start; i < conjunto.size(); i++) {
            atual.add(conjunto.get(i));
            backtrack(conjunto, n, i + 1, atual, resultados);
            atual.remove(atual.size() - 1);
        }
    }
}

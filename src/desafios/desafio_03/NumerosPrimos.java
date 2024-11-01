package desafios.desafio_03;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public List<Integer> listarPrimos(int limite) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
}


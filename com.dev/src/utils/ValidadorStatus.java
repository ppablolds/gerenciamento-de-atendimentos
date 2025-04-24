package utils;

import java.util.Arrays;
import java.util.List;

public class ValidadorStatus {
    private static final List<String> STATUS_VALIDOS = Arrays.asList(
            "Aberto", "Em andamento", "Concluído"
    );

    public static boolean isValido(String status) {
        return STATUS_VALIDOS.contains(status);
    }

    public static void exibirOpcoes() {
        System.out.println("Status válidos: " + String.join(", ", STATUS_VALIDOS));
    }
}

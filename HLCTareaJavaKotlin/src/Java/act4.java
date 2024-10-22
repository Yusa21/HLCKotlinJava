package Java;

public class act4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Número: " + i);
        }
    }
}

//Java no tiene acceso a .. de kotlin para usar el los bucles for, tambíen tienen
// etiquetas que permiten hacer continue o break para salir de varios
// bucles anidados a la vez, además WHEN es más flexible que SWITCH
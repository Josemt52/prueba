public class Regalo {
    public static String elegir(int vida) {
        String gift = "";
        switch (vida) {
            case 1:
            case 2:
            case 3:
                gift = "Un pasaje al caribe";
                break;
        }
        return gift;
    }
}

class Principal {
    public static void main(String[] args) {
        int vidasUtilizadas = 2; // Cambia esto según las vidas utilizadas por el jugador
        String premio = Regalo.elegir(vidasUtilizadas);

        if (!premio.isEmpty()) {
            System.out.println("¡Felicidades! Has ganado: " + premio);
        } else {
            System.out.println("No has ganado ningún premio.");
        }
    }
}

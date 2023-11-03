public class SalaCine {
    private boolean[][] asientos;

    public SalaCine(int filas, int asientosPorFila) {
        this.asientos = new boolean[filas][asientosPorFila];
        poblarSala();
    }

    private void poblarSala() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = false;
            }
        }
    }

    public void reservarAsiento(int fila, int asiento) {
        // Acceso a la matriz y marcar como reservado
        if(!asientos[fila][asiento]) {
            asientos[fila][asiento] = true;
        } else {
            System.out.println("Asiento ya está reservado.");
        }
    }

    public boolean verificarDisponibilidad(int fila, int asiento) {
        return !asientos[fila][asiento];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                result += asientos[i][j] ? "[X]" : "[ ]";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        SalaCine cine = new SalaCine(5, 8); // 5 filas con 8 asientos cada una
        cine.reservarAsiento(2, 4);
        System.out.println(cine);
    }
}

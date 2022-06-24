import java.util.Scanner;

public class TresEnRaya {
    private char [][] tablero;

    void crearLlenarTablero() {
        tablero = new char[3][3];
        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero.length; j++){
                tablero[i][j] = '-';
            }
        }
    }
    void mostrarTablero() {
        for (int i = 0; i<tablero.length; i++){
            for (int j = 0; j<tablero.length; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    void movimientoJugador(){
        int fila;
        int columna;
        Scanner teclado = new Scanner(System.in);
        do{
            do {
                System.out.print("\nEn que fila desea jugar ?: ");
                fila = teclado.nextInt();
            } while(fila < 1 || fila > 3);
            fila--;
            do {
                System.out.print("\nEn que columna desea jugar ?: ");
                columna = teclado.nextInt();

            } while (columna < 1 || columna > 3);
            columna--;

        } while (tablero[fila][columna] != '-');

        tablero[fila][columna] = 'O';

    }
    void movimientoComputadora(){
        int fila;
        int columna;
        do{
            do {
                fila = (int) (Math.random() * (3 - 1 +1) + 1 );
            } while(fila < 1 || fila > 3);
            fila--;
            do {
                columna = (int) (Math.random() * (3 - 1 +1) + 1 );

            } while (columna < 1 || columna > 3);
            columna--;

        } while (tablero[fila][columna] != '-');

        tablero[fila][columna] = 'X';
    }
    boolean haGanado(char quienJuega){
        //filas
        if (tablero[0][0] == quienJuega && tablero[0][1] == quienJuega && tablero[0][2] == quienJuega) {
             return true;
        } else if (tablero[1][0] == quienJuega && tablero[1][1] == quienJuega && tablero[1][2] == quienJuega) {
           return true;
        }
        else if (tablero[2][0] == quienJuega && tablero[2][1] == quienJuega && tablero[2][2] == quienJuega) {
        return true;
        }
        // columnas
        else if (tablero[0][0] == quienJuega && tablero[1][0] == quienJuega && tablero[2][0] == quienJuega) {
            return true;
        } else if (tablero[0][1] == quienJuega && tablero[1][1] == quienJuega && tablero[2][1] == quienJuega) {
            return true;
        }
        else if (tablero[0][2] == quienJuega && tablero[1][2] == quienJuega && tablero[2][2] == quienJuega) {
            return true;
        } else if (tablero[0][0] == quienJuega && tablero[1][1] == quienJuega && tablero[2][2] == quienJuega) {
           return true; 
        } else if (tablero[2][0] == quienJuega && tablero[1][1] == quienJuega && tablero[0][2] == quienJuega) {
            return true;
        }
        else return false;

    }
    boolean hayCeldaVacia(){
        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero.length; j++){
                if(tablero[i][j] == '-')
                return true;
            }
        }
        return false;
    }
}

public class PruebaTresEnRaya {
   public static void main(String[] args) {
      TresEnRaya jugar = new TresEnRaya();

      jugar.crearLlenarTablero();
      jugar.mostrarTablero();

      do {
         System.out.println();
         jugar.movimientoJugador();
         jugar.mostrarTablero();
         boolean resultado = jugar.haGanado('O');
         if(resultado == true){
            System.out.println("\nEl jugador ha ganado ");
            break;
         }

         resultado = jugar.hayCeldaVacia();
         if(resultado == false){
            System.out.println("\nEmpates !!!");
            break;
         }
         System.out.println("Es mi turno...");
         jugar.movimientoComputadora();
         jugar.mostrarTablero();
         resultado = jugar.haGanado('X');
         if(resultado ==true){
            System.out.println("\nLa computadora ha ganado ");
            break;
         }

      } while (true);
   }
}

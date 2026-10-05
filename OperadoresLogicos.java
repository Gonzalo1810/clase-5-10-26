public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("Operador AND (&&):");
        System.out.println( true && true );   // Imprime: true
        System.out.println( true && false );  // Imprime: false
        System.out.println( false && true );  // Imprime: false
        System.out.println( false && false ); // Imprime: false
        System.out.println();

        System.out.println("Operador OR (||):");
        System.out.println( true || true );   // Imprime: true
        System.out.println( true || false );  // Imprime: false
        System.out.println( false || true );  // Imprime: false
        System.out.println( false || false ); // Imprime: false (Esta es la línea que faltaba)
        System.out.println();

        System.out.println("Operador NOT (!):");
        System.out.println( !true );          // Imprime: false
        System.out.println( !false );         // Imprime: true
    } // Fin del método main
} // Fin de la clase OperadoresLogicos

package spacecraft;

/**
 * Esta clase abstracta es lo general que debe hacer una nave cuando
 * despega
 *  @author Jhon Anderson Galeano Santillana
 *  @version 1.0.0
 */
public abstract class Count {
    /**
     * la constante inicio la declara cada clase
     * perteneciente a cada tipo de nave.
     */
    protected static int start;

    /**
     * Inicializa el conteo
     *
     * @param count inicializa el conteo
     */
    public Count(int count) {
        start =count;

    }

    /**
     * metodo Contar que lo que hace es la cuenta regresiva del 3
     * al 1.
     */
    public void contar(){
        for (int i = 3; i > 0; i--) {
            mostrarConteo(start);
            start--;
        }

    }

    /**
     *Esta funcion imprime el conteo
     */
    private void mostrarConteo(int conteo) {
        System.out.println("en: " + conteo);
    }


}

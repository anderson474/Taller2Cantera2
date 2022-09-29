package nave;

public abstract class conteo {
    protected static int inicio;
    public conteo(int conteo) {
        inicio=conteo;

    }

    public void contar(){
        for (int i = 3; i > 0; i--) {
            mostrarConteo(inicio);
            inicio--;
        }

    }

    private void mostrarConteo(int conteo) {
        System.out.println("en: " + conteo);
    }


}

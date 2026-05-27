public class numeros {
    public static void main(String[] args) {
        int[] lista = {1, 2, 9, 8, 5, 7, 6, 4, 6};

        int mayor = lista[0];
        int posicion = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
                posicion = i;
            }
        }
        System.out.println("la posicion del numero  es:" + posicion);
        System.out.println("el numero mayor es:" + mayor);

    }
}
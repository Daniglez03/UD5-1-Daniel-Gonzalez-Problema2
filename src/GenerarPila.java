public class GenerarPila<Integer> {
    private int numObjects = 0;
    private Object data[] = null;
    public int numObjetos = 0;
    protected static final int MAX_NUMEROS = 2;
    GenerarPila<Integer> pilita = new GenerarPila<Integer>(MAX_NUMEROS);

    public GenerarPila(int maxNumeros) {
    }

    public void insert(Integer element, int i) {

        if (numObjetos == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for(int j = 0; j < numObjetos; j++) {
                data[j] = aux[j];
            }
            aux = null;
        }
        for (int j = numObjetos - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }
        data[i] = element;
        numObjetos++;
    }

    public Integer delete(int i) {
        Object aux = data[i];

        for (int j = i; j < numObjetos - 1; j++) {
            data[j] = data[j + 1];
        }
        numObjetos--;
        return (Integer) aux;
    }

    public void push(Integer element) {
        pilita.insert(element, 0);
    }
    public Integer pop() {
        return pilita.delete(0);
    }
}

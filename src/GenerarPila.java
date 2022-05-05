public class GenerarCola<Integer> {
    private int numObjects = 0;


    public void push(Integer element) {
        pilita.insert(element, 0);
    }
    public Integer pop() {
        return pilita.delete(0);
    }
}

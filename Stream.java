abstract class Stream<T> {

    private T value;
    private Observer object;

    public void add(T value) {
        this.value = value;
        object.execute();
    }

    public void listen(Observer object) {
        this.object = object;
    }
}
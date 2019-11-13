abstract class Stream<T> {

    private T value;
    private Observer object;

    public void add(T value) {
        this.value = value;
        object.execute(value);
    }

    public void listen(Observer<T> object) {
        this.object = object;
    }
}
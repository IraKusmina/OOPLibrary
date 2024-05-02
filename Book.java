public class Book<T> {
    private T name;

    public Book (T name){
        this.name = name;
    }

    public void setName (T name){
        this.name = name;
    }

    public T getName(){
        return name;
    }
}

public class Novel extends Book {

    public String type;

    Novel(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name:" + name + " NumberOfPages:" + numberOfPages + " Type:" + type;
    }

}

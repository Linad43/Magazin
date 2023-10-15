public class Toy {
    private int IDToy;
    private String name;
    private int count;
    static public int allCount;


    @Override
    public String toString() {
        return "Toy{" +
                "IDToy=" + IDToy +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public Toy(String name, int count) {
        this.IDToy = (int) (Math.random() * Math.pow(10,6));
        this.name = name;
        this.count = count;
        allCount += count;
    }

    public int getIDToy() {
        return IDToy;
    }

    public void setIDToy(int IDToy) {
        this.IDToy = IDToy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

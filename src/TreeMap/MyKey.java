package TreeMap;

public class MyKey implements Comparable {
    private int number;

    public MyKey(int number) {
        super();
        this.number = number;
    }

    @Override
    public int compareTo(Object o) {
        MyKey key = (MyKey) o;

        if ((this.number - key.number) == 0) {
            return 1;
        } else {
            return (this.number - key.number);
        }
    }
}

class Student {
    private String name;
    private int height;
    private int weight;

    public Student(String name, int height, int weight) {
        super();
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", height=" + height + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + height;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (height != other.height)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }
}

import java.util.Objects;

public class Buyer {
    String name;
    int age;
    int cnic;
    iPhone iphone;

    Buyer(String name,int age,int cnic){
        this.name = name;
        this.age = age;
        this.cnic = cnic;
    }

    void buy(iPhone iphone){
        this.iphone = iphone;
        System.out.println(name + " Buying " + iphone.model);
    }

    void exchange(iPhone iphone){
        System.out.println( this.iphone.model +" Take this bro , " + iphone.model + " Give another piece of this ");
        this.iphone = iphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buyer)) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(name, buyer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

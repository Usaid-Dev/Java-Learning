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
        System.out.println( this.iphone.model +" Take this bro , " + iphone.model + " Give me this one ");
        this.iphone = iphone;
    }
}

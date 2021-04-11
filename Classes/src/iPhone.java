public class iPhone {

    String model;

    iPhone(String model){
        this.model = model;
    }

    void powerOn() {
        System.out.println( " Powering On your iPhone " + model);
    }

    void unlock(){
        System.out.println( " Your screen is unlocked ! " );
    }

    void lock(){
        System.out.println( " Your screen is now locked ! " );
    }
}

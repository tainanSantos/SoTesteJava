package pattern_singleton.test3;

public class Person3 {

    private static Person3 instance;

    public static Person3 getInstance(){
        if(instance != null){}
        else {instance =  new Person3();}
        return  instance;
    }

    private Person3() {

    }
}



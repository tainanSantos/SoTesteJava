package pattern_singleton.test1;

public class Person {

    private static Person instance ;

    public static Person getInstance() {
        if (instance == null) instance =  new Person();
        return instance;

    }

    // tem que ser provado para que o padrão singleton possa ser válido
    private Person(){
    }


}

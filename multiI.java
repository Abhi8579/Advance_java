interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {
    public void showFather() {
        System.out.println("he is dad");
    }

    public void showMother() {
        System.out.println("She is Mother");
    }
}

public class multiI {
    public static void main(String[] args) {
        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}

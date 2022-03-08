public class VirtusaMachine {

    private static VirtusaMachine instance = new VirtusaMachine();

    private VirtusaMachine(){}

    public static VirtusaMachine getInstance(){

        return instance;

    }

    public void bootMachine(){

        System.out.println("Hello World!");

    }

}

class NewHire {

    public static void main(String[] args) {

        VirtusaMachine pc = VirtusaMachine.getInstance();

        pc.bootMachine();

    }

}
import java.util.Scanner;

abstract class Package{
    protected int data;
    protected int price;
    protected int speed;

    abstract void getData();
    abstract void getPrice();
    abstract void getSpeed();

}

class  LitePackage extends Package{

    public void getData(){
        data=15;
    }

    public void getPrice(){
        price=2000;
    }

    public void getSpeed(){
        speed=3;
    }
}

class  HeavyPackage extends Package{

    public void getData(){
        data=50;
    }

    public void getPrice(){
        price=5000;
    }

    public void getSpeed(){
        speed=10;
    }
}

class  SuperPackage extends Package{

    public void getData(){
        data=150;
    }

    public void getPrice(){
        price=6000;
    }

    public void getSpeed(){
        speed=25;
    }
}

class GetPackageFactory{


    public Package getPackage(String packageType){
        if(packageType == null){
            return null;
        }
        if(packageType.equalsIgnoreCase("lite package")) {
            return new LitePackage();
        }
        else if(packageType.equalsIgnoreCase("heavy package")){
            return new HeavyPackage();
        }
        else if(packageType.equalsIgnoreCase("super package")) {
            return new SuperPackage();
        }
        return null;
    }
}


public class InternetServiceProvider{

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        GetPackageFactory packageFactory = new GetPackageFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String input = sc.nextLine();

        Package p = packageFactory.getPackage(input);


        p.getData();
        p.getPrice();
        p.getSpeed();

    }

}

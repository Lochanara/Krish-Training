import java.util.Hashtable;

abstract class Game implements Cloneable {

    private String name;
    protected int price;
    protected int size;

    abstract void launch();

    public String getName(){

        return name;

    }

    public int getPrice() {

        return price;

    }

    public int getSize() {

        return size;

    }

    public void setName(String name) {

        this.name = name;

    }

    public Object clone() {

        Object clone = null;

        try {

            clone = super.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();

        }

        return clone;

    }

}

class Minecraft extends Game {

    public Minecraft(){

        price = 15;
        size = 10;

    }

    @Override
    public void launch() {

        System.out.println("Minecraft is launching");

    }

}

class Valorant extends Game {

    public Valorant(){

        price = 0;
        size = 7;

    }

    @Override
    public void launch() {

        System.out.println("Valorant is launching");

    }

}

class Overwatch extends Game {

    public Overwatch(){

        price = 40;
        size = 30;

    }

    @Override
    public void launch() {

        System.out.println("Overwatch is launching");

    }

}

class GameCache {

    private static Hashtable<String, Game> gameMap  = new Hashtable<String, Game>();

    public static Game getGame(String Name) {

        Game cachedGame = gameMap.get(Name);
        return (Game) cachedGame.clone();

    }


    public static void loadCache() {

        Minecraft minecraft = new Minecraft();
        minecraft.setName("mc");
        gameMap.put(minecraft.getName(),minecraft);

        Valorant valorant = new Valorant();
        valorant.setName("val");
        gameMap.put(valorant.getName(),valorant);

        Overwatch overwatch = new Overwatch();
        overwatch.setName("ow");
        gameMap.put(overwatch.getName(),overwatch);

    }

}

public class SteamGame {

    public static void main(String[] args) {

        GameCache.loadCache();

        Game clonedGame = (Game) GameCache.getGame("mc");
        System.out.println("Name : " + clonedGame.getName());
        System.out.println("Price : " + clonedGame.getPrice());
        System.out.println("Size : " + clonedGame.getSize());
        System.out.println();

        Game clonedGame2 = (Game) GameCache.getGame("val");
        System.out.println("Name : " + clonedGame2.getName());
        System.out.println("Price : " + clonedGame2.getPrice());
        System.out.println("Size : " + clonedGame2.getSize());
        System.out.println();

        Game clonedGame3 = (Game) GameCache.getGame("ow");
        System.out.println("Name : " + clonedGame3.getName());
        System.out.println("Price : " + clonedGame3.getPrice());
        System.out.println("Size : " + clonedGame3.getSize());

    }

}

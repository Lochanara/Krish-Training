import java.util.ArrayList;
import java.util.List;

class GameSave {

    private String save;

    public GameSave(String save){

        this.save = save;

    }

    public String getSave(){

        return save;

    }

}

class Originator {

    private String save;

    public void setSave(String save){

        this.save = save;

    }

    public String getSave(){

        return save;

    }

    public GameSave saveGameSave(){

        return new GameSave(save);

    }

    public void loadGameSave(GameSave gameSave){

        save = gameSave.getSave();

    }

}

class CareTaker {

    private List<GameSave> gameSaveList = new ArrayList<GameSave>();

    public void add(GameSave gameSave){

        gameSaveList.add(gameSave);

    }

    public GameSave get(int index){

        return gameSaveList.get(index);

    }

    public int getGameSaveListSize() {

        return gameSaveList.size();

    }

}

public class AdventureGame {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setSave("Save 1");
        careTaker.add(originator.saveGameSave());

        originator.setSave("Save 2");
        originator.setSave("Save 3");
        originator.setSave("Save 4");
        careTaker.add(originator.saveGameSave());

        originator.setSave("Save 5");
        originator.setSave("Save 6");
        careTaker.add(originator.saveGameSave());

        System.out.println("Most current game save : " + originator.getSave() + "\n");

        System.out.println("All available game saves");

        for (int i = 0; i < careTaker.getGameSaveListSize(); i ++) {

            originator.loadGameSave(careTaker.get(i));
            System.out.println(i + ". " + originator.getSave());

        }

    }

}
package ir.hoshmand.zamin.iran.wheatdisease.models;


import java.util.ArrayList;

public class Title {
    private String name;
    private ArrayList<String >levels;
    public Title(String name){
        this.name=name;
        levels=new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getLevels() {
        return levels;
    }

    public void addLevel(String level) {
        levels.add(level);
    }


}

package classes;


public class Champion {

    public String name;
    public int cost;
    public String[] type;

    public Champion(String name, String[] type){
        this.name = name;
        this.type = type;
    }

    public void setChampType(String[] type){
        this.type = type;
    }

    public String[] getChampType(){
        return type;
    }

    public String toString(){
        return name;
    }
}

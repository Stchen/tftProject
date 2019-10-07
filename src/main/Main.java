package main;
import classes.Champion;
import classes.ChampsList;

import java.util.*;

public class Main {

    private static final ChampsList data = new ChampsList();
    private static final HashMap<String, HashSet<String>> champTypeLibrary = data.getChampTypeLibrary();
    private static final HashMap<String, Champion> champLibrary = data.getChampSet();
    private static ArrayList<Champion> currentChamps = new ArrayList<Champion>();
    private static HashMap<String, Integer> currentSynergies = new HashMap<String, Integer>();

    public static void main(String[] args) {

        boolean loop = true;
        while(loop == true){
            Scanner client = new Scanner(System.in);
            System.out.println("Give me a command");
            String command = client.next();
            if(command == "exit"){
                loop = false;
            }else{
                String champName = "";
                if(client.hasNext()){
                    champName = client.next();
                }
                command(command, champName);
                printInventory();
            }

        }
    }

    public static String command(String command, String champName){
        String result;
        if(command == "get"){
            result = getChampionMatch();
        }else if(command == "remove"){
            removeChampion(champName);
            result = "Champion removed";
        }else{ //(command == "add")
            addChampion(champName);
            result = "Champion added";
        }
        return result;
    }
    //Get Champion that matches synergy the most.
    public static String getChampionMatch(){
        //get current synergies
        for(String synergy: currentSynergies){

        }
        //look through champLibrary using synergies as key and note what/how many time a champion name pops up.
        return "";
    }

    public static void addChampion(String champName){
        Champion champ = champLibrary.get(champName);
        currentChamps.add(champ);
        for(String type: champ.getChampType()){
            int synergyNum = currentSynergies.get(type);
            currentSynergies.put(type, synergyNum++);
        }
    }
    public static void removeChampion(String champName){
        Champion champ = champLibrary.get(champName);
        currentChamps.remove(champ);
        for(String type: champ.getChampType()){
            int synergyNum = currentSynergies.get(type);
            if(synergyNum == 1){
                currentSynergies.remove(type);
            }else{
                currentSynergies.put(type, synergyNum--);
            }
        }
    }
    //prints what we currently have for champions and synergies.
    public static void printInventory(){
        boolean allowComma = false;
        System.out.println("These are the current Champions you have:");
        for(String champName : currentChamps){
            if(allowComma){
                System.out.print(", ")
            }
            System.out.print(champName);
            allowComma = true;
        }
        allowComma = false;
        System.out.println("These are the current synergies you have:");
        for(String synergy : currentSynergies.keySet()){
            if(allowComma){
                System.out.print(", ")
            }
            System.out.print(synergy);
            allowComma = true;
        }
    }
}

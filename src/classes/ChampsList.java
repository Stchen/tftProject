package classes;
import java.util.*;

public class ChampsList {

    private HashMap<String, Champion> champList;

    //constructor;
    public ChampsList(){
        champList = new HashMap<String, Champion>();
        champList.put("Akali", new Champion("Akali", new String[]{"Assasin", "Ninja"}));
        champList.put("Evelynn", new Champion("Evelynn", new String[]{"Assasin", "Demon"}));
        champList.put("Katarina", new Champion("Katarina", new String[]{"Assasin", "Imperial"}));
        champList.put("Kha’Zix", new Champion("Kha’Zix", new String[]{"Assasin", "Void"}));
        champList.put("Pyke", new Champion("Pyke", new String[]{"Assasin", "Pirate"}));
        champList.put("Rengar", new Champion("Rengar", new String[]{"Assasin", "Wild"}));
        champList.put("Zed", new Champion("Zed", new String[]{"Assasin", "Ninja"}));
        champList.put("Aatrox", new Champion("Aatrox", new String[]{"Blademaster", "Demon"}));
        champList.put("Draven", new Champion("Draven", new String[]{"Blademaster", "Imperial"}));
        champList.put("Fiora", new Champion("Fiora", new String[]{"Blademaster", "Noble"}));
        champList.put("Gangplank", new Champion("Gangplank", new String[]{"Blademaster", "Pirate", "Gunslinger"}));
        champList.put("Shen", new Champion("Shen", new String[]{"Blademaster", "Ninja"}));
        champList.put("Yasuo", new Champion("Yasuo", new String[]{"Blademaster", "Exile"}));
        champList.put("Blitzcrank", new Champion("Blitzcrank", new String[]{"Brawler", "Robot"}));
        champList.put("Cho'gath", new Champion("Cho'gath", new String[]{"Brawler", "Void"}));
        champList.put("Rek'Sai", new Champion("Rek'Sai", new String[]{"Brawler", "Void"}));
        champList.put("Volibear", new Champion("Volibear", new String[]{"Brawler", "Glacial"}));
        champList.put("Warwick", new Champion("Warwick", new String[]{"Brawler", "Wild"}));
        champList.put("Anivia", new Champion("Anivia", new String[]{"Elementalist", "Glacial"}));
        champList.put("Brand", new Champion("Brand", new String[]{"Elementalist", "Demon"}));
        champList.put("Kennen", new Champion("Kennen", new String[]{"Elementalist", "Yordle", "Ninja"}));
        champList.put("Lissandra", new Champion("Lissandra", new String[]{"Elementalist", "Glacial"}));
        champList.put("Braum", new Champion("Braum", new String[]{"Guardian", "Glacial"}));
        champList.put("Leona", new Champion("Leona", new String[]{"Guardian", "Noble"}));
        champList.put("Graves", new Champion("Graves", new String[]{"Gunslinger", "Pirate"}));
        champList.put("Lucian", new Champion("Lucian", new String[]{"Gunslinger", "Noble"}));
        champList.put("Miss Fortune", new Champion("Miss Fortune", new String[]{"Gunslinger", "Pirate"}));
        champList.put("Tristana", new Champion("Tristana", new String[]{"Gunslinger", "Yordle"}));
        champList.put("Darius", new Champion("Darius", new String[]{"Knight", "Imperial"}));
        champList.put("Garen", new Champion("Garen", new String[]{"Knight", "Noble"}));
        champList.put("Kayle", new Champion("Kayle", new String[]{"Knight", "Noble"}));
        champList.put("Mordekaiser", new Champion("Mordekaiser", new String[]{"Knight", "Phantom"}));
        champList.put("Poppy", new Champion("Poppy", new String[]{"Knight", "Yordle"}));
        champList.put("Sejuani", new Champion("Sejuani", new String[]{"Knight", "Glacial"}));
        champList.put("Ashe", new Champion("Ashe", new String[]{"Ranger", "Glacial"}));
        champList.put("Kindred", new Champion("Kindred", new String[]{"Ranger", "Phantom"}));
        champList.put("Varus", new Champion("Varus", new String[]{"Ranger", "Demon"}));
        champList.put("Vayne", new Champion("Vayne", new String[]{"Ranger", "Noble"}));
        champList.put("Elise", new Champion("Elise", new String[]{"Shapeshifter", "Demon"}));
        champList.put("Gnar", new Champion("Gnar", new String[]{"Shapeshifter", "Wild", "Yordle"}));
        champList.put("Nidalee", new Champion("Nidalee", new String[]{"Shapeshifter", "Wild"}));
        champList.put("Shyvana", new Champion("Shyvana", new String[]{"Shapeshifter", "Dragon"}));
        champList.put("Swain", new Champion("Swain", new String[]{"Shapeshifter", "Demon", "Imperial"}));
        champList.put("Ahri", new Champion("Ahri", new String[]{"Sorcerers", "Wild"}));
        champList.put("Aurelion Sol", new Champion("Aurelion Sol", new String[]{"Sorcerers", "Dragon"}));
        champList.put("Karthus", new Champion("Karthus", new String[]{"Sorcerers", "Phantom"}));
        champList.put("Kassadin", new Champion("Kassadin", new String[]{"Sorcerers", "Void"}));
        champList.put("Lulu", new Champion("Lulu", new String[]{"Sorcerers", "Yordle"}));
        champList.put("Morgana", new Champion("Morgana", new String[]{"Sorcerers", "Demon"}));
        champList.put("Veigar", new Champion("Veigar", new String[]{"Sorcerers", "Yordle"}));
    }

    public HashMap<String, Champion> getChampSet(){
        return champList;
    }

}

package ItemSystem.Entities.Crops;

import JsonParser.json.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseCrops {

    public static void main(String[] args) {
        String[] cropDataArray = getSeedDataAsArray("485");
        for (String s : cropDataArray) System.out.println(s);
    }


    public static String getCropData(String id) {
        return (String) getJsonObjectFromFile("GameData/Data/Crops.json").get(id);
    }

    getNameOfSeedFromId(String id) {
        return
    }

    getIdOfCropFromName(String name) {

    }

    public static String[] getSeedDataAsArray(String id) {
        return getCropData(id).split("/");
    }

    private static JSONObject getJsonObjectFromFile(String filePath) {
        try {
            String jsonFileAsString = "";
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                jsonFileAsString += scanner.nextLine();
            }
            return new JSONObject(jsonFileAsString);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new JSONObject(); // failure
    }

}

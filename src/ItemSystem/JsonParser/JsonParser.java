package ItemSystem.JsonParser;

import JsonParser.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JsonParser {

    public static void main(String[] args) {
        String[][] objects = new String[930][1];
//        System.out.println(getNameOfObjectFromId("75"));
        for (int i = 0; i <= 930; i++) {
            try {
//                System.out.println(getNameOfObjectFromId(Integer.toString(i)));
                objects[i] = getObjectDataFromId(Integer.toString(i));
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }
        for (String[] s : objects) {
            if (s != null && s[0] != null) {
                System.out.print("[");
                for (String t : s) {
                    if (t != null) System.out.print(t + "/");
                }
                System.out.print("],");
                System.out.println();
            }
        }
    }

    /**
     * Given a string id, return the object data of that item (entity)
     * @param id
     * @return an array of data
     */
    public static String[] getObjectDataFromId(String id) {
        String objectDataAsString = (String) (getJsonObjectFromFile("GameData/Data/ObjectInformation.json")).get(id);
        return objectDataAsString.split("/");
    }

    public static String getNameOfObjectFromId(String id) {
        return getObjectDataFromId(id)[0];
    }

    /**
     * Get a JSONObject given a file path
     * @param filePath the location of the .json file
     * @return a JSONObject with the data from the file path
     */
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

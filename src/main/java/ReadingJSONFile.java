import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingJSONFile {
    public static void main(String[] args) {
        JSONParser jsonParser=new JSONParser();
        try(FileReader reader=new FileReader("src/main/resources/employee.json"))
        {
            Object object=jsonParser.parse(reader);
            JSONArray employeeList=(JSONArray) object;
            System.out.println(employeeList);
            employeeList.forEach(emp->parseEmployeeObject((JSONObject) emp));

        }catch(FileNotFoundException fe){
            fe.getStackTrace();
            fe.printStackTrace();
        }
        catch (IOException ioe){
            ioe.getStackTrace();
            ioe.printStackTrace();
        }catch(ParseException pe){
            pe.getStackTrace();
            pe.printStackTrace();
        }
    }
    private static void parseEmployeeObject(JSONObject employee){
        JSONObject employeeObject=(JSONObject) employee.get("employee");
        String firstName=(String) employeeObject.get("firstName");
        System.out.println(firstName);
        String lastName=(String)employeeObject.get("lastName");
        System.out.println(lastName);
        String website=(String) employeeObject.get("website");
        System.out.println(website);
    }
}

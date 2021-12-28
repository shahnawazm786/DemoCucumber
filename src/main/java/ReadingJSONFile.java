import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadingJSONFile {
    private  static  final Logger logger=LogManager.getLogger(ReadingJSONFile.class);
    public static void main(String[] args) {
        logger.info("Reference has been created");
        JSONParser jsonParser=new JSONParser();
        logger.info("Object has been created");
        try(FileReader reader=new FileReader("src/main/resources/employee.json"))
        {
            logger.info("File has been opened to read the json elements");
            Object object=jsonParser.parse(reader);
            logger.info("Object created");
            JSONArray employeeList=(JSONArray) object;
            logger.info("Employee list created");
            System.out.println(employeeList);
            logger.info("Display employee list");
            logger.info("Iterating employee");
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
        logger.info("JSON Object has been initialized and object created");
        JSONObject employeeObject=(JSONObject) employee.get("employee");
        logger.info("Reading first name");
        String firstName=(String) employeeObject.get("firstName");
        logger.info("printing first name"+firstName);
        System.out.println(firstName);
        logger.info("Reading the last name of employee");
        String lastName=(String)employeeObject.get("lastName");
        logger.info("Printing last name"+lastName);
        System.out.println(lastName);
        logger.info("Reading website");
        String website=(String) employeeObject.get("website");
        logger.info("Printing website"+website);
        System.out.println(website);
    }
}

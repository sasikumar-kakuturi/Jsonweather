package jsonpakage;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonclass {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonparser=new JSONParser();
		FileReader reader= new FileReader(".\\json file\\weather.json");
		 Object obj=jsonparser.parse(reader);
		JSONObject weatherobj=  (JSONObject)obj;
		JSONArray array=(JSONArray)weatherobj.get("list");
		
		for(int i=0;i<array.size();i++)
		{
			JSONObject data=(JSONObject)array.get(i);
			JSONArray weather=(JSONArray) data.get("weather");
			System.out.println("Enter Number");
			String s=scan.nextLine();
			for(int j=0;j<weather.size();j++)
			{			
				System.out.println("Enter date");
				String sp=scan.nextLine();
				if(s.equals("1") && sp.equals("2019-03-27")||s.equals("1") &&sp.equals("2019-03-28")||s.equals("1") &&sp.equals("2019-03-29")||s.equals("1") &&sp.equals("2019-03-30")||s.equals("1") &&sp.equals("2019-03-31"))
				{
				JSONObject w=(JSONObject) weather.get(j);
				String in=  (String) w.get("description");
				JSONObject sa=(JSONObject) data.get("main");
				double te=(Double) sa.get("temp");
				System.out.println("Weather condition:"+in+"   Temperature::"+te);
				}
				if(s.equals("2")&& sp.equals("2019-03-27")||s.equals("2")&&sp.equals("2019-03-28")||s.equals("2")&&sp.equals("2019-03-29")||s.equals("2")&&sp.equals("2019-03-30")||s.equals("2")&&sp.equals("2019-03-31"))
				{
					JSONObject wind=(JSONObject) data.get("wind");
					double speed= (Double) wind.get("speed");
					System.out.println("Wind Speed::"+speed);
				}
				if(s.equals("3")&& sp.equals("2019-03-27")||s.equals("3")&&sp.equals("2019-03-28")||s.equals("3")&&sp.equals("2019-03-29")||s.equals("3")&&sp.equals("2019-03-30")||s.equals("3")&&sp.equals("2019-03-31"))
				{
					JSONObject sa=(JSONObject) data.get("main");
					double pressure=(Double) sa.get("pressure");
					System.out.println("pressure::"+pressure);
					
				}
				}
			if(s.equals("0"))
			{
				break;
			}
				
				
			}
		
			
		}
	}





	


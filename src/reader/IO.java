package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IO {
	public ArrayList<String> readText(String address) throws IOException
    {
        ArrayList<String> arrayList=new ArrayList<String>();
        try
        {
            BufferedReader buffReader = new BufferedReader(new FileReader(address));  
            String data = buffReader.readLine();
            while( data!=null){   
                  String[] dataArray=data.split("/t");
                  for(String element:dataArray)
                  {
                      arrayList.add(element);
                  }
                  data = buffReader.readLine();  
            }
            buffReader.close();
            return arrayList;
        }
        catch(Exception e)
        {
            return null;
        }
    }

	public boolean writeText(String address, ArrayList<String> context) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(address, true);
			for (String text : context) {
				writer.write(text);
			}
			writer.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}

package reader;

import java.io.BufferedReader;    
import java.io.FileReader;    
   
public class ReadFile {    
   
    public static void main(String[] args) {    
        try {    
            BufferedReader reader = new BufferedReader(new FileReader("BUSINESS_NAMES_201803.csv"));//换成你的文件名   
            reader.readLine();   
            String line = null;    
            while((line=reader.readLine())!=null){    
                String item[] = line.split(",");
                    
                String last = item[item.length-1]; 
                System.out.println(last);    
            }    
        } catch (Exception e) {    
            e.printStackTrace();    
        }    
    }    
   
} 
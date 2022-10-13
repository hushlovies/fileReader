package fileReader;
import java.io.*;

public class FileReader implements Read{
     FileInputStream in;
    private File f;
    long lineCount;
    public FileReader(File f) throws Exception {
        this.f = f;
         in=new FileInputStream(f);
        countLines();
    }

    public void countLines(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            while (reader.ready()) {
                reader.readLine();
                lineCount++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reverseRead() throws Exception{
    	
        for (long i = lineCount - 1; i > -1; i--) {
            
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            	String s="";
            	in = new FileInputStream(f);
                for(long j = 0; j < i && reader.ready(); j++) {
                    s = reader.readLine();               
                }
                System.out.println(reader.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    //method of how to read the text file
    public void readLines() throws FileNotFoundException {
    	in = new FileInputStream(f);
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
        	in = new FileInputStream(f);
            while(reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
    public void palindrome() throws FileNotFoundException {
    	in = new FileInputStream(f);      
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
        	StringBuilder line = new StringBuilder(reader.readLine()).reverse();
        	in = new FileInputStream(f);
            while(lineCount!=0) {
            	System.out.println(line);
            	line = new StringBuilder(reader.readLine()).reverse();
 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    	
    	
    }
    
    	
    
    
 
    


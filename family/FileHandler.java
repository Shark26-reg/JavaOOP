package tree.family;

import java.io.*;

public class FileHandler implements Writable{

   public  boolean save(Serializable serializable, String fileName) {
       try {       ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
           objectOutputStream.writeObject(serializable);
           objectOutputStream.close();
           return true;
       }catch (Exception e)
       {
           e.printStackTrace();
           return false;
       }
   }
public  Object load(String fileName){
       try {    
           ObjectInputStream objectInputStream = new ObjectInputStream(
                   new FileInputStream(fileName));
                   objectInputStream.close();
           return objectInputStream.readObject();
       }catch (Exception e) {
           e.printStackTrace();
           return null;
       }
}
}
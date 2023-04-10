package tree.familyTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveRead implements SaveAndRead{
    public FamilyTree read(String fileAddress) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileAddress));
        FamilyTree familyTree = (FamilyTree)in.readObject();
        in.close();
        return familyTree;
    }

    @Override
    public void save(FamilyTree familyTree, String fileAddress) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileAddress));
        out.writeObject(familyTree);
        out.close();


} 
} 
  
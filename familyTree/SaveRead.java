package tree.familyTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveRead implements SaveAndRead {
    public FamilyTree loadFile (String str){
        FamilyTree familyTree = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(str))){
            familyTree = (FamilyTree) ois.readObject();
                       
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return familyTree;

    }

    public static void saveFile(FamilyTree familyTree, String str){
        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream(str)))){
            oos.writeObject(familyTree);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public void SaveRead() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SaveRead'");

    
    }

}

   
    

 
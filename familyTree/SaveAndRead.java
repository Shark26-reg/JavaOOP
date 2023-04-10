package tree.familyTree;

import java.io.IOException;

public interface SaveAndRead {
   void save(FamilyTree familyTree, String fileAddress) throws IOException;
   FamilyTree read(String fileAddress) throws IOException, ClassNotFoundException;
}

package tree.handler;

import java.io.IOException;

import tree.familyTree.FamilyTree;

public interface SaveAndRead {
   void save(FamilyTree familyTree, String fileAddress) throws IOException;
   FamilyTree read(String fileAddress) throws IOException, ClassNotFoundException;
}

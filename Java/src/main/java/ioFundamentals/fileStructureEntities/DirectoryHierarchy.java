package ioFundamentals.fileStructureEntities;

import java.util.LinkedList;

public class DirectoryHierarchy extends LinkedList<DirectoryHierarchyItem> {
    public final String PARENT_PATH;

    public DirectoryHierarchy(String path) {
        PARENT_PATH = path;
    }

    @Override
    public String toString() {
        return "DirectoryHierarchy{" +
                "PARENT_PATH='" + PARENT_PATH + '\'' +
                ", modCount=" + modCount +
                '}';
    }
}

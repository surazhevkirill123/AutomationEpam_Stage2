package ioFundamentals.analyzers;

import ioFundamentals.fileStructureEntities.DirectoryHierarchy;
import ioFundamentals.fileStructureEntities.DirectoryHierarchyItem;

import java.io.File;

public class FileStructureAnalyzer {

    public static DirectoryHierarchyItem getDirectoryHierarchyItem(DirectoryHierarchy directoryHierarchy, File file) {
        return new DirectoryHierarchyItem(file, calculateNestingLevel(directoryHierarchy, file));
    }

    private static Integer calculateNestingLevel(DirectoryHierarchy directoryHierarchy, File file) {//подсчёт уровня вложенности
        Integer nestingLevel = 0;

        if (directoryHierarchy.stream().anyMatch(item -> item.getFile().equals(file.getParentFile()))) {
            nestingLevel = directoryHierarchy.stream().
                    filter(item -> item.getFile().equals(file.getParentFile())).findFirst().get().getNestedLevel();
            nestingLevel++;
        }
        return nestingLevel;
    }
}

package ioFundamentals.fileStructureEntities;

import java.io.File;

public class DirectoryHierarchyItem {
    private final File File;
    private final Integer NestedLevel; //уровень вложенности

    public DirectoryHierarchyItem(File file, Integer nestedLevel) {
        File = file;
        NestedLevel = nestedLevel;
    }

    public File getFile() {
        return File;
    }

    public Integer getNestedLevel() {
        return NestedLevel;
    }

    @Override
    public String toString() {
        String GENERAL_INDENT = "|";
        String FILE_INDENT = "   ";
        String DIRECTORY_INDENT = "---";

        StringBuilder directoryContent = new StringBuilder(GENERAL_INDENT);
        String indent = File.isDirectory() ? DIRECTORY_INDENT : FILE_INDENT;
        directoryContent.append(indent.repeat(Math.max(0, NestedLevel + 1))); //формирование отступов в виде пробелов(если файл) или нескольких дефисов(если директоория)
        directoryContent.append(File.getName());
        //System.out.println(directoryContent.toString());
        return directoryContent.toString();
    }
}

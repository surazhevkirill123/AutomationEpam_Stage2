package ioFundamentals.analyzers;

import ioFundamentals.fileStructureEntities.DirectoryHierarchy;
import ioFundamentals.fileStructureEntities.DirectoryHierarchyItem;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileAnalyzer {
    private static final int GENERAL_INDENT = 1;
    private static final int NESTED_LEVEL_INDENT = 3;
    private static Integer nestingLevel = 0;
    private static String fileName;

    public static DirectoryHierarchyItem analyzeLine(String line, DirectoryHierarchy directoryHierarchy) {
        parseLineToNestingLevelAndFileName(line);
        String parentPath = PathAnalyzer.getParentPath(directoryHierarchy, nestingLevel);
        return new DirectoryHierarchyItem(new File(parentPath + fileName), nestingLevel);
    }

    private static void parseLineToNestingLevelAndFileName(String line) {
        if (line.matches("[|][-]+\\S+")) {
            parseByPattern(line, Pattern.compile(("[|][-]+")));
        } else if (line.matches("[|][ ]+\\S+")) {
            parseByPattern(line, Pattern.compile(("[|][ ]+")));
        }
    }

    private static void parseByPattern(String line, Pattern pattern) {
        Matcher matcher = pattern.matcher(line);
        if (matcher.lookingAt()) {
            int fileNameIndex = matcher.end();
            nestingLevel = (fileNameIndex - GENERAL_INDENT) / NESTED_LEVEL_INDENT;
            nestingLevel--;
            fileName = line.substring(fileNameIndex);
        }
    }
}

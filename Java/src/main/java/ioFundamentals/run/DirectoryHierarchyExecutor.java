package ioFundamentals.run;

import ioFundamentals.analyzers.PathAnalyzer;
import ioFundamentals.fileStructureEntities.DirectoryHierarchy;
import ioFundamentals.input.DirectoryHierarchyCreator;
import ioFundamentals.services.SourceFileType;
import ioFundamentals.output.Writer;
import ioFundamentals.services.Calculator;

import java.io.File;

public class DirectoryHierarchyExecutor {
    private static final String HIERARCHY_FILE_NAME = "hierarchy.txt";

    public static void execute(String path) {
        DirectoryHierarchy directoryHierarchy;
        Calculator calculator;
        switch (SourceFileType.getSourceFileType(path)) {
            case DIRECTORY:
                directoryHierarchy = new DirectoryHierarchy(path + File.separator);
                new DirectoryHierarchyCreator(directoryHierarchy).createFromDirectory(path);
                new Writer(directoryHierarchy.PARENT_PATH + HIERARCHY_FILE_NAME).writeToFile(directoryHierarchy);
                break;
            case FILE:
                directoryHierarchy = new DirectoryHierarchy(PathAnalyzer.getParentPath(path));
                calculator = new Calculator(directoryHierarchy);
                new DirectoryHierarchyCreator(directoryHierarchy).createFromFile(path);
                System.out.println("Количество файлов " + calculator.getFilesCount());
                System.out.println("Количество папок " + calculator.getDirectoriesCount());
                System.out.println("Средняя длина названий файлов " + calculator.getAverageFileNameLength());
                System.out.println("Среднее количество файлов в папке " + calculator.getAverageFilesCountInDirectory());
                break;
        }
    }
}

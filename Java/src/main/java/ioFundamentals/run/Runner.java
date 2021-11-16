package ioFundamentals.run;

public class Runner {
    private static final String PATH_TO_THE_DIRECTORY = "E:\\STUDIES\\AutomationEpam_Stage2\\Java\\src\\main\\java\\ioFundamentals";
    private static final String PATH_TO_THE_FILE = "E:\\STUDIES\\AutomationEpam_Stage2\\Java\\src\\main\\java\\ioFundamentals\\hierarchy.txt";
    public static void main(String[] args) {
        DirectoryHierarchyExecutor.execute(PATH_TO_THE_DIRECTORY);
        DirectoryHierarchyExecutor.execute(PATH_TO_THE_FILE);
    }
}

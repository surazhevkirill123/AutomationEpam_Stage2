package ioFundamentals.run;

public class Runner {
    private static final String PATH_TO_THE_DIRECTORY = "E:\\STUDIES\\AutomationEpam_Stage2";
    private static final String PATH_TO_THE_FILE = "E:\\STUDIES\\AutomationEpam_Stage2\\hierarchy.txt";

    public static void main(String[] args) {
        DirectoryHierarchyExecutor.execute(PATH_TO_THE_DIRECTORY);
        DirectoryHierarchyExecutor.execute(PATH_TO_THE_FILE);
    }
}

package Hardcore.service;

import Hardcore.model.VMParameters;

public class VMParametersCreator {
    public static final String TESTDATA_INSTANCES = "testdata.instances";

    public static final String TESTDATA_ITEM_SOFTWARE = "testdata.item.software";

    public static final String TESTDATA_ITEM_CLASS = "testdata.item.class";

    public static final String TESTDATA_ITEM_SERIES = "testdata.item.series";

    public static final String TESTDATA_ITEM_MACHINE_TYPE = "testdata.item.machine.type";

    public static final String TESTDATA_ITEM_GPU_TYPE = "testdata.item.GPU.type";
    public static final String TESTDATA_ITEM_NUMBER_OF_GPUs = "testdata.item.number.of.GPUs";

    public static final String TESTDATA_ITEM_SSD = "testdata.item.SSD";

    public static final String TESTDATA_ITEM_LOCATION = "testdata.item.location";

    public static final String TESTDATA_ITEM_USAGE = "testdata.item.usage";

    public static VMParameters VMParametersCreate(){
        return new VMParameters(TestDataReader.getTestData(TESTDATA_INSTANCES),
                TestDataReader.getTestData(TESTDATA_ITEM_SOFTWARE),
                TestDataReader.getTestData(TESTDATA_ITEM_CLASS),
                TestDataReader.getTestData(TESTDATA_ITEM_SERIES),
                TestDataReader.getTestData(TESTDATA_ITEM_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_ITEM_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_ITEM_NUMBER_OF_GPUs),
                TestDataReader.getTestData(TESTDATA_ITEM_SSD),
                TestDataReader.getTestData(TESTDATA_ITEM_LOCATION),
                TestDataReader.getTestData(TESTDATA_ITEM_USAGE));
    }


}

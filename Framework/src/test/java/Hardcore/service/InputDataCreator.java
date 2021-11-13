package Hardcore.service;

import Hardcore.driver.DriverSingleton;
import Hardcore.model.InputData;
import Hardcore.util.StringToWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputDataCreator {
    public static final WebDriver driver = DriverSingleton.getDriver();

    public static final String TESTDATA_INSTANCES = "testdata.instances";

    public static final String TESTDATA_BUTTON_COMPUTE_ENGINE = "testdata.button.compute.engine";

    public static final String TESTDATA_INPUT_NUMBER_OF_INSTANCES = "testdata.input.number.of.instances";

    public static final String TESTDATA_INPUT_PURPOSE = "testdata.input.purpose";

    public static final String TESTDATA_DROPDOWN_SOFTWARE = "testdata.dropdown.software";
    public static final String TESTDATA_ITEM_SOFTWARE = "testdata.item.software";

    public static final String TESTDATA_DROPDOWN_CLASS = "testdata.dropdown.class";
    public static final String TESTDATA_ITEM_CLASS = "testdata.item.class";

    public static final String TESTDATA_DROPDOWN_SERIES = "testdata.dropdown.series";
    public static final String TESTDATA_ITEM_SERIES = "testdata.item.series";

    public static final String TESTDATA_DROPDOWN_MACHINE_TYPE = "testdata.dropdown.machine.type";
    public static final String TESTDATA_ITEM_MACHINE_TYPE = "testdata.item.machine.type";

    public static final String TESTDATA_CHECKBOX_ADD_GPUs = "testdata.checkbox.add.GPUs";
    public static final String TESTDATA_DROPBOX_NUMBER_OF_GPUs = "testdata.dropbox.number.of.GPUs";
    public static final String TESTDATA_ITEM_NUMBER_OF_GPUs = "testdata.item.number.of.GPUs";
    public static final String TESTDATA_DROPBOX_GPU_TYPE = "testdata.dropbox.GPU.type";
    public static final String TESTDATA_ITEM_GPU_TYPE = "testdata.item.GPU.type";

    public static final String TESTDATA_DROPDOWN_SSD = "testdata.dropdown.SSD";
    public static final String TESTDATA_ITEM_SSD = "testdata.item.SSD";

    public static final String TESTDATA_DROPDOWN_LOCATION = "testdata.dropdown.location";
    public static final String TESTDATA_ITEM_LOCATION = "testdata.item.location";

    public static final String TESTDATA_DROPDOWN_USAGE = "testdata.dropdown.usage";
    public static final String TESTDATA_ITEM_USAGE = "testdata.item.usage";

    public static InputData InputDataCreateDev(){
        System.setProperty("environment","dev");
        return new InputData(TestDataReader.getTestData(TESTDATA_INSTANCES),
                TestDataReader.getTestData(TESTDATA_BUTTON_COMPUTE_ENGINE),
                TestDataReader.getTestData(TESTDATA_INPUT_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_INPUT_PURPOSE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SOFTWARE),
                TestDataReader.getTestData(TESTDATA_ITEM_SOFTWARE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_CLASS),
                TestDataReader.getTestData(TESTDATA_ITEM_CLASS),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SERIES),
                TestDataReader.getTestData(TESTDATA_ITEM_SERIES),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_ITEM_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_CHECKBOX_ADD_GPUs),
                TestDataReader.getTestData(TESTDATA_DROPBOX_NUMBER_OF_GPUs),
                TestDataReader.getTestData(TESTDATA_ITEM_NUMBER_OF_GPUs),
                TestDataReader.getTestData(TESTDATA_DROPBOX_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_ITEM_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SSD),
                TestDataReader.getTestData(TESTDATA_ITEM_SSD),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_LOCATION),
                TestDataReader.getTestData(TESTDATA_ITEM_LOCATION),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_USAGE),
                TestDataReader.getTestData(TESTDATA_ITEM_USAGE));
    }

    public static InputData InputDataCreateQa(){
        System.setProperty("environment","qa");
        return new InputData(TestDataReader.getTestData(TESTDATA_INSTANCES),
                TestDataReader.getTestData(TESTDATA_BUTTON_COMPUTE_ENGINE),
                TestDataReader.getTestData(TESTDATA_INPUT_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_INPUT_PURPOSE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SOFTWARE),
                TestDataReader.getTestData(TESTDATA_ITEM_SOFTWARE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_CLASS),
                TestDataReader.getTestData(TESTDATA_ITEM_CLASS),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SERIES),
                TestDataReader.getTestData(TESTDATA_ITEM_SERIES),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_ITEM_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_CHECKBOX_ADD_GPUs),
                TestDataReader.getTestData(TESTDATA_DROPBOX_NUMBER_OF_GPUs),
                TestDataReader.getTestData(TESTDATA_ITEM_NUMBER_OF_GPUs),
                TestDataReader.getTestData(TESTDATA_DROPBOX_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_ITEM_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SSD),
                TestDataReader.getTestData(TESTDATA_ITEM_SSD),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_LOCATION),
                TestDataReader.getTestData(TESTDATA_ITEM_LOCATION),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_USAGE),
                TestDataReader.getTestData(TESTDATA_ITEM_USAGE));
    }

    public static InputData InputDataCreateDefault(){
        return new InputData(TestDataReader.getTestData(TESTDATA_INSTANCES),
                TestDataReader.getTestData(TESTDATA_BUTTON_COMPUTE_ENGINE),
                TestDataReader.getTestData(TESTDATA_INPUT_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_INPUT_PURPOSE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SOFTWARE),
                TestDataReader.getTestData(TESTDATA_ITEM_SOFTWARE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_CLASS),
                TestDataReader.getTestData(TESTDATA_ITEM_CLASS),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SERIES),
                TestDataReader.getTestData(TESTDATA_ITEM_SERIES),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_ITEM_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_CHECKBOX_ADD_GPUs),
                TestDataReader.getTestData(TESTDATA_DROPBOX_NUMBER_OF_GPUs),
                TestDataReader.getTestData(TESTDATA_ITEM_NUMBER_OF_GPUs),
                TestDataReader.getTestData(TESTDATA_DROPBOX_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_ITEM_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_SSD),
                TestDataReader.getTestData(TESTDATA_ITEM_SSD),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_LOCATION),
                TestDataReader.getTestData(TESTDATA_ITEM_LOCATION),
                TestDataReader.getTestData(TESTDATA_DROPDOWN_USAGE),
                TestDataReader.getTestData(TESTDATA_ITEM_USAGE));
    }


}

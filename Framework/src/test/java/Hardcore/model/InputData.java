package Hardcore.model;

import java.util.Objects;

public class InputData {
    private String instances;
    private String buttonComputeEngine;

    private String inputNumberOfInstances;

    private String inputPurpose;

    private String dropdownSoftware;
    private String itemSoftware;

    private String dropdownClass;
    private String itemClass;

    private String dropdownSeries;
    private String itemSeries;

    private String dropdownMachineType;
    private String itemMachineType;

    private String checkboxAddGPUs;
    private String dropboxNumberOfGPUs;
    private String itemNumberOfGPUs;
    private String dropboxGPUType;
    private String itemGPUType;

    private String dropdownSSD;
    private String itemSSD;

    private String dropdownLocation;
    private String itemLocation;

    private String dropdownUsage;
    private String itemUsage;

    public InputData(String instances, String buttonComputeEngine, String inputNumberOfInstances,
                     String inputPurpose, String dropdownSoftware, String itemSoftware,
                     String dropdownClass, String itemClass, String dropdownSeries, String itemSeries,
                     String dropdownMachineType, String itemMachineType, String checkboxAddGPUs,
                     String dropboxNumberOfGPUs, String itemNumberOfGPUs, String dropboxGPUType,
                     String itemGPUType, String dropdownSSD, String itemSSD, String dropdownLocation,
                     String itemLocation, String dropdownUsage, String itemUsage) {
        this.instances = instances;
        this.buttonComputeEngine = buttonComputeEngine;
        this.inputNumberOfInstances = inputNumberOfInstances;
        this.inputPurpose = inputPurpose;
        this.dropdownSoftware = dropdownSoftware;
        this.itemSoftware = itemSoftware;
        this.dropdownClass = dropdownClass;
        this.itemClass = itemClass;
        this.dropdownSeries = dropdownSeries;
        this.itemSeries = itemSeries;
        this.dropdownMachineType = dropdownMachineType;
        this.itemMachineType = itemMachineType;
        this.checkboxAddGPUs = checkboxAddGPUs;
        this.dropboxNumberOfGPUs = dropboxNumberOfGPUs;
        this.itemNumberOfGPUs = itemNumberOfGPUs;
        this.dropboxGPUType = dropboxGPUType;
        this.itemGPUType = itemGPUType;
        this.dropdownSSD = dropdownSSD;
        this.itemSSD = itemSSD;
        this.dropdownLocation = dropdownLocation;
        this.itemLocation = itemLocation;
        this.dropdownUsage = dropdownUsage;
        this.itemUsage = itemUsage;
    }

    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public String getButtonComputeEngine() {
        return buttonComputeEngine;
    }

    public void setButtonComputeEngine(String buttonComputeEngine) {
        this.buttonComputeEngine = buttonComputeEngine;
    }

    public String getInputNumberOfInstances() {
        return inputNumberOfInstances;
    }

    public void setInputNumberOfInstances(String inputNumberOfInstances) {
        this.inputNumberOfInstances = inputNumberOfInstances;
    }

    public String getInputPurpose() {
        return inputPurpose;
    }

    public void setInputPurpose(String inputPurpose) {
        this.inputPurpose = inputPurpose;
    }

    public String getDropdownSoftware() {
        return dropdownSoftware;
    }

    public void setDropdownSoftware(String dropdownSoftware) {
        this.dropdownSoftware = dropdownSoftware;
    }

    public String getItemSoftware() {
        return itemSoftware;
    }

    public void setItemSoftware(String itemSoftware) {
        this.itemSoftware = itemSoftware;
    }

    public String getDropdownClass() {
        return dropdownClass;
    }

    public void setDropdownClass(String dropdownClass) {
        this.dropdownClass = dropdownClass;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getDropdownSeries() {
        return dropdownSeries;
    }

    public void setDropdownSeries(String dropdownSeries) {
        this.dropdownSeries = dropdownSeries;
    }

    public String getItemSeries() {
        return itemSeries;
    }

    public void setItemSeries(String itemSeries) {
        this.itemSeries = itemSeries;
    }

    public String getDropdownMachineType() {
        return dropdownMachineType;
    }

    public void setDropdownMachineType(String dropdownMachineType) {
        this.dropdownMachineType = dropdownMachineType;
    }

    public String getItemMachineType() {
        return itemMachineType;
    }

    public void setItemMachineType(String itemMachineType) {
        this.itemMachineType = itemMachineType;
    }

    public String getCheckboxAddGPUs() {
        return checkboxAddGPUs;
    }

    public void setCheckboxAddGPUs(String checkboxAddGPUs) {
        this.checkboxAddGPUs = checkboxAddGPUs;
    }

    public String getDropboxNumberOfGPUs() {
        return dropboxNumberOfGPUs;
    }

    public void setDropboxNumberOfGPUs(String dropboxNumberOfGPUs) {
        this.dropboxNumberOfGPUs = dropboxNumberOfGPUs;
    }

    public String getItemNumberOfGPUs() {
        return itemNumberOfGPUs;
    }

    public void setItemNumberOfGPUs(String itemNumberOfGPUs) {
        this.itemNumberOfGPUs = itemNumberOfGPUs;
    }

    public String getDropboxGPUType() {
        return dropboxGPUType;
    }

    public void setDropboxGPUType(String dropboxGPUType) {
        this.dropboxGPUType = dropboxGPUType;
    }

    public String getItemGPUType() {
        return itemGPUType;
    }

    public void setItemGPUType(String itemGPUType) {
        this.itemGPUType = itemGPUType;
    }

    public String getDropdownSSD() {
        return dropdownSSD;
    }

    public void setDropdownSSD(String dropdownSSD) {
        this.dropdownSSD = dropdownSSD;
    }

    public String getItemSSD() {
        return itemSSD;
    }

    public void setItemSSD(String itemSSD) {
        this.itemSSD = itemSSD;
    }

    public String getDropdownLocation() {
        return dropdownLocation;
    }

    public void setDropdownLocation(String dropdownLocation) {
        this.dropdownLocation = dropdownLocation;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    public String getDropdownUsage() {
        return dropdownUsage;
    }

    public void setDropdownUsage(String dropdownUsage) {
        this.dropdownUsage = dropdownUsage;
    }

    public String getItemUsage() {
        return itemUsage;
    }

    public void setItemUsage(String itemUsage) {
        this.itemUsage = itemUsage;
    }

    @Override
    public String toString() {
        return "InputData{" +
                "instances='" + instances + '\'' +
                ", buttonComputeEngine=" + buttonComputeEngine +
                ", inputNumberOfInstances=" + inputNumberOfInstances +
                ", inputPurpose=" + inputPurpose +
                ", dropdownSoftware=" + dropdownSoftware +
                ", itemSoftware=" + itemSoftware +
                ", dropdownClass=" + dropdownClass +
                ", itemClass=" + itemClass +
                ", dropdownSeries=" + dropdownSeries +
                ", itemSeries=" + itemSeries +
                ", dropdownMachineType=" + dropdownMachineType +
                ", itemMachineType=" + itemMachineType +
                ", checkboxAddGPUs=" + checkboxAddGPUs +
                ", dropboxNumberOfGPUs=" + dropboxNumberOfGPUs +
                ", itemNumberOfGPUs=" + itemNumberOfGPUs +
                ", dropboxGPUType=" + dropboxGPUType +
                ", itemGPUType=" + itemGPUType +
                ", dropdownSSD=" + dropdownSSD +
                ", itemSSD=" + itemSSD +
                ", dropdownLocation=" + dropdownLocation +
                ", itemLocation=" + itemLocation +
                ", dropdownUsage=" + dropdownUsage +
                ", itemUsage=" + itemUsage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputData inputData = (InputData) o;
        return Objects.equals(instances, inputData.instances) &&
                Objects.equals(buttonComputeEngine, inputData.buttonComputeEngine) &&
                Objects.equals(inputNumberOfInstances, inputData.inputNumberOfInstances) &&
                Objects.equals(inputPurpose, inputData.inputPurpose) &&
                Objects.equals(dropdownSoftware, inputData.dropdownSoftware) &&
                Objects.equals(itemSoftware, inputData.itemSoftware) &&
                Objects.equals(dropdownClass, inputData.dropdownClass) &&
                Objects.equals(itemClass, inputData.itemClass) &&
                Objects.equals(dropdownSeries, inputData.dropdownSeries) &&
                Objects.equals(itemSeries, inputData.itemSeries) &&
                Objects.equals(dropdownMachineType, inputData.dropdownMachineType) &&
                Objects.equals(itemMachineType, inputData.itemMachineType) &&
                Objects.equals(checkboxAddGPUs, inputData.checkboxAddGPUs) &&
                Objects.equals(dropboxNumberOfGPUs, inputData.dropboxNumberOfGPUs) &&
                Objects.equals(itemNumberOfGPUs, inputData.itemNumberOfGPUs) &&
                Objects.equals(dropboxGPUType, inputData.dropboxGPUType) &&
                Objects.equals(itemGPUType, inputData.itemGPUType) &&
                Objects.equals(dropdownSSD, inputData.dropdownSSD) &&
                Objects.equals(itemSSD, inputData.itemSSD) &&
                Objects.equals(dropdownLocation, inputData.dropdownLocation) &&
                Objects.equals(itemLocation, inputData.itemLocation) &&
                Objects.equals(dropdownUsage, inputData.dropdownUsage) &&
                Objects.equals(itemUsage, inputData.itemUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, buttonComputeEngine, inputNumberOfInstances, inputPurpose, dropdownSoftware, itemSoftware, dropdownClass, itemClass, dropdownSeries, itemSeries, dropdownMachineType, itemMachineType, checkboxAddGPUs, dropboxNumberOfGPUs, itemNumberOfGPUs, dropboxGPUType, itemGPUType, dropdownSSD, itemSSD, dropdownLocation, itemLocation, dropdownUsage, itemUsage);
    }
}

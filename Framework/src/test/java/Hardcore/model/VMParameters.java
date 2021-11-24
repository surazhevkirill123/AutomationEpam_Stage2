package Hardcore.model;

import java.util.Objects;

public class VMParameters {
    private String instances;

    private String itemSoftware;

    private String itemClass;

    private String itemSeries;

    private String itemMachineType;

    private String itemGPUType;
    private String itemNumberOfGPUs;

    private String itemSSD;

    private String itemLocation;

    private String itemUsage;

    public VMParameters(String instances, String itemSoftware, String itemClass, String itemSeries, String itemMachineType, String itemGPUType, String itemNumberOfGPUs, String itemSSD, String itemLocation, String itemUsage) {
        this.instances = instances;
        this.itemSoftware = itemSoftware;
        this.itemClass = itemClass;
        this.itemSeries = itemSeries;
        this.itemMachineType = itemMachineType;
        this.itemGPUType = itemGPUType;
        this.itemNumberOfGPUs = itemNumberOfGPUs;
        this.itemSSD = itemSSD;
        this.itemLocation = itemLocation;
        this.itemUsage = itemUsage;
    }

    public String getInstances() {
        return instances;
    }

    public String getItemSoftware() {
        return itemSoftware;
    }

    public String getItemClass() {
        return itemClass;
    }

    public String getItemSeries() {
        return itemSeries;
    }

    public String getItemMachineType() {
        return itemMachineType;
    }

    public String getItemGPUType() {
        return itemGPUType;
    }

    public String getItemNumberOfGPUs() {
        return itemNumberOfGPUs;
    }

    public String getItemSSD() {
        return itemSSD;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public String getItemUsage() {
        return itemUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VMParameters VMParameters = (VMParameters) o;
        return Objects.equals(instances, VMParameters.instances) &&
                Objects.equals(itemSoftware, VMParameters.itemSoftware) &&
                Objects.equals(itemClass, VMParameters.itemClass) &&
                Objects.equals(itemSeries, VMParameters.itemSeries) &&
                Objects.equals(itemMachineType, VMParameters.itemMachineType) &&
                Objects.equals(itemGPUType, VMParameters.itemGPUType) &&
                Objects.equals(itemNumberOfGPUs, VMParameters.itemNumberOfGPUs) &&
                Objects.equals(itemSSD, VMParameters.itemSSD) &&
                Objects.equals(itemLocation, VMParameters.itemLocation) &&
                Objects.equals(itemUsage, VMParameters.itemUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, itemSoftware, itemClass, itemSeries, itemMachineType, itemGPUType, itemNumberOfGPUs, itemSSD, itemLocation, itemUsage);
    }

    @Override
    public String toString() {
        return "VMParameters{" +
                "instances='" + instances + '\'' +
                ", itemSoftware='" + itemSoftware + '\'' +
                ", itemClass='" + itemClass + '\'' +
                ", itemSeries='" + itemSeries + '\'' +
                ", itemMachineType='" + itemMachineType + '\'' +
                ", itemGPUType='" + itemGPUType + '\'' +
                ", itemNumberOfGPUs='" + itemNumberOfGPUs + '\'' +
                ", itemSSD='" + itemSSD + '\'' +
                ", itemLocation='" + itemLocation + '\'' +
                ", itemUsage='" + itemUsage + '\'' +
                '}';
    }
}

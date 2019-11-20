package com.company;

/**
 * Created by witekgr1 on 2017-04-24.
 */

public class SystemObjectList {

    private Integer systemObjectId;
    private Integer systemId;
    private String systemName;
    private Integer objectId;
    private String objectName;
    private Integer objectTypeId;
    private String objectTypeName;

    public SystemObjectList(Integer systemObjectId, Integer systemId, String systemName, Integer objectId, String objectName, Integer objectTypeId, String objectTypeName) {
        this.systemObjectId = systemObjectId;
        this.systemId = systemId;
        this.systemName = systemName;
        this.objectId = objectId;
        this.objectName = objectName;
        this.objectTypeId = objectTypeId;
        this.objectTypeName = objectTypeName;
    }

    public Integer getSystemObjectId() {
        return systemObjectId;
    }

    public void setSystemObjectId(Integer systemObjectId) {
        this.systemObjectId = systemObjectId;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Integer getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(Integer objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public String getObjectTypeName() {
        return objectTypeName;
    }

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    @Override
    public String toString() {
        return "SystemObjectList{" +
                "systemObjectId=" + systemObjectId +
                ", systemId=" + systemId +
                ", systemName='" + systemName + '\'' +
                ", objectId=" + objectId +
                ", objectName='" + objectName + '\'' +
                ", objectTypeId=" + objectTypeId +
                ", objectTypeName='" + objectTypeName + '\'' +
                '}';
    }
}

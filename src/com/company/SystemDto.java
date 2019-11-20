package com.company;

import java.util.List;

public class SystemDto {
    private Integer id;
    private String name;
    private String statusName;
    private List<LayerDto> layers;

    public SystemDto(Integer id, String name, String statusName, List<LayerDto> layers) {
        this.id = id;
        this.name = name;
        this.statusName = statusName;
        this.layers = layers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public List<LayerDto> getLayers() {
        return layers;
    }

    public void setLayers(List<LayerDto> layers) {
        this.layers = layers;
    }

    @Override
    public String toString() {
        return "SystemDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", statusName='" + statusName + '\'' +
                ", layers=" + layers +
                '}';
    }
}


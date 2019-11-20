package com.company;

import java.util.List;

public class LayerDto {
    private String name;
    private List<ObjectDto> objects;

    public LayerDto(String name, List<ObjectDto> objects) {
        this.name = name;
        this.objects = objects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ObjectDto> getObjects() {
        return objects;
    }

    public void setObjects(List<ObjectDto> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "LayerDto{" +
                "name='" + name + '\'' +
                ", objects=" + objects +
                '}';
    }
}

package com.company;

import java.util.List;
import java.util.Objects;

public class LayerDto {
    private Integer id;
    private String name;
    private List<ObjectDto> objects;

    public LayerDto(Integer id, String name, List<ObjectDto> objects) {
        this.id = id;
        this.name = name;
        this.objects = objects;
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

    public List<ObjectDto> getObjects() {
        return objects;
    }

    public void setObjects(List<ObjectDto> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "LayerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", objects=" + objects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LayerDto layerDto = (LayerDto) o;
        return id.equals(layerDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<SystemObjectList> items = Arrays.asList(
                new SystemObjectList(1, 1, "SA", 1, "OA", 1, "APP"),
                new SystemObjectList(2, 1, "SA", 2, "OB", 2, "OS"),
                new SystemObjectList(3, 1, "SA", 3, "OC", 1, "APP"),
                new SystemObjectList(4, 2, "SB", 1, "OA", 1, "APP"),
                new SystemObjectList(5, 2, "SB", 2, "OB", 2, "OS"),
                new SystemObjectList(6, 2, "SB", 3, "OC", 1, "APP")

        );

        Map<SystemDto, Map<LayerDto, List<SystemObjectList>>> systemMap =
                items.stream().collect(
                        groupingBy(
                                (SystemObjectList item) -> new SystemDto(item.getSystemId(), item.getSystemName(), null, null),
                                groupingBy(
                                        (SystemObjectList item) -> new LayerDto(item.getObjectTypeId(), item.getObjectTypeName(), null)
                                )
                        )
                );

        List<SystemDto> systems = systemMap.entrySet().stream()
                .map(systemKey ->
                        new SystemDto(
                                systemKey.getKey().getId(),
                                systemKey.getKey().getName(),
                                systemKey.getKey().getStatusName(),
                                systemKey.getValue().entrySet().stream()
                                        .map(layerKey -> new LayerDto(
                                                layerKey.getKey().getId(),
                                                layerKey.getKey().getName(),
                                                layerKey.getValue().stream()
                                                        .map(val -> new ObjectDto(val.getObjectId(), val.getObjectName()))
                                                        .collect(toList())
                                        ))
                                        .collect(toList())
                        )
                ).collect(toList());

        System.out.println(systems);
    }
}


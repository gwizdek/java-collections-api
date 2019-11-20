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


//        Map<Integer, List>

        Map<Integer, Map<Integer, List<SystemObjectList>>> groupBy =
                items.stream().collect(
                        groupingBy(
                                SystemObjectList::getSystemId,
                                groupingBy(
                                        SystemObjectList::getObjectTypeId
                                )
                        )
                );

//        List<SystemDto> systems = groupBy.entrySet().stream()
//                .map(s -> new SystemDto(s.getKey(), s.getValue()));

//        Map<Integer, List<ObjectDto>> groupBy =
//                items.stream()
//                        .map(item -> new ObjectDto(item.getObjectId(), item.getObjectName()))
//                        .collect(Collectors.groupingBy(SystemObjectList::getSystemId));

//        List<SystemDto> systems = groupBy.entrySet().stream()
//                .map(e -> new SystemDto(
//                        e.getKey(),
//                        "test",
//                        "status",
//                        e.getValue().stream()
//                                .map(systemObject-> new ObjectDto(systemObject.getObjectId(), systemObject.getObjectName()))
//                                .collect(Collectors.toList())
//                        )
//                )
//                .collect(Collectors.toList());

//        systems.stream().forEach(System.out::println);

        groupBy.entrySet().stream().forEach(System.out::println);
    }
}

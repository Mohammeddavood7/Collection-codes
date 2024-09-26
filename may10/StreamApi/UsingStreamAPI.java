package com.may10.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamAPI
{
    public static void main(String[] args)
    {
        List<String> strings = Arrays.asList("abcd", "efgh", "jklm", "xyz");

        List<String> result = strings.stream()
        		.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}

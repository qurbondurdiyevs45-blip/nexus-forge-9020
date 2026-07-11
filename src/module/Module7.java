// Nexus Forge — module 7
package com.pushforge.nexus_forge_;

import java.util.*;
import java.util.stream.*;

public class Module7 {
    public static Map<String, Long> wordCount(String text){
        return Arrays.stream(text.toLowerCase().split("\\W+"))
            .filter(s -> !s.isEmpty())
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    }
    public static void main(String[] args){
        System.out.println(wordCount("An autonomous music synthesizer scaffolded by PushForge Engine."));
    }
}
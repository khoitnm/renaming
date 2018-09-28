package org.tnmk.replacing.all.common.nametransformer;


import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapitalizeTransformer implements Function<String, String> {

    @Override
    public String apply(String wordsString) {
        List<String> wordsList = SplitWordsHelper.splitWords(wordsString);
        String className = wordsList.stream().collect(Collectors.joining());
        return org.apache.commons.lang3.StringUtils.capitalize(className);
    }
}
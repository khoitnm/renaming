package org.tnmk.replacing.all.common.multiformname.nametransformer;

import org.tnmk.replacing.all.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitWordsHelper {
    /**
     * At first, this method will split words by space.
     * After that, it will continue split words by hyphen "-".
     * @param phase
     * @return
     */
    public static List<String> splitWordsBySpaceOrHyphen(String phase){
        String[] splitBySpaceWords = StringUtils.splitToWords(phase);
        List<String> splitByHyphenWordsList = new ArrayList<>();
        for (String splitBySpaceWord : splitBySpaceWords) {
            String[] splitByHyphenWords = splitBySpaceWord.split("-");
            splitByHyphenWordsList.addAll(Arrays.asList(splitByHyphenWords));
        }
        return splitByHyphenWordsList;
    }
}
package org.tnmk.replacing.all.renaming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author khoi.tran on 7/6/17.
 */
@Service
public class CopyingAndReplacingService {
    public static final Logger LOGGER = LoggerFactory.getLogger(CopyingAndReplacingService.class);

    @Autowired
    private CopyingService copyingService;
    @Autowired
    private ReplacingService replacingService;

    public void copyingAndReplacing(String sourcePath, String destPath, List<String> excludingPatterns,
                                    Map<String, String> renameMap) {
        this.copyingService.copySubItems(sourcePath, destPath, excludingPatterns);
        this.replacingService.replace(destPath, renameMap);
    }
}

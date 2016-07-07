package Service;

import java.io.File;

/**
 * Created by sanjeev budha on 7/7/16.
 */
public class LocalFile extends AbstractFileFetcher {

    @Override
    public File getFile(String classifier) {
        if(classifier.equalsIgnoreCase("noDrill")) {
            inputFile = new File("/home/sanjeevbudha/HVACDataAnalysis/HVAC-Reporter/data/secondResult.csv");
        }else{
            inputFile = new File("/home/sanjeevbudha/HVACDataAnalysis/HVAC-Reporter/data/firstResult.csv");
        }
        return inputFile;
    }
}

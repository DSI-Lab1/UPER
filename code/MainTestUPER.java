import java.io.IOException;


public class MainTestUPER {

    public static void main(String[] args) throws IOException {
        // the min support of HUPOERM algorithm
        int minSupport =0;
        // the XSpan of HUPOERM algorithm
        int xSpan =1;
        // the YSpan of HUPOERM algorithm
        int ySpan =1;
        // the XYSpan of HUPOERM algorithm
        int xySpan =3;
        // the minimum utility threshold : a ratio
        double minUtilityRatio = 0.5;
        // the min confidence of HUPOERM algorithm
        double minConfidence = 0.6;
        // the maximum line number
        int maxLineNumber = 10000000;
        // whether to use matrix
        boolean matrix=false;
        // whether to use tighter upper bound
        boolean tighterUpperBound=true;
        // Input file
        String inputFile = "dataset/example_paper.txt";
        // Output file
        String outputFile = "output.txt";

        AlgoUPER HUPOERM = new AlgoUPER();

        //poerm.runAlgorithm(inputFile, minSupport, xSpan, ySpan, minConfidence, winlen, selfIncrement);
        HUPOERM.runAlgorithm(inputFile, outputFile, minSupport, minConfidence, minUtilityRatio, xSpan, ySpan, xySpan, maxLineNumber,matrix, tighterUpperBound);
        HUPOERM.printStats();
    }

}
package com.BrowserGenerator;

import com.Configuration.BrowserConfigurationFile;
import org.apache.commons.math3.distribution.EnumeratedDistribution;
import org.apache.commons.math3.util.Pair;

import java.util.Arrays;
import java.util.List;

public class GenerateBrowserToRun {

    /**
     * the method generate_random_browser_based_on_probability is used to generate browser values based
     * on the probability we have given. We have created a collection which accepts String Browser
     * and double-Weightage. So basically if i run 10 times chrome will be created 5 times Firefox as 2 and Edge as
     * 1 since chrome has the maximum weightage
     * @throws Exception
     */
   public static void generate_random_browser_based_on_probability() throws Exception{
       List<Pair<String, Double>> browsers = Arrays.asList(
               Pair.create("Chrome", .5),
               Pair.create("Firefox", .2),
               Pair.create("Edge", .1));
       EnumeratedDistribution<String> distribution = new EnumeratedDistribution<>(browsers);
       String random = distribution.sample();
       BrowserConfigurationFile.setBrowserName(random);
   }
}

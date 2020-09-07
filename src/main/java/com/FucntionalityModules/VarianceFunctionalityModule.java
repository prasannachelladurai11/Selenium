package com.FucntionalityModules;

import com.Comparator.VarianceCalculatorandComparator;
import com.VariableDeclaration.TestVariableDeclararion;
import org.testng.Assert;

public class VarianceFunctionalityModule {


    public static void find_variance_and_authenticate_weather() throws Exception{
        VarianceCalculatorandComparator.calculate_variance_difference_and_compare();
        Assert.assertTrue(TestVariableDeclararion.getVarianceCalculated()<=TestVariableDeclararion.getVarianceAssinged(),"Variance Calculated Should be Less the Variance Assigned.");
    }
}

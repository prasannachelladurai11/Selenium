package com.Comparator;


import com.VariableDeclaration.TestVariableDeclararion;

public class VarianceCalculatorandComparator {


    public static void calculate_variance_difference_and_compare() throws Exception{
          double data[]= {Double.parseDouble(TestVariableDeclararion.getCelsiusTemperature()),Double.parseDouble(TestVariableDeclararion.getTemperatureFromUi())};
          double mean = 0.0;
          for(int i=0;i< data.length;i++){
             mean += data[i];
          }
          mean /= data.length;
          double variance = 0;
          for (int i = 0; i < data.length; i++) {
              variance += Math.pow(data[i] - mean, data.length);
          }
          variance /= data.length;
          System.out.println("Varience Calculated:-"+variance);
          TestVariableDeclararion.setVarianceCalculated(variance);
    }
}

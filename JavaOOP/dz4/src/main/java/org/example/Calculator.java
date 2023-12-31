package org.example;



import java.util.*;


public class Calculator {
    public Double getSum(List<? extends Number> list) {
        double res = 0.0;
        for (Number num : list) {
            res += num.doubleValue();
        }
        return res;
    }

    public Double getCom(List<? extends Number> list) {
        double res = 1.0;
        for (Number num : list) {
            res *= num.doubleValue();
        }
        return res;
    }

    public Double getDiv(List<? extends Number> list) {
        double res = 1.0;
        for (Number num : list) {
            if (num.doubleValue() != 0) {
                res /= num.doubleValue();
            }
        }
        return res;
    }

    public List<String> decimalToBinary(List<? extends Number> decimalList) {
        List<String> binaryList = new ArrayList<>();
        for (Number decimal : decimalList) {
            binaryList.add(Integer.toBinaryString(decimal.intValue()));
        }
        return binaryList;
    }

    public List<Integer> binaryToDecimal(List<String> binaryList) {
        List<Integer> decimalList = new ArrayList<>();
        for (String binary : binaryList) {
            decimalList.add(Integer.parseInt(binary, 2));
        }
        return decimalList;
    }

    public List<Integer> roundDoubleToInteger(List<? extends Number> doubleList) {
        List<Integer> integerList = new ArrayList<>();
        for (Number d : doubleList) {
            integerList.add((int) Math.round(d.doubleValue()));
        }
        return integerList;
    }

    public List<Integer> roundFloatToInteger(List<? extends Number> floatList) {
        List<Integer> integerList = new ArrayList<>();
        for (Number f : floatList) {
            integerList.add(Math.round(f.floatValue()));
        }
        return integerList;
    }

}

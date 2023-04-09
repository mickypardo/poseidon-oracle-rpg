package org.mpardo.apps.initializators;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.mpardo.apps.model.AnswerOracle;
import org.mpardo.apps.model.Odds;
import org.mpardo.apps.model.OddsValues;

public class InitDates {
    
    static List<OddsValues> valuesFixed = Arrays.asList(
        new OddsValues(null, 1, 81), new OddsValues(1, 5, 82), new OddsValues(2, 10, 83), 
        new OddsValues(3, 15, 84), new OddsValues(5, 85, 26), new OddsValues(7, 35, 88), 
        new OddsValues(10, 50, 91), new OddsValues(13, 65, 94), new OddsValues(15, 75, 96), 
        new OddsValues(17, 85, 98), new OddsValues(18, 90, 99), new OddsValues(19, 95, 100), 
        new OddsValues(20, 99, null));
    
    static OddsValues[][] oddsValuesArray = {
        {valuesFixed.get(6), valuesFixed.get(7), valuesFixed.get(8), valuesFixed.get(9), valuesFixed.get(10), valuesFixed.get(11), valuesFixed.get(12), valuesFixed.get(12), valuesFixed.get(12)},
        {valuesFixed.get(5), valuesFixed.get(6), valuesFixed.get(7), valuesFixed.get(8), valuesFixed.get(9), valuesFixed.get(10), valuesFixed.get(11), valuesFixed.get(12), valuesFixed.get(12)},
        {valuesFixed.get(4), valuesFixed.get(5), valuesFixed.get(6), valuesFixed.get(7), valuesFixed.get(8), valuesFixed.get(9), valuesFixed.get(10), valuesFixed.get(11), valuesFixed.get(12)},
        {valuesFixed.get(3), valuesFixed.get(4), valuesFixed.get(5), valuesFixed.get(6), valuesFixed.get(7), valuesFixed.get(8), valuesFixed.get(9), valuesFixed.get(10), valuesFixed.get(11)},
        {valuesFixed.get(2), valuesFixed.get(3), valuesFixed.get(4), valuesFixed.get(5), valuesFixed.get(6), valuesFixed.get(7), valuesFixed.get(8), valuesFixed.get(9), valuesFixed.get(10)},
        {valuesFixed.get(1), valuesFixed.get(2), valuesFixed.get(3), valuesFixed.get(4), valuesFixed.get(5), valuesFixed.get(6), valuesFixed.get(7), valuesFixed.get(8), valuesFixed.get(9)},
        {valuesFixed.get(0), valuesFixed.get(1), valuesFixed.get(2), valuesFixed.get(3), valuesFixed.get(4), valuesFixed.get(5), valuesFixed.get(6), valuesFixed.get(7), valuesFixed.get(8)},
        {valuesFixed.get(0), valuesFixed.get(0), valuesFixed.get(1), valuesFixed.get(2), valuesFixed.get(3), valuesFixed.get(4), valuesFixed.get(5), valuesFixed.get(6), valuesFixed.get(7)},
        {valuesFixed.get(0), valuesFixed.get(0), valuesFixed.get(0), valuesFixed.get(1), valuesFixed.get(2), valuesFixed.get(3), valuesFixed.get(4), valuesFixed.get(5), valuesFixed.get(6)},
        {valuesFixed.get(0), valuesFixed.get(0), valuesFixed.get(0), valuesFixed.get(0), valuesFixed.get(1), valuesFixed.get(2), valuesFixed.get(3), valuesFixed.get(4), valuesFixed.get(5)}
    };

    public static String resultFateCheck(Integer chaosFactor, Odds odds) {

        String result;

        Random rnd = new Random();

        int roll = rnd.nextInt(100) + 1;

        System.out.println("Tirada: " + roll);

        OddsValues oValues = oddsValuesArray[odds.ordinal()][chaosFactor-1];

        if (roll <= oValues.getValue()) {

            if (roll <= oValues.getMin()) {
                // Check is EXCEPTIONAL_YES
                result = AnswerOracle.EXCEPTIONAL_YES.name();
            } else {
                // Check is YES
                result = AnswerOracle.YES.name();
            }
        } else {
            if (roll > oValues.getMax()) {
                // Check is EXCEPTIONAL_NO
                result = AnswerOracle.EXCEPTIONAL_NO.name();
            } else {
                // Check is NO
                result = AnswerOracle.NO.name();
            }

        }

        String rollString = String.valueOf(roll);
        if (rollString.length() == 2) {
            if (rollString.charAt(0) == rollString.charAt(1)) {
                // Matches in both numbers (11, 22, 33, ...)
                String digit = rollString.substring(1);
                if (Integer.parseInt(digit) <= chaosFactor) {
                    // Random Event
                    result += ";" + "RANDOM_EVENT";
                }
            }
        }

        return result;

    }
    
}

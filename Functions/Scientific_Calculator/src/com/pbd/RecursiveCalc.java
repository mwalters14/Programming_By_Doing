package com.pbd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Logic 1
 *
 * Get position of a SIGN
 * get the digits before and after the sign to the next signs
 * solve the three and replace them with the result
 * create a new string with the replacement
 *
 * repeat the process
 *
 *-------------------------------------------------------------------------
 *  Logic 2
 *
 *
 *  Store the digits in an array
 *  Store the operators in a separate array
 *  get an operator from list
 *  get digits before and after the operator position
 *  operate on the two
 *  delete the second and the operator too
 *
 *  repeat the process
 */


public class RecursiveCalc {
    public static Character[] OPERATORS={'/','*','+','-'};

    public static final String REGEXOPERATORS="[+,-,/*,//,-]";
    public static final String REGEXDIGITS="(\\d+)";

    public static ArrayList<Character> operators = new ArrayList<Character>();
    public static ArrayList<Integer> digits = new ArrayList<Integer>();

    public RecursiveCalc(){
        System.out.println("Constructor called");
    }


    public static void main(String[] args){
        String math="81*52-29+36";
        getDigits(math);
        getOperators(math);
        //get highest level sign
        getNextOperator(operators);


        Iterator<Integer> i=digits.iterator();

        while (i.hasNext()) {
            System.out.print(String.valueOf(i.next())+' ');
        }

        System.out.println();


        Iterator<Character> z=operators.iterator();
        while (z.hasNext()) {

            System.out.print(z.next());
        }
        //System.out.println(operators.size());
    }

    private static void getNextOperator(ArrayList<Character> operators) {
        for (Character op:OPERATORS) {
            /*System.out.println("\nCharacter is: "+op);
            //
            for (Character h:operators) {

                System.out.print(String.valueOf(h)+' ');
            }
            //
            //System.out.println("\n----------------------------------------------------------");*/


            A:for (int i = 0; i < operators.size(); i++) {

                if (operators.get(i) =='/') {
                    operators.remove(i);
                    digits.set(i, (digits.get(i) / digits.get(i + 1)));
                    digits.remove(i + 1);
                    i -= 1;
                    continue A;
                }
            }


            /*/
            for (Character h:operators) {

                System.out.print(String.valueOf(h)+' ');
            }
            //
            System.out.println("\n-----------------inLoop:*-------------------");*/
            B:for (int i = 0; i < operators.size(); i++) {

                if (operators.get(i) =='*') {
                    System.out.println("if in for");
                    operators.remove(i);
                    digits.set(i, (digits.get(i) * digits.get(i + 1)));
                    digits.remove(i + 1);
                    i -= 1;
                    continue B;
                }
            }
            /*System.out.println("\n-----------------EndLoop:*-------------------");

            //
            for (Character h:operators) {

                System.out.print(String.valueOf(h)+' ');
            }
            //

            System.out.println("\n-----------------inLoop:+-------------------");*/
            for (int i = 0; i < operators.size(); i++) {

                if (operators.get(i) =='+') {
                    System.out.println("if in for");
                    operators.remove(i);
                    digits.set(i, (digits.get(i) + digits.get(i + 1)));
                    digits.remove(i + 1);
                    i -= 1;
                    continue;
                }
            }/*
            System.out.println("\n-----------------EndLoop:+-------------------");
            //
            for (Character h:operators) {

                System.out.print(String.valueOf(h)+' ');
            }
            //

            System.out.println("\n----------------------------------------------------------");*/
            for (int i = 0; i < operators.size(); i++) {

                if (operators.get(i) =='-') {
                    operators.remove(i);
                    digits.set(i, (digits.get(i) - digits.get(i + 1)));
                    digits.remove(i + 1);
                    i -= 1;
                    continue;
                }
            }



        }

        //getNextOperator(operators);
    }


    public static void getDigits(String math){
        System.out.println("Getting digits ...");

        Pattern r=Pattern.compile(REGEXDIGITS);
        Matcher m=r.matcher(math);
        while (m.find()){/*
            System.out.print("Start: "+m.start()+" ");
            System.out.print("End:"+m.end()+" ");*/

            int t=Integer.parseInt(math.substring(m.start(), m.end()));
            //System.out.println(t);
            digits.add(t);
        }
        System.out.println("\rFinished getting digits...");
    }
    public static void getOperators(String math){
        System.out.println("Getting Operators..");
        Pattern r=Pattern.compile(REGEXOPERATORS);
        Matcher m=r.matcher(math);
        while (m.find()){/*
            System.out.print("Start: "+m.start()+" ");
            System.out.print("End:"+m.end()+" ");
            System.out.println(math.charAt(m.end()));*/
            operators.add(math.charAt(m.start()));
        }
        System.out.println("Finished getting Operators..");

    }


}

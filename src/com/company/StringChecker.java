package com.company;

public class StringChecker {

    public boolean checklength(StringBuilder SourceString,StringBuilder TargetString){
        if(SourceString.length()==TargetString.length()) return true;
        else return false;
    }
    public int countSimilar(StringBuilder SourceString,StringBuilder TargetString){
        int count=0;
        for(int i=0;i<TargetString.length();i++){
            if(SourceString.charAt(i)!=TargetString.charAt(i)) count++;
        }
        return count;
    }
//used when two strings are of unequal length
    public int countDissimilar(StringBuilder SourceString,StringBuilder TargetString){
        int count=0;
        if(SourceString.length()>TargetString.length()){
            int difference=SourceString.length()-TargetString.length();
            for (int i =0;i<(SourceString.length()-difference);i++){
                if(SourceString.charAt(i)!=TargetString.charAt(i)) count++;
            }
            return count+difference;
        }
        else {
            int difference=TargetString.length()-SourceString.length();
            for (int i =0;i<(TargetString.length()-difference);i++){
                if(SourceString.charAt(i)!=TargetString.charAt(i)) count++;
            }
            return count+difference;
        }


    }
        }

package com.mann;

public class Richest {
    public static void main(String[] args) {

    }
    public int MaximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i< accounts.length;i++){
            int rsum=0;
            for(int j=0;j<accounts[i].length;j++){
                rsum+=accounts[i][j];
            }
            if(rsum > ans)
            {
                ans=rsum;
            }
        }
        return ans;
    }
}

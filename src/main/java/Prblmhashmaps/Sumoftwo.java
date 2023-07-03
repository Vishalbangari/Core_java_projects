package Prblmhashmaps;

import java.util.HashMap;

public class Sumoftwo {
        public static void findIndex(int[] list,int target){
            int start=0;
            int end=list.length-1;
            HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
            for(int i=0;i<list.length-1;i++){
                hm.put(list[i],i);
            }
            while(start<end){
                if(list[start]+list[end]==target){
                    System.out.println("Start index :" + hm.get(list[start]) + " End index :" +end );
                    return;
                }
                else if(list[start]+list[end]<target) start++;
                else end--;
            }

        }
        public static void main(String[] args) {
            int[] nums = { 10, 20, 30, 40, 50, 60 };
            int target = 100;
            findIndex(nums,target);
        }
    }

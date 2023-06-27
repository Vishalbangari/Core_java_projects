package Prblmhashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;


public class Hashmaps {
        private String lastName;
        private String firstName;
        private double GPA;
        public static List<Hashmaps> students= new ArrayList<Hashmaps>();



        public Hashmaps(String ln,String fn,double G){
            this.lastName=ln;
            this.firstName=fn;
            this.GPA=G;
        }


        public static void main(String[] args) {
            students.add(new Hashmaps("s", "s1", 4.0));
            students.add(new Hashmaps("hardy", "s2", 3.0));
            students.add(new Hashmaps("cena", "s3", 3.5));
            students.add(new Hashmaps("cena", "s4", 3.5));
            students.add(new Hashmaps("cena", "s5", 3.5));
            students.add(new Hashmaps("cena", "s6", 3.5));
            students.add(new Hashmaps("cena", "s7", 3.5));
            students.add(new Hashmaps("cena", "s8", 3.5));

            HashMap<String,Hashmaps> hm=new HashMap<String,Hashmaps>();
            for (Hashmaps st:students) {
                hm.put(st.firstName,st);
            }
            hm.forEach((key,value)-> System.out.println("Key : "+key+" "+"value :"+value));

            for (Map.Entry<String, Hashmaps> entry : hm.entrySet()) {
                String key = entry.getKey();
                Hashmaps val=entry.getValue();
                System.out.println("Key: " + key + ", Value: " + val.firstName);
            }

            Iterator<String> iterator = hm.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                Hashmaps value = hm.get(key);
                System.out.println("Key: " + key + ", Value: " + value.firstName);
            }
        }
    }
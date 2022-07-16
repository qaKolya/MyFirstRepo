package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void tets1(){
        System.out.println("This is test 1");
    }

    public boolean catDog(String str){
        int count = 0;
        int count1 = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i,i+3).equals("cat")){
                count++;
            }
            if(str.substring(i,i+3).equals("dog")){
                count1++;
            }
        }if(count == count1){
            return true;
        }else{
            return false;
        }
    }
    @Test
    public void testCatDog(){
        String str1 = "catdog";
        boolean expectedValue1 = true;
        String str2 = "catcat";
        boolean expectedValue2 = false;
        String str3 = "1cat1cadodog";
        boolean expectedValue3 = true;

        Assertions.assertEquals(expectedValue1, catDog(str1));
        Assertions.assertEquals(expectedValue2, catDog(str2));
        Assertions.assertEquals(expectedValue3, catDog(str3));
    }
}

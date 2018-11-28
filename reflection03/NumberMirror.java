package reflection03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {


    public List<Integer> mirrorNumber(Integer number){

        List<Integer> numbers = new ArrayList<>();

        separate(number, numbers);


        return numbers;

    }

    private void separate(Integer number, List<Integer> numbers) {
        while (number>0){

            Integer unit = number%10;
            numbers.add(unit);
            number=number/10;
        }
        // tu barname ghabli Math.floor(number) neveshtam ke javab nadad
        // niaz nist chon hasele taghsime Integer bar 10 mishe Integer v decimalo hazf mikone.
        //pas yadet bashe injoor mavaghe ke Integere decimal nadare v floor niaz nist.

        //numbers.add(number);
    }
}
    /*public Integer reverse(Integer number) {

        List<Integer> numbers = new ArrayList<>();
        Collections.reverse(numbers);
        String reversed = "";
        for (Integer nu : numbers) {
            reversed += number;
        }
        return reversed;

    }


    /*
    action​ separate(Number number) ​ returns​ Collection of Number
Collection of Number numbers ​ = ​ []
repeat while​ number ​ > ​ 9
Number unit ​ = ​ number ​ % ​ 10
numbers ​ = ​ numbers.​ add​ (unit)
number ​ = ​ (number ​ / ​ 10).​ roundDown​ ()
numbers ​ = ​ numbers.​ add​ (number)
numbers ​ = ​ reverse(numbers)
return ​ numbers
     */
    /*
    action​ reverse(Collection of Number elements) ​ returns​ Collection of Number
Number size ​ = ​ elements.​ size​ ()
if​ size ​ is​ 0
return ​ []
Collection of Number reversedElements ​ = ​ []
Number position ​ = ​ size ​ - ​ 1
repeat while​ position ​ >=​ 0
Number number ​ = ​ elements.​ get​ (position)
reversedElements ​ = ​ reversedElements.​ add​ (number)
position ​ = ​ position ​ - ​ 1
return ​ reversedElements
     */
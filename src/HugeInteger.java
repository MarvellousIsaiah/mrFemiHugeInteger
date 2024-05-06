import java.math.BigInteger;
import java.util.Arrays;

public class HugeInteger {
    private  int [] elementArray = new int[40];
    public HugeInteger(String elements){
        int [] newElementArray = new int[elements.length()];

        for(int count = 0; count < elements.length(); count++) {
            newElementArray[count] = Integer.parseInt(String.valueOf(elements.charAt(count)));

        }
        this.elementArray = newElementArray;



    }
    public HugeInteger(){
    }

    public int[] getElementArray(){
        return elementArray;
    }
    public int[] parse(String numbers) {
        int[] digits = new int [numbers.length()];
        for(int count = 0; count < numbers.length(); count++){
            digits[count] = Integer.parseInt(String.valueOf(numbers.charAt(count)));
        }
        return digits;
    }
    public String toString(){
        return Arrays.toString(this.elementArray);
    }


    public BigInteger add(HugeInteger hugeInteger) {
             StringBuilder stringBuilder= new StringBuilder();
             StringBuilder stringBuilder2= new StringBuilder();
                    for(int index = 0; index < this.elementArray.length; index++){
                        stringBuilder.append(this.elementArray[index]);
                    }
                    BigInteger firstHugeInteger = new BigInteger(stringBuilder+"");
                  for(int index = 0; index < hugeInteger.getElementArray().length; index++){
                      stringBuilder2.append(hugeInteger.elementArray[index]);
                  }
                   BigInteger secondHugeInteger = new BigInteger(stringBuilder2+"");
                  return firstHugeInteger.add(secondHugeInteger);
    }

    public BigInteger subtract(HugeInteger hugeInteger) {
        StringBuilder stringBuilder= new StringBuilder();
        StringBuilder stringBuilder2= new StringBuilder();
        for(int index = 0; index < this.elementArray.length; index++){
            stringBuilder.append(this.elementArray[index]);
        }
        BigInteger firstHugeInteger = new BigInteger(stringBuilder+"");
        for(int index = 0; index < hugeInteger.getElementArray().length; index++){
            stringBuilder2.append(hugeInteger.elementArray[index]);
        }
        BigInteger secondHugeInteger = new BigInteger(stringBuilder2+"");
        return firstHugeInteger.subtract(secondHugeInteger);

    }
}

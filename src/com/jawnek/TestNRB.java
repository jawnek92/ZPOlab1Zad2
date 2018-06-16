package com.jawnek;

import java.math.BigInteger;

public class TestNRB {
    private StringBuffer stringBuffer;

    public TestNRB(StringBuffer stringBuffer) {
        this.stringBuffer = new StringBuffer(stringBuffer);
    }

    private boolean testNr(StringBuffer buffer){
        buffer.append("2521");
        int count =0;
        BigInteger modulo = new BigInteger("97");
        for(int i=0; i<2; i++)
            buffer.append(buffer.charAt(i));

        while(count < 2){
            buffer.deleteCharAt(0);
            count++;
        }
        BigInteger bigInteger = new BigInteger(buffer.toString());
        BigInteger wynik = bigInteger.mod(modulo);

        if(wynik.equals(BigInteger.valueOf(1)))
            return true;
        else
            return false;

    }

    public void runTest(){
        boolean wynik = testNr(this.stringBuffer);
        if(wynik == true){
            System.out.println("Wynik pozytywny, numer NRB jest poprawny.");
        }else
            System.out.println("Rachunek nie jest poprawny.");
    }
}

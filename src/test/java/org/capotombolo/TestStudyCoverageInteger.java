package org.capotombolo;


import com.alibaba.fastjson.util.TypeUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestStudyCoverageInteger {

    private Object objectExpectedCastToBigInteger;
    private Object objectInputCastToBigInteger;

    public TestStudyCoverageInteger(Object param1, boolean param2){
        this.configureBigIntegerSame(param1, param2);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
                {null, true},
                {1L, false},
                {Double.valueOf("2"), false},
                {new BigInteger("32"), true},
                {"1234", true}
        });
    }

    private void configureBigIntegerSame(Object input, boolean bool) {
        this.objectExpectedCastToBigInteger = bool;
        this.objectInputCastToBigInteger = input;
    }

    @Test
    public void test_cast_to_BigInteger_same(){
        if(this.objectInputCastToBigInteger == null || (this.objectInputCastToBigInteger.getClass()!=String.class))
            Assert.assertEquals(this.objectExpectedCastToBigInteger, this.objectInputCastToBigInteger == TypeUtils.castToBigInteger(this.objectInputCastToBigInteger));
        else
            Assert.assertEquals(this.objectExpectedCastToBigInteger, new BigInteger((String) this.objectInputCastToBigInteger).equals(TypeUtils.castToBigInteger(this.objectInputCastToBigInteger)));
    }




}
package org.capotombolo;

import com.alibaba.fastjson.util.TypeUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

@RunWith(Parameterized.class)
public class TestStudyCoverageDecimal {

    private Object input;
    private Object expected;

    public TestStudyCoverageDecimal(Object param1, Object param2){
        this.configureBigDecimal(param1, (Boolean) param2);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
                {null, true},
                {1L, false},
                {Double.valueOf("2"), false},
                {new BigDecimal("4"), true},
                {new HashMap<>(), false},
                {"1234", true}
        });
    }

    public void configureBigDecimal(Object input, Boolean bool){
        this.input = input;
        this.expected = bool;
    }

    @Test
    public void test_cast_to_BigDecimal(){
        if(this.input == null || (this.input.getClass()!=String.class))
            Assert.assertEquals(this.expected, this.input == TypeUtils.castToBigDecimal(this.input));
        else
            Assert.assertEquals(this.expected, new BigDecimal((String) this.input).equals(TypeUtils.castToBigDecimal(this.input)));
    }
}
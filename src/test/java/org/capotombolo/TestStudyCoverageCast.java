package org.capotombolo;

import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestStudyCoverageCast {

    private JSONObject jsonObjectTestPutID;
    private Object objectInput1TestPutID;
    private Object objectInput2TestPutID;
    private Object objectExpectedTestPutID;

    public TestStudyCoverageCast(String idKey, Object idValue, Class<?> classObject, Object objectExpectedTestPutID){
        this.configureTestPutID(idKey, idValue, classObject, objectExpectedTestPutID);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
                {"key", null, int.class, Integer.valueOf(0)},
                {"key", null, long.class, Long.valueOf(0)},
                {"key", null, short.class, Short.valueOf((short) 0)},
                {"key", null, byte.class, Byte.valueOf((byte) 0)},
                {"key", null, float.class, Float.valueOf(0)},
                {"key", null, double.class, Double.valueOf(0)},
                {"key", null, boolean.class, Boolean.FALSE},
                {"key", null, boolean.class, Boolean.FALSE}
        });
    }

    private void configureTestPutID(String idKey, Object idValue, Class<?> classObject, Object objectExpectedTestPutID) {
        this.jsonObjectTestPutID = new JSONObject();
        this.objectInput1TestPutID = idKey;
        this.objectInput2TestPutID = classObject;
        this.jsonObjectTestPutID.put(idKey, idValue);
        this.objectExpectedTestPutID = objectExpectedTestPutID;
    }

    @Test
    public void test_put_ID(){
        Assert.assertEquals(this.objectExpectedTestPutID, this.jsonObjectTestPutID.getObject((String) this.objectInput1TestPutID, (Class<?>) this.objectInput2TestPutID));
    }
}

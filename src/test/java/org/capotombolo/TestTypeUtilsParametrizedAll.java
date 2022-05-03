package org.capotombolo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.capotombolo.TestTypeUtilsParametrizedAll.Testing.*;

@RunWith(Parameterized.class)
public class TestTypeUtilsParametrizedAll extends TestCase {

    private final Testing testType;
    private final Object inputValue1;
    private final Object inputValue2;
    private final Object expectedValue1;
    private final Object expectedValue2;
    private JSONObject json;

    @Parameterized.Parameters
    public static Collection<Object[]> setParameters(){
        HashMap hashMap = new HashMap();
        JSONObject jsonObject = new JSONObject();

        return Arrays.asList(new Object[][]{
                {TEST_0, hashMap, Map.class, hashMap, null},
                {TEST_1, jsonObject, Map.class, jsonObject, null},
                {TEST_CAST_TO, "id", long.class, 1L,null}
        });
    }

    public TestTypeUtilsParametrizedAll(Testing testType, Object inputValue1, Object inputValue2, Object expectedValue1, Object expectedValue2){

        this.testType = testType;
        this.inputValue1 = inputValue1;
        this.inputValue2 = inputValue2;
        this.expectedValue1 = expectedValue1;
        this.expectedValue2 = expectedValue2;

        switch (testType){
            case TEST_CAST_TO:
                configureCastTo("id", 1);
        }
    }

    public void configureCastTo(String key, Object value){
        this.json = new JSONObject();
        this.json.put(key, value);
    }


    @Test
    public void test_cast_to()  {
        Assume.assumeTrue(this.testType == TEST_CAST_TO);
        Assert.assertEquals(this.expectedValue1, this.json.getObject((String) this.inputValue1, (Class<?>) this.inputValue2));
    }



    @Test
    public void test_0_1() throws Exception {
        Assume.assumeTrue(this.testType == TEST_0 || this.testType == TEST_1);
        Assert.assertTrue(this.expectedValue1 == TypeUtils.castToJavaBean(this.inputValue1, (Class<?>) this.inputValue2));
    }


    enum Testing {
        TEST_0,
        TEST_1,
        TEST_CAST_TO
    }


    public static class User {

        private long id;
        private String name;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

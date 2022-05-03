package org.capotombolo;

import com.alibaba.fastjson.util.TypeUtils;
import junit.framework.TestCase;
import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;

import static org.capotombolo.TestTypeUtilsParameterized.Testing.*;

@RunWith(Parameterized.class)
public class TestTypeUtilsParameterized extends TestCase{
    //private final Testing testType;
    private  Object inputValue2Test_01;
    private Class<?> classType;
    private  Object inputValue1Test_01;
    private  Object expectedValue1Test01;
    private Object inputValue2;
    private Object inputValue1;
    private  Object expectedValue2;
    private JSONObject jsonObject;

    @Parameterized.Parameters
    public static Collection<Object[]> setParameters(){
        HashMap hashMap = new HashMap();
        JSONObject jsonObject = new JSONObject();
        return Arrays.asList(new Object[][]{
                {hashMap, Map.class, hashMap},
                //{TEST_1, jsonObject, JSONObject.class, jsonObject, null, null, null},
                //{TEST_2, null, null, null, "id", long.class, 1}
                });
    }

    public TestTypeUtilsParameterized(Object inputValue1Test_01, Object inputValue2Test_01,
                                      Object expectedValue1Test01, Object inputValue1,
                                      Object inputValue2, Object expectedValue2){
        //this.testType = testType1;
        this.inputValue1Test_01 = inputValue1Test_01;
        this.inputValue2Test_01 = inputValue2Test_01;
        this.expectedValue1Test01 = expectedValue1Test01;
        this.inputValue1 = inputValue1;
        this.inputValue2 = inputValue2;
        this.expectedValue2 = expectedValue2;


        //switch (testType){
        //    case TEST_2:
                configure((Class<?>) this.inputValue2);
        //}
    }


    private void configureTest2(String key1, String key2, Long value1, String value2, Class<User> userClass) {
      //TO TODO
    }

    public void configure(Class<?> classType){
        this.jsonObject = new JSONObject();
        this.jsonObject.put("id", 1L);
        this.classType = classType;
    }

    @Test
    public void test_cast_to_x()  {
        //Assume.assumeTrue(this.testType == TEST_2);
        Assert.assertEquals(this.expectedValue2, this.jsonObject.getObject((String) this.inputValue1, (Class<?>) this.inputValue2));
    }



    @Test
    public void test_0_1() throws Exception {
        //Assume.assumeTrue(this.testType == TEST_0 || this.testType == TEST_1);
        Assert.assertTrue(this.expectedValue1Test01 == TypeUtils.castToJavaBean(this.inputValue1Test_01, (Class<?>) this.inputValue2Test_01));
    }



    enum Testing {
        TEST_0,
        TEST_1,
        TEST_2
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

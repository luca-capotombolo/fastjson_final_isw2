package org.capotombolo;

import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.*;

@RunWith(Parameterized.class)
public class TestTypeUtilsParameterized extends TestCase{

    private final HashMap map;
    //private final Class<?> aClass;

    @Parameterized.Parameters
    public static Collection<Object[]> setParameters(){
        return Arrays.asList(new Object[][]{
                });
    }

    public TestTypeUtilsParameterized(HashMap map){
        this.map = map;
    }

    public void test_0() throws Exception {


    }

}

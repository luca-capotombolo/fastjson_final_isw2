package org.capotombolo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * package com.alibaba.json.bvt.parser;
 *
 * import org.junit.Assert;
 *
 * import com.alibaba.fastjson.JSON;
 * import com.alibaba.fastjson.parser.Feature;
 *
 * import junit.framework.TestCase;
 *
 * public class OrderedFieldTest extends TestCase {
 *     public void test_ordered_field() throws Exception {
 *         String text = "{\"id\":1001}";
 *         Model model = JSON.parseObject(text, Model.class, Feature.OrderedField);
 *         Assert.assertEquals(1001, model.getId());
 *         String text2 = JSON.toJSONString(model);
 *         Assert.assertEquals(text, text2);
 *
 *     }
 *
 *     public static interface Model {
 *         public int getId();
 *         public void setId(int value);
 *     }
 * }
 */
// comment

@RunWith(Parameterized.class)
public class TestOrderedFiledParameterized {
    private final String inputText;
    private final Class<Model> inputClass;
    private final Feature inputFeature;
    private final int expectedValue1;
    private final String expectedValue2;


    @Parameterized.Parameters
    public static Collection<Object[]> setParameters(){
        return Arrays.asList(new Object[][]{
                {"{\"id\":1001,}", Model.class, Feature.OrderedField, 1001, "{\"id\":1001}"},       //actual = expected
                {"{\"id\":1004}", Model.class, Feature.OrderedField, 1004, "{\"id\":1004}"},        //actual = expected
                //{"{\"id\":1004}", Model.class, Feature.OrderedField, 1004, "{\"id\":1011}"},        //actual != expected
                //{"{\"id\":1001,}", Model.class, Feature.OrderedField, 1, "{\"id\":1001}"},          //actual != expected
        });
    }

    public TestOrderedFiledParameterized(String inputText, Class<Model> inputClass, Feature inputFeature, int expectedValue, String expectedValue2)    {
        this.inputText = inputText;
        this.inputFeature = inputFeature;
        this.inputClass = inputClass;
        this.expectedValue1 = expectedValue;
        this.expectedValue2 = expectedValue2;
    }

    @Test
    public void test_ordered_field()  {
        Model model = JSON.parseObject(this.inputText, this.inputClass, this.inputFeature);
        System.out.println(JSON.toJSONString(model));
        Assert.assertEquals(this.expectedValue1, model.getId());
        String text = JSON.toJSONString(model);
        Assert.assertEquals(this.expectedValue2, text);
    }

    public static interface Model {
        public int getId();
        public void setId(int value);
    }

}

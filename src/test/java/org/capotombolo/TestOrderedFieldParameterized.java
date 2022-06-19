package org.capotombolo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import org.junit.Assert;
import org.junit.Test;

public class TestOrderedFieldParameterized {
    private String text;
    private Class<Model> modelClass;
    private Feature feature;
    private int expectedValue;


    public TestOrderedFieldParameterized()    {
        configure("{\"id\":1001}", Model.class, Feature.OrderedField, 1001);
    }

    private void configure(String inputText, Class<Model> inputClass, Feature inputFeature, int expectedValue) {
        this.text = inputText;
        this.modelClass = inputClass;
        this.feature = inputFeature;
        this.expectedValue = expectedValue;
    }

    @Test
    public void test_ordered_field()  {
        Model model = JSON.parseObject(this.text, this.modelClass, this.feature);
        Assert.assertEquals(this.expectedValue, model.getId());
        String text = JSON.toJSONString(model);
        Assert.assertEquals(this.text, text);
    }

    public static interface Model {
        public int getId();
        public void setId(int value);
    }

}

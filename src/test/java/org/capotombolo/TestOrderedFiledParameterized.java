package org.capotombolo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

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
        Assert.assertEquals(this.expectedValue1, model.getId());
        String text = JSON.toJSONString(model);
        Assert.assertEquals(this.expectedValue2, text);
    }

    public static interface Model {
        public int getId();
        public void setId(int value);
    }

}

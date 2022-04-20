package org.example;

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
    private String inputText;
    private int inputID;

    public TestOrderedFiledParameterized(String inputText, int inputID)    {
        this.inputID = inputID;
        this.inputText = inputText;
    }

    @Parameterized.Parameters
    public static Collection setParameters(){
        return Arrays.asList(new Object[][]{
                {"{\"id\":1001}", 1001}
        });
    }

    @Test
    public void test_ordered_field()  {
        Model model = JSON.parseObject(this.inputText, Model.class, Feature.OrderedField);
        System.out.println(JSON.toJSONString(model));
        Assert.assertEquals(this.inputID, model.getId());
    }

    public static interface Model {
        public int getId();
        public void setId(int value);
    }

}

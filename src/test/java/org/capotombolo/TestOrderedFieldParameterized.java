package org.capotombolo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Assert;
import org.junit.Test;



public class TestOrderedFieldParameterized {
    private String inputText;
    private Class<Model> inputClass;
    private Feature inputFeature;
    private int expectedValue;

    //NON FUNZIONAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA


    public TestOrderedFieldParameterized()    {
        configure("{\"id\":1001}", Model.class, Feature.OrderedField, 1001);
    }

    private Model parseObjectOracle(String jsonString, Class<Model> modelClass){
        Model model;

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        model = gson.fromJson(jsonString, modelClass);

        return model;
    }

    private void configure(String inputText, Class<Model> inputClass, Feature inputFeature, int expectedValue) {
        this.inputText = inputText;
        this.inputClass = inputClass;
        this.inputFeature = inputFeature;
        this.expectedValue = expectedValue;
    }

    @Test
    public void test_ordered_field()  {
        Model model = JSON.parseObject(this.inputText, this.inputClass, this.inputFeature);
        Assert.assertEquals(this.expectedValue, model.getId());
        String text = JSON.toJSONString(model);
        Assert.assertEquals(this.inputText, text);
    }

    @Test
    public void test_ordered_field_assert_gson()  {
        Model model = JSON.parseObject(this.inputText, this.inputClass, this.inputFeature);
        Model modelGson = parseObjectOracle(this.inputText, this.inputClass);
        Assert.assertEquals(modelGson.getId(), model.getId());
        String text = JSON.toJSONString(model);
        Assert.assertEquals(this.inputText, text);
    }

    public static interface Model {
        public int getId();
        public void setId(int value);
    }

}

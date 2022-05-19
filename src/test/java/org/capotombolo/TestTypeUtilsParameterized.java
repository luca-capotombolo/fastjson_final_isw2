package org.capotombolo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Map;

public class TestTypeUtilsParameterized {

    //{28, 34}
    private  Object objectInput1Test_0_1;
    private Object objectInput2Test_0_1;
    private Object objectExpectedTest_0_1;
    //{39}
    private User objectInputTest2;
    private long objectExpected1Test2;
    private String objectExpected2Test2;
    private JSONObject jsonObjectTestPutID;
    private Object objectInput1TestPutID;
    private Object objectInput2TestPutID;
    private Object objectExpectedTestPutID;
    private Object objectInputSqlDate183;
    private Object objectExpectedSqlDate183;
    private final long millis;




    public TestTypeUtilsParameterized(){
        millis = System.currentTimeMillis();
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_0(), test_1()
        //configureTest_0_1(new HashMap<>(), Map.class);
        configureTest_0_1(new JSONObject(), Map.class);
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_2()
        configureTest2Gson(new JSONObject(), "id", 1, "name", "panlei", User.class);
        //------------------------------------------------------------------------------------------------------------------------------------
        /*test_cast_Integer(), test_cast_Integer_2(), test_cast_to_long(), test_cast_to_Long(), test_cast_to_short()
        test_cast_to_Short(), test_cast_to_byte(), test_cast_to_Byte(), test_cast_to_BigInteger(), test_cast_to_BigDecimal()
        test_cast_to_boolean(), test_cast_to_Boolean(), test_cast_to_String(), test_cast_null(), test_cast_to_Timestamp()
        test_cast_to_Timestamp_string, test_cast_to_Timestamp_number(), void test_cast_to_Timestamp_null(), test_cast_to_Timestamp_util_Date()
        test_cast_to_Timestamp_sql_Date(), */
        //configureTestPutID(new JSONObject(), "id", 1,int.class, new Integer(1));
        //configureTestPut1ID(new JSONObject(), "id", 1,Integer.class, new Integer(1));
        //configureTestPut1ID(new JSONObject(), "id", 1,long.class, 1L);
        //configureTestPut1ID(new JSONObject(), "id", 1,Long.class, 1L);
        //configureTestPut1ID(new JSONObject(), "id", 1,short.class, new Short((short) 1));
        //configureTestPut1ID(new JSONObject(), "id", 1,Short.class, new Short((short) 1));
        //configureTestPut1ID(new JSONObject(), "id", 1,byte.class, new Byte((byte) 1));
        //configureTestPut1ID(new JSONObject(), "id", 1,Byte.class, new Byte((byte) 1));
        //configureTestPut1ID(new JSONObject(), "id", 1,BigInteger.class, new BigInteger( "1"));
        //configureTestPut1ID(new JSONObject(), "id", 1,BigDecimal.class, new BigDecimal( "1"));
        //configureTestPut1ID(new JSONObject(), "id", 1,boolean.class, Boolean.TRUE);
        //configureTestPut1ID(new JSONObject(), "id", 1,Boolean.class, Boolean.TRUE);
        //configureTestPut1ID(new JSONObject(), "id", 1,String.class, "1");
        //configureTestPut1ID(new JSONObject(), "id", null, Boolean.class, null);
        //configureTestPutID(new JSONObject(), "date", millis, Date.class, new Date(millis));
        //configureTestPutID(new JSONObject(), "date", millis, java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID(new JSONObject(), "date", Long.toString(millis), java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID(new JSONObject(), "date", null, java.sql.Date.class, null);
        //configureTestPutID(new JSONObject(), "date", new Date(millis), java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID(new JSONObject(), "date", new java.sql.Date(millis), java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID(new JSONObject(), "date", millis, java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //configureTestPutID(new JSONObject(), "date", Long.toString(millis), java.sql.Timestamp.class, new java.sql.Timestamp(millis) );
        //configureTestPutID(new JSONObject(), "date",new BigDecimal(Long.toString(millis)), java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //configureTestPutID(new JSONObject(), "date", null, java.sql.Timestamp.class, null);
        //configureTestPutID(new JSONObject(), "date", new Date((millis)), java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //configureTestPutID(new JSONObject(), "date",new java.sql.Date(millis), java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_SqlDate_sql_Date2()
        configureToSqlDate183(millis);
        //------------------------------------------------------------------------------------------------------------------------------------
        //It runs test_put_ID() ATTENZIONE!! TOGLI TUTTI I configureTestPutID
        //196 test_cast_to_SqlDate_calendar(), test_cast_to_Timestamp_calendar()
        //configureToSqlDateCalendar(new JSONObject(), "date", Calendar.getInstance(), java.sql.Date.class, new java.sql.Date(millis));
        configureToSqlDateCalendar(new JSONObject(), "date", Calendar.getInstance(), java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //------------------------------------------------------------------------------------------------------------------------------------
        //{244, ... photo}

        //------------------------------------------------------------------------------------------------------------------------------------
    }

    private void configureToSqlDateCalendar(JSONObject jsonObject, String idKey, Calendar calendar, Class<?> classObject, Object objectExpectedTestPutID) {
        calendar.setTimeInMillis(millis);
        jsonObject.put(idKey, calendar);
        this.jsonObjectTestPutID = jsonObject;
        this.objectInput1TestPutID = idKey;
        this.objectInput2TestPutID = classObject;
        this.objectExpectedTestPutID = objectExpectedTestPutID;

    }

    private void configureToSqlDate183(Long millis){
        java.sql.Date date = new java.sql.Date(millis);
        this.objectInputSqlDate183 = date;
        this.objectExpectedSqlDate183 = date;
    }

    @Test
    public void test_cast_to_SqlDate_sql_Date2_183(){
        Assert.assertEquals(this.objectExpectedSqlDate183, TypeUtils.castToSqlDate(this.objectInputSqlDate183));
    }

    private void configureTestPutID(JSONObject jsonObject, String idKey, Object idValue, Class<?> classObject, Object objectExpectedTestPutID) {
        this.objectInput1TestPutID = idKey;
        this.objectInput2TestPutID = classObject;
        jsonObject.put(idKey, idValue);
        this.jsonObjectTestPutID = jsonObject;
        this.objectExpectedTestPutID = objectExpectedTestPutID;
    }

    @Test
    public void test_put_ID(){
        Assert.assertEquals(this.objectExpectedTestPutID, this.jsonObjectTestPutID.getObject((String) this.objectInput1TestPutID, (Class<?>) this.objectInput2TestPutID));
    }

    private void configureTest2Gson(JSONObject jsonObject, String idKey, int idValue, String nameKey, String nameValue, Class<User> userClass) {
        jsonObject.put(idKey, idValue);
        jsonObject.put(nameKey, nameValue);
        this.objectInputTest2 = TypeUtils.castToJavaBean(jsonObject, userClass);
        Gson gson = new Gson();
        User user = gson.fromJson("{'id':" + idValue  + ",'name':"+nameValue+"}", User.class);
        this.objectExpected1Test2 = user.id;
        this.objectExpected2Test2 = user.name;
    }

    @Test
    public void test_2Gson(){
        Assert.assertEquals(this.objectExpected1Test2, this.objectInputTest2.getId());
        Assert.assertEquals(this.objectExpected2Test2, this.objectInputTest2.getName());
    }

    private void configureTest_0_1(Object object, Class<?> objectClass){
        this.objectInput1Test_0_1 = object;
        this.objectInput2Test_0_1 = objectClass;
        this.objectExpectedTest_0_1 = object;
    }

    @Test
    public void test_0_1() throws Exception {
        Assert.assertTrue(this.objectExpectedTest_0_1 == TypeUtils.castToJavaBean(this.objectInput1Test_0_1, (Class<?>) this.objectInput2Test_0_1));
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

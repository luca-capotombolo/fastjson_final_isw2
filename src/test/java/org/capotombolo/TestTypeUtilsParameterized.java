package org.capotombolo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.*;

public class TestTypeUtilsParameterized {

    private  Object objectInput1Test_0_1;
    private Object objectInput2Test_0_1;
    private Object objectExpectedTest_0_1;

    private JSONObject objectInput1Test2;
    private Class<User> objectInput2Test2;
    private String objectInput3Test2;
    private String objectInput4Test2;
    private int objectInput5Test2;
    private String objectInput6Test2;

    private long objectExpected1Test2;
    private String objectExpected2Test2;

    private JSONObject jsonObjectTestPutID;
    private Object objectInput1TestPutID;
    private Object objectInput2TestPutID;
    private Object objectExpectedTestPutID;

    private Object objectInputSqlDate183;
    private Object objectExpectedSqlDate183;
    private final long millis;

    private JSONObject jsonObjectABError_cast_to_SqlDate_error;
    private Object objectInput1TestABError_cast_to_SqlDate_error;
    private Object objectInput2TestABError_cast_to_SqlDate_error;

    private JSONObject jsonObjectError;
    private ParserConfig objectInput1TestError;
    private Class<C> objectInput2TestError;

    private JSONObject jsonObjectError2;
    private Type objectInput1TestError2;
    private Object objectInput2TestError2;

    private JSONObject object1InputTest3;
    private Class<User> object2InputTest3;
    private String object3InputTest3;
    private Object object4InputTest3;
    private String object5InputTest3;
    private Object object6InputTest3;
    private Object objectExpected1Test3;
    private Object objectExpected2Test3;

    private Object objectExpectedCastToSqlDate;
    private Object objectInputCastToSqlDate;

    private Object objectInputCastToTimestamp;
    private Object objectExpectedCastToTimestamp;

    private Object objectExpectedCastToBigDecimal;
    private Object objectInputCastToBigDecimal;

    private Object objectExpectedCastToBigInteger;
    private Object objectInputCastToBigInteger;

    private JSONObject jsonObjectTimestampNotError;
    private String objectInput11TimestampNotError;
    private Class<?> objectInput12TimestampNotError;
    private String objectInput21TimestampNotError;
    private Class<?> objectInput22TimestampNotError;
    private Object objectExpectedTimestampNotError;



    public TestTypeUtilsParameterized() throws NoSuchMethodException {
        B b;
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
        test_cast_to_boolean(), test_cast_to_Boolean() test_cast_to_String(), test_cast_null(), test_cast_to_Date(), test_cast_to_SqlDate(),
        test_cast_to_SqlDate_string(), test_cast_to_SqlDate_null(), test_cast_to_SqlDate_util_Date(), test_cast_to_SqlDate_sql_Date,
        test_cast_to_Timestamp(), test_cast_to_Timestamp_string, test_cast_to_Timestamp_number(), test_cast_to_Timestamp_null(), test_cast_to_Timestamp_util_Date()
        test_cast_to_Timestamp_sql_Date(), test_cast_ab(), test_cast_ab_1()*/

        //configureTestPutID("id", 1,int.class, new Integer(1));
        //configureTestPutID("id", 1,Integer.class, new Integer(1));
        //configureTestPutID("id", 1,long.class, 1L);
        //configureTestPutID("id", 1,Long.class, 1L);
        //configureTestPutID("id", 1,short.class, new Short((short) 1));
        //configureTestPutID("id", 1,Short.class, new Short((short) 1));
        //configureTestPutID( "id", 1,byte.class, new Byte((byte) 1));
        //configureTestPutID( "id", 1,Byte.class, new Byte((byte) 1));
        //configureTestPutID("id", 1,BigInteger.class, new BigInteger( "1"));
        //configureTestPutID("id", 1,BigDecimal.class, new BigDecimal( "1"));
        //configureTestPutID("id", 1,boolean.class, Boolean.TRUE);
        //configureTestPutID("id", 1,Boolean.class, Boolean.TRUE);
        //configureTestPutID("id", 1,String.class, "1");
        //configureTestPutID("id", null, Boolean.class, null);
        //configureTestPutID( "date", millis, Date.class, new Date(millis));
        //configureTestPutID("date", millis, java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID("date", Long.toString(millis), java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID("date", null, java.sql.Date.class, null);
        //configureTestPutID("date", new java.sql.Date(millis), java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID("date", new Date(millis), java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID("date", new java.sql.Date(millis), java.sql.Date.class, new java.sql.Date(millis));
        //configureTestPutID("date", millis, java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //configureTestPutID("date", Long.toString(millis), java.sql.Timestamp.class, new java.sql.Timestamp(millis) );
        //configureTestPutID( "date",new BigDecimal(Long.toString(millis)), java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //configureTestPutID("date", null, java.sql.Timestamp.class, null);
        //configureTestPutID("date", new Date((millis)), java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //configureTestPutID("date", new java.sql.Date(millis),java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //test_cast_ab()
        //configureTestPutID("value", b = new B(), A.class,b);
        //test_cast_ab_1()
        configureTestPutID("value", b = new B(), IA.class, b);
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_SqlDate_sql_Date2()
        configureToSqlDate183();
        //------------------------------------------------------------------------------------------------------------------------------------
        //It runs test_put_ID() ATTENZIONE!! TOGLI TUTTI I configureTestPutID
        //test_cast_to_SqlDate_calendar(), test_cast_to_Timestamp_calendar()
        //configureToSqlDateCalendar("date", java.sql.Date.class, new java.sql.Date(millis));
        //configureToSqlDateCalendar("date", java.sql.Timestamp.class, new java.sql.Timestamp(millis));
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_SqlDate_null2()
        configureToSqlDateNull2(null, null);
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_Timestamp_null2()
        //it runs with configureCastToTimestampSqlTimestamp() and configureCastToTimestampSqlTimestamp()
        //configureToTimestampNull2(null, null);
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_ab_error(), test_cast_to_SqlDate_error()
        configureABError_cast_to_SqlDate_error("value", new A(), B.class);
        //configureABError_cast_to_SqlDate_error("date", 0, java.sql.Date.class);
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_error()
        configureError(new JSONObject(), "id", 1, C.class, ParserConfig.getGlobalInstance());
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_error_2()
        configureError2(new JSONObject(), "id", 1, "f", List.class, ParserConfig.getGlobalInstance());
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_3()
        configureTest3(new JSONObject(), "id", 1, "name", "panlei", User.class);
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_Timestamp_1970_01_01_00_00_00()
        //it runs with configureCastToTimestampSqlTimestamp() and configureToTimestampNull2
        //configureTimestamp1970("Asia/Shanghai", "1970-01-01 08:00:00", new Timestamp(0));
        //------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_BigDecimal_same()
        configureBigDecimalSame("123", true);
        // ------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_BigDecimal_same()
        configureBigIntegerSame("123", true);
        // ------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_Timestamp_sql_Timestamp()
        configureCastToTimestampSqlTimestamp();
        // ------------------------------------------------------------------------------------------------------------------------------------
        //test_cast_to_Timestamp_not_error()
        configureTimestampNotError("date", -1, java.sql.Timestamp.class, new Timestamp(-1L));
        //-------------------------------------------------------------------------------------------------------------------------------------
    }

    private void configureTimestampNotError(String idKey, Object idValue, Class<?> classObject, Object objectExpectedTimestampNotError) {
        this.jsonObjectTimestampNotError = new JSONObject();
        this.jsonObjectTimestampNotError.put(idKey, idValue);
        this.objectInput11TimestampNotError = idKey;
        this.objectInput12TimestampNotError = classObject;
        this.objectInput21TimestampNotError = idKey;
        this.objectInput22TimestampNotError = classObject;
        this.objectExpectedTimestampNotError = objectExpectedTimestampNotError;
    }

    @Test
    public void test_cast_to_Timestamp_not_error(){
        JSONException error = null;
        try{
            this.jsonObjectTimestampNotError.getObject(this.objectInput11TimestampNotError, objectInput12TimestampNotError);
        }catch (JSONException e){
            error = e;
        }
        Assert.assertNull(error);
        Assert.assertEquals(this.objectExpectedTimestampNotError, this.jsonObjectTimestampNotError.getObject(this.objectInput21TimestampNotError, this.objectInput22TimestampNotError));
    }

    private void configureBigIntegerSame(String inputString, boolean bool) {
        this.objectExpectedCastToBigInteger = bool;
        this.objectInputCastToBigInteger = new BigInteger(inputString);
    }

    @Test
    public void test_cast_to_BigInteger_same(){
        Assert.assertEquals(this.objectExpectedCastToBigInteger, this.objectInputCastToBigInteger == TypeUtils.castToBigInteger(this.objectInputCastToBigInteger));
    }

    public void configureBigDecimalSame(String inputString, Boolean bool){
        this.objectInputCastToBigDecimal = new BigDecimal(inputString);
        this.objectExpectedCastToBigDecimal = bool;
    }

    @Test
    public void test_cast_to_BigDecimal_same(){
        Assert.assertEquals(this.objectExpectedCastToBigDecimal, this.objectInputCastToBigDecimal == TypeUtils.castToBigDecimal(this.objectInputCastToBigDecimal));
    }

    private void configureTimestamp1970(String timeZone, String objectInputCastToTimestamp_1970, Timestamp objectExpectedCastToTimestamp_1970){
        JSON.defaultTimeZone = TimeZone.getTimeZone(timeZone);
        this.objectInputCastToTimestamp = objectInputCastToTimestamp_1970;
        this.objectExpectedCastToTimestamp = objectExpectedCastToTimestamp_1970;
    }

    private void configureCastToTimestampSqlTimestamp() {
        java.sql.Timestamp date = new java.sql.Timestamp(millis);
        this.objectInputCastToTimestamp = date;
        this.objectExpectedCastToTimestamp = date;
    }

    private void configureToTimestampNull2(Object objectExpectedCastToTimestampNull2, Object objectInputCastToTimestampNull2) {
        this.objectExpectedCastToTimestamp = objectExpectedCastToTimestampNull2;
        this.objectInputCastToTimestamp = objectInputCastToTimestampNull2;
    }

    @Test
    public void test_cast_to_Timestamp(){
        Assert.assertEquals(this.objectExpectedCastToTimestamp, TypeUtils.castToTimestamp(this.objectInputCastToTimestamp));
    }

    private void configureToSqlDateNull2(Object objectExpectedCastToSqlDate, Object objectInputCastToSqlDate) {
        this.objectExpectedCastToSqlDate = objectExpectedCastToSqlDate;
        this.objectInputCastToSqlDate = objectInputCastToSqlDate;
    }

    @Test
    public void testCastToSqlDate(){
        Assert.assertEquals(this.objectExpectedCastToSqlDate, TypeUtils.castToSqlDate(this.objectInputCastToSqlDate));
    }


    private void configureTest3(JSONObject jsonObject, String idKey, Object idValue, String nameKey, Object nameValue, Class<User> classObject){
        jsonObject.put(idKey, idValue);
        jsonObject.put(nameKey, nameValue);
        this.object1InputTest3 = jsonObject;
        this.object2InputTest3 = classObject;
        this.object3InputTest3 = idKey;
        this.object4InputTest3 = idValue;
        this.object5InputTest3 = nameKey;
        this.object6InputTest3 = nameValue;
    }

    @Test
    public void test_3(){
        Gson gson = new Gson();
        User userGson = gson.fromJson("{'"+this.object3InputTest3+"':" + this.object4InputTest3  + ",'"+this.object5InputTest3+"':"+this.object6InputTest3+"}", this.object2InputTest3);
        this.objectExpected1Test3 = userGson.id;
        this.objectExpected2Test3 = userGson.name;
        User user = JSON.toJavaObject(this.object1InputTest3, this.object2InputTest3);
        Assert.assertEquals(this.objectExpected1Test3, user.getId());
        Assert.assertEquals(this.objectExpected2Test3, user.getName());
    }

    private void configureError2(JSONObject jsonObject, String idKey, Object idValue, String input, Class<List> classObject, ParserConfig parserConfig) throws NoSuchMethodException {
        jsonObject.put(idKey, idValue);
        Method method = TestTypeUtilsParameterized.class.getMethod(input, classObject);
        this.objectInput1TestError2 = method.getGenericParameterTypes()[0];
        this.objectInput2TestError2 = parserConfig;
        this.jsonObjectError2 = jsonObject;
    }

    @Test
    public void test_error_2(){
        Throwable error = null;
        try {
            TypeUtils.cast(this.jsonObjectError2, this.objectInput1TestError2, (ParserConfig) this.objectInput2TestError2);
        }catch (JSONException ex){
            error = ex;
        }
        Assert.assertNotNull(error);
    }

    private void configureError(JSONObject jsonObject, String idKey, int idValue, Class<C> classObject, ParserConfig parserConfig) {
        jsonObject.put(idKey, idValue);
        this.jsonObjectError = jsonObject;
        this.objectInput1TestError = parserConfig;
        this.objectInput2TestError = classObject;
    }

    @Test
    public void test_error(){
        JSONException error = null;
        try {
            TypeUtils.castToJavaBean(this.jsonObjectError, this.objectInput2TestError, this.objectInput1TestError);
        }catch (JSONException e){
            error = e;
        }
        Assert.assertNotNull(error);
    }

    private void configureABError_cast_to_SqlDate_error(String idKey, Object idValue, Class<?> classObject){
        this.jsonObjectABError_cast_to_SqlDate_error = new JSONObject();
        this.jsonObjectABError_cast_to_SqlDate_error.put(idKey, idValue);
        this.objectInput1TestABError_cast_to_SqlDate_error = idKey;
        this.objectInput2TestABError_cast_to_SqlDate_error = classObject;
    }

    @Test
    public void test_cast_ab_error_cast_to_sqlDate_error(){
        JSONException error = null;
        try {
            this.jsonObjectABError_cast_to_SqlDate_error.getObject((String) this.objectInput1TestABError_cast_to_SqlDate_error, (Class<?>) this.objectInput2TestABError_cast_to_SqlDate_error);
        }catch (JSONException e){
            error=e;
        }
        Assert.assertNotNull(error);
    }

    private void configureToSqlDateCalendar(String idKey, Class<?> classObject, Object objectExpectedTestPutID) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        this.jsonObjectTestPutID = new JSONObject();
        this.jsonObjectTestPutID.put(idKey, calendar);
        this.objectInput1TestPutID = idKey;
        this.objectInput2TestPutID = classObject;
        this.objectExpectedTestPutID = objectExpectedTestPutID;

    }

    private void configureToSqlDate183(){
        java.sql.Date date = new java.sql.Date(millis);
        this.objectInputSqlDate183 = date;
        this.objectExpectedSqlDate183 = date;
    }

    @Test
    public void test_cast_to_SqlDate_sql_Date2_183(){
        Assert.assertEquals(this.objectExpectedSqlDate183, TypeUtils.castToSqlDate(this.objectInputSqlDate183));
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

    private void configureTest2Gson(JSONObject jsonObject, String idKey, int idValue, String nameKey, String nameValue, Class<User> userClass) {
        jsonObject.put(idKey, idValue);
        jsonObject.put(nameKey, nameValue);
        this.objectInput1Test2 = jsonObject;
        this.objectInput2Test2 = userClass;
        this.objectInput3Test2 = idKey;
        this.objectInput4Test2 = nameKey;
        this.objectInput5Test2 = idValue;
        this.objectInput6Test2 = nameValue;
    }

    @Test
    public void test_2Gson(){
        Gson gson = new Gson();
        User userGson = gson.fromJson("{'"+this.objectInput3Test2+"':" +this.objectInput5Test2+ ",'"+this.objectInput4Test2+"':"+this.objectInput6Test2+"}", this.objectInput2Test2);
        this.objectExpected1Test2 = userGson.id;
        this.objectExpected2Test2 = userGson.name;
        User user = TypeUtils.castToJavaBean(this.objectInput1Test2, this.objectInput2Test2);
        Assert.assertEquals(this.objectExpected1Test2, user.getId());
        Assert.assertEquals(this.objectExpected2Test2, user.getName());
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
    public static class A implements IA {

    }

    public static interface IA {

    }

    public static class B extends A {

    }

    public static class C extends B {

        public int getId() {
            throw new UnsupportedOperationException();
        }

        public void setId(int id) {
            throw new UnsupportedOperationException();
        }
    }

    public static void f(List<?> list) {

    }



}

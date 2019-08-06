package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OAuth2ExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: OAuth2Exception */
  // Test written by Diffblue Cover.
  @Test
  public void addAdditionalInformationInputNotNullNotNullOutputVoid() {

    // Arrange
    final OAuth2Exception objectUnderTest = new OAuth2Exception("3");
    final String key = "2";
    final String value = "BAZ";

    // Act
    objectUnderTest.addAdditionalInformation(key, value);

    // Assert side effects
    final TreeMap<String, String> treeMap = new TreeMap<String, String>();
    treeMap.put("2", "BAZ");
    Assert.assertEquals(treeMap, objectUnderTest.getAdditionalInformation());
    Assert.assertNotNull(Reflector.getInstanceField(objectUnderTest, "cause"));
    Assert.assertEquals(treeMap,
                        ((OAuth2Exception)Reflector.getInstanceField(objectUnderTest, "cause"))
                            .getAdditionalInformation());
    Assert.assertEquals(
        Reflector.getInstanceField(objectUnderTest, "cause"),
        Reflector.getInstanceField(Reflector.getInstanceField(objectUnderTest, "cause"), "cause"));
    Assert.assertEquals(
        "3", ((Throwable)Reflector.getInstanceField(objectUnderTest, "cause")).getMessage());
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNullOutputVoid() {

    // Arrange
    final String msg = "1a 2b 3c";
    final Throwable t = null;

    // Act, creating object to test constructor
    final OAuth2Exception objectUnderTest = new OAuth2Exception(msg, t);

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(objectUnderTest, "cause"));
    Assert.assertEquals("1a 2b 3c", objectUnderTest.getMessage());
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullOutputVoid() {

    // Arrange
    final String msg = "3";

    // Act, creating object to test constructor
    final OAuth2Exception objectUnderTest = new OAuth2Exception(msg);

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(objectUnderTest, "cause"));
    Assert.assertNull(((OAuth2Exception)Reflector.getInstanceField(objectUnderTest, "cause"))
                          .getAdditionalInformation());
    Assert.assertEquals(
        Reflector.getInstanceField(objectUnderTest, "cause"),
        Reflector.getInstanceField(Reflector.getInstanceField(objectUnderTest, "cause"), "cause"));
    Assert.assertEquals(
        "foo", ((Throwable)Reflector.getInstanceField(objectUnderTest, "cause")).getMessage());
    Assert.assertEquals("foo", objectUnderTest.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNotNullOutputNotNull() {

    // Arrange
    final String errorCode = "a\'b\'c";
    final String errorMessage = ",";

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals(",", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull() {

    // Arrange
    final String errorCode = "invalid_grant";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("invalid_grant", Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull10() {

    // Arrange
    final String errorCode = "unsupported_grant_type";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("unsupported_grant_type",
                        Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull2() {

    // Arrange
    final String errorCode = "invalid_token";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("invalid_token", Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull3() {

    // Arrange
    final String errorCode = "invalid_client";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("invalid_client", Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull4() {

    // Arrange
    final String errorCode = "access_denied";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("access_denied", Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull5() {

    // Arrange
    final String errorCode = "invalid_scope";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("invalid_scope", Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull6() {

    // Arrange
    final String errorCode = "invalid_request";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("invalid_request", Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull7() {

    // Arrange
    final String errorCode = "unauthorized_client";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("unauthorized_client", Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull8() {

    // Arrange
    final String errorCode = "unsupported_response_type";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("unsupported_response_type",
                        Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull9() {

    // Arrange
    final String errorCode = "redirect_uri_mismatch";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, errorMessage);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(Reflector.getInstanceField(actual, "additionalInformation"));
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("redirect_uri_mismatch",
                        Reflector.getInstanceField(actual, "detailMessage"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAdditionalInformationOutputNull() {

    // Arrange
    final OAuth2Exception objectUnderTest = new OAuth2Exception("3");

    // Act
    final Map<String, String> actual = objectUnderTest.getAdditionalInformation();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHttpErrorCodeOutputPositive() {

    // Arrange
    final OAuth2Exception objectUnderTest = new OAuth2Exception("3");

    // Act
    final int actual = objectUnderTest.getHttpErrorCode();

    // Assert result
    Assert.assertEquals(400, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOAuth2ErrorCodeOutputNotNull() {

    // Arrange
    final OAuth2Exception objectUnderTest = new OAuth2Exception("3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("invalid_request", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSummaryOutputNotNull() {

    // Arrange
    final OAuth2Exception objectUnderTest = new OAuth2Exception(",");

    // Act
    final String actual = objectUnderTest.getSummary();

    // Assert result
    Assert.assertEquals("error=\"invalid_request\", error_description=\",\"", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSummaryOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final OAuth2Exception objectUnderTest = (OAuth2Exception)Reflector.getInstance(
        "org.springframework.security.oauth2.common.exceptions.OAuth2Exception");
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    Reflector.setField(objectUnderTest, "additionalInformation", hashMap);
    final Throwable throwable = new Throwable();
    Reflector.setField(throwable, "cause", null);
    Reflector.setField(throwable, "detailMessage", "a/b/c");
    Reflector.setField(objectUnderTest, "cause", throwable);
    Reflector.setField(objectUnderTest, "detailMessage", "2");

    // Act
    final String actual = objectUnderTest.getSummary();

    // Assert result
    Assert.assertEquals("error=\"invalid_request\", error_description=\"2\"", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSummaryOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final OAuth2Exception objectUnderTest = (OAuth2Exception)Reflector.getInstance(
        "org.springframework.security.oauth2.common.exceptions.OAuth2Exception");
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    Reflector.setField(objectUnderTest, "additionalInformation", hashMap);
    final Throwable throwable = new Throwable();
    Reflector.setField(throwable, "cause", null);
    Reflector.setField(throwable, "detailMessage", "a/b/c");
    Reflector.setField(objectUnderTest, "cause", throwable);
    Reflector.setField(objectUnderTest, "detailMessage", null);

    // Act
    final String actual = objectUnderTest.getSummary();

    // Assert result
    Assert.assertEquals("error=\"invalid_request\"", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSummaryOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final OAuth2Exception objectUnderTest = (OAuth2Exception)Reflector.getInstance(
        "org.springframework.security.oauth2.common.exceptions.OAuth2Exception");
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("1234", "\'");
    Reflector.setField(objectUnderTest, "additionalInformation", hashMap);
    final Throwable throwable = new Throwable();
    Reflector.setField(throwable, "cause", null);
    Reflector.setField(throwable, "detailMessage", "a/b/c");
    Reflector.setField(objectUnderTest, "cause", throwable);
    Reflector.setField(objectUnderTest, "detailMessage", null);

    // Act
    final String actual = objectUnderTest.getSummary();

    // Assert result
    Assert.assertEquals("error=\"invalid_request\", 1234=\"\'\"", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final OAuth2Exception objectUnderTest = new OAuth2Exception("3");

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals("error=\"invalid_request\", error_description=\"3\"", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final OAuth2Exception objectUnderTest = (OAuth2Exception)Reflector.getInstance(
        "org.springframework.security.oauth2.common.exceptions.OAuth2Exception");
    Reflector.setField(objectUnderTest, "additionalInformation", null);
    Reflector.setField(objectUnderTest, "cause", null);
    Reflector.setField(objectUnderTest, "detailMessage", null);

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals("error=\"invalid_request\"", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final OAuth2Exception objectUnderTest = (OAuth2Exception)Reflector.getInstance(
        "org.springframework.security.oauth2.common.exceptions.OAuth2Exception");
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("1234", "1234");
    Reflector.setField(objectUnderTest, "additionalInformation", hashMap);
    Reflector.setField(objectUnderTest, "cause", null);
    Reflector.setField(objectUnderTest, "detailMessage", null);

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals("error=\"invalid_request\", 1234=\"1234\"", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInput0OutputNotNull() {

    // Arrange
    final HashMap<String, String> errorParams = new HashMap<String, String>();

    // Act
    final OAuth2Exception actual = OAuth2Exception.valueOf(errorParams);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual, Reflector.getInstanceField(actual, "cause"));
    Assert.assertEquals("OAuth Error", actual.getMessage());
  }

  // Test written by Diffblue Cover.

  @Test
  public void valueOfInput1OutputNullPointerException() {

    // Arrange
    final HashMap<String, String> errorParams = new HashMap<String, String>();
    errorParams.put(null, null);

    // Act
    thrown.expect(NullPointerException.class);
    OAuth2Exception.valueOf(errorParams);

    // Method is not expected to return due to exception thrown
  }
}

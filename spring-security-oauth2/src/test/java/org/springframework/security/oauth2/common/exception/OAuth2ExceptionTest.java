package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class OAuth2ExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNotNullOutputNotNull() {

    // Arrange
    final String errorCode = "a'b'c";
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

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), InvalidGrantException.class);
    Assert.assertEquals("invalid_grant", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull10() {

    // Arrange
    final String errorCode = "unsupported_grant_type";

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), UnsupportedGrantTypeException.class);
    Assert.assertEquals("unsupported_grant_type",
                        actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull2() {

    // Arrange
    final String errorCode = "invalid_token";
    final String errorMessage = null;

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), InvalidTokenException.class);
    Assert.assertEquals("invalid_token", actual.getMessage());
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
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), InvalidClientException.class);
    Assert.assertEquals("invalid_client", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull4() {

    // Arrange
    final String errorCode = "access_denied";

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), UserDeniedAuthorizationException.class);
    Assert.assertEquals("access_denied", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull5() {

    // Arrange
    final String errorCode = "invalid_scope";

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), InvalidScopeException.class);
    Assert.assertEquals("invalid_scope", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull6() {

    // Arrange
    final String errorCode = "invalid_request";

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), InvalidRequestException.class);
    Assert.assertEquals("invalid_request", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullNullOutputNotNull7() {

    // Arrange
    final String errorCode = "unauthorized_client";

    // Act
    final OAuth2Exception actual = OAuth2Exception.create(errorCode, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), UnauthorizedClientException.class);
    Assert.assertEquals("unauthorized_client", actual.getMessage());
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
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), UnsupportedResponseTypeException.class);
    Assert.assertEquals("unsupported_response_type",
                        actual.getMessage());
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
    Assert.assertNull(actual.getAdditionalInformation());
    Assert.assertEquals(actual.getClass(), RedirectMismatchException.class);
    Assert.assertEquals("redirect_uri_mismatch",
                        actual.getMessage());
  }


  // Test written by Diffblue Cover.
  @Test
  public void getHttpErrorCodeOutputPositive() {

    // Arrange
    final OAuth2Exception oAuth2Exception = new OAuth2Exception("3");

    // Assert result
    Assert.assertEquals(400, oAuth2Exception.getHttpErrorCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOAuth2ErrorCodeOutputNotNull() {

    // Arrange
    final OAuth2Exception oAuth2Exception = new OAuth2Exception("3");

    // Assert result
    Assert.assertEquals("invalid_request", oAuth2Exception.getOAuth2ErrorCode());
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
  public void toStringOutputNotNull3() throws InvocationTargetException {

    // Arrange
      final OAuth2Exception objectUnderTest = OAuth2Exception.create("invalid_request", "error message");
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("1234", "1234");
    objectUnderTest.addAdditionalInformation("1234", "1234");
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

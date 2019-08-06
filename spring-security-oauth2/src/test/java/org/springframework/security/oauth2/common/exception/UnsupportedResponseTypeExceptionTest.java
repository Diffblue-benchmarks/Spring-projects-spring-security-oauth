package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.UnsupportedResponseTypeException;

import java.lang.reflect.Method;

public class UnsupportedResponseTypeExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: UnsupportedResponseTypeException */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNullOutputVoid() {

    // Arrange
    final String msg = "\'";
    final Throwable t = null;

    // Act, creating object to test constructor
    final UnsupportedResponseTypeException objectUnderTest =
        new UnsupportedResponseTypeException(msg, t);

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(objectUnderTest, "cause"));
    Assert.assertEquals("\'", objectUnderTest.getMessage());
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullOutputVoid() {

    // Arrange
    final String msg = "A1B2C3";

    // Act, creating object to test constructor
    final UnsupportedResponseTypeException objectUnderTest =
        new UnsupportedResponseTypeException(msg);

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOAuth2ErrorCodeOutputNotNull() {

    // Arrange
    final UnsupportedResponseTypeException objectUnderTest =
        new UnsupportedResponseTypeException("A1B2C3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("unsupported_response_type", actual);
  }
}

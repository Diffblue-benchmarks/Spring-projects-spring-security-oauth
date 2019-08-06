package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.UnsupportedGrantTypeException;

import java.lang.reflect.Method;

public class UnsupportedGrantTypeExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: UnsupportedGrantTypeException */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNullOutputVoid() {

    // Arrange
    final String msg = "\'";
    final Throwable t = null;

    // Act, creating object to test constructor
    final UnsupportedGrantTypeException objectUnderTest = new UnsupportedGrantTypeException(msg, t);

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
    final UnsupportedGrantTypeException objectUnderTest = new UnsupportedGrantTypeException(msg);

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOAuth2ErrorCodeOutputNotNull() {

    // Arrange
    final UnsupportedGrantTypeException objectUnderTest =
        new UnsupportedGrantTypeException("A1B2C3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("unsupported_grant_type", actual);
  }
}

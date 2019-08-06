package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.common.exceptions.RedirectMismatchException;

public class RedirectMismatchExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: RedirectMismatchException */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNullOutputVoid() {

    // Arrange
    final String msg = "1a 2b 3c";
    final Throwable t = null;

    // Act, creating object to test constructor
    final RedirectMismatchException objectUnderTest = new RedirectMismatchException(msg, t);

    // Assert side effects
    Assert.assertNull(Reflector.getInstanceField(objectUnderTest, "cause"));
    Assert.assertEquals("1a 2b 3c", objectUnderTest.getMessage());
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullOutputVoid() {

    // Arrange
    final String msg = "A1B2C3";

    // Act, creating object to test constructor
    final RedirectMismatchException objectUnderTest = new RedirectMismatchException(msg);

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(objectUnderTest, "cause"));
    Assert.assertNull(((OAuth2Exception)Reflector.getInstanceField(objectUnderTest, "cause"))
                          .getAdditionalInformation());
    Assert.assertEquals(
        Reflector.getInstanceField(objectUnderTest, "cause"),
        Reflector.getInstanceField(Reflector.getInstanceField(objectUnderTest, "cause"), "cause"));
    Assert.assertEquals(
        "1a 2b 3c", ((Throwable)Reflector.getInstanceField(objectUnderTest, "cause")).getMessage());
    Assert.assertEquals("1a 2b 3c", objectUnderTest.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOAuth2ErrorCodeOutputNotNull() {

    // Arrange
    final RedirectMismatchException objectUnderTest = new RedirectMismatchException("A1B2C3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("invalid_grant", actual);
  }
}

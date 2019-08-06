package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

public class InvalidTokenExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getHttpErrorCodeOutputPositive() {

    // Arrange
    final InvalidTokenException objectUnderTest = new InvalidTokenException("3");

    // Act
    final int actual = objectUnderTest.getHttpErrorCode();

    // Assert result
    Assert.assertEquals(401, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOAuth2ErrorCodeOutputNotNull() {

    // Arrange
    final InvalidTokenException objectUnderTest = new InvalidTokenException("3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("invalid_token", actual);
  }
}

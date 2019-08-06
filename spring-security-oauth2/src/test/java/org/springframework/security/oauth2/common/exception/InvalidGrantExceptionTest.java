package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

public class InvalidGrantExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void testOAuth2ErrorCodeIsInvalidGrant() {

    // Arrange
    final InvalidGrantException objectUnderTest = new InvalidGrantException("A1B2C3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("invalid_grant", actual);
  }
}

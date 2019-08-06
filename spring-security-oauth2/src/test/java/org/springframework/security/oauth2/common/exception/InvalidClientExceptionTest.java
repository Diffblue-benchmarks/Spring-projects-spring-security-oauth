package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

public class InvalidClientExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  @Test
  public void testHttpErrorCodeIs401() {

    // Arrange
    final InvalidClientException objectUnderTest = new InvalidClientException("3");

    // Act
    final int actual = objectUnderTest.getHttpErrorCode();

    // Assert result
    Assert.assertEquals(401, actual);
  }

  @Test
  public void testOAuth2ErrorCodeIsInvalidClient() {

    // Arrange
    final InvalidClientException objectUnderTest = new InvalidClientException("3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("invalid_client", actual);
  }
}

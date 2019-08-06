package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedClientException;

public class UnauthorizedClientExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);


  // Test written by Diffblue Cover.
  @Test
  public void testHttpErrorCodeIs401() {

    // Arrange
    final UnauthorizedClientException objectUnderTest = new UnauthorizedClientException("/");

    // Act
    final int actual = objectUnderTest.getHttpErrorCode();

    // Assert result
    Assert.assertEquals(401, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void testOAuth2ErrorCodeIsUnauthorizedClient() {

    // Arrange
    final UnauthorizedClientException objectUnderTest = new UnauthorizedClientException("3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("unauthorized_client", actual);
  }
}

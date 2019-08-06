package org.springframework.security.oauth2.common.exceptions;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.security.oauth2.common.exceptions.ClientAuthenticationException;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

public class ClientAuthenticationExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: ClientAuthenticationException */
  // Test written by Diffblue Cover.

//  @Test
//  public void constructorInputNotNullNullOutputVoid() {
//
//    // Arrange
//    final String msg = "BAZ";
//    final Throwable t = null;
//
//    // Act, creating object to test constructor
//    final ClientAuthenticationException objectUnderTest = new ClientAuthenticationException(msg, t);
//
//    // Assert side effects
//    Assert.assertNull(Reflector.getInstanceField(objectUnderTest, "cause"));
//    Assert.assertEquals("BAZ", objectUnderTest.getMessage());
//  }

  // Test written by Diffblue Cover.

//  @Test
//  public void constructorInputNotNullOutputVoid() {
//
//    // Arrange
//    final String msg = "Bar";
//
//    // Act, creating object to test constructor
//    final ClientAuthenticationException objectUnderTest = new ClientAuthenticationException(msg);
//
//    // Assert side effects
//    Assert.assertNotNull(Reflector.getInstanceField(objectUnderTest, "cause"));
//    Assert.assertNull(((OAuth2Exception)Reflector.getInstanceField(objectUnderTest, "cause"))
//                          .getAdditionalInformation());
//    Assert.assertEquals(
//        Reflector.getInstanceField(objectUnderTest, "cause"),
//        Reflector.getInstanceField(Reflector.getInstanceField(objectUnderTest, "cause"), "cause"));
//    Assert.assertEquals(
//        "\'", ((Throwable)Reflector.getInstanceField(objectUnderTest, "cause")).getMessage());
//    Assert.assertEquals("\'", objectUnderTest.getMessage());
//  }

  // Test written by Diffblue Cover.
  @Test
  public void getHttpErrorCodeOutputPositive() {

    // Arrange
    final InvalidClientException objectUnderTest = new InvalidClientException("3");

    // Act
    final int actual = objectUnderTest.getHttpErrorCode();

    // Assert result
    Assert.assertEquals(400, actual);
  }
}

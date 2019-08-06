package org.springframework.security.oauth2.common.exceptions;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.security.oauth2.common.exceptions.InvalidScopeException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.common.util.OAuth2Utils;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

@RunWith(PowerMockRunner.class)
public class InvalidScopeExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: InvalidScopeException */
  // Test written by Diffblue Cover.
  @PrepareForTest(OAuth2Utils.class)
  @Test
  public void constructorInputNotNullNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(OAuth2Utils.class);

    // Arrange
    final String msg = "1a 2b 3c";
    final Set validScope = null;
    final Method formatParameterListMethod =
        DTUMemberMatcher.method(OAuth2Utils.class, "formatParameterList", Collection.class);
    PowerMockito.doReturn(null)
        .when(OAuth2Utils.class, formatParameterListMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act, creating object to test constructor
    final InvalidScopeException objectUnderTest = new InvalidScopeException(msg, validScope);

    // Assert side effects
    final TreeMap<String, String> treeMap = new TreeMap<String, String>();
    treeMap.put("scope", null);
    Assert.assertEquals(treeMap, objectUnderTest.getAdditionalInformation());
    Assert.assertNotNull(Reflector.getInstanceField(objectUnderTest, "cause"));
    Assert.assertEquals(treeMap,
                        ((OAuth2Exception)Reflector.getInstanceField(objectUnderTest, "cause"))
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
  public void constructorInputNotNullOutputVoid() {

    // Arrange
    final String msg = "3";

    // Act, creating object to test constructor
    final InvalidScopeException objectUnderTest = new InvalidScopeException(msg);

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
    final InvalidScopeException objectUnderTest = new InvalidScopeException("3");

    // Act
    final String actual = objectUnderTest.getOAuth2ErrorCode();

    // Assert result
    Assert.assertEquals("invalid_scope", actual);
  }
}

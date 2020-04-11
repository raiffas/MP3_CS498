package jenkins.model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jvnet.hudson.test.Issue;
import org.kohsuke.stapler.Stapler;
import org.kohsuke.stapler.StaplerRequest;
import static org.mockito.Matchers.anyString;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
public class idFromFilenameTest {

@Mock 
IdStrategy idstrategy;  
@Test 
public void validFilename(){
String result = idstrategy.idFromFilename("apples");
assertEquals(result, "apples");

}

	
	

}

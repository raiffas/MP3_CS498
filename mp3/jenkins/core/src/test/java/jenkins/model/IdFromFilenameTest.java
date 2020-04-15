package jenkins.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.*;
import java.io.*;

@RunWith(PowerMockRunner.class)
public class IdFromFilenameTest {
	private IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
	
	@Test
	public void checkFilenameLowerCase() {
		String input = "ab1";
		assertEquals(test.idFromFilename(input), input);
		
	}
	
	@Test 
	public void checkFilenameMixedCase() {
		String input = "abZZ1";
		assertEquals(test.idFromFilename(input), "ab1");
	}
	
	@Test 
	public void checkFilenameUpperCase() {
		String input = "ABC";
		assertEquals(test.idFromFilename(input), "");
	}
	
	
}

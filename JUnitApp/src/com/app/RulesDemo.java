package com.app;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RulesDemo {
	@Rule
	public TemporaryFolder folder=new TemporaryFolder();
	
	@Test
	public void testRule() throws IOException
	{
		File cf=folder.newFolder("newfolder");
		File crf=folder.newFile("file.txt");
		
		assertTrue(cf.exists());
		
	}
}

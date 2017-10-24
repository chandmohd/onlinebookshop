package com.emids.TestClasses;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.emids.Services.Admin;
import com.emids.Utility.ScannerClass;

public class OnlineBookShopTest {
	@Test
	public final void checkAdminDetailsAndReturnTrue() {
		Mockito.when(ScannerClass.inOut()).thenReturn("chand");
		Mockito.when(ScannerClass.inOut()).thenReturn("emids");
		Assert.assertTrue(new Admin().verifyAdmin());
	}
		@Test
		public final void checkAdminDetailsAndReturnFalse() {
			Mockito.when(ScannerClass.inOut()).thenReturn("chand");
			Mockito.when(ScannerClass.inOut()).thenReturn("emids");
			Assert.assertFalse(new Admin().verifyAdmin());
	}

}
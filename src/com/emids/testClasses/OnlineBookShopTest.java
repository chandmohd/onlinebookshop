package com.emids.testClasses;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.emids.services.Admin;
import com.emids.utility.ScannerClass;

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
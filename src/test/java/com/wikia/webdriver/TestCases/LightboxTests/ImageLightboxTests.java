package com.wikia.webdriver.TestCases.LightboxTests;

import org.testng.annotations.Test;

import com.wikia.webdriver.Common.ContentPatterns.URLsContent;
import com.wikia.webdriver.Common.Templates.TestTemplate;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Lightbox.LightboxComponentObject;
import com.wikia.webdriver.PageObjectsFactory.PageObject.WikiBasePageObject;

public class ImageLightboxTests extends TestTemplate{
	@Test(groups = {"lightbox", "lightobx001"})
	public void lightboxTest_001() {
		WikiBasePageObject base = new WikiBasePageObject(driver);
		base.openArticle(URLsContent.lightboxImageTest);
		LightboxComponentObject lightbox = new LightboxComponentObject(driver);
		lightbox.openLightbox();
		lightbox.verifyLightboxPopup();
	}
}
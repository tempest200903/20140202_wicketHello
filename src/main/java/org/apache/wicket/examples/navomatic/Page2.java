package org.apache.wicket.examples.navomatic;

import org.apache.wicket.markup.html.WebPage;

public class Page2 extends WebPage {

	public Page2() {
		add(new NavomaticBorder("navomaticBorder"));
	}

}

package kewen.web.gensite.sitedef.element

import kewen.web.gensite.sitedef.Element

class Actioner extends Element {

	/*
	 * Text
	 */
	final static String attributeTEXT = "text"
	/*
	 * Type: B Button, L Link
	 */
	final static String attributeTYPE = "type"

	public Actioner() {
		registerAttribute(attributeTEXT, "Text")
		registerAttribute(attributeTYPE, "Type: B Button, L Link")
	}
}

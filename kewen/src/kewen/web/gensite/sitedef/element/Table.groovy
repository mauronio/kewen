package kewen.web.gensite.sitedef.element

import kewen.web.gensite.sitedef.Element

class Table extends Element {

	/*
	 * Title
	 */
	final static String attributeTITLE = "title"
	/*
	 * Visible columns
	 */
	final static String attributeCOLUMNS = "columns"
	/*
	 * Hidden columns
	 */
	final static String attributeHIDDENCOLUMNS = "hiddenColumns"

	public Table() {
		registerAttribute(attributeTITLE, "Title")
		registerAttribute(attributeCOLUMNS, "Visible Columns: columnID1;columnID2;...;columnIDN")
		registerAttribute(attributeHIDDENCOLUMNS, "Hidden Columns: columnID1;columnID2;...;columnIDN")
	}	
}

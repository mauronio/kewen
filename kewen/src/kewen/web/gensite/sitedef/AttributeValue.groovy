package kewen.web.gensite.sitedef

class AttributeValue {

	public String name
	public String description
	public String value	
	
	@Override
	public void report(ReportWriter writer, int offset) {
		writer.writeLn("<attribute name='" + name + "' value='" + value + "'/>", offset)
	}
}

package kewen.web.gensite.sitedef

class Event extends ExtensibleDefinition {

	public String id
	public String componentId
	
	@Override
	public void report(ReportWriter writer, int offset) {
		writer.writeLn("<event id='" + id + "' source='" + componentId +"' >", offset )
		super.report(writer, offset + Constants.indentationOffset )
		writer.writeLn("</event>", offset )
	}
}

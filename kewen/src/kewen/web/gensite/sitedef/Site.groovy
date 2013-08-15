package kewen.web.gensite.sitedef

class Site extends ExtensibleDefinition {

	List<Page> pages
	
	@Override
	public void report(ReportWriter writer, int offset) {
		writer.writeLn("<site>", offset )
		super.report(writer, offset + Constants.indentationOffset )
		writer.writeLn("<pages>", offset + Constants.indentationOffset )
		pages.each{page -> page.report(writer, offset + Constants.indentationOffset + Constants.indentationOffset) }
		writer.writeLn("</pages>", offset + Constants.indentationOffset )
		writer.writeLn("</site>", offset )
	}

	
}

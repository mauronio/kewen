package kewen.web.gensite.sitedef

class Component extends Region {
	
	public String id

	public List<Event> reportedEvents
	public List<Event> listenedEvents
	
	@Override
	public void report(ReportWriter writer, int offset) {
		super.report(writer, offset)
		writer.writeLn("<reported-events>", offset )
		reportedEvents.each{event -> event.report(writer, offset + Constants.indentationOffset) }
		writer.writeLn("</reported-events>", offset )
		writer.writeLn("<listened-events>", offset )
		listenedEvents.each{event -> event.report(writer, offset + Constants.indentationOffset) }
		writer.writeLn("</listened-events>", offset )
	}

}

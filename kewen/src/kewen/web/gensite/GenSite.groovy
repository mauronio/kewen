package kewen.web.gensite

import kewen.web.gensite.sitedef.Page

class GenSite {

	public void run() {
		Page page = new Page()
		page.name = "pepe"
		
		print "hola " + page.name
	}

	static main(args) {
		
		GenSite genSite = new GenSite()
		genSite.run()
		
		
	}

}

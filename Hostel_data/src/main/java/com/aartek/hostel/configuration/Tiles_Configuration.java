package com.aartek.hostel.configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.request.Request;

import com.aartek.hostel.model.Reg_Dto;

public class Tiles_Configuration implements DefinitionsFactory
{
	private static final Map<String, Definition> tilesDefinitions = new HashMap<String, Definition>();

	@Override
	public Definition getDefinition(String name, org.apache.tiles.request.Request tilesContext) {
		
		  return tilesDefinitions.get(name);
		 }	
private static void addDefaultLayoutDef(String name, String body, String header, String footer) {
		
		Map<String, Attribute> attributes = new HashMap<String, Attribute>();
		attributes.put("header", new Attribute(header));
		//attributes.put("leftheader", new Attribute(leftheader));
		attributes.put("body", new Attribute("/WEB-INF/" + "" + body + "" + ".jsp"));
		attributes.put("footer", new Attribute(footer));
		tilesDefinitions.put(name, new Definition(name, new Attribute("/WEB-INF/DefaultLayout.jsp"), attributes));
	}

	/*private static void addWelcomeLayoutDef(String name, String body, String welcomeHeader, String welcomeFooter) {

		Map<String, Attribute> attributes = new HashMap<String, Attribute>();
		attributes.put("header", new Attribute(welcomeHeader));
		attributes.put("body", new Attribute("/WEB-INF/jsp/" + "" + body + "" + ".jsp"));
		attributes.put("footer", new Attribute(welcomeFooter));
		tilesDefinitions.put(name, new Definition(name, new Attribute("/WEB-INF/layout/welcomelayout.jsp"), attributes));
	}*/

public static void addDefinitions() {
	   addDefaultLayoutDef("home", "home", "/WEB-INF/header.jsp", "/WEB-INF/footer.jsp");
}
}
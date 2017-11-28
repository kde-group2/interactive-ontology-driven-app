package com.kde.group2.model;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

public class SampleModel {
	
	public SampleModel() {
		Model model = ModelFactory.createDefaultModel();
		
		String NS = "http://example.com/test/";
		
		Resource r = model.createResource(NS + "r");
		Property p = model.createProperty(NS + "p");
		
		r.addProperty(p, "Hello World", XSDDatatype.XSDstring);
		
		model.write (System.out, "Turtle");
	}

}

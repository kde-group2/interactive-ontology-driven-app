package com.kde.group2.rdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class RDFFile {
	
	Model model;
	
	public RDFFile (String path, String modelName) throws IOException {
		
		try(InputStream in = new FileInputStream(new File(path))) {
			
			// Create an empty in-memory model and populate it from the graph
			this.model = ModelFactory.createMemModelMaker().createModel(modelName);
			
			// null base URI, since model URIs are absolute
			this.model.read(in,null); 
			
		}
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
}
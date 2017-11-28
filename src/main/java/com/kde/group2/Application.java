package com.kde.group2;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.kde.group2.rdf.RDFFile;

import constants.Constants;
import constants.Queries;

public class Application {

	static Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String args[]) {

		
		Model model = null;
		
		String executionPath = System.getProperty("user.dir");
		System.out.println(executionPath);
		try {
			System.out.println("current dir = " + System.getProperty("user.dir"));
			RDFFile rdfFile = new RDFFile(Constants.RDF_FILE_PATH, Constants.RDF_MODEL_NAME);
			model = rdfFile.getModel();
		} catch (IOException e) {
			logger.error("Unable to open RDF file.",e);
			throw new RuntimeException("Unable to open file: "+Constants.RDF_FILE_PATH);
		}
		
		Query query = QueryFactory.create(Queries.QUERY);
		
		// Execute the query and obtain results
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		ResultSet results = qe.execSelect();
		
		// Output query results 
		ResultSetFormatter.out(System.out, results, query);
		 
		// Important - free up resources used running the query
		qe.close();
	}
}

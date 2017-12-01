package constants;

public class Queries {
	
	public static String QUERY = "SELECT ?x ?fname WHERE { ?x  <http://www.w3.org/2001/vcard-rdf/3.0#FN>  ?fname } ";
	public static String HOUSING_TYPE_QUERY = "SELECT ?countyResource ?county ?notation ?households ?persons ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> ?county ." +
				"?countyResource <http://www.w3.org/2004/02/skos/core#notation> ?notation ." +
				"?z <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?z <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/Bed-Sit> ." +
				"?y <http://data.cso.ie/census-2011/property/households> ?households ." +
				"?p <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?p <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/Bed-Sit> ." +
				"?p <http://data.cso.ie/census-2011/property/persons> ?persons ." +
			"}";
}

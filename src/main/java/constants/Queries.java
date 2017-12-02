package constants;

public class Queries {
	
	public static String HOUSEHOLDS_POPULATION_BY_TYPE = "SELECT ?countyResource ?county ?households ?persons ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> ?county ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%1$s> ." +
				"?y <http://data.cso.ie/census-2011/property/households> ?households ." +
				"?p <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?p <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%1$s> ." +
				"?p <http://data.cso.ie/census-2011/property/persons> ?persons ." +
			"}";

	public static String HOUSEHOLDS_POPULATION_BY_COUNTY_AND_TYPE = "SELECT ?countyResource ?households ?persons ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> \"%1$s\"@en ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%2$s> ." +
				"?y <http://data.cso.ie/census-2011/property/households> ?households ." +
				"?p <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?p <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%2$s> ." +
				"?p <http://data.cso.ie/census-2011/property/persons> ?persons ." +
			"}";

	public static String HOUSEHOLDS_BY_COUNTY_AND_TYPE = "SELECT ?countyResource ?households ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> \"%s\"@en ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%s> ." +
				"?y <http://data.cso.ie/census-2011/property/households> ?households ." +
			"}";

	public static String PERSONS_BY_COUNTY_AND_TYPE = "SELECT ?countyResource ?persons ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> \"%s\"@en ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%s> ." +
				"?y <http://data.cso.ie/census-2011/property/persons> ?persons ." +
			"}";

	public static String PERSONS_BY_COUNTY = "SELECT ?countyResource ?accommodationType ?persons ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> \"%s\"@en ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> ?accommodationType ." +
				"?y <http://data.cso.ie/census-2011/property/persons> ?persons ." +
			"}";

	public static String HOUSEHOLDS_BY_COUNTY = "SELECT ?countyResource ?accommodationType ?households ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> \"%s\"@en ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> ?accommodationType ." +
				"?y <http://data.cso.ie/census-2011/property/households> ?households ." +
			"}";

	public static String PERSONS_BY_TYPE = "SELECT ?countyResource ?county ?persons ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> ?county ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%s> ." +
				"?y <http://data.cso.ie/census-2011/property/persons> ?persons ." +
			"}";

	public static String HOUSEHOLDS_BY_TYPE = "SELECT ?countyResource ?county ?households ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> ?county ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%s> ." +
				"?y <http://data.cso.ie/census-2011/property/households> ?households ." +
			"}";

	public static String HOUSEHOLDS_GREATHER_THAN_X_BY_TYPE = "SELECT ?countyResource ?county ?households ?geometry WHERE {" +
				"?countyResource <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2004/02/skos/core#Concept> ." +
				"?countyResource <http://www.w3.org/2000/01/rdf-schema#label> ?county ." +
				"?countyResource <http://www.w3.org/2002/07/owl#sameAs> ?geoHiveCounty ." +
				"?geoHiveCounty <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://ontologies.geohive.ie/osi#County> ." +
				"?geoHiveCounty <http://www.opengis.net/ont/geosparql#hasGeometry> ?geo ." +
				"?geo <http://www.opengis.net/ont/geosparql#asWKT> ?geometry ." +
				"?y <http://purl.org/linked-data/sdmx/2009/dimension#refArea> ?countyResource ." +
				"?y <http://data.cso.ie/census-2011/property/type-of-accommodation> <http://data.cso.ie/census-2011/classification/type-of-accommodation/%s> ." +
				"?y <http://data.cso.ie/census-2011/property/households> ?households ." +
				"FILTER (?households > %d)" +
			"}";
}

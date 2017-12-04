package com.kde.group2.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonUtils {

	private Logger logger = LoggerFactory.getLogger(JsonUtils.class);

	public ResponseEntity<String> getJsonForResponse(Object object) {
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, Visibility.ANY);

		String json = null;
		try {
			json = om.writeValueAsString(object);
			return ResponseEntity.status(HttpStatus.OK).body(json);
		} catch (JsonProcessingException e) {
			logger.error("Error creating response object.", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Utils.createErrorResponseMessage(e.getMessage()));
		}
	}

	public String getJson(Object object) {
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, Visibility.ANY);

		String json = null;

		try {
			json = om.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			logger.error("",e);
		}
		return json;
	}

}

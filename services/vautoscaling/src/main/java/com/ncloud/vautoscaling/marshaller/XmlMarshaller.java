/*
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.marshaller;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

/**
 * The type Xml marshaller.
 */
public class XmlMarshaller implements Marshaller {
	private static XmlMarshaller instance;
	private final String contentType;
	private final XmlMapper xmlMapper;

	private XmlMarshaller() {
		contentType = "application/xml";
		xmlMapper = new XmlMapper();
		xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
		xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static XmlMarshaller getInstance() {
		if (instance == null) {
			instance = new XmlMarshaller();
		}
		return instance;
	}

	public String getContentType() {
		return contentType;
	}

	public String writeValueAsString(Object value) throws IOException {
		return xmlMapper.writeValueAsString(value);
	}

	public <T> T readValue(InputStream src, Class clazz) throws IOException {
		return (T)xmlMapper.readValue(src, clazz);
	}
}

/*
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.marshaller;

import java.io.IOException;
import java.io.InputStream;

/**
 * The interface Marshaller.
 */
public interface Marshaller {
	/**
	 * Gets content type.
	 *
	 * @return the content type
	 */
	String getContentType();

	/**
	 * Write value as string string.
	 *
	 * @param value the value
	 * @return the string
	 * @throws IOException the io exception
	 */
	String writeValueAsString(Object value) throws IOException;

	/**
	 * Read value t.
	 *
	 * @param <T>  the type parameter
	 * @param src the src
	 * @param clazz the clazz
	 * @return the t
	 * @throws IOException the io exception
	 */
	<T> T readValue(InputStream src, Class clazz) throws IOException;
}
package com.handle.exception;

import java.util.function.Consumer;

public class GenericException {
	public static <T, E extends Exception> Consumer<T> handleException(Consumer<T> consumer, Class<E> clazz) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception ex) {
				try {
					E exCast = clazz.cast(ex);
					System.err.println("Exception occured : " + exCast.getMessage());
				} catch (ClassCastException ccEx) {
					throw ccEx;
				}
			}
		};
	}
}

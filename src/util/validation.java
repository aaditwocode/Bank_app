package util;

import exceptions.ValidationException;

@FunctionalInterface
public interface validation<T> {
    void validate(T value) throws ValidationException;
}
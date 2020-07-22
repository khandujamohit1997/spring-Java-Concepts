package com.unthinkable.enumeration.converter;

import com.unthinkable.enumeration.resources.EnItemType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Component
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RequestParameterConverter {
}

@RequestParameterConverter
public class StringToEnItemTypeConverter implements Converter<String, EnItemType> {
    @Override
    public EnItemType convert(String source) {
        return EnItemType.decode(source);
    }
}

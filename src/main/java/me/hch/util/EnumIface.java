package me.hch.util;

import java.util.Map;

/**
 * Created by hch on 2014/7/12.
 */
public interface EnumIface<E extends Enum<?>> {
    String getValue();

    E getEnum(String persistedValue);

    Map<String, E> getValueEnumMap();
}

package com.echenagucia.litelalura.service;

public interface ConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}

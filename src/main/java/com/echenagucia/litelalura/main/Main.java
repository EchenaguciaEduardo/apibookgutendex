package com.echenagucia.litelalura.main;

import com.echenagucia.litelalura.model.DatosLibros;
import com.echenagucia.litelalura.service.ConsumirApi;
import com.echenagucia.litelalura.service.ConvertirDatos;

import java.net.URL;
import java.util.concurrent.RecursiveTask;

public class Main {

private final String URL_BASE = "https://gutendex.com/books/";



    private ConsumirApi consumirApi = new ConsumirApi();
    private ConvertirDatos convertirDatos = new ConvertirDatos();

    private DatosLibros getDatosLibros (){
        var json = consumirApi.obtenerLibros(URL_BASE);
        System.out.println(json);
        DatosLibros datosLibros = convertirDatos.obtenerDatos(json, DatosLibros.class);
        System.out.println(datosLibros);
        return datosLibros;

    }




}

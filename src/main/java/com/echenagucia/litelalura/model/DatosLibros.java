package com.echenagucia.litelalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosLibros(

        @JsonAlias ("title") String titulo,
        @JsonAlias ("name") String autor,
        @JsonAlias ("languages") String idioma,
        @JsonAlias ("download_count") Integer numeroDeDescargas

) {
}

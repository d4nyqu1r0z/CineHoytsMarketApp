/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieapp.logica;

import com.mycompany.movieapp.persistencia.ControladorPersistencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dani2
 */
public class Controlador {
    
    ControladorPersistencia controladorPersis = new ControladorPersistencia();

    public void guardar(String titulo, String director, int anio, int duracion, String genero) {
        
        Movie pelicula = new Movie();
        pelicula.setTitulo(titulo);
        pelicula.setDirector(director);
        pelicula.setAnio(anio);
        pelicula.setDuracion(duracion);
        pelicula.setGenero(genero);
        
        controladorPersis.guardar(pelicula);
        
    }

    public List<Movie> traerPeliculas() {
        return controladorPersis.traerPeliculas();
    }

    public void borrarPelicula(int id) {
        controladorPersis.borrarPelicula(id);
    }

    public Movie traerPelicula(int id) {
        return controladorPersis.traerPelicula(id);
    }

    public void modificarPelicula(Movie peli, String titulo, String director, int anio, int duracion, String genero) {
        peli.setTitulo(titulo);
        peli.setDirector(director);
        peli.setAnio(anio);
        peli.setDuracion(duracion);
        peli.setGenero(genero);
        
        controladorPersis.modificarPelicula(peli);
    }

    public List<Movie> buscarPeliculasFiltradas(String filtro, String valor, int anioInicio, int anioFin) {
        
        List<Movie> peliculasFiltradas = new ArrayList<>();
        
        

        
        for (Movie pelicula : controladorPersis.traerPeliculas()){
            switch(filtro){
                case "Id" -> {
                    if(String.valueOf(pelicula.getId()).equals(valor)){
                        peliculasFiltradas.add(pelicula);
                    }
                }
                case "Título" -> {
                    if(pelicula.getTitulo().toLowerCase().contains(valor.toLowerCase())){
                        peliculasFiltradas.add(pelicula);
                    }
                }
                case "Director" -> {
                    if(pelicula.getDirector().toLowerCase().contains(valor.toLowerCase())){
                        peliculasFiltradas.add(pelicula);
                    }
                }
                case "Duración" -> {
                    int duracion = pelicula.getDuracion();
                    if(!valor.isEmpty()&&duracion>=Integer.parseInt(valor)){
                        peliculasFiltradas.add(pelicula);
                    }
                }
                case "Género" -> {
                    if(pelicula.getGenero().toLowerCase().contains(valor.toLowerCase())){
                        peliculasFiltradas.add(pelicula);
                    }
                }
                default -> {
                    return controladorPersis.traerPeliculas();
                }
            }
        }
        
        
        

        
        peliculasFiltradas.removeIf(pelicula -> pelicula.getAnio() < anioInicio || pelicula.getAnio() > anioFin);
        return peliculasFiltradas;
    }
    
}

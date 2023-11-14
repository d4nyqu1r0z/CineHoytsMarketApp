/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieapp.persistencia;

import com.mycompany.movieapp.logica.Movie;
import com.mycompany.movieapp.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author dani2
 */
public class ControladorPersistencia {
    
    MovieJpaController peliJpa = new MovieJpaController();

    public void guardar(Movie pelicula) {
        peliJpa.create(pelicula);
    }

    public List<Movie> traerPeliculas() {
        return peliJpa.findMovieEntities();
    }

    public void borrarPelicula(int id) {
        try {
            peliJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Movie traerPelicula(int id) {
        return peliJpa.findMovie(id);
    }

    public void modificarPelicula(Movie peli) {
        try {
            peliJpa.edit(peli);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public List<Movie> buscarPeliculasFiltradas(String filtro, String valor, int anioInicio, int anioFin) {
    EntityManager entityManager = peliJpa.getEntityManager();

    // Construye la consulta JPQL base
    String jpql = "SELECT m FROM Movie m WHERE ";

    // Agrega las condiciones según los filtros proporcionados
    if (!"Titulo".equals(filtro)) if ("Director".equals(filtro)) {
        jpql += "m.director LIKE :valor ";
    } else if ("Anio".equals(filtro)) {
        jpql += "m.anio BETWEEN :anioInicio AND :anioFin ";
    } else {
        jpql += "m.titulo LIKE :valor ";
        }

    // Crea la consulta JPQL final
    Query query = entityManager.createQuery(jpql, Movie.class);

    // Establece los parámetros según los filtros y valores proporcionados
    if ("Titulo".equals(filtro) || "Director".equals(filtro)) {
        query.setParameter("valor", "%" + valor + "%");
    } else if ("Anio".equals(filtro)) {
        query.setParameter("anioInicio", anioInicio);
        query.setParameter("anioFin", anioFin);
    }

    // Ejecuta la consulta y retorna el resultado
    return query.getResultList();
} 
    
}

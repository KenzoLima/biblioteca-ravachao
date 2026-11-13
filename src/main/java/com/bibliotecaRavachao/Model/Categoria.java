package com.bibliotecaRavachao.Model;

import com.bibliotecaRavachao.Model.Livro;

import java.util.ArrayList;

public class Categoria {
    private ArrayList<Livro> livrosGenero;
    private ArrayList<Livro> livrosArea;

    public ArrayList<Livro> getLivrosGenero() {
        return livrosGenero;
    }

    public void setLivrosGenero(ArrayList<Livro> livrosGenero) {
        this.livrosGenero = livrosGenero;
    }

    public ArrayList<Livro> getLivrosArea() {
        return livrosArea;
    }

    public void setLivrosArea(ArrayList<Livro> livrosArea) {
        this.livrosArea = livrosArea;
    }
}
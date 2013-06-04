package tests;


import static org.junit.Assert.assertEquals;

import grafo.Aresta;
import grafo.GrafoAbstrato;
import grafo.GrafoListaAdjacencia;
import grafo.IAresta;
import grafo.IVertice;
import grafo.Vertice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import visitor.Visitor;
import visitor.VisitorRelevancia;

public class GrafoAbstratoTest {
        GrafoAbstrato grafo;
        Visitor visitor;
        List<IVertice> listaResultado;
        List<IVertice> listaEsperada;
        Vertice vertice1;
        Vertice vertice2;
        Vertice vertice3;
        Vertice vertice4;
        Vertice vertice5;
        Vertice vertice6;
        Vertice vertice7;
        Vertice vertice8;
        Vertice vertice9;
        Vertice vertice10;
        Vertice vertice11;
        Vertice vertice12;

        @Before
        public void setUp() throws Exception {
                
                grafo = new GrafoListaAdjacencia();
                visitor = new VisitorRelevancia();
                listaResultado = new ArrayList<IVertice>();
                listaEsperada = new ArrayList<IVertice>();
                
                vertice1 = new Vertice("1","1");
                vertice2 = new Vertice("2","2");
                vertice3 = new Vertice("3","3");
                vertice4 = new Vertice("4","4");
                vertice5 = new Vertice("5","5");
                vertice6 = new Vertice("6","6");
                vertice7 = new Vertice("7","7");
                vertice8 = new Vertice("8","8");
                vertice9 = new Vertice("9","9");
                vertice10 = new Vertice("10","10");
                vertice11 = new Vertice("11","11");
                vertice12 = new Vertice("12","12");
                
                grafo.adicionarVertice(vertice1);
                grafo.adicionarVertice(vertice2);
                grafo.adicionarVertice(vertice3);
                grafo.adicionarVertice(vertice4);
                grafo.adicionarVertice(vertice5);
                grafo.adicionarVertice(vertice6);
                grafo.adicionarVertice(vertice7);
                grafo.adicionarVertice(vertice8);
                grafo.adicionarVertice(vertice9);
                grafo.adicionarVertice(vertice10);
                grafo.adicionarVertice(vertice11);
                grafo.adicionarVertice(vertice12);
                
                IAresta aresta1 = new Aresta(vertice1, vertice2);
                IAresta aresta2 = new Aresta(vertice1, vertice12);
                IAresta aresta3 = new Aresta(vertice1, vertice4);
                IAresta aresta4 = new Aresta(vertice1, vertice3);
                IAresta aresta5 = new Aresta(vertice12, vertice6);
                IAresta aresta6 = new Aresta(vertice4, vertice8);
                IAresta aresta7 = new Aresta(vertice5, vertice9);
                IAresta aresta8 = new Aresta(vertice6, vertice7);
                IAresta aresta9 = new Aresta(vertice7, vertice11);
                IAresta aresta10 = new Aresta(vertice11, vertice10);
                IAresta edge10 = new Aresta(vertice3, vertice5);
                
                grafo.adicionarAresta(aresta1);
                grafo.adicionarAresta(aresta2);
                grafo.adicionarAresta(aresta3);
                grafo.adicionarAresta(aresta4);
                grafo.adicionarAresta(aresta5);
                grafo.adicionarAresta(aresta6);
                grafo.adicionarAresta(aresta7);
                grafo.adicionarAresta(aresta8);
                grafo.adicionarAresta(aresta9);
                grafo.adicionarAresta(aresta10);
                grafo.adicionarAresta(edge10);
        }

        @Test
        public void depthTest() throws VerticeJaExisteException,
                        ParDeVerticesNaoExistenteException {
                
                listaEsperada.add(vertice1);
                listaEsperada.add(vertice2);
                listaEsperada.add(vertice12);
                listaEsperada.add(vertice6);
                listaEsperada.add(vertice7);
                listaEsperada.add(vertice11);
                listaEsperada.add(vertice10);
                listaEsperada.add(vertice4);
                listaEsperada.add(vertice8);
                listaEsperada.add(vertice3);
                listaEsperada.add(vertice5);
                listaEsperada.add(vertice9);
                
                grafo.buscaEmProfundidade(visitor, 0, listaResultado);
                assertEquals(listaEsperada, listaResultado);

        }
        
        @Test
        public void breadthTest() throws VerticeJaExisteException,
                        ParDeVerticesNaoExistenteException {
                
                listaEsperada.add(vertice1);
                listaEsperada.add(vertice2);
                listaEsperada.add(vertice12);
                listaEsperada.add(vertice4);
                listaEsperada.add(vertice3);
                listaEsperada.add(vertice6);
                listaEsperada.add(vertice8);
                listaEsperada.add(vertice5);
                listaEsperada.add(vertice7);
                listaEsperada.add(vertice9);
                listaEsperada.add(vertice11);
                listaEsperada.add(vertice10);
                
                grafo.buscaEmLargura(visitor, 0, listaResultado);
                assertEquals(listaEsperada, listaResultado);

        }
}

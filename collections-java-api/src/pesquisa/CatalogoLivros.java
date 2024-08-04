package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }

        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {

        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public List<Livro> pesquisarLivorsPorTitulo(String titulo) {

        List<Livro> livrosPorTitulo = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo.add(l);
                }
            }

        }
        return livrosPorTitulo;
    }

    public int obterTotalDeLivros() {
        return livroList.size();
    }

    public void obterNomesDosLivros() {
        System.out.println(livroList);
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "Autor1", 2020);
        catalogoLivros.adicionarLivro("Livro1", "Autor2", 2021);
        catalogoLivros.adicionarLivro("Livro2", "Autor2", 2022);
        catalogoLivros.adicionarLivro("Livro3", "Autor3", 2023);
        catalogoLivros.adicionarLivro("Livro4", "Autor4", 1994);
        catalogoLivros.adicionarLivro("JAVA", "Javeiros1", 2005);
        catalogoLivros.adicionarLivro("JAVA", "Javeiros2", 2005);
        catalogoLivros.adicionarLivro("COBOL", "COBOL", 1965);
        catalogoLivros.adicionarLivro("CICS", "COBOL", 1965);
        catalogoLivros.adicionarLivro("DB2", "COBOL", 1965);
        catalogoLivros.adicionarLivro("VSAM", "COBOL", 1965);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2").size());

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1965, 2005));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1965, 2005).size());

        System.out.println(catalogoLivros.pesquisarLivorsPorTitulo("JAVA"));
        System.out.println(catalogoLivros.pesquisarLivorsPorTitulo("JAVA").size());

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));

        System.out.println("Total = " + catalogoLivros.obterTotalDeLivros());

        catalogoLivros.obterNomesDosLivros();
    }
}

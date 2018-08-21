package br.com.datamob.controledeuniversidade.database.entity;

public class UniversidadeEntity
{
    private Long codigo;
    private String nome;
    private Long cidade;

    public UniversidadeEntity()
    {
    }

    public UniversidadeEntity(Long codigo, String nome, Long cidade)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Long getCodigo()
    {
        return codigo;
    }

    public void setCodigo(Long codigo)
    {
        this.codigo = codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Long getCidade()
    {
        return cidade;
    }

    public void setCidade(Long cidade)
    {
        this.cidade = cidade;
    }
}

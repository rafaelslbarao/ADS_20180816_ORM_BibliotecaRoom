package br.com.datamob.controledeuniversidade.database_room.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

// Definição de chave primária composta
//@Entity(tableName = "cidade", primaryKeys = {"codigo", "outracoluna"})
@Entity(tableName = "cidade")
public class CidadeEntity
{
    @PrimaryKey
    private Long codigo;

    @ColumnInfo
    private String nome;

    @ColumnInfo
    private String estado;

    @Ignore
    private String colunaAuxiliar;

    public CidadeEntity()
    {
    }

    public CidadeEntity(Long codigo, String nome, String estado)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
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

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    @Override
    public String toString()
    {
        return nome.toString() + " - " + estado.toString();
    }
}

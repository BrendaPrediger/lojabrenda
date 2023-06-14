/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author mateus
 */
public class Estado {
    private int idestado;
    private String uf;
    private String descricao;
   private String situacao;

    public Estado(int idestado, String uf, String descricao, String situacao) {
        this.idestado = idestado;
        this.uf = uf;
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public Estado(){
        
    }
    
     public String getSituacao() {
        return situacao;
    }

    public void setId(String situacao) {
        this.situacao = situacao;
    }
    
    public int getId() {
        return idestado;
    }

    public void setId(int idestado) {
        this.idestado = idestado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}

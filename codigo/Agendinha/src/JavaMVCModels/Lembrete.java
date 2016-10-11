/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCModels;
import java.util.Date;

/**
 *
 * @author vinicius e gigik-adm
 */
public class Lembrete {
   private Date data;
   private String descricao;
   
   public Lembrete(Date data, String descricao) {
       this.data = data;
       this.descricao = descricao;
   }
   
   public Date getData(){
        return this.data;
   }
   
   public String getDescricao(){
        return this.descricao;
   }
   
   public void setDate(Date novaData) {
       this.data = novaData;
   }
   
   public void setDescricao(String novaDescricao) {
       this.descricao = novaDescricao;
   }
}

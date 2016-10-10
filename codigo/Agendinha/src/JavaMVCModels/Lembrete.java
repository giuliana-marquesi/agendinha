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
   
   private Date getData(){
        return this.data;
   }
   
   private String getDescricao(){
        return this.descricao;
   }
   
   private void setDate(Date novaData) {
       this.data = novaData;
   }
   
   private void setDescricao(String novaDescricao) {
       this.descricao = novaDescricao;
   }
}

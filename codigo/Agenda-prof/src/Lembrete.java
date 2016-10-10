import java.util.Date;
/**
 * Write a description of class Lembrete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lembrete
{
    private Date data;
    private String desc;
    
    public void setData(Date data){
        this.data = data;
    }     
    
    public void setData(String str){
        //como converter string em data em java
    }
     
    public void setDesc(String desc){
        this.desc = desc;
    }
    
    public String getData(){
        return data.toString();    
    }
    
    public String getDesc(){
        return desc;    
    }
}


import java.util.LinkedList;
import java.util.Date;
import java.util.Iterator;
/**
 * Write a description of class Agenda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agenda
{
    private LinkedList<Lembrete> lembretes;
    
    public Agenda(){
       lembretes = new LinkedList<Lembrete>();
    }
    
    public void incluir(String desc){
        Lembrete tmp = new Lembrete();
        tmp.setData(new Date() );
        tmp.setDesc(desc);
        lembretes.add( tmp );
        
    }
    
    public void incluir(Lembrete lembrete){
        lembretes.add(lembrete);    
    }
    
    public void imprimirTudo(){
        for( int i=0; i < lembretes.size(); i++ ){
            Lembrete tmp = lembretes.get(i);    
            String str = tmp.getDesc();
            System.out.println(str);
        }
        
    }
    
    public void imprimirTudo2(){
        for( Lembrete tmp  :  lembretes ){
            String str = tmp.getDesc();
            System.out.println(str);
        }
    }
    
    public void imprimirTudo3(){
        Iterator<Lembrete> it = lembretes.iterator();     
        while( it.hasNext() ){
            Lembrete tmp = it.next();
            String str = tmp.getDesc();
            System.out.println(str);
        }
    }
    
    public void procuraPalavra(String procura){
        Iterator<Lembrete> it = lembretes.iterator();
        while(it.hasNext()){
            Lembrete tmp = it.next();
            String str = tmp.getDesc();
            if(str.contains(procura)){
                System.out.println(str);
            }
        }
    
    }  
}

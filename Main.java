
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;
//Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..

public class Main {
    public static void main(String[] args) {
        
        Vector<String> vector =  new Vector<String>();
        /*
        Vectorler arraylistlerin içerisinde bulundurmadğı bir yapıyı barındırmaktadır Sycronized yapısı...Diğer projelerde detaylı uygulamalarla anlatmayı planlıyorum....
        bunun yanı sıra vector yapıalrı thread ler ile kullanıldığında arrayliste kıyasla daha güvenli fakat arrayliste kıyasla daha yavaş 
        Eğer performans sıkıntısı çekiyorsanız ve thread kullanmıyacaksanız arraylistleri tercih edebilirsiniz.
        Vectorler ile arraylistler bu konu dışında genel hatlar ile birbirlerine çok benzemektedir.
        */
        
        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");
        
       /* for (String s : vector) {
            //Vectorlerin basılması olayı arraylistlerde olduğu gibi 
            System.out.println(s);
        }*/
       
        
        /*ListIterator<String> iterator =  vector.listIterator();
        //ArrayList ve LinkedListlerde yaptığımız gibi Vectorler üzerinde de listItetator kullanabiliriz.
        while (iterator.hasNext()) {
            //Iterator üzerinde geinme işlemimiz
            System.out.println(iterator.next());
            
        }*/
        
       /* Enumeration<String> enumaration = vector.elements();
        //Iterator sınıfı gibi vectorlerin üzerinde gezinmemize yardımcı olan bir sınıf
        while (enumaration.hasMoreElements()) {
            
            System.out.println(enumaration.nextElement());
            
        }*/
        //System.out.println("İlk Eleman : " + vector.firstElement());
        //System.out.println("Son Eleman : " + vector.lastElement());
        
        Stack<String> stack = new Stack<String>();
        
        /*Veri Yapıları Derslerinde önemli bir yere sahip Arraylistler gibi depo sistemi var ilk giren en alta yerleşiyor ve sıralya üstüne veri alıyor...
        Çalışma Mantıkları LIFO-->> Son giren ilk çıkar mantığı ile çalışmaktadırlar.
        Oldukça Fazla kullanılan bir veri yapısıdır.Stacler sebeplerinden biri bu çalışma mekaniğidir.
        Stacler vectorleri extends ediyor.Syncronized anahtar kelimesine sahipler(Ortak olarak),
        add ile eleman ekleme işlemi yapılır fakat pro arenada push kullanılıyor.
        */
        
        
        System.out.println(stack.empty());

        
        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");
        
        /*for (String s : stack ){
            
            System.out.println(s);
            
        }*/
        
        /*Enumeration<String> enumeration = stack.elements();
        
        while (enumeration.hasMoreElements()) {
            
            System.out.println(enumeration.nextElement());
            
        }*/
        //System.out.println("Son eleman Çıkarılıyor : " + stack.pop());
        
        /*for (String s : stack ){
            
            System.out.println(s);
            
        }*/
        //System.out.println(stack.empty());
        
        while (!stack.empty()){
            
            System.out.println("Eleman Çıkarılıyor : " + stack.pop());
            
        }
        
        
        
        
    }
}

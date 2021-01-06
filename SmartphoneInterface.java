

package smartphoneinterface;

class Phone
{
    public void call(){System.out.println("phone is calling");}
    public void sms(){System.out.println("forward sms");}
}
interface Icamera
{
    void click();
    void record();
}
interface Imusic
{
    void playmusic();
    void stopmusic();
}
class SmartPhone extends Phone implements Icamera,Imusic
{
    public void videocall(){System.out.println("smartphone video calling ");}
    public void click(){System.out.println("click photo");}
    public void record(){System.out.println("record video");}
    public void playmusic(){System.out.println("Play music");}
    public void stopmusic(){System.out.println("Stop music");}
}

public class SmartphoneInterface {


    
    public static void main(String[] args) {
        // TODO code application logic here
        SmartPhone c1=new SmartPhone();
        Imusic c2=c1;
        Icamera c3=c1;
        c1.call();
        c1.sms();
        c3.click();
        c3.record();
        c1.videocall();
        c2.playmusic();
        c2.stopmusic();
      
    }
    
}

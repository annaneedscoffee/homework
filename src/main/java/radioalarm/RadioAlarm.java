package radioalarm;

public class RadioAlarm implements Radio, Alarm{


    @Override
    public void c() {
        System.out.println('c');
    }

    @Override
    public void d() {
        System.out.println('d');
    }

    @Override
    public void a() {
        System.out.println('a');
    }

    @Override
    public void b() {
        System.out.println('b');
    }
}

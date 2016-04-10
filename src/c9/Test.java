package c9;

/**
 * Created by SuSong on 2014/12/28 0028.
 */

class AA{
    public void a(){

    }

    protected void b(){


    }

    void c(){

    }

    private void d(){

    }
}

class BB extends AA{

    @Override
    public void a() {
        super.a();
    }

    @Override
    public void b() {
        super.b();
    }

    @Override
    protected void c() {
        super.c();
    }
}


public class Test{

}

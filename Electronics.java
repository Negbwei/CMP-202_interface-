public interface Electronics {

    boolean onORoff = false;
    boolean isonORoff;

    boolean (on)
    boolean  (off);

    default void Electronic(){
        if (onORoff){
            System.out.println("default");

        }
    }
}

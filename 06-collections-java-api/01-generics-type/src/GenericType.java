public class GenericType<S> {
    private S string;

    public void set(S string){
        this.string = string;
    }
    public S get(){
        return string;
    }
}

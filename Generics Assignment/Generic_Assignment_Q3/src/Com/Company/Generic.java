package Com.Company;

public class Generic<M> {
    public M[] swap(M[] a, int i, int j){
        M temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}

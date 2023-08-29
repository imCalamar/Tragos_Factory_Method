import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class sumarCuentaTragos extends RecursiveTask<Integer>{
    private static final int umbralDivision = 2;
    private int[] cuenta;
    private int start;
    private int end;

    public sumarCuentaTragos(int[] cuenta,int start,int cont){
        this.cuenta=cuenta;
        this.start=start;
        end=cont;

    }
    @Override
    protected Integer compute(){

        if(end-start<=umbralDivision){
        int  suma = 0;
        for(int i=start;i<end;i++){
            suma+=cuenta[i];
        }
        return suma;
    }else{
        int mid = (start + end) / 2;
        sumarCuentaTragos leftTask = new sumarCuentaTragos(cuenta, start, mid);
        sumarCuentaTragos rightTask = new sumarCuentaTragos(cuenta, mid, end);

        leftTask.fork();
        int rightResult = rightTask.compute();
        int leftResult = leftTask.join();

        return leftResult + rightResult;

    }
}
}


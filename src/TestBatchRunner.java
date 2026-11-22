public class TestBatchRunner {
    public static void main(String[] args){

        for(int i=1 ;i<=15;i++){
            if (i%3==0 && i%5==0){
                System.out.println("Test " + i + ": Smoke + Regression");
            }else if (i%3==0){
                System.out.println("Test " + i + ": Smoke");
            }else if(i%5==0){
                System.out.println("Test " + i + ": Regression");
            }else{
                System.out.println("Test" + i + ": Sanity");
            }
        }
    }
}

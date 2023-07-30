package LeetCodeAns;

public class Q277 {
    static int[][] graph = new int[][]{{1,0,1},{1,1,0},{0,1,1}};
    public static boolean knows(int a, int b){
        return graph[a][b] == 1;
    }
    public static int findCelebrity(int n) {
        int res = 0;
        for(int i = 0; i < n; i ++){
            if(knows(res,i)){
                res = i;
            }
        }
        for(int i = 0; i < n; i++){
            if(res != i){
                if(!(!knows(res,i) && knows(i,res))){
                    return -1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int res = findCelebrity(3);
        System.out.println(res);
    }
}

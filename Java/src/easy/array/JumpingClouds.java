package easy.array;

public class JumpingClouds {
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int jump = 0;
        for (int i = 0; i < c.length-1; i++) {
            if (c[i] == 1) continue;
            jump = i+2;
            if ( jump < c.length && c[jump] == 0){
                jumps++;
                i = jump - 1;
            } else {
                jumps++;
            }
        }
        return jumps;

    }

    public static void main(String[] args) {
        //int[] nums = new int[]{0,0,1,0,0,1,0};
        int[] nums = new int[]{0,0,0,0,1,0};
        System.out.println(JumpingClouds.jumpingOnClouds(nums));
    }
}

package aaa.bbb;


/**
 * @author lisainan
 * @since 2018-09-13
 */
public class Main {

    public static void main(String[] args) {
        int r = 80;
        int count = count(r, r, 0);
        System.out.println(count * 4 + 4);
    }

    private static int count(int r, int x, int count) {
        x --;
        if (x <= 0) {
            return count;
        }
        // 逆时针旋转
        int y = 0;
        for (;x > 0;x --) {
            for (;y < r;y ++) {
                if ((Math.sqrt(x) + Math.sqrt(y)) == Math.sqrt(r)) {
                    count ++;
                } else if ((Math.sqrt(x) + Math.sqrt(y) > Math.sqrt(r))) {
                    continue;
                }
            }
        }
        return count;
    }
}

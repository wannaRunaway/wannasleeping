package thinkingInJava;

class Myobject {
    String value1 = "not at all";
    private void functionOne(){

    }
    static String staticValueOne = "yup";
    static String staticValueTwo = "yup second";
    static private void staticFunctionOne(){

    }

    //程序中的短路现象
    public static void main(String[] args) {
        System.out.println(firstJudge()&&secondJudge()&&thirdJudge());
        System.out.println(firstJudge()&secondJudge()&thirdJudge());
        breakAndContinue();
        switchJudge();
        /**
         * firstJudge
         * secondJudge
         * false
         * firstJudge
         * secondJudge
         * thirdJudge
         * false
         *
         * && 短路与 只要有一个false,后面全部不执行，相当于短路
         * &  条件判断，条件里的代码全部执行
         * */
    }

    private static void switchJudge() {
        String message = "notme";
        switch (message){
            case "notme":
                System.out.println("notme");
                break;
            case "aa":
                break;
            default:break;
        }
    }

    private static void breakAndContinue() {
        for (int i = 0; i < 10; i++) {
            if (i==6) break;
            System.out.println("break current I is: "+i);
        }
        for (int i = 0; i < 10; i++) {
            if (i==6) continue;
            System.out.println("continue current I is: "+i);
        }
    }

    static boolean firstJudge(){
        System.out.println("firstJudge");
        return true;
    }

    static boolean secondJudge(){
        System.out.println("secondJudge");
        return false;
    }

    static boolean thirdJudge(){
        System.out.println("thirdJudge");
        return true;
    }
}

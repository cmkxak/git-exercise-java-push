public class CurrencyCnt {
    public static void main(String[] args) {
        int refund = 25400;

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        //25000원을 5만원으로 나누었을 때 몫,나머지
        //25000원을 각 화폐 단위로 나누었을 때 몫과 나머지를 출력하세요.
        //각 화폐 단위는 위와 같이 각각 변수로 선언 해주세요.

        System.out.printf("5만원권 %d장 나머지:%d\n", refund/curr50000, refund%curr50000);
        refund%=curr50000;
        System.out.printf("1만원권 %d장 나머지:%d\n", refund/curr10000, refund%curr10000);
        //5천원권은 1장만 나오도록 하고 싶다. 왜냐하면 25,000에서 2만원은 (1만원권 x 2)로 처리했기 때문이다.
        refund%=curr10000;

        System.out.printf("5천원권 %d장 나머지:%d\n", refund/curr5000, refund%curr5000);
        refund%=curr5000;

        System.out.printf("1천원권 %d장 나머지:%d\n", refund/curr1000, refund%curr1000);
        refund%=curr1000;

        System.out.printf("500원 %d개 나머지:%d\n", refund/curr500, refund%curr500);
        refund%=curr500;

        System.out.printf("100원 %d개 나머지:%d\n", refund/curr100, refund%curr100);
        refund%=curr100;

        System.out.printf("50원 %d개 나머지:%d\n", refund/curr50, refund%curr50);
        refund%=curr50;

        System.out.printf("10원 %d개 나머지:%d\n", refund/curr10, refund%curr10);
        refund%=curr10;
    }
}

public class Buy {

    public static void main(String[] args) {
        int money = 100000;
        int bitcoin_price = 50;
        int ethereum_price = 25;
        int litecoin_price = 10;
        System.out.println("With 100000$ you can buy:" + money / ethereum_price +
                "Bitcoins," + money / bitcoin_price+
                "Ethereum and," + money / litecoin_price + "Litecoins");
    }
}

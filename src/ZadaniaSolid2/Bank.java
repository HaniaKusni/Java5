package ZadaniaSolid2;

    public class Bank {
        public String nazwa;
        public String oprocentowanie;
        public String czasSplaty;
        public String ryzyko;
        public String status;

        public Bank(String nazwa) {
            this.nazwa = nazwa;
        }
        public Bank(String nazwa, String oprocentowanie) {
            this(nazwa);
            this.oprocentowanie = oprocentowanie;
        }
        public Bank(String nazwa, String oprocentowanie, String czasSplaty) {
            this(nazwa, oprocentowanie);
            this.czasSplaty = czasSplaty;
        }
        public Bank(String nazwa, String oprocentowanie, String czasSplaty, String ryzyko) {
            this(nazwa, oprocentowanie, czasSplaty);
            this.ryzyko = ryzyko;
        }
        public Bank(String nazwa, String oprocentowanie, String czasSplaty, String ryzyko, String status) {
            this(nazwa, oprocentowanie, czasSplaty, ryzyko);
            this.status = status;
        }
    }


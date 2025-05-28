import java.util.*;

class bank_management {

    Scanner sc = new Scanner(System.in);
    String name, type, accno;
    long num;
    int age;
    int password;
    double balance, amount;
    double amount1, loanamt, A;

    void enter() {

        System.out.println();
        System.out.println("PLEASE LOGIN TO PORTAL");
        for (int i = 0; i < 10; i++) {
            System.out.println("================================================================");
            System.out.println("ENTER PASSWORD IN FORM OF PIN:");
            System.out.println("**PASSWORD MUST BE IN NUMBER NOT IN CHARACTERS OR LETTERS**");
            System.out.println("====================================================================");
            password = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if (password == 1107) { // 1107 IS DEFAULT PASSWORD FOR LOGIN TO PORTAL
                System.out.println("=======================");
                System.out.println("WELCOME");
                System.out.println("ENTER USER  DETAIL:");
                System.out.println("=======================");

                System.out.println("ENTER THE USER NAME:");
                name = sc.nextLine();
                boolean flag = false;
                System.out.println("ENTER THE USER ACCOUNT TYPE:SAVE OR CURRENT");
                type = sc.nextLine();
                do {
                    System.out.println("ENTER ACCOUNT NUMBER: IN DIGITS ONLY : LENGTH REQUIRED [6]");
                    accno = sc.nextLine();
                    if (accno.length() == 6) {

                        for (int j = 0; j < accno.length(); j++) {
                            if (accno.charAt(j) >= '0' && accno.charAt(j) <= '9') {
                                System.out.println("DONE");
                                flag = true;
                                break;
                            } else {
                                flag = false;
                                System.out.println("INVALID FORMAT TRY AGAIN");
                                break;
                            }
                        }
                    }
                } while (flag == false);

                System.out.println("ENTER USER MOBILE NUMBER:");
                num = sc.nextLong();

                System.out.println("ENTER USER CURRENT BALANCE:");
                balance = sc.nextDouble();

                break;
            } else {
                System.out.println("REENTER THE PASSWORD:");
            }
        }
    }

    void deposit() {

        System.out.println("=============");
        System.out.println("DEPOSIT MONEY");
        System.out.println("=============");
        A = balance;

        System.out.println("ENTER AMOUNT USER WANT TO DIPOSIT:");
        amount = sc.nextDouble();

        balance = balance + amount;

        System.out.println("NOW CURRENT BALANCE IS:" + balance);
        System.out.println("THANK YOU");
    }

    void withdraw() {

        System.out.println("==============");
        System.out.println("WITHDRAW MONEY");
        System.out.println("==============");
        A = balance;

        System.out.println("ENTER AMOUNT USER WANT TO WITHDRAW:");
        amount1 = sc.nextDouble();

        if (balance > amount1) {

            balance = balance - amount1;
            System.out.println("WITHDRAW OF " + amount1 + "/- AMOUNT IS SUCCESSFULLY DONE");
            System.out.println("NOW CURRENT BALANCE IS:" + balance);
            System.out.println("THANK YOU");
        } else {
            System.out.println("USER DOESN'T HAVE SUFFICIENT AMOUNT TO WITHDRAW");
            System.out.println("THANK YOU");
        }
    }

    void old_print() {
        System.out.println("============");
        System.out.println("USER DETAILS");
        System.out.println("============");
        System.out.println();
        System.out.println("NAME OF ACCOUNT HOLDER::" + name);
        System.out.println("ACCOUNT TYPE:" + type);
        System.out.println("ACCOUNT NUMBER:" + accno);
        System.out.println("MOBILE NUMBER:" + num);
        System.out.println("USER AMOUNT BEFORE ACTION:" + A);
        System.out.println("CURRENT BALANCE:" + balance);
        System.out.println("THANK YOU");
    }

    void print() {

        System.out.println();
        System.out.println("=======================");
        System.out.println("NAME:" + name);
        System.out.println("ACCOUNT:" + type);
        System.out.println("ACCOUNT NUMBER:" + accno);
        System.out.println("MOBILE NUMBER::" + num);
        System.out.println("CURRENT BALANCE:" + balance);
        System.out.println("THANK YOU");
        System.out.println("=======================");
        System.out.println();
    }

    void pancard() {

        System.out.println("====================");
        System.out.println("PAN CARD APPLICATION");
        System.out.println("====================");

        System.out.println("ENTER BIRTH YEAR:");
        age = sc.nextInt();
        int ans = 2023 - age;

        if (ans >= 18) {
            System.out.println("===YOU ARE ELIGIBLE FOR PAN CARD===");
        } else {
            System.out.println("YOU ARE NOT ELIGIBLE FOR PAN CARD NOW===");
        }
    }

    void loan_conditions() {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("CONDITIONS FOR LOAN APPLICATION");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("USER MUST HAVE ACCOUNT IN RESPECTIVE BANK");
        System.out.println("USER HAVE TO PAY INEREST ON TIME");
        System.out.println("INTEREST RATE WILL BE 3% PER YEAR");
        System.out.println("MAXIMUM AMOUNT FOR LOAN IS 500000/-");
        System.out.println("AFTER 1 YEAR USER HAVE TO GIVE AMOUNT BAK WITH RESPECTIVE INTEREST");
        System.out.println("IF USER DON'T PAY RESPECTIVE AMOUNT ON TIME THEN STRICT ACTION WILL BE TAKEN");
        System.out.println("ALL TERMS AND CONDITIONS WILL BE APPLIED TO USER");
        System.out.println("THANK YOU");
        System.out.println("===============================================================================");
    }

    void loan() {

        System.out.println("======================");
        System.out.println("WELCOME TO LOAN PORTAL");
        System.out.println("======================");

        System.out.println("ENTER REQUIRED AMOUNT FOR LOAN:");
        loanamt = sc.nextDouble();

        if (loanamt <= 500000) {
            System.out.println("AMOUNT VALIDATION SUCCESSFULLY DONE");
            System.out.println("INTEREST RATE WILL BE 3%");

            double interest = (loanamt * 12 * 0.03);
            loanamt = loanamt + interest;

            System.out.println("LOAN INTEREST AFTER YEAR:" + interest);
            System.out.println("USER HAVE TO GIVE TOTAL AMOUNT " + loanamt + "/- AFTER YEAR COMPLETE:");
            System.out.println("THANK YOU");

        } else {
            System.out.println("NOT VALID AMOUNT FOR LOAN");
            System.out.println("THANK YOU");
        }
    }

    void setname(String name) {
        this.name = name;
    }
}

class run {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("|| WELCOME TO BANK PORTAL ||");
        System.out.println("============================");

        System.out.println("================");
        System.out.println("ENTER USER COUNT");
        int n = sc.nextInt();
        bank_management bank[] = new bank_management[n];

        for (int i = 0; i < n; i++) {
            bank[i] = new bank_management();
            bank[i].enter();
        }
        int X;
        do {
            System.out.println();
            System.out.println("===========================================");
            System.out.println("CHOOSE OPTION AS PER GIVEN BELOW TO ACTION");
            System.out.println("===========================================");
            System.out.println("PRESS [1] FOR CHECK STATUS OF ACCOUNT BY ENTER ACCOUNT NUM :");
            System.out.println("PRESS [2] FOR DEPOSIT MONEY: ");
            System.out.println("PRESS [3] FOR WITHDRAW MONEY:");
            System.out.println("PRESS [4] TO CHECK ELIGIBILITY FOR PAN CARD");
            System.out.println("PRESS [5] FOR LOAN APPLICATION");
            System.out.println("PRESS [6] FOR DISPLAY ALL ACCOUNTS DETAILS");
            System.out.println("PRESS [7] FOR MODIFY NAME BY USING ACCOUNT NUMBER");
            System.out.println("PRESS [8] FOR EXIT");
            System.out.println("============================================");
            System.out.println();
            System.out.println("ENTER OPTION:");
            X = sc.nextInt();
            sc.nextLine();

            switch (X) {

                case 1:
                    System.out.println("ENTER ACCOUNT NUMBER:");
                    String I = sc.nextLine();
                    boolean L = false;
                    for (int i = 0; i < n; i++) {
                        if (bank[i].accno.equals(I)) {
                            bank[i].print();
                            L = true;
                            break;
                        }
                    }
                    if (!L) {
                        System.out.println("NOT FOUND");
                    }
                    break;

                case 2:

                    System.out.println("ENTER ACCOUNT NUMBER:");
                    String a = sc.nextLine();
                    boolean f = false;
                    for (int i = 0; i < n; i++) {

                        if (bank[i].accno.equals(a)) {
                            bank[i].deposit();
                            bank[i].old_print();
                            f = true;
                            break;
                        }
                    }
                    if (!f) {
                        System.out.println("NOT FOUND");
                    }
                    break;

                case 3:

                    System.out.println("ENTER ACCOUNT NUMBER:");
                    String b = sc.nextLine();
                    boolean e = false;
                    for (int i = 0; i < n; i++) {
                        if (bank[i].accno.equals(b)) {
                            bank[i].withdraw();
                            bank[i].old_print();
                            e = true;
                            break;
                        }
                    }
                    if (!e) {
                        System.out.println("not found");
                    }
                    break;

                case 4:

                    System.out.println("ENTER ACCOUNT NUMBER :");
                    String c = sc.nextLine();
                    boolean z = false;
                    for (int i = 0; i < n; i++) {
                        if (bank[i].accno.equals(c)) {
                            bank[i].pancard();
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        System.out.println("NOT FOUND");
                    }
                    break;

                case 5:

                    System.out.println("ENTER ACCOUNT NUMBER:");
                    String l = sc.nextLine();
                    boolean w = false;
                    for (int i = 0; i < n; i++) {

                        if (bank[i].accno.equals(l)) {
                            bank[i].loan_conditions();
                            System.out.println("WANT TO APPLY FOR LOAN APPLICATION ?");
                            System.out.println("'Y' FOR YES AND 'N' FOR NO");
                            char k = sc.next().charAt(0);
                            if (k == 'Y') {
                                bank[i].loan();
                            } else {
                                System.out.println("THANK YOU");
                            }
                            w = true;
                            break;
                        }
                    }
                    if (!w) {
                        System.out.println("NOT FOUND");
                    }
                    break;

                case 6:

                    System.out.println("HERE ARE ALL DETAILS :");
                    for (int i = 0; i < n; i++) {
                        bank[i].print();
                        System.out.println();
                    }
                    break;

                case 7:

                    System.out.println("ENTER ACCOUNT NUMBER TO CHANGE NAME:");
                    String ac = sc.nextLine();
                    boolean op = false;
                    for (int i = 0; i < n; i++) {
                        if (bank[i].accno.equals(ac)) {
                            System.out.println("ENTER NEW NAME:");
                            String newname = sc.nextLine();
                            bank[i].setname(newname);
                            System.out.println(("NAME MODIFICATION HAS DONE SUCCESSFULLY"));
                            System.out.println();
                            bank[i].print();
                            op = true;
                            break;
                        }
                    }
                    if (!op) {
                        System.out.println("NOT FOUND");
                    }
            }
        } while (X != 8);
    }
}
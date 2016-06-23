package automatos_trabalho2;

public class AFD {

    public AFD() {
    }

    public int funcaoDeTransicao(int Q, char x) {
        switch (Q) {
            case 0:
                if (x == 'a') {
                    return 1;
                } else {
                    return 0;
                }
            case 1:
                if (x == 'a') {
                    return 2;
                } else {
                    return 5;
                }
            case 2:
                if (x == 'a') {
                    return 3;
                } else {
                    return 4;
                }
            case 3:
                if (x == 'a') {
                    return 3;
                } else {
                    return 4;
                }
            case 4:
                if (x == 'a') {
                    return 6;
                } else {
                    return 7;
                }
            case 5:
                if (x == 'a') {
                    return 6;
                } else {
                    return 7;
                }
            case 6:
                if (x == 'a') {
                    return 2;
                } else {
                    return 5;
                }
            case 7:
                if (x == 'a') {
                    return 1;
                } else {
                    return 0;
                }
            default:
                return -1;
        }
    }

    public int funcaoEstendida(int Q, String w) {
        if (w.length() == 1) {
            return funcaoDeTransicao(Q, w.charAt(0));
        }
        String temp = "" + w.charAt(w.length() - 1);//pegando ultimo caractere
        String resto = w.substring(0, w.length() - 1); //separando o resto para a 

        return funcaoEstendida(funcaoEstendida(Q, resto), temp);
    }

    public boolean funcaoEstendida(String w) {
        int r = funcaoEstendida(0, w);
        switch (r) {
            case 3:
            case 4:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }
}

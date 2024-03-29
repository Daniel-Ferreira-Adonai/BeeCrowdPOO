package BEE1050;

import java.util.ArrayList;
import java.util.List;

public class Ddd {
    private List<String> ddd = new ArrayList<>();

    Ddd(){

        init();
        ddd.add(55,"Brasilia");
        ddd.add(65,"Salvador");
        ddd.add(11,"Sao Paulo");
        ddd.add(20,"Rio de Janeiro");
        ddd.add(29,"Juiz de Fora");
        ddd.add(19,"Campinas");
        ddd.add(27,"Vitoria");
        ddd.add(31,"Belo Horizonte");
    }

    public void init(){
        for (int i = 0; i < 100; i++) {
            ddd.add(null);
        }
    }

    public void mostra() {
        for (String e : ddd) {
            System.out.println(e);
        }
    }
    public String dddToDestination(int dddCode) {
        String destination = ddd.get(dddCode);
        return destination != null ? destination : "DDD nao cadastrado";
    }
}

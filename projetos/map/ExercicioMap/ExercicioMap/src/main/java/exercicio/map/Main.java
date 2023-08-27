package exercicio.map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");

        Map<String, Integer> estadosNe = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(estadosNe);

        System.out.println("Substitua a população do RN por 3.534.165");

        estadosNe.put("RN",3534165);

        System.out.println(estadosNe);

        System.out.println("Confira se o estado PB está no dicionário: " + estadosNe.containsKey("PB") + "caso não adicione");

        estadosNe.put("PB", 4039277);

        System.out.println(estadosNe);

        System.out.println("Exiba a população do PE: " + estadosNe.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");

        Map<String, Integer> estadosNe1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534165);
            put("PB", 4039277);
        }};

        System.out.println(estadosNe1);

        System.out.println("Exiba os estados em ordem alfabetica: ");

        Map<String, Integer> estadosNe2 = new TreeMap<>(estadosNe1);
        System.out.println(estadosNe2);



        Integer estadoMenosPopuloso = Collections.min(estadosNe.values());
        Set<Map.Entry<String, Integer>> entries = estadosNe.entrySet();
        String estadoComMenos = "";

        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(estadoMenosPopuloso)){
                estadoComMenos = entry.getKey();
            }
        }

        System.out.println("Exiba o estados com menor população: " + estadoComMenos + " - " + estadoMenosPopuloso );

        Integer estadoMaisPopuloso = Collections.max(estadosNe.values());
        Set<Map.Entry<String, Integer>> entries1 = estadosNe.entrySet();
        String estadoComMais = "";

        for(Map.Entry<String, Integer> entry : entries1){
            if(entry.getValue().equals(estadoMaisPopuloso)){
                estadoComMais = entry.getKey();
            }
        }

        System.out.println("Exiba o estado com maior população: " + estadoComMais + " - " + estadoMaisPopuloso);

        Iterator<Integer> iterator = estadosNe.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("Exiba a soma das populações dos estados: " + soma);

        System.out.println("Exiba a média das populações dos estados: " + (soma/estadosNe.size()));

        System.out.println("Remova os estados com a população menor que 4M: ");

        Iterator<Integer> iterator1 = estadosNe.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 4000000){
                iterator1.remove();
            }
        }

        System.out.println(estadosNe);

        System.out.println("Apague o dicionario");

        estadosNe.clear();

        System.out.println("Confira se o dicionario está vazio: " + estadosNe.isEmpty());

    }


}

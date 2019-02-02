package SDA;

import java.util.*;

public class FIrm {
    private static int id = 446;
    private Map<Integer, Employe> mapa = new HashMap<>();

    public void addEmploye(Employe employe){
        mapa.put(id++, employe);
    }

    public List<Employe> getEmployeById(int id){
        List<Employe> employeList = new ArrayList<>();
        List<Character> idList = new ArrayList<Character>();
        List<Character> idTmpList = new ArrayList<Character>();
        char[] charId = String.valueOf(id).toCharArray();
        char[] charIdTmp;

        for(int idTmp : mapa.keySet()){
            idList.clear();
            idTmpList.clear();
            charIdTmp = String.valueOf(idTmp).toCharArray();

            for(int i = 0; i<charId.length; i++){
                idList.add(charId[i]);
            }

            for(int i = 0; i<charIdTmp.length; i++){
                idTmpList.add(charIdTmp[i]);
            }

            if(idList.size() == idTmpList.size()) {
                for (Character character : idList) {
                    for (Character characterTmp : idTmpList) {
                        if(character.equals(characterTmp)){
                            idTmpList.remove(character);
                            break;
                        }
                    }
                }
                if(idTmpList.isEmpty()){
                    employeList.add(mapa.get(idTmp));
                }
            }

        }
        return employeList;
    }
}

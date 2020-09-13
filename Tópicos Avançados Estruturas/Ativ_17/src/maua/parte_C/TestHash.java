package maua.parte_C;

public class TestHash {
    public static void main(String[] args) {
        Integer[] tabChaves = new Integer[] { 23, 45, 77, 11, 33, 49, 10, 4, 89, 14} ;
        Integer[] tabHash = new Integer[10];
        for (int i=0; i<tabChaves.length; i++ ) {
            Integer chave = tabChaves[i];
            Integer indiceHash = hash(chave);
            System.out.println("Chave = " + chave +
                    " mapeada para hascode = " + indiceHash);
            if (tabHash[indiceHash] == null )
                tabHash[indiceHash] = tabChaves[i];
            else {
                System.out.println("** Colisao no slot da Tabela Hash ** " );
                tabHash[rehashing(tabHash,indiceHash)] = tabChaves[i];
            }

        }
        for (int i = 0 ; i < tabHash.length; i++)
            System.out.print ("Slot " + i + " ---> " +
                        tabHash[i]+ '\n');
    }
    public static Integer hash(Integer key) {
        return key%10;
    }

    public static Integer rehashing(Integer[] tabHash, Integer indice) {
        for (Integer i = indice + 1 ; i < tabHash.length ; i ++) {
            if (tabHash[i] == null )
                return i;
        }
        for (Integer i = 0 ; i < indice ; i++ ) {
            if (tabHash[i] == null )
                return i;
        }
        return null;
    }

}

package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
/**
 * 
 * Classes nesse arquivo não condizem com a especificação da documentação
 * (e a mesma esta desenhada erradamente)
 * (Classe Troco não é, nem deveria ser uma abstração de Iterator)
 * [COMISSÃO]
 */

class Troco {

    protected PapelMoeda[] papeisMoeda;
    
    /**
     * Construtor com lógica e estruturas desnecessarias,
     * loops poderiam ser organizados de outra forma oucompletamente removidos
     * Algoritmo usado não garante a resolução do problema, e seu resultado não
     * condiz com as espectativas
     * estruturas de dados usadas não são adequadas para a situação em questão.
     * [COMPUTAÇÃO]
     * [DESEMPENHO]
     * [DADOS]
     * [EXESSO]
     */

    public Troco(int valor) {
         // estrutura de dados errada. Não possibilita alteração no tamanho do vetor[DADOS]
       
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        /**
         * Variavel de controle (valor) não alterada durante o loop
         * Programatrava aqui e não segue pois loop não retorna.
         * [CONTROLE][DESEMPENHO]
         */
        while (valor % 100 != 0) {
            count++;
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;
        /**
         * Variável count sempre é zerada. seu valor não passa adiante.
         * [COMPUTAÇÃO]
         */
        while (valor % 50 != 0) {
            count++;
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 20 != 0) {
            count++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 10 != 0) {
            count++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 5 != 0) {
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 2 != 0) {
            count++;
        }
        /**
         * Posição 1 do vetor tem seu valor resetado.
         * [COMPUTAÇÃO]
         */
        papeisMoeda[1] = new PapelMoeda(2, count);
         /**
         * vetor papeisMoeda não inicializado corretamente.
         * O mesmo tem 6 posições e somente 5 foram usadas/inicialisadas
         * 
         * posição 0 é null
         * 
         * [COMPUTAÇÃO][DADOS]
         */
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {
        /**
         * Variavel Troco dispensável uma vez que os atributos da instancia usada estão
         * no mesmo escopo deste iterator.
         * [DESEMPENHO]
         * [EXESSO]
         */

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
               /**
             * Iteração errada, contador i sobe, e sai do escopo do array. loop não retorna.
             * [COMPUTAÇÃO]
             */
            /**
             * Implementação do método hasNext() errada!
             * Não se percorre o array, guarda-se a posição atual.
             * [COMPUTAÇÃO]
             * [DESEMPENHO]
             */
        
            for (int i = 6; i >= 0; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        /**
         * 
         * Implementação completamente errada.
         * [COMPUTAÇÃO]
         * [DADOS]
         * [DESEMPENHO]
         * 
         */
        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}

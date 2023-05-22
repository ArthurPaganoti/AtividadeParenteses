public class StackDinamica {
    
    private CelulaPilha top;

    public void push(String nome){
        CelulaPilha novaCelula = new CelulaPilha();
        novaCelula.setDado(nome);
        novaCelula.setAnterior(this.top);
        this.top = novaCelula;
    }

    public void pop(){
        if(!isEmpty()){
            System.out.println("Retirando elemento da pilha: " + this.top.getDado());
            this.top = this.top.getAnterior();
        } else {
            System.out.println("Pilha Vazia!!!");
        }
    }

    public boolean isEmpty(){
        return (this.top == null);
    }

    public int sizePilha(){
        CelulaPilha p = this.top;
        int cont = 0;
        while(p != null){
            p = p.getAnterior();
            cont++;
        }
        return cont;
    }

    public void imprimir(){
        CelulaPilha p = this.top;
        if(isEmpty()){
            System.out.println("Pilha Vazia!!!");
        } else {
            while(p != null){
                System.out.println("Nome na pilha: " + p.getDado());
                p = p.getAnterior();
            }
        }
    }

    public CelulaPilha top(){
        if(isEmpty()){
            System.out.println("Pilha Vazia!!!");
            return null;
        } else {
            System.out.println("Nome no topo da Pilha: " + top.getDado());
            return this.top;
        }
    }

    public static boolean verificarParentesses(String expressao) {
        StackDinamica pilha = new StackDinamica();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '{' || caractere == '[' || caractere == '(') {
                pilha.push(String.valueOf(caractere));
            } else if (caractere == '}' || caractere == ']' || caractere == ')') {
                if (pilha.isEmpty()) {
                    return false;
                } else {
                    CelulaPilha topo = pilha.top();
                    if ((caractere == '}' && !topo.getDado().equals("{")) ||
                        (caractere == ']' && !topo.getDado().equals("[")) ||
                        (caractere == ')' && !topo.getDado().equals("("))) {
                        return false;
                        }
                    }
                }
            }
        return pilha.isEmpty();
        }
    }
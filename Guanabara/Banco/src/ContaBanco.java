public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){

        this.setTipo(t);
        setStatus(true);

        if(t.equals("cc")){
            this.setSaldo(50);
        }
        else if(t.equals("cp")){
            this.setSaldo(150);
        }

    }

    public void dados(){
        System.out.println(getDono());
        System.out.println(getNumConta());
        System.out.println(getTipo());
        System.out.println(getSaldo());
        System.out.println(isStatus());
    }

    public void fecharConta(){

        if(this.getSaldo() > 0){
            System.out.println("Ipossível fechar a conta, pois ainda há saldo");
        }

        else if(this.getSaldo() < 0){
            System.out.println("A conta está em débito");
        }

        else{
            setStatus(false);
            System.out.println("A conta foi fechada!");
        }

    }

    public void depositar(float v){
        if(isStatus()){
            this.setSaldo(this.getSaldo() + v);
        }
        else{
            System.out.println("Impossivel sacar");
        }
    }

    public void sacar(float v){

        if(isStatus()){

            if(saldo >= v){
                setSaldo(getSaldo() - v);
            }

            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("A conta está fechada");
        }
    }

    public void pagarMensal(){
        int v = 0;

        if (getTipo().equals("cc")){
            v = 12;
        }

        else if (getTipo().equals("cp")){
            v=20;
        }

        if (isStatus()){
            if (saldo >= v){
                this.setSaldo(this.getSaldo() - v);
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Impossível pagar, a conta está fechada");
        }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
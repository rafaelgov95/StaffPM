package az.main;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PolicialPojo implements Serializable {

    private int id;
    private String nome;
    private int idade;
    private int vcorrida;
    private int vapoio;
    private int vbarra;
    private int vabdom;
    private double mcorrida;
    private double mapoio;
    private double mbarra;
    private double mabdom;
//    private Date Date;
    private double mediafinal;
    private String date;
    StaffHomem Homem = new StaffHomem();

    public PolicialPojo() {

        this.date = getDateTime();

        System.out.println(this.date);
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = new Date();
        return dateFormat.format(data);
    }

    public PolicialPojo(int id, String nome, int idade, int vcorrida, int vapoio, int vbarra, int vabdom, int mcorrida, int mapoio, int mbarra, int mabdom, int mediafinal, String date) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.vcorrida = vcorrida;
        this.vapoio = vapoio;
        this.vbarra = vbarra;
        this.vabdom = vabdom;
        this.mcorrida = Homem.Correr(mabdom, idade);
        this.mapoio = Homem.Apio(mapoio, idade);
        this.mbarra = Homem.barra(mbarra, idade);
        this.mabdom = Homem.abdom(mabdom, idade);
        this.mediafinal = ((this.mcorrida + this.mapoio + this.mbarra + this.mabdom) / 3);
        this.date = date;
        System.out.println(this.date);
    }
//
//    public PolicialPojo(int id, String nome, int idade, int vcorrida, int vapoio, int vabdom) {
//        this.id = id;
//        this.nome = nome;
//        this.vcorrida = vcorrida;
//        this.vapoio = vapoio;
//
//        this.vabdom = vabdom;
//
//    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVcorrida() {
        return vcorrida;
    }

    public void setVcorrida(int vcorrida) {
        this.vcorrida = vcorrida;
    }

    public int getVapoio() {
        return vapoio;
    }

    public void setVapoio(int vapoio) {
        this.vapoio = vapoio;
    }

    public int getVbarra() {
        return vbarra;
    }

    public void setVbarra(int vbarra) {
        this.vbarra = vbarra;
    }

    public int getVabdom() {
        return vabdom;
    }

    public void setVabdom(int vabdom) {
        this.vabdom = vabdom;
    }

    public double getMcorrida() {
        return mcorrida;
    }

    public void setMcorrida(double mcorrida) {
        this.mcorrida = mcorrida;
    }

    public double getMapoio() {
        return mapoio;
    }

    public void setMapoio(double mapoio) {
        this.mapoio = mapoio;
    }

    public double getMbarra() {
        return mbarra;
    }

    public void setMbarra(double mbarra) {
        this.mbarra = mbarra;
    }

    public double getMabdom() {
        return mabdom;
    }

    public void setMabdom(double mabdom) {
        this.mabdom = mabdom;
    }

    public double getMediafinal() {
        return mediafinal;
    }

    public void setMediafinal(double mediafinal) {
        this.mediafinal = mediafinal;
    }

    public StaffHomem getHomem() {
        return Homem;
    }

    public void setHomem(StaffHomem Homem) {
        this.Homem = Homem;
    }

}

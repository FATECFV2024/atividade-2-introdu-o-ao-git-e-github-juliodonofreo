public class Aluno {

    private String nome;
    private String rgm;
    private int idade;
    private String github_url;
    private String linkedin_url;

    public Aluno() {
    }

    public Aluno(String nome, String rgm, int idade, String github_url, String linkedin_url) {
        this.nome = nome;
        this.rgm = rgm;
        this.idade = idade;
        this.github_url = github_url;
        this.linkedin_url = linkedin_url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGithub_url() {
        return github_url;
    }

    public void setGithub_url(String github_url) {
        this.github_url = github_url;
    }

    public String getLinkedin_url() {
        return linkedin_url;
    }

    public void setLinkedin_url(String linkedin_url) {
        this.linkedin_url = linkedin_url;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                "\nrgm: " + rgm +
                "\nidade: " + idade +
                "\ngithub: " + github_url +
                "\nlinkedin: " + linkedin_url;
    }
}

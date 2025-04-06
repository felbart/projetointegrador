public class SensorData {
    private float temperatura;
    private int luminosidade;
    private int umidadeSolo;

    public SensorData(float temperatura, int luminosidade, int umidadeSolo) {
        this.temperatura = temperatura;
        this.luminosidade = luminosidade;
        this.umidadeSolo = umidadeSolo;
    }

    public String avaliarTemperatura() {
        if (temperatura < 18) return "Frio";
        else if (temperatura <= 26) return "Ideal";
        else return "Calor";
    }

    public String avaliarLuz() {
        return (luminosidade < 400) ? "Pouca luz" : "Luz boa";
    }

    public String avaliarSolo() {
        return (umidadeSolo < 500) ? "Seco - Regar" : "Solo úmido";
    }

    public void exibirResumo() {
        System.out.println("Temperatura: " + temperatura + " C (" + avaliarTemperatura() + ")");
        System.out.println("Luminosidade: " + luminosidade + " (" + avaliarLuz() + ")");
        System.out.println("Umidade do Solo: " + umidadeSolo + " (" + avaliarSolo() + ")");
    }
}

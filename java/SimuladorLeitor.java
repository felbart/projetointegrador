public class SimuladorLeitor {
    public static void main(String[] args) {
        // Simulando uma leitura recebida do Arduino
        String linhaRecebida = "Temp: 25.4 C | Luz: 682 | Solo: 390";
        System.out.println("Simulando recebimento da seguinte linha:");
        System.out.println(linhaRecebida);
        System.out.println();

        try {
            
            String[] partes = linhaRecebida.split("\\|");

            float temperatura = Float.parseFloat(partes[0].split(":")[1].replace("C", "").trim());
            int luz = Integer.parseInt(partes[1].split(":")[1].trim());
            int solo = Integer.parseInt(partes[2].split(":")[1].trim());

            SensorData dados = new SensorData(temperatura, luz, solo);
            dados.exibirResumo();

        } catch (Exception e) {
            System.out.println("Erro ao interpretar a linha simulada.");
        }
    }
}

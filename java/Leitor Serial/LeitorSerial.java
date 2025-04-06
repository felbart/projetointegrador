import com.fazecast.jSerialComm.SerialPort;
import java.util.Scanner;

public class LeitorSerial {
    public static void main(String[] args) {
        // Lista portas disponíveis
        SerialPort[] ports = SerialPort.getCommPorts();
        System.out.println("Portas disponíveis:");
        for (int i = 0; i < ports.length; i++) {
            System.out.println("[" + i + "] " + ports[i].getSystemPortName());
        }

        // Escolhe a primeira porta 
        SerialPort arduino = ports[0];
        arduino.setBaudRate(9600);

        if (arduino.openPort()) {
            System.out.println("Conectado à porta " + arduino.getSystemPortName());
        } else {
            System.out.println("Falha ao abrir a porta.");
            return;
        }

        Scanner scanner = new Scanner(arduino.getInputStream());

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println("Recebido: " + linha);

            try {

                String[] partes = linha.split("\\|");

                float temperatura = Float.parseFloat(partes[0].split(":")[1].replace("C", "").trim());
                int luz = Integer.parseInt(partes[1].split(":")[1].trim());
                int solo = Integer.parseInt(partes[2].split(":")[1].trim());

                SensorData dados = new SensorData(temperatura, luz, solo);
                dados.exibirResumo();
                System.out.println("---");
            } catch (Exception e) {
                System.out.println("Erro ao processar linha: " + linha);
            }
        }

        scanner.close();
        arduino.closePort();
    }
}

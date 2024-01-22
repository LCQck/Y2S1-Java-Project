package partA.a1;

public class DataPacket {

    public static String stringToHex(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            stringBuilder.append(String.format("%02x", (int) ch));
        }
        return stringBuilder.toString();
    }

    public static String convertToDataPacket(String data) {
        String hexData = stringToHex(data);
        String crc = CRC16.getCRC(hexData);
        return "AA" + String.format("%02X", data.length()) + hexData + crc + "BB";
    }

    public static String getDataFromDataPacket(String hexData) {
        // Add validation and extraction logic here
        return hexData;
    }
}



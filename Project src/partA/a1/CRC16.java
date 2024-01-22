package partA.a1;

public class CRC16 {

    public static int getCRC(byte[] bytes) {
        int crc = 0xFFFF; // initial value
        for (byte b : bytes) {
            crc = (crc ^ b) & 0xFF;
            for (int i = 0; i < 8; i++) {
                if ((crc & 0x0001) != 0) {
                    crc = (crc >> 1) ^ 0xA001;
                } else {
                    crc = crc >> 1;
                }
            }
        }
        return crc;
    }

    public static String getCRC(String hexData) {
        byte[] data = hexStringToByteArray(hexData);
        return Integer.toHexString(getCRC(data));
    }

    private static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}

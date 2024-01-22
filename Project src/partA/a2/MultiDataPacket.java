package partA.a2;

import partA.a1.CRC16;
import partA.a1.DataPacket;

public class MultiDataPacket extends DataPacket {

    public static String[] stringToHex(String[] strArr) {
        String[] hexArr = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            hexArr[i] = stringToHex(strArr[i]);
        }
        return hexArr;
    }

    public static String convertToHexDataPacket(String[] data) throws DataPacketException {
        StringBuilder hexDataPacket = new StringBuilder();
        for (String s : data) {
            String hexData = stringToHex(s);
            String crc = CRC16.getCRC(hexData);
            hexDataPacket.append("AA");
            hexDataPacket.append(String.format("%02X", s.length()));
            hexDataPacket.append(hexData);
            hexDataPacket.append(crc);
            hexDataPacket.append("BB");
        }
        return hexDataPacket.toString();
    }

    public static String[] getMultiDataFromHexDataPacket(String hexData) throws DataPacketException {
        // You need to implement the validation and splitting logic here
        // Throw DataPacketException if validation fails
        // For now, this is a placeholder returning an empty array
        return new String[0];
    }
}

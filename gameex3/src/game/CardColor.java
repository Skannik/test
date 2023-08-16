package game;

import java.awt.*;

public final class CardColor {
    private static final int[] colors = {
            0xFFFFFF, 0x000000, 0xFFFF00, 0xE83000, 0x4FC601,
            0x1CE6FF, 0xFF34FF, 0x0000A6, 0x006FA6, 0xFFDBE5,
            0xFF913F, 0x7ED379, 0x008941, 0x00FECF, 0xFF90C9,
            0xFF2F80, 0x1B4400, 0xA079BF, 0x575329, 0x6B002C,
            0x404E55, 0x66E1D3, 0xA4E804, 0x00A6AA, 0xD0AC94,
            0xB4A8BD, 0x938A81, 0x7A4900, 0x6B7900, 0xCB7E9B,
            0xA77500, 0xFFF69F, 0xBF5650, 0xC0B9B2, 0xA30059,
            0x788D66, 0x012C58, 0xBEC459, 0xFFAA92, 0x922329,
            0x372101, 0xFFB500, 0x7B4F4B, 0xC2FFED, 0x7900D7,
            0x8FB0FF, 0x0086ED, 0xFF4A46, 0xD790FF, 0xFFFF66
    };

    public static Color getColorCard(int index) {
        return new Color(colors[index]);
    }
}
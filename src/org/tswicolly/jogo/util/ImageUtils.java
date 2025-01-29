package org.tswicolly.jogo.util;

import org.tswicolly.jogo.interfacegrafica.paineis.JanelaInventario;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ImageUtils {
    public static ImageIcon getScaledIcon(ImageIcon original, int width, int height) {
        Image image = original.getImage();
        Image scaled = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }

    public static ImageIcon loadAndScaleIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(
                JanelaInventario.class.getResource(path)
        ));
        return getScaledIcon(icon, width, height);
    }
}
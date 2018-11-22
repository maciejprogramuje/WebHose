package pl.maciejprogramuje.webhose.managers;

import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class CopyToClipboard {
    public static void copy(String string) {
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(string);
        clipboard.setContent(content);
    }
}

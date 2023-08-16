package game;

import javax.swing.*;
import java.awt.*;

public class BoardComponent extends JComponent {
    private CardsPanel cardsPanel;
    private UserPanel userPanel;
    private static Level level;

    public BoardComponent(Level level) {
        setLayout(new BorderLayout());
        BoardComponent.level = level;
        cardsPanel = new CardsPanel(level);
        userPanel = new UserPanel(cardsPanel.getCards());

        add(cardsPanel, BorderLayout.CENTER);
        cardsPanel.setOpaque(false);

        add(userPanel, BorderLayout.SOUTH);

        GameEngine gameEngine = new GameEngine(userPanel);
        gameEngine.start();

    }



    public static Level getLevel() {
        return level;
    }
}

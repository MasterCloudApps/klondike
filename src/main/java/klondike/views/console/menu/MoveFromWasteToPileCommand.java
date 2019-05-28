package klondike.views.console.menu;

import klondike.controllers.PlayController;
import klondike.models.Error;

public class MoveFromWasteToPileCommand extends MoveCommand {

    public MoveFromWasteToPileCommand(PlayController playController) {
        super(CommandTitle.WASTE2PILE_COMMAND.getTitle(), playController);
    }

    @Override
    protected Error move() {
        int pileIndex = PileReader.readIndex(Message.DESTINATION);
        return this.playController.moveFromWasteToPile(pileIndex);
    }

    @Override
    public boolean isActive() {
        return true;
    }
}

package guard.ttp.packets.responses;

import crypto.memento.PrivateKeyMemento;
import crypto.memento.PublicParametersMemento;
import guard.ttp.SystemParameters;
import protocol.Response;

public class RegistrationResponse extends Response {

    public final boolean successful;
    public final int assignedNumID;
    public final String assignedNameID;
    public final PrivateKeyMemento assignedPrivateKeyMemento;
    public final PublicParametersMemento publicParametersMemento;
    public final SystemParameters systemParameters;

    public RegistrationResponse(String errorMessage) {
        super(errorMessage);
        successful = false;
        assignedNumID = -1;
        assignedNameID = null;
        assignedPrivateKeyMemento = null;
        publicParametersMemento = null;
        systemParameters = null;
    }

    public RegistrationResponse(boolean successful, int assignedNumID, String assignedNameID,
                                PrivateKeyMemento assignedPrivateKeyMemento, PublicParametersMemento publicParametersMemento,
                                SystemParameters systemParameters) {
        super(null);
        this.successful = successful;
        this.assignedNumID = assignedNumID;
        this.assignedNameID = assignedNameID;
        this.assignedPrivateKeyMemento = assignedPrivateKeyMemento;
        this.publicParametersMemento = publicParametersMemento;
        this.systemParameters = systemParameters;
    }
}

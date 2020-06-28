package skipnode.packets.requests;

import network.Request;
import network.RequestType;

public class GetRightNodeRequest extends Request {

    public final int level;

    public GetRightNodeRequest(int level) {
        super(RequestType.GET_RIGHT_NODE);
        this.level = level;
    }
}

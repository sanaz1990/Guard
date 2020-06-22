package skipnode.packets.requests;

import protocol.Request;
import protocol.RequestType;

public class RouteSearchNumIDRequest extends Request {

    public final int target;
    public int level;

    public RouteSearchNumIDRequest(int target, int level) {
        super(RequestType.ROUTE_SEARCH_NUM_ID);
        this.target = target;
        this.level = level;
    }
}

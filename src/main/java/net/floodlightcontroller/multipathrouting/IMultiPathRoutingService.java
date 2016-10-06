package net.floodlightcontroller.multipathrouting;

import java.util.ArrayList;
import org.projectfloodlight.openflow.types.DatapathId;
import net.floodlightcontroller.routing.Route;
import net.floodlightcontroller.core.module.IFloodlightService;

public interface IMultiPathRoutingService extends IFloodlightService {
	public void modifyLinkCost(Long srcDpid, Long dstDpid, short cost);

	public Route getRoute(long srcDpid, short srcPort, long dstDpid,
			short dstPort);

	public ArrayList<Route> getRoutes(DatapathId srcDpid, DatapathId dstDpid);
}

package net.cshift.api.transit.network.packet;

import net.cshift.api.transit.type.*;

/** Interface describing an unchanging packet.
 * @author Kyle Gunger
 *
 * @param <D> The data type (Object) that the packet transfers.
 */
public interface IStaticPacket<D>
{
	/**Get the packet's data.
	 * 
	 * @return <D> The packet's data
	 */
    public D getData();
    
    /**Get the packet's type.
     * 
     * @return IType<<D>> The type of the packet
     */
    public Type<D> getType();
}
/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COMMAND_INT PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* Message encoding a command with parameters as scaled integers. Scaling depends on the actual command value.
*/
public class msg_command_int extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_COMMAND_INT = 75;
    public static final int MAVLINK_MSG_LENGTH = 35;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COMMAND_INT;


      
    /**
    * PARAM1, see MAV_CMD enum
    */
    public float param1;
      
    /**
    * PARAM2, see MAV_CMD enum
    */
    public float param2;
      
    /**
    * PARAM3, see MAV_CMD enum
    */
    public float param3;
      
    /**
    * PARAM4, see MAV_CMD enum
    */
    public float param4;
      
    /**
    * PARAM5 / local: x position in meters * 1e4, global: latitude in degrees * 10^7
    */
    public int x;
      
    /**
    * PARAM6 / local: y position in meters * 1e4, global: longitude in degrees * 10^7
    */
    public int y;
      
    /**
    * PARAM7 / z position: global: altitude in meters (relative or absolute, depending on frame).
    */
    public float z;
      
    /**
    * The scheduled action for the mission item.
    */
    public int command;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
      
    /**
    * The coordinate system of the COMMAND.
    */
    public short frame;
      
    /**
    * false:0, true:1
    */
    public short current;
      
    /**
    * autocontinue to next wp
    */
    public short autocontinue;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_COMMAND_INT;
              
        packet.payload.putFloat(param1);
              
        packet.payload.putFloat(param2);
              
        packet.payload.putFloat(param3);
              
        packet.payload.putFloat(param4);
              
        packet.payload.putInt(x);
              
        packet.payload.putInt(y);
              
        packet.payload.putFloat(z);
              
        packet.payload.putUnsignedShort(command);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
              
        packet.payload.putUnsignedByte(frame);
              
        packet.payload.putUnsignedByte(current);
              
        packet.payload.putUnsignedByte(autocontinue);
        
        return packet;
    }

    /**
    * Decode a command_int message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.param1 = payload.getFloat();
              
        this.param2 = payload.getFloat();
              
        this.param3 = payload.getFloat();
              
        this.param4 = payload.getFloat();
              
        this.x = payload.getInt();
              
        this.y = payload.getInt();
              
        this.z = payload.getFloat();
              
        this.command = payload.getUnsignedShort();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
              
        this.frame = payload.getUnsignedByte();
              
        this.current = payload.getUnsignedByte();
              
        this.autocontinue = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_command_int(){
        msgid = MAVLINK_MSG_ID_COMMAND_INT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_command_int(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_COMMAND_INT;
        unpack(mavLinkPacket.payload);        
    }

                              
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_COMMAND_INT - sysid:"+sysid+" compid:"+compid+" param1:"+param1+" param2:"+param2+" param3:"+param3+" param4:"+param4+" x:"+x+" y:"+y+" z:"+z+" command:"+command+" target_system:"+target_system+" target_component:"+target_component+" frame:"+frame+" current:"+current+" autocontinue:"+autocontinue+"";
    }
}
        
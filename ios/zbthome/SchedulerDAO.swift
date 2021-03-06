//
//  RoomDAO.swift
//  zbthome
//
//  Created by Mackbook on 04/08/16.
//  Copyright © 2016 Mackbook. All rights reserved.
//

import UIKit

class SchedulerDAO: NSObject, NSCoding {

    var name:String = ""
    var repeatType:String = ""
    var repeatValue:String = ""
    var startTime:String = ""
    
    var devicesArray: [[Int]] = [[Int]]()
    init(name:String, repeatType:String, startTime:String, repeatValue: String) {
        self.name = name
        self.repeatType = repeatType
        self.startTime = startTime
        self.repeatValue = repeatValue
        super.init()
    }
    
    required internal init(coder decoder: NSCoder) {
        name = decoder.decodeObjectForKey("name") as! String
        repeatType = decoder.decodeObjectForKey("repeatType") as! String
        repeatValue = decoder.decodeObjectForKey("repeatValue") as! String
        startTime = decoder.decodeObjectForKey("startTime") as! String
        devicesArray = decoder.decodeObjectForKey("devicesArray") as! [[Int]]
    }
    
    internal func encodeWithCoder(coder: NSCoder) {
        coder.encodeObject(name, forKey: "name")
        coder.encodeObject(repeatType, forKey: "repeatType")
        coder.encodeObject(repeatValue, forKey: "repeatValue")
        coder.encodeObject(startTime, forKey: "startTime")
        coder.encodeObject(devicesArray, forKey: "devicesArray")
    }
}

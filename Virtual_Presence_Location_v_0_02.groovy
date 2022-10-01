metadata {
    definition (name: "Virtual Presence+Location v.0.02", namespace: "Maddigan", author: "Steve Maddigan") {
        capability "PresenceSensor"
 		command "arrived", ["string"]
		command "departed", ["string"]
        attribute "location", "string"
    }
}

def setPresent(string) {
    sendEvent(name: "location", value: string)
	sendEvent(name: "presence", value: "present") 
}

def setNotPresentHome(string) {
    sendEvent(name: "location", value: string)
	sendEvent(name: "presence", value: "not present")
}

def arrived(string) {
	setPresent(string)
}

def departed(string) {
	setNotPresentHome(string)
}

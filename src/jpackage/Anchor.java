package jpackage;

import java.sql.Timestamp;

public class Anchor {
private Domain domain;
private String anchorHash;
private String anchorUrl;
private boolean enabled;
private int scanStatus;
private Timestamp changed;
private Timestamp created;

public String getAnchorHash() {
	return anchorHash;
}

public String getAnchorUrl() {
	return anchorUrl;
}

public boolean isEnabled() {
	return enabled;
}

public Timestamp getModified() {
	return changed;
}

public int getScanStatus() {
	return scanStatus;
}

public Timestamp getCreated() {
	return created;
}

public Anchor(String anchorHash, String anchorUrl) {
	this.domain = domain;
	this.anchorHash = anchorHash;
	this.anchorUrl = anchorUrl;
}

public Anchor(String anchorHash, String anchorUrl, boolean enabled, Timestamp changed, Timestamp created) {
	this.domain = domain;
	this.scanStatus = scanStatus;
	this.anchorHash = anchorHash;
	this.anchorUrl = anchorUrl;
	this.created = created;
	this.changed = changed;
	this.enabled = enabled;
}


}

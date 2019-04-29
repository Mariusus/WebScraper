package jpackage;

import java.sql.Timestamp;

public class Domain {
private String anchorHash;
private String anchorUrl;
private boolean enabled;
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

public Timestamp getCreated() {
	return created;
}

public Domain(String anchorHash, String anchorUrl) {
	this.anchorHash = anchorHash;
	this.anchorUrl = anchorUrl;
}

public Domain(String anchorHash, String anchorUrl, boolean enabled, Timestamp changed, Timestamp created) {
	this.anchorHash = anchorHash;
	this.anchorUrl = anchorUrl;
	this.created = created;
	this.changed = changed;
	this.enabled = enabled;
}

}
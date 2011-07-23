package org.apache.tapestry.finder.entities.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.tapestry.finder.entities.ComponentEntry;
import org.apache.tapestry.finder.entities.License;
import org.apache.tapestry.finder.entities.TapestryVersion;

/**
 * Class _ModuleEntry was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ModuleEntry extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ENABLED_PROPERTY = "enabled";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String URL_PROPERTY = "url";
    public static final String COMPONENTS_PROPERTY = "components";
    public static final String LICENSE_PROPERTY = "license";
    public static final String SINCE_PROPERTY = "since";
    public static final String UNTIL_PROPERTY = "until";

    public static final String ID_PK_COLUMN = "id";

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setEnabled(Boolean enabled) {
        writeProperty("enabled", enabled);
    }
    public Boolean getEnabled() {
        return (Boolean)readProperty("enabled");
    }

    public void setId(Long id) {
        writeProperty("id", id);
    }
    public Long getId() {
        return (Long)readProperty("id");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setUrl(String url) {
        writeProperty("url", url);
    }
    public String getUrl() {
        return (String)readProperty("url");
    }

    public void addToComponents(ComponentEntry obj) {
        addToManyTarget("components", obj, true);
    }
    public void removeFromComponents(ComponentEntry obj) {
        removeToManyTarget("components", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ComponentEntry> getComponents() {
        return (List<ComponentEntry>)readProperty("components");
    }


    public void setLicense(License license) {
        setToOneTarget("license", license, true);
    }

    public License getLicense() {
        return (License)readProperty("license");
    }


    public void setSince(TapestryVersion since) {
        setToOneTarget("since", since, true);
    }

    public TapestryVersion getSince() {
        return (TapestryVersion)readProperty("since");
    }


    public void setUntil(TapestryVersion until) {
        setToOneTarget("until", until, true);
    }

    public TapestryVersion getUntil() {
        return (TapestryVersion)readProperty("until");
    }


}
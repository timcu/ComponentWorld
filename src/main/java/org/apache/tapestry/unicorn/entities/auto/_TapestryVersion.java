package org.apache.tapestry.unicorn.entities.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.tapestry.unicorn.entities.Entry;

/**
 * Class _TapestryVersion was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TapestryVersion extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String RELEASED_PROPERTY = "released";
    public static final String ENTRIES_SINCE_PROPERTY = "entriesSince";
    public static final String ENTRIES_UNTIL_PROPERTY = "entriesUntil";

    public static final String ID_PK_COLUMN = "ID";

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
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

    public void setReleased(Date released) {
        writeProperty("released", released);
    }
    public Date getReleased() {
        return (Date)readProperty("released");
    }

    public void addToEntriesSince(Entry obj) {
        addToManyTarget("entriesSince", obj, true);
    }
    public void removeFromEntriesSince(Entry obj) {
        removeToManyTarget("entriesSince", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Entry> getEntriesSince() {
        return (List<Entry>)readProperty("entriesSince");
    }


    public void addToEntriesUntil(Entry obj) {
        addToManyTarget("entriesUntil", obj, true);
    }
    public void removeFromEntriesUntil(Entry obj) {
        removeToManyTarget("entriesUntil", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Entry> getEntriesUntil() {
        return (List<Entry>)readProperty("entriesUntil");
    }


}

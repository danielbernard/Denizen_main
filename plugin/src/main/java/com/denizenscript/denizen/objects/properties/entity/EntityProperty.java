package com.denizenscript.denizen.objects.properties.entity;

import com.denizenscript.denizen.objects.EntityTag;
import com.denizenscript.denizencore.objects.properties.ObjectProperty;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public abstract class EntityProperty extends ObjectProperty<EntityTag> {

    public EntityProperty() {
    }

    public EntityProperty(EntityTag entity) {
        object = entity;
    }

    public Entity getEntity() {
        return object.getBukkitEntity();
    }

    public LivingEntity getLivingEntity() {
        return object.getLivingEntity();
    }

    public EntityType getType() {
        return object.getBukkitEntityType();
    }
}

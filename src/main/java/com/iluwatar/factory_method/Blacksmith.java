package com.iluwatar.factory_method;

/**
 * 
 * The interface containing method for producing objects.
 * 
 */
public interface Blacksmith {

	Weapon manufactureWeapon(WeaponType weaponType);

}

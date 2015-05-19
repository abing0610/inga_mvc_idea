package com.iluwatar.factory_method;

public class OrcWeapon implements Weapon {

	private WeaponType weaponType;

	public OrcWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Orcish " + weaponType;
	}

}

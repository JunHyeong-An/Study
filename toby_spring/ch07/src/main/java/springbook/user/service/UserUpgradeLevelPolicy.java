package springbook.user.service;

import springbook.user.domain.User;

public interface UserUpgradeLevelPolicy {
	public void upgradeLevel(User user);
	public boolean canUpgradeLevel(User user);
}

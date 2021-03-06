/**
 * 
 */
package com.rajesh.nagarro.model;

/**
 * enum for book issue status.
 * 
 *
 */
public enum BookIssueStatus {
	ISSUED, RETURNED;

	public static BookIssueStatus getBookIssueStatus(String status) {
		for (BookIssueStatus ut : BookIssueStatus.values()) {
			if (ut.name().equals(status))
				return ut;
		}
		return null;
	}
}

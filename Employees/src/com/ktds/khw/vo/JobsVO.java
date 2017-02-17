package com.ktds.khw.vo;

public class JobsVO {

	private String jobId;
	private String jobTitle;
	private int minSaraly;
	private int maxSaraly;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobName) {
		this.jobTitle = jobName;
	}

	public int getMinSaraly() {
		return minSaraly;
	}

	public void setMinSaraly(int minSaraly) {
		this.minSaraly = minSaraly;
	}

	public int getMaxSaraly() {
		return maxSaraly;
	}

	public void setMaxSaraly(int maxSaraly) {
		this.maxSaraly = maxSaraly;
	}

}

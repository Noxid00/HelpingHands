package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.PayPalModel;

public class PayoutBatchHeader extends PayPalModel {

	/**
	 * An ID for the batch payout. Generated by PayPal. 30 characters max.
	 */
	private String payoutBatchId;

	/**
	 * Generated batch status.
	 */
	private String batchStatus;

	/**
	 * The time the batch entered processing.
	 */
	private String timeCreated;

	/**
	 * The time that processing for the batch was completed.
	 */
	private String timeCompleted;

	/**
	 * The original batch header as provided by the payment sender.
	 */
	private PayoutSenderBatchHeader senderBatchHeader;

	/**
	 * Total amount, in U.S. dollars, requested for the applicable payouts.
	 */
	private Currency amount;

	/**
	 * Total estimate in U.S. dollars for the applicable payouts fees.
	 */
	private Currency fees;

	/**
	 * 
	 */
	private Error errors;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public PayoutBatchHeader() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PayoutBatchHeader(String payoutBatchId, String batchStatus, String timeCreated, PayoutSenderBatchHeader senderBatchHeader, Currency amount, Currency fees) {
		this.payoutBatchId = payoutBatchId;
		this.batchStatus = batchStatus;
		this.timeCreated = timeCreated;
		this.senderBatchHeader = senderBatchHeader;
		this.amount = amount;
		this.fees = fees;
	}


	/**
	 * Setter for payoutBatchId
	 */
	public PayoutBatchHeader setPayoutBatchId(String payoutBatchId) {
		this.payoutBatchId = payoutBatchId;
		return this;
	}

	/**
	 * Getter for payoutBatchId
	 */
	public String getPayoutBatchId() {
		return this.payoutBatchId;
	}


	/**
	 * Setter for batchStatus
	 */
	public PayoutBatchHeader setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
		return this;
	}

	/**
	 * Getter for batchStatus
	 */
	public String getBatchStatus() {
		return this.batchStatus;
	}


	/**
	 * Setter for timeCreated
	 */
	public PayoutBatchHeader setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
		return this;
	}

	/**
	 * Getter for timeCreated
	 */
	public String getTimeCreated() {
		return this.timeCreated;
	}


	/**
	 * Setter for timeCompleted
	 */
	public PayoutBatchHeader setTimeCompleted(String timeCompleted) {
		this.timeCompleted = timeCompleted;
		return this;
	}

	/**
	 * Getter for timeCompleted
	 */
	public String getTimeCompleted() {
		return this.timeCompleted;
	}


	/**
	 * Setter for senderBatchHeader
	 */
	public PayoutBatchHeader setSenderBatchHeader(PayoutSenderBatchHeader senderBatchHeader) {
		this.senderBatchHeader = senderBatchHeader;
		return this;
	}

	/**
	 * Getter for senderBatchHeader
	 */
	public PayoutSenderBatchHeader getSenderBatchHeader() {
		return this.senderBatchHeader;
	}


	/**
	 * Setter for amount
	 */
	public PayoutBatchHeader setAmount(Currency amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Getter for amount
	 */
	public Currency getAmount() {
		return this.amount;
	}


	/**
	 * Setter for fees
	 */
	public PayoutBatchHeader setFees(Currency fees) {
		this.fees = fees;
		return this;
	}

	/**
	 * Getter for fees
	 */
	public Currency getFees() {
		return this.fees;
	}


	/**
	 * Setter for errors
	 */
	public PayoutBatchHeader setErrors(Error errors) {
		this.errors = errors;
		return this;
	}

	/**
	 * Getter for errors
	 */
	public Error getErrors() {
		return this.errors;
	}
	
	/**
	 * Setter for links
	 */
	public PayoutBatchHeader setLinks(List<Links> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<Links> getLinks() {
		return this.links;
	}
	
}

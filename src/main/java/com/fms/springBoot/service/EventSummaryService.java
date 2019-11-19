package com.fms.springBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.springBoot.EventRptRepository;
import com.fms.springBoot.entity.IEventReport;

@Service
public class EventSummaryService {
	@Autowired
	private EventRptRepository eRepository;

	public List<IEventReport> getEventRatingByEvent(String pocId) {

		if (pocId == null || "".equals(pocId)) {
			return eRepository.findAllByEvents();
		}
		return eRepository.findAllByPocEvents(pocId);
	}

	public List<IEventReport> getEventRatingByBaseLocation(String pocId) {

		if (pocId == null || "".equals(pocId)) {
			return eRepository.findAllByBaseLocation();
		}
		return eRepository.findAllByPocBaseLocation(pocId);
	}

	public List<IEventReport> getEventRatingByBeneficiary(String pocId) {

		if (pocId == null || "".equals(pocId)) {
			return eRepository.findAllByBenificiary();
		}
		return eRepository.findAllByPocBenificiary(pocId);
	}
}

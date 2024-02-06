package com.sumanth.emp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanth.emp.model.LeaveAllocation;
import com.sumanth.emp.repository.LeaveAllocationRepository;

@Service
public class LeaveAllocationServiceImpl implements LeaveAllocationService {

    private final LeaveAllocationRepository leaveAllocationRepository;

    @Autowired
    public LeaveAllocationServiceImpl(LeaveAllocationRepository leaveAllocationRepository) {
        this.leaveAllocationRepository = leaveAllocationRepository;
    }

	@Override
	public List<LeaveAllocation> getAllLeaveAllocations() {
        return (List<LeaveAllocation>) leaveAllocationRepository.findAll();

	}

	@Override
	public LeaveAllocation getLeaveAllocationById(Integer id) {
        return leaveAllocationRepository.findById(id).orElse(null);

	}

	@Override
	public LeaveAllocation saveLeaveAllocation(LeaveAllocation leaveAllocation) {
        return leaveAllocationRepository.save(leaveAllocation);

		}

	@Override
	public void deleteLeaveAllocation(Integer id) {
        leaveAllocationRepository.deleteById(id);
		
	}

   
}
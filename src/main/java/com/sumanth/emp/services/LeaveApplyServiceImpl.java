package com.sumanth.emp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanth.emp.model.LeaveApply;
import com.sumanth.emp.repository.LeaveApplyRepository;

@Service
public class LeaveApplyServiceImpl implements LeaveApplyService {

    private final LeaveApplyRepository leaveApplyRepository;

    @Autowired
    public LeaveApplyServiceImpl(LeaveApplyRepository leaveApplyRepository) {
        this.leaveApplyRepository = leaveApplyRepository;
    }

	@Override
	public List<LeaveApply> getAllLeaveApplications() {
        return leaveApplyRepository.findAll();

	}

	@Override
	public LeaveApply getLeaveApplicationById(Integer leaveId) {
        return leaveApplyRepository.findById(leaveId).orElse(null);

	}

	@Override
	public LeaveApply saveLeaveApplication(LeaveApply leaveApply) {
        return leaveApplyRepository.save(leaveApply);
	}

	@Override
	public void deleteLeaveApplication(Integer leaveId) {
        leaveApplyRepository.deleteById(leaveId);
		
	}

   
}
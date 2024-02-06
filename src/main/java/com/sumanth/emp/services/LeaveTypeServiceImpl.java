package com.sumanth.emp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanth.emp.model.LeaveType;
import com.sumanth.emp.repository.LeaveTypeRepository;


@Service
public class LeaveTypeServiceImpl implements LeaveTypeService {

    private final LeaveTypeRepository leaveTypeRepository;

    @Autowired
    public LeaveTypeServiceImpl(LeaveTypeRepository leaveTypeRepository) {
        this.leaveTypeRepository = leaveTypeRepository;
    }

	@Override
	public List<LeaveType> getAllLeaveTypes() {
		 return (List<LeaveType>) leaveTypeRepository.findAll();
	}

	@Override
	public LeaveType getLeaveTypeById(Integer id) {
		  return leaveTypeRepository.findById(id).orElse(null);

	}

	@Override
	public LeaveType saveLeaveType(LeaveType leaveType) {
		  return leaveTypeRepository.save(leaveType);
	}

	@Override
	public void deleteLeaveType(Integer id) {
		leaveTypeRepository.deleteById(id);
		
	}


    }
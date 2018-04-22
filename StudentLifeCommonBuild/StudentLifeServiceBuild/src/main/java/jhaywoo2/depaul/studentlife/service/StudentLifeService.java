package jhaywoo2.depaul.studentlife.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentLifeService")
public interface StudentLifeService {
   public List getAllStudents();
}

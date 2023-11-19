package com.gebeya.bankAPI.Service;

import com.gebeya.bankAPI.Model.DTO.MerchantDTO;
import com.gebeya.bankAPI.Model.DTO.ShortStatementDTO;
import com.gebeya.bankAPI.Model.DTO.TransactionRequestDTO;
import com.gebeya.bankAPI.Model.DTO.TransferDTO;
import com.gebeya.bankAPI.Model.Entities.Transaction;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
//    public Transaction addTransaction(TransactionRequestDTO transaction);
//    public Transaction updateTransaction(Transaction transaction);
//    @Scheduled(fixedRate = 60000)
    public void autoCheckOTPExpiration();

    public Transaction depositForDefaultCustomer(TransactionRequestDTO transaction);
    public Transaction withdrawForDefaultCustomer(TransactionRequestDTO transaction);
    public Transaction depositForMerchantCustomer(MerchantDTO transaction);
    public Transaction transfer(TransferDTO transferDTO);
    public Transaction withdrawalForMerchantCustomer(MerchantDTO transaction);
    public List<ShortStatementDTO> shortStatement(long accountNo);
}

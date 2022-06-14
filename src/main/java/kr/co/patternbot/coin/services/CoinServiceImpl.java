package kr.co.patternbot.coin.services;

import kr.co.patternbot.coin.repositories.CoinRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoinServiceImpl implements CoinService{
    private final CoinRepository repository;
}

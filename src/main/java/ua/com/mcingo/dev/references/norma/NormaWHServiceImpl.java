package ua.com.mcingo.dev.references.norma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by it_mb on 18.10.2016.
 */
@Service
public class NormaWHServiceImpl implements NormaWHService{
    @Autowired
    NormaWHRepository normaWHRepository;

    @Override
    public List<NormaWH> findAllNormaWHForYears() {
        return null;
    }
}

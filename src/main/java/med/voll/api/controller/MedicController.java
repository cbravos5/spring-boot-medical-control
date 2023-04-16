package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medic.ListMedicResponse;
import med.voll.api.medic.Medic;
import med.voll.api.medic.MedicRegisterRequest;
import med.voll.api.medic.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medics")
public class MedicController {

    @Autowired
    private MedicRepository _medicRepository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid MedicRegisterRequest data) {

        _medicRepository.save(new Medic(data));
    }

    @GetMapping
    public Page<ListMedicResponse> list(@PageableDefault(size = 10, sort = {"name"}) Pageable pagination) {
        return _medicRepository.findAll(pagination).map(ListMedicResponse::new);
    }
}

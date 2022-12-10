package dev.gustavoteixeira.easygest.adapter.secondary.db.scheduling;

import dev.gustavoteixeira.easygest.model.scheduling.Scheduling;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
interface SchedulingMapper {

    Scheduling toScheduling(SchedulingDocument schedulingDocument);

//    @Mapping(target = "id", ignore = true)
    SchedulingDocument toSchedulingDocument(Scheduling scheduling);

}
package ru.practicum.explorewithme.request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventRequestStatusUpdateResult {

    private List<EventRequestStatusUpdateRequest> confirmedRequests;
    private List<EventRequestStatusUpdateRequest> rejectedRequests;
}

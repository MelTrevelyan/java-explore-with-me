package ru.practicum.explorewithme.event.service;

import ru.practicum.explorewithme.event.dto.*;

import java.util.List;

public interface EventService {

    List<EventShortDto> findEventsOfUser(Long userId, Integer from, Integer size);
    EventFullDto addEvent(Long userId, NewEventDto newEventDto);
    EventFullDto findUserEventById(Long userId, Long eventId);
    EventFullDto userUpdateEvent(Long userId, Long eventId, UpdateEventUserRequest eventUpdate);
    EventFullDto adminUpdateEvent(Long eventId, UpdateEventAdminRequest eventUpdate);
    List<EventFullDto> findEventsByAdmin(EventAdminParam eventAdminParam);
}
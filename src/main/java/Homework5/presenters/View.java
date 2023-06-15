package Homework5.presenters;

import Homework5.models.Table;

import java.util.Collection;

public interface View {
    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationNo);

    void printReservationTableError(String errorMessage);

    void printChangeReservationTableResult(int reservationNo);
}

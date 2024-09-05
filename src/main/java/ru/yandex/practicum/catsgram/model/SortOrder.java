package ru.yandex.practicum.catsgram.model;

public enum SortOrder {
    ASCENDING, DESCENDING;

    public static SortOrder from(String order) {
        if (order == null) {
            return ASCENDING;
        }
        switch (order.toLowerCase()) {
            case "asc":
            case "ascending":
                return ASCENDING;
            case "desc":
            case "descending":
                return DESCENDING;
            default:
                throw new IllegalArgumentException("Неизвестный порядок сортировки: " + order);
        }
    }
}
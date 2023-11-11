public enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;
    public boolean checkEmployeeEmployment (Employee employee) {
        return this == employee.getEmployment();
    }
}

package office_hours.Practice_2020_02_03;

public class Testers  extends ScrumTeam {

        /*
        inherited features:
                variables: employeeName, jobTitle, salary
                methods: getEmployeeInfo()
         */
        public Testers(String employeeName, String jobTitle, double salary) {
            this.employeeName = employeeName;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }


        @Override
        public void demo() {
            System.out.println("Tester " + this.employeeName + " is doing demo");
        }

        @Override
        public void dailyStandUp() {
            System.out.println("Tester " + this.employeeName + " is attending the daily stand up");
        }

        public void foundBug() {
            System.out.println("Tester " + this.employeeName + " reported a bug");
        }


    }

 interface olaCustomer{
        void bookCab();
        void findARide();
        void rentCab();
        void rateDriver();
        void scheduleCab();
        void cancelCab();
        void addMoneytoWallet();
        void raiseTicket();
        void signUp();
        void signIn();
    }
    interface olaDriver{
        void acceptBooking();
        void getCustomerLocation();
        void setAvailableStatus();
        void getMyCommission();
        void raiseMoneyTransferRequest();
        void callCustomer();
        void setUpYourVehicle();
        void customerFeedback();
    }
    interface olaOwner{
        void getDriverRecords();
        void getReportByDriver();
        void gteReportByRegion();
        void getTotalRevenue();
        void getCustomerFeedback();
        void addDriver();
        void removeDriver();
        void changeDriverStatus();
    }
    public class L7_1 implements olaCustomer,olaDriver,olaOwner {
        public static void main(String[] args) {
            olaCustomer cust=new L7_1();
            olaOwner manoj=new L7_1();
            olaDriver driver=new L7_1();
        }

        @Override
        public void bookCab() {

        }

        @Override
        public void findARide() {

        }

        @Override
        public void rentCab() {

        }

        @Override
        public void rateDriver() {

        }

        @Override
        public void scheduleCab() {

        }

        @Override
        public void cancelCab() {

        }

        @Override
        public void addMoneytoWallet() {

        }

        @Override
        public void raiseTicket() {

        }

        @Override
        public void signUp() {

        }

        @Override
        public void signIn() {

        }

        @Override
        public void acceptBooking() {

        }

        @Override
        public void getCustomerLocation() {

        }

        @Override
        public void setAvailableStatus() {

        }

        @Override
        public void getMyCommission() {

        }

        @Override
        public void raiseMoneyTransferRequest() {

        }

        @Override
        public void callCustomer() {

        }

        @Override
        public void setUpYourVehicle() {

        }

        @Override
        public void customerFeedback() {

        }

        @Override
        public void getDriverRecords() {

        }

        @Override
        public void getReportByDriver() {

        }

        @Override
        public void gteReportByRegion() {

        }

        @Override
        public void getTotalRevenue() {

        }

        @Override
        public void getCustomerFeedback() {

        }

        @Override
        public void addDriver() {

        }

        @Override
        public void removeDriver() {

        }

        @Override
        public void changeDriverStatus() {

        }
    }

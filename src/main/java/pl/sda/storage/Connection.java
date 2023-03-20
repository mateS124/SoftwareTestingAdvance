package pl.sda.storage;

 class Connection {

     private boolean state;

    public void open() throws InterruptedException {
        // todo
        Thread.sleep(500);
        state = true;

    }

    void close() throws InterruptedException {
        //todo
        Thread.sleep(500);
        state = false;

    }

    public boolean isOpen(){
        // todo
        return state;
    }
    boolean isClosed(){
        //todo
         return  !isOpen();
    }

    void refresh(){

        System.out.println("Refreshing connection!");
    }













}

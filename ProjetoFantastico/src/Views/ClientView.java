package Views;

import Controllers.ClientController;

public class ClientView {
    private ClientController clientController;

    public ClientView(ClientController clientController) {
        this.clientController = clientController;
    }

    public void sum() {
        System.out.println(1+1);
    }

    public void multiply() {
        System.out.println(3*5);
    }

    public void divide() {
        System.out.println(3/5);
    }

}

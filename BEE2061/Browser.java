package BEE2061;

class Browser {
    private int tabs;

    Browser(int tabs) {
        this.tabs = tabs;
    }

    public void setTabs(int tabs) {
        this.tabs = tabs;
    }

    public int getTabs() {
        return this.tabs;
    }

    public void clickOrClose(String comando) {

        if (comando.equals("clicou")) {
            this.tabs -= 1;
        } else if (comando.equals("fechou")) {
            this.tabs += 2;
            this.tabs -= 1;
        }

    }


}
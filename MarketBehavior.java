interface MarketBehaviour {
    void acceptOrder(Order order);
    Order deliverOrder();
}


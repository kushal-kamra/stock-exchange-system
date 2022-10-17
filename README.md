# stock-exchange-system
Implementation of Stock Exchange System

Faced this in Meesho Round 1 for SDE 4

Implementation in Java, NodeJs and Golang

System Design reference found at ByteByteGo - https://blog.bytebytego.com/p/match-buy-and-sell-stock-orders
- An efficient data structure for an order book must satisfy:
- Constant lookup time. Operations include: get volume at a price level or between price levels, query best bid/ask.
- Fast add/cancel/execute/update operations, preferably O(1) time complexity. Operations include: place a new order, cancel an order, and match an order.
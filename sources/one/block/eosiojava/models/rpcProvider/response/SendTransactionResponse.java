package one.block.eosiojava.models.rpcProvider.response;

/* loaded from: classes.dex */
public class SendTransactionResponse {
    private static final transient java.lang.String ACTION_TRACES_NAME = "action_traces";
    private static final transient java.lang.String RETURN_VALUE_DATA_NAME = "return_value_data";

    @p189kb.InterfaceC4079b("processed")
    private java.util.Map processed;

    @p189kb.InterfaceC4079b("transaction_id")
    private java.lang.String transactionId;

    public SendTransactionResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public <T> T getActionValueAtIndex(int r2, java.lang.Class<T> r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.getActionValues()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r2 = r3.cast(r2)
            return r2
    }

    public java.util.ArrayList<java.lang.Object> getActionValues() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r1 = r5.processed
            if (r1 != 0) goto La
            return r0
        La:
            java.lang.String r2 = "action_traces"
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L13
            return r0
        L13:
            java.util.Map r1 = r5.processed
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            java.lang.String r4 = "return_value_data"
            java.lang.Object r2 = r2.getOrDefault(r4, r3)
            r0.add(r2)
            goto L1f
        L36:
            return r0
    }

    public java.util.Map getProcessed() {
            r1 = this;
            java.util.Map r0 = r1.processed
            return r0
    }

    public java.lang.String getTransactionId() {
            r1 = this;
            java.lang.String r0 = r1.transactionId
            return r0
    }
}

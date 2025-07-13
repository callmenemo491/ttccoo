package one.block.eosiojava.models.rpcProvider;

/* loaded from: classes.dex */
public class Transaction implements java.io.Serializable {

    @p189kb.InterfaceC4079b("actions")
    private java.util.List<one.block.eosiojava.models.rpcProvider.Action> actions;

    @p189kb.InterfaceC4079b("context_free_actions")
    private java.util.List<one.block.eosiojava.models.rpcProvider.Action> contextFreeActions;

    @p189kb.InterfaceC4079b("delay_sec")
    private java.math.BigInteger delaySec;

    @p189kb.InterfaceC4079b("expiration")
    private java.lang.String expiration;

    @p189kb.InterfaceC4079b("max_cpu_usage_ms")
    private java.math.BigInteger maxCpuUsageMs;

    @p189kb.InterfaceC4079b("max_net_usage_words")
    private java.math.BigInteger maxNetUsageWords;

    @p189kb.InterfaceC4079b("ref_block_num")
    private java.math.BigInteger refBlockNum;

    @p189kb.InterfaceC4079b("ref_block_prefix")
    private java.math.BigInteger refBlockPrefix;

    @p189kb.InterfaceC4079b("transaction_extensions")
    private java.util.List<java.lang.String> transactionExtensions;

    public Transaction(java.lang.String r1, java.math.BigInteger r2, java.math.BigInteger r3, java.math.BigInteger r4, java.math.BigInteger r5, java.math.BigInteger r6, java.util.List<one.block.eosiojava.models.rpcProvider.Action> r7, java.util.List<one.block.eosiojava.models.rpcProvider.Action> r8, java.util.List<java.lang.String> r9) {
            r0 = this;
            r0.<init>()
            r0.expiration = r1
            r0.refBlockNum = r2
            r0.refBlockPrefix = r3
            r0.maxNetUsageWords = r4
            r0.maxCpuUsageMs = r5
            r0.delaySec = r6
            r0.contextFreeActions = r7
            r0.actions = r8
            r0.transactionExtensions = r9
            return
    }

    public java.util.List<one.block.eosiojava.models.rpcProvider.Action> getActions() {
            r1 = this;
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r0 = r1.actions
            return r0
    }

    public java.util.List<one.block.eosiojava.models.rpcProvider.Action> getContextFreeActions() {
            r1 = this;
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r0 = r1.contextFreeActions
            return r0
    }

    public java.math.BigInteger getDelaySec() {
            r1 = this;
            java.math.BigInteger r0 = r1.delaySec
            return r0
    }

    public java.lang.String getExpiration() {
            r1 = this;
            java.lang.String r0 = r1.expiration
            return r0
    }

    public java.math.BigInteger getMaxCpuUsageMs() {
            r1 = this;
            java.math.BigInteger r0 = r1.maxCpuUsageMs
            return r0
    }

    public java.math.BigInteger getMaxNetUsageWords() {
            r1 = this;
            java.math.BigInteger r0 = r1.maxNetUsageWords
            return r0
    }

    public java.math.BigInteger getRefBlockNum() {
            r1 = this;
            java.math.BigInteger r0 = r1.refBlockNum
            return r0
    }

    public java.math.BigInteger getRefBlockPrefix() {
            r1 = this;
            java.math.BigInteger r0 = r1.refBlockPrefix
            return r0
    }

    public java.util.List<java.lang.String> getTransactionExtensions() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.transactionExtensions
            return r0
    }

    public void setActions(java.util.List<one.block.eosiojava.models.rpcProvider.Action> r1) {
            r0 = this;
            r0.actions = r1
            return
    }

    public void setContextFreeActions(java.util.List<one.block.eosiojava.models.rpcProvider.Action> r1) {
            r0 = this;
            r0.contextFreeActions = r1
            return
    }

    public void setDelaySec(java.math.BigInteger r1) {
            r0 = this;
            r0.delaySec = r1
            return
    }

    public void setExpiration(java.lang.String r1) {
            r0 = this;
            r0.expiration = r1
            return
    }

    public void setMaxCpuUsageMs(java.math.BigInteger r1) {
            r0 = this;
            r0.maxCpuUsageMs = r1
            return
    }

    public void setMaxNetUsageWords(java.math.BigInteger r1) {
            r0 = this;
            r0.maxNetUsageWords = r1
            return
    }

    public void setRefBlockNum(java.math.BigInteger r1) {
            r0 = this;
            r0.refBlockNum = r1
            return
    }

    public void setRefBlockPrefix(java.math.BigInteger r1) {
            r0 = this;
            r0.refBlockPrefix = r1
            return
    }

    public void setTransactionExtensions(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.transactionExtensions = r1
            return
    }
}

package p414xc;

/* renamed from: xc.n */
/* loaded from: classes.dex */
public class C7039n extends p414xc.C7040o implements p394wc.InterfaceC6831b {
    private static final java.lang.String ACTIONS = "actions";
    private static final java.lang.String CONTEXT_FREE_ACTIONS = "context_free_actions";
    public static final java.lang.String DELAY_SEC = "delay_sec";
    public static final java.lang.String EXPIRATION = "expiration";
    public static final java.lang.String MAX_CPU_USAGE_MS = "max_cpu_usage_ms";
    public static final java.lang.String MAX_NET_USAGE_WORDS = "max_net_usage_words";
    public static final java.lang.String REF_BLOCK_NUM = "ref_block_num";
    public static final java.lang.String REF_BLOCK_PREFIX = "ref_block_prefix";
    private static final java.lang.String TRANSACTION_EXTENSIONS = "transaction_extensions";
    public static final java.lang.String VARIANT_TYPE = "transaction";
    private java.util.List<p414xc.C7027b> gActions;
    private java.util.List<p414xc.C7027b> gContextFreeActions;
    private java.util.List<p414xc.C7033h> gTransactionExtensions;

    public C7039n() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.gContextFreeActions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.gActions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.gTransactionExtensions = r0
            return
    }

    public C7039n(java.lang.String r1, java.lang.Long r2, java.lang.Long r3, int r4, int r5, int r6, java.util.List<p414xc.C7027b> r7, java.util.List<p414xc.C7027b> r8, java.util.List<p414xc.C7033h> r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.gContextFreeActions = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.gActions = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.gTransactionExtensions = r1
            r0.gContextFreeActions = r7
            r0.gActions = r8
            r0.gTransactionExtensions = r9
            return
    }

    public C7039n(p169jb.C3476s r9) {
            r8 = this;
            java.lang.String r0 = "expiration"
            jb.p r0 = r9.m7949n(r0)
            java.lang.String r2 = r0.mo7944l()
            java.lang.String r0 = "ref_block_num"
            jb.p r0 = r9.m7949n(r0)
            long r0 = r0.mo7942h()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ref_block_prefix"
            jb.p r0 = r9.m7949n(r0)
            long r0 = r0.mo7942h()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "max_net_usage_words"
            jb.p r0 = r9.m7949n(r0)
            int r5 = r0.mo7941a()
            java.lang.String r0 = "max_cpu_usage_ms"
            jb.p r0 = r9.m7949n(r0)
            int r6 = r0.mo7941a()
            java.lang.String r0 = "delay_sec"
            jb.p r0 = r9.m7949n(r0)
            int r7 = r0.mo7941a()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.gContextFreeActions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.gActions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.gTransactionExtensions = r0
            xc.e r0 = new xc.e
            java.lang.String r1 = "context_free_actions"
            jb.m r1 = r9.m7950p(r1)
            r0.<init>(r1)
            java.util.List r0 = r0.getActions()
            r8.gContextFreeActions = r0
            xc.e r0 = new xc.e
            java.lang.String r1 = "actions"
            jb.m r1 = r9.m7950p(r1)
            r0.<init>(r1)
            java.util.List r0 = r0.getActions()
            r8.gActions = r0
            java.lang.String r0 = "transaction_extensions"
            jb.m r9 = r9.m7950p(r0)
            java.util.List r9 = makeExtensionList(r9)
            r8.gTransactionExtensions = r9
            return
    }

    private static java.util.List<p414xc.C7033h> makeExtensionList(p169jb.C3470m r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            jb.p r1 = (p169jb.AbstractC3473p) r1
            boolean r2 = r1 instanceof p169jb.C3476s
            if (r2 == 0) goto L24
            jb.s r1 = (p169jb.C3476s) r1
            xc.h r2 = new xc.h
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L24:
            uc.a r3 = new uc.a
            java.lang.String r0 = "Extensions should be an object"
            r3.<init>(r0)
            throw r3
        L2c:
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.Object> toMap() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r4.getExpiration()
            java.lang.String r2 = "expiration"
            r0.put(r2, r1)
            java.lang.Long r1 = r4.getRefBlockNum()
            java.lang.String r2 = "ref_block_num"
            r0.put(r2, r1)
            java.lang.Long r1 = r4.getRefBlockPrefix()
            java.lang.String r2 = "ref_block_prefix"
            r0.put(r2, r1)
            int r1 = r4.getMaxNetUsageWords()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "max_net_usage_words"
            r0.put(r2, r1)
            int r1 = r4.getMaxCpuUsageMs()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "max_cpu_usage_ms"
            r0.put(r2, r1)
            int r1 = r4.getDelaySec()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "delay_sec"
            r0.put(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<xc.b> r2 = r4.gContextFreeActions
            java.util.Iterator r2 = r2.iterator()
        L52:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r2.next()
            xc.b r3 = (p414xc.C7027b) r3
            java.util.Map r3 = r3.toMap()
            r1.add(r3)
            goto L52
        L66:
            java.lang.String r2 = "context_free_actions"
            r0.put(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<xc.b> r2 = r4.gActions
            java.util.Iterator r2 = r2.iterator()
        L76:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r2.next()
            xc.b r3 = (p414xc.C7027b) r3
            java.util.Map r3 = r3.toMap()
            r1.add(r3)
            goto L76
        L8a:
            java.lang.String r2 = "actions"
            r0.put(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<xc.h> r2 = r4.gTransactionExtensions
            java.util.Iterator r2 = r2.iterator()
        L9a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r2.next()
            xc.h r3 = (p414xc.C7033h) r3
            java.util.Map r3 = r3.toMap()
            r1.add(r3)
            goto L9a
        Lae:
            java.lang.String r2 = "transaction_extensions"
            r0.put(r2, r1)
            return r0
    }

    public java.util.List<p414xc.C7027b> getActionsList() {
            r1 = this;
            java.util.List<xc.b> r0 = r1.gActions
            return r0
    }

    public java.util.List<p414xc.C7027b> getContextFreeActionsList() {
            r1 = this;
            java.util.List<xc.b> r0 = r1.gContextFreeActions
            return r0
    }

    public java.util.List<p414xc.C7027b> getRawActions() {
            r1 = this;
            java.util.List r0 = r1.getActionsList()
            return r0
    }

    public java.util.List<p414xc.C7033h> getTransactionExtensions() {
            r1 = this;
            java.util.List<xc.h> r0 = r1.gTransactionExtensions
            return r0
    }

    public boolean hasTapos() {
            r5 = this;
            java.lang.String r0 = r5.getExpiration()
            java.lang.String r1 = "1970-01-01T00:00:00.000"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
            java.lang.Long r0 = r5.getRefBlockNum()
            long r0 = r0.longValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            java.lang.Long r0 = r5.getRefBlockPrefix()
            long r0 = r0.longValue()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            goto L29
        L27:
            r0 = 0
            goto L2a
        L29:
            r0 = 1
        L2a:
            return r0
    }

    public void setActions(java.util.List<p414xc.C7027b> r1) {
            r0 = this;
            r0.gActions = r1
            return
    }

    public void setContextFreeActions(java.util.List<p414xc.C7027b> r1) {
            r0 = this;
            r0.gContextFreeActions = r1
            return
    }

    public void setTransactionExtensions(java.util.List<p414xc.C7033h> r1) {
            r0 = this;
            r0.gTransactionExtensions = r1
            return
    }

    public p414xc.C7039n shallowClone() {
            r2 = this;
            xc.n r0 = new xc.n
            r0.<init>()
            java.lang.String r1 = r2.getExpiration()
            r0.setExpiration(r1)
            java.lang.Long r1 = r2.getRefBlockNum()
            r0.setRefBlockNum(r1)
            java.lang.Long r1 = r2.getRefBlockPrefix()
            r0.setRefBlockPrefix(r1)
            int r1 = r2.getMaxCpuUsageMs()
            r0.setMaxCpuUsageMs(r1)
            int r1 = r2.getMaxNetUsageWords()
            r0.setMaxNetUsageWords(r1)
            java.util.List r1 = r2.getContextFreeActionsList()
            r0.setContextFreeActions(r1)
            java.util.List r1 = r2.getActionsList()
            r0.setActions(r1)
            java.util.List r1 = r2.getTransactionExtensions()
            r0.setTransactionExtensions(r1)
            return r0
    }

    public java.lang.String toJSON() {
            r1 = this;
            java.util.Map r0 = r1.toMap()
            java.lang.String r0 = p435yc.C7155a.m14270c(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toJSON()
            return r0
    }

    @Override // p394wc.InterfaceC6831b
    public java.util.List<java.lang.Object> toVariant() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "transaction"
            r0.add(r1)
            java.util.Map r1 = r2.toMap()
            r0.add(r1)
            return r0
    }
}

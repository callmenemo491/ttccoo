package p255od;

/* renamed from: od.n0 */
/* loaded from: classes.dex */
public final class C5218n0 {
    public static final p255od.C5218n0.a Companion = null;
    private final java.lang.String account;
    private final p276pd.InterfaceC5460t1 jsonData;
    private final java.lang.String name;

    /* renamed from: od.n0$a */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final p255od.C5218n0 generate(java.lang.String r21, java.lang.String r22, ge.EnumC2328a r23, double r24) {
                r20 = this;
                r1 = r21
                r2 = r22
                java.lang.String r0 = "payer"
                p214m2.C4339q.m9706k(r1, r0)
                java.lang.String r0 = "receiver"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "buyStake"
                r3 = r23
                p214m2.C4339q.m9706k(r3, r0)
                od.n0 r6 = new od.n0
                int r0 = r23.ordinal()
                r4 = 1
                r5 = 2
                if (r0 == 0) goto L2d
                if (r0 == r4) goto L2a
                if (r0 != r5) goto L24
                goto L2a
            L24:
                e7.y7 r0 = new e7.y7
                r0.<init>(r5)
                throw r0
            L2a:
                java.lang.String r0 = "delegatebw"
                goto L2f
            L2d:
                java.lang.String r0 = "buyram"
            L2f:
                r14 = r0
                int r0 = r23.ordinal()
                java.lang.String r3 = " WAX"
                r15 = 0
                r16 = 8
                if (r0 == 0) goto L9d
                r17 = 0
                if (r0 == r4) goto L72
                if (r0 != r5) goto L6c
                pd.y1 r19 = new pd.y1
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r7 = r24
                r9 = r16
                r10 = r15
                r11 = r5
                r13 = r3
                java.lang.String r4 = p238nd.C4786y.m10840a(r7, r9, r10, r11, r12, r13)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r7 = r17
                java.lang.String r5 = p238nd.C4786y.m10840a(r7, r9, r10, r11, r12, r13)
                r7 = 0
                r0 = r19
                r1 = r21
                r2 = r22
                r3 = r4
                r4 = r5
                r5 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                goto Lb2
            L6c:
                e7.y7 r0 = new e7.y7
                r0.<init>(r5)
                throw r0
            L72:
                pd.y1 r19 = new pd.y1
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r7 = r17
                r9 = r16
                r10 = r15
                r11 = r5
                r13 = r3
                java.lang.String r4 = p238nd.C4786y.m10840a(r7, r9, r10, r11, r12, r13)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r7 = r24
                java.lang.String r5 = p238nd.C4786y.m10840a(r7, r9, r10, r11, r12, r13)
                r7 = 0
                r0 = r19
                r1 = r21
                r2 = r22
                r3 = r4
                r4 = r5
                r5 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                goto Lb2
            L9d:
                pd.v r0 = new pd.v
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r7 = r24
                r9 = r16
                r10 = r15
                r11 = r5
                r13 = r3
                java.lang.String r3 = p238nd.C4786y.m10840a(r7, r9, r10, r11, r12, r13)
                r0.<init>(r1, r2, r3)
            Lb2:
                java.lang.String r1 = "eosio"
                r6.<init>(r1, r14, r0)
                return r6
        }
    }

    static {
            od.n0$a r0 = new od.n0$a
            r1 = 0
            r0.<init>(r1)
            p255od.C5218n0.Companion = r0
            return
    }

    public C5218n0(java.lang.String r2, java.lang.String r3, p276pd.InterfaceC5460t1 r4) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "jsonData"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.account = r2
            r1.name = r3
            r1.jsonData = r4
            return
    }

    public static /* synthetic */ p255od.C5218n0 copy$default(p255od.C5218n0 r0, java.lang.String r1, java.lang.String r2, p276pd.InterfaceC5460t1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.account
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.name
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            pd.t1 r3 = r0.jsonData
        L12:
            od.n0 r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final p276pd.InterfaceC5460t1 component3() {
            r1 = this;
            pd.t1 r0 = r1.jsonData
            return r0
    }

    public final p255od.C5218n0 copy(java.lang.String r2, java.lang.String r3, p276pd.InterfaceC5460t1 r4) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "jsonData"
            p214m2.C4339q.m9706k(r4, r0)
            od.n0 r0 = new od.n0
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5218n0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.n0 r5 = (p255od.C5218n0) r5
            java.lang.String r1 = r4.account
            java.lang.String r3 = r5.account
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            pd.t1 r1 = r4.jsonData
            pd.t1 r5 = r5.jsonData
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final p276pd.InterfaceC5460t1 getJsonData() {
            r1 = this;
            pd.t1 r0 = r1.jsonData
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.account
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            pd.t1 r1 = r3.jsonData
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "StakeBuyData(account="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.account
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", jsonData="
            r0.append(r1)
            pd.t1 r1 = r2.jsonData
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

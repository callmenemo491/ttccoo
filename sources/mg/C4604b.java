package mg;

/* renamed from: mg.b */
/* loaded from: classes.dex */
public final class C4604b {

    @p189kb.InterfaceC4079b("act")
    private final mg.C4603a act;

    @p189kb.InterfaceC4079b("block_time")
    private final java.lang.String blockTime;

    @p189kb.InterfaceC4079b("receipt")
    private final mg.C4608f receipt;

    @p189kb.InterfaceC4079b("trx_id")
    private final java.lang.String trxID;

    public C4604b(mg.C4603a r2, java.lang.String r3, mg.C4608f r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "act"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "blockTime"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "receipt"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "trxID"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.act = r2
            r1.blockTime = r3
            r1.receipt = r4
            r1.trxID = r5
            return
    }

    public static /* synthetic */ mg.C4604b copy$default(mg.C4604b r0, mg.C4603a r1, java.lang.String r2, mg.C4608f r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            mg.a r1 = r0.act
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.blockTime
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            mg.f r3 = r0.receipt
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.lang.String r4 = r0.trxID
        L18:
            mg.b r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final mg.C4603a component1() {
            r1 = this;
            mg.a r0 = r1.act
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.blockTime
            return r0
    }

    public final mg.C4608f component3() {
            r1 = this;
            mg.f r0 = r1.receipt
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.trxID
            return r0
    }

    public final mg.C4604b copy(mg.C4603a r2, java.lang.String r3, mg.C4608f r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "act"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "blockTime"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "receipt"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "trxID"
            p214m2.C4339q.m9706k(r5, r0)
            mg.b r0 = new mg.b
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            java.lang.Class<mg.b> r1 = mg.C4604b.class
            if (r5 == 0) goto Ld
            java.lang.Class r2 = r5.getClass()
            goto Le
        Ld:
            r2 = 0
        Le:
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type io.tacocrypto.app.ui.tools.transactions.model.ActionTrace"
            java.util.Objects.requireNonNull(r5, r1)
            mg.b r5 = (mg.C4604b) r5
            mg.a r1 = r4.act
            mg.a r3 = r5.act
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L28
            return r2
        L28:
            java.lang.String r1 = r4.trxID
            java.lang.String r5 = r5.trxID
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L33
            return r2
        L33:
            return r0
    }

    public final mg.C4603a getAct() {
            r1 = this;
            mg.a r0 = r1.act
            return r0
    }

    public final java.lang.String getBlockTime() {
            r1 = this;
            java.lang.String r0 = r1.blockTime
            return r0
    }

    public final mg.C4608f getReceipt() {
            r1 = this;
            mg.f r0 = r1.receipt
            return r0
    }

    public final java.lang.String getTrxID() {
            r1 = this;
            java.lang.String r0 = r1.trxID
            return r0
    }

    public int hashCode() {
            r2 = this;
            mg.a r0 = r2.act
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.trxID
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ActionTrace(act="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            mg.a r1 = r3.act
            r0.append(r1)
            java.lang.String r1 = ", blockTime="
            r0.append(r1)
            java.lang.String r1 = r3.blockTime
            r0.append(r1)
            java.lang.String r1 = ", receipt="
            r0.append(r1)
            mg.f r1 = r3.receipt
            r0.append(r1)
            java.lang.String r1 = ", trxID="
            r0.append(r1)
            java.lang.String r1 = r3.trxID
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
